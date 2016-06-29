package types.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import types.core.SyntacticType;
import wyil.lang.Type.Array;

/**
 * <p>
 * Automatically enumerates types upto a given size. To do this, we
 * progressively given all combinations of types over an given "depth" and
 * "width". Here, depth refers to the maximum level of nesting, whilst width
 * refers to the maximum number of terms at the same level. For example, the
 * type <code>(int,int)</code> has depth 1 and width 2.
 * </p>
 * <p>
 * To generate the full set of types at a given depth n, we first generate all
 * types for depth n-1. Then, we "extend" by at least one depth.
 * </p>
 * 
 * 
 * 
 * @author David J. Pearce
 *
 */
public class TypeGenerator implements Iterable<SyntacticType> {
	/**
	 *  Maximum nesting depth of type to generate
	 */
	private final int depth;
	
	/**
	 * Maximum width of types to generate
	 */
	private final int width;
	
	public TypeGenerator(int depth, int width) {
		this.depth = depth;
		this.width = width;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public int getWidth() {
		return width;
	}
	
	/**
	 * Determine the number of types in the space described by this iterator
	 */
	public long size() {
		return count(depth,width);
	}
	
	/**
	 * Get an iterator for this space. Note that the algorithm used for this is
	 * completely different to the algorithm used for generate(). Hence, it's a
	 * useful sanity check to compare them.
	 * 
	 * @return
	 */
	public Iterator iterator() {
		return new Iterator(depth,width);
	}
	
	/**
	 * Generate all possible types in a given space. This is an expensive
	 * process once the dimensions get above about two each.
	 * 
	 * @return
	 */
	public List<SyntacticType> generate() {
		ArrayList<SyntacticType> types = new ArrayList<SyntacticType>();
		// Add seed types
		types.addAll(Arrays.asList(PRIMITIVE_TYPES));
		// For each depth and width extend the current set of types
		int start = 0;
		for(int d = 1 ; d <= depth; ++d) {
			int end = types.size();
			for(int w = 1 ; w <= width; ++w) {
				extend(types,start,end,w);
			}
			start = end;
		}
		// Done
		return types;
	}
	
	/**
	 * Extend the list of types upto a given size by all possible combinations
	 * at a given width.
	 * 
	 * @param types
	 */
	private void extend(List<SyntacticType> types, int start, int end, int width) {
		// Generate all possible combinations of the input types at a given
		// dimension
		List<SyntacticType[]> allCombinations = generateCombinations(types, start, end, width);
		// Generate tuples
		for(SyntacticType[] arguments : allCombinations) {
			types.add(new SyntacticType.Tuple(arguments));
		}		
		if(width > 1) {
			// Generate unions
			for(SyntacticType[] arguments : allCombinations) {
				types.add(new SyntacticType.Union(arguments));
			}
			// Generate negations			
			for(SyntacticType[] arguments : allCombinations) {
				types.add(new SyntacticType.Intersection(arguments));
			}
		} else if(width == 1) {
			// Generate negations
			for(int i=start;i!=end;++i) {
				types.add(new SyntacticType.Negation(types.get(i)));
			}
		}
	}
	
	private List<SyntacticType[]> generateCombinations(List<SyntacticType> types, int start, int end, int width) {
		ArrayList<SyntacticType[]> combinations = new ArrayList<SyntacticType[]>();

		// First, compute the irregular pieces
		Counter counter = new Counter(width,end-1);
		//
		while(!counter.isFinished()) {
			// First, ignore the "cube" which is the product of types all
			// previously seen before.
			if(!counter.allBelow(start)) {
				SyntacticType[] combination = new SyntacticType[width];			
				for(int i=0;i!=width;++i) {
					combination[i] = types.get((int) counter.get(i));
				}
				combinations.add(combination);
			}
			counter.increment();
		}
		// Second, compute the regular pieces
		
		return combinations;
	}
	
	public static class Counter {
		private final long[] items;
		private final long max;
		
		public Counter(int dim, long max) {
			this.items = new long[dim];
			this.max = max;
		}
		
		public long get(int index) {
			return items[index];
		}
		/**
		 * The counter is finished when each dimension has reached the maximum value
		 * 
		 * @param counter
		 * @param max
		 *            maximum value of any dimension
		 * @return
		 */
		public boolean isFinished() {
			return items[0] == -1;
		}
		
		/**
		 * To increment the counter we starting incrementing from the innermost
		 * dimensions first. If a dimension has the maximum value, we roll it over
		 * to zero and carry to the next dimension. Otherwise, we just increment the
		 * given dimension by 1.
		 * 
		 * @param counter
		 * @param max
		 *            maximum value of any dimension
		 */
		public void increment() {
			int i = 0;
			while (i < items.length && items[i] == max) {
				items[i] = 0;
				i = i + 1;
			}
			if(i == items.length) {
				// signal count has finished
				items[0] = -1;
			} else {
				items[i] = items[i] + 1;
			}
		}
		
		public boolean allBelow(long size) {
			for(int i=0;i!=items.length;++i) {
				if(items[i] >= size) {
					return false;
				}				
			}
			return true;
		}
		
		public String toString() {
			return Arrays.toString(items);
		}
	}
	
	public static class Iterator implements java.util.Iterator<SyntacticType> {
		private final int depth;
		private final int width;
		private final long size;
		private long index;

		public Iterator(int depth, int width) {
			this.depth = depth;
			this.width = width;
			this.size = count(depth, width);
		}
		
		public boolean hasNext() {
			return index < size;
		}
		
		public SyntacticType next() {
			return construct(index++,depth,width);
		}
		
		public void skip() {
			index = index + 1;
		}
	}
	
	/**
	 * Construct the type corresponding to a specific index in the given
	 * dimension space.  Each index corresponds to a unique type.
	 * 
	 * @param index
	 * @param depth
	 * @param width
	 * @return
	 */
	private static SyntacticType construct(long index, int depth, int width) {
		long depth_m1 = count(depth-1,width);
		if(index < depth_m1) {
			return construct(index,depth-1,width);
		} else {
			index = index - depth_m1; // index into my space
			return constructWithin(index,depth,width);
		}
	}
	
	/**
	 * Construct a type within a specific space. That is, the index within the
	 * space at a given depth not including lower depths.
	 * 
	 * @param index
	 * @param depth
	 * @param width
	 * @return
	 */
	private static SyntacticType constructWithin(long index, int depth, int width) {
		// Determine size of space at exact depth-1
		if(depth == 0) {
			return PRIMITIVE_TYPES[(int) index];
		} else {
			long depth_m1 = count(depth-1,width);
			long depth_m2 = count(depth-2,width);
			long diff = depth_m1 - depth_m2;
			
			long count = 0;
			for(int i=1;i<=width;++i) {
				if(i == 1) {
					// tuples + negations
					if(index < (count+diff)) {
						// tuple of width 1
						return new SyntacticType.Tuple(constructWithin(index-count,depth-1,width));
					} 
					count += diff;
					if(index < (count+diff)) {
						// negation
						return new SyntacticType.Negation(constructWithin(index-count,depth-1,width));
					}
					count += diff;
				} else {
					long pow = pow(depth_m1,i) - pow(depth_m2,i); 
					// unions, intersections and tuples
					if(index < (count+pow)) {
						// tuple of width i
						long[] dims = getDimensions(index-count,i,depth_m1,depth_m2);
						SyntacticType[] types = getTypes(dims,depth-1,width);
						return new SyntacticType.Tuple(types);
					} 
					count += pow;
					if(index < (count+pow)) {
						// union of width i
						long[] dims = getDimensions(index-count,i,depth_m1,depth_m2);
						SyntacticType[] types = getTypes(dims,depth-1,width);
						return new SyntacticType.Union(types);
					} 
					count += pow;
					if(index < (count+pow)) {
						// intersection of width i
						long[] dims = getDimensions(index-count,i,depth_m1,depth_m2);
						SyntacticType[] types = getTypes(dims,depth-1,width);
						return new SyntacticType.Intersection(types);
					}
					count += pow;
				}
			}
			throw new RuntimeException("deadcode reached: " + index + ", " + count);
		}
	}
	
	private static SyntacticType[] getTypes(long[] indices, int depth, int width) {
		SyntacticType[] types = new SyntacticType[indices.length];
		for(int i=0;i!=indices.length;++i) {
			types[i] = construct(indices[i],depth,width);
		}
		return types;
	}
	
	private static long[] getDimensions(long index, int width, long depth_m1, long depth_m2) {
		Counter counter = new Counter(width,depth_m1 - 1);
		//
		while(counter.allBelow(depth_m2)) {
			counter.increment();
		}
		while(index > 0) {
			index = index - 1;
			counter.increment();
			while(counter.allBelow(depth_m2)) {
				counter.increment();
			}
		}
		return counter.items;
	}
	
	/**
	 * Return the number of elements in the given type space. This includes all
	 * elements in spaces with lower depth and/or width.
	 * 
	 * @param depth
	 * @param width
	 * @return
	 */
	private static long count(int depth, int width) {
		if(depth < 0) {
			return 0;
		} else if(depth == 0) {
			return PRIMITIVE_TYPES.length;
		} else {
			long depth_m1 = count(depth-1,width);
			long depth_m2 = count(depth-2,width);
			long diff = depth_m1 - depth_m2;			
			// 
			long result = depth_m1;
			for(int i=1;i<=width;++i) {
				if(i == 1) {
					// tuples + negations
					result += 2 * diff;
				} else {
					// unions, intersections and tuples
					result += 3 * (pow(depth_m1,i) - pow(depth_m2,i));
				}
			}
			return result;
		}
	}
	
	private static long pow(long base, long exp) {
		long r = 1;
		for(int i=0;i!=exp;++i) {
			r = r * base;
		}
		return r;
	}
	
	private static final SyntacticType[] PRIMITIVE_TYPES = {
		SyntacticType.Any,SyntacticType.Int
	};
	
	public static void main(String[] args) {
		int depth = 2;
		int width = 2;
		//
		// Sanity check the two different ways of generating the space against
		// each other.
		//
		TypeGenerator space = new TypeGenerator(depth,width);
		List<SyntacticType> types = space.generate();
		int i = 0;
		for(SyntacticType t : space) {
			SyntacticType ot = types.get(i++);
			if(!t.equals(ot)) {
				System.out.println("*** MISSING: " + t + " v " + ot);
			}
		}
		//System.out.println("Generated " + types.size() + " types");
		System.out.println("Counted " + count(depth,width) + " types vs " + i);
	}
}
