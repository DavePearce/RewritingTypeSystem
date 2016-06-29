package types.core;

import java.util.Arrays;

/**
 * Provides the definition of a value used in the semantic interpretation of
 * types. Specifically, every syntactic type is defined to accept zero or more
 * values and this is its interpretation.
 * 
 * @author David J. Pearce
 *
 */
public abstract class Value {
	
	public static class Int extends Value {
		private final int value;
		
		public Int(int value) {
			this.value = value;
		}
		
		public boolean equals(Object o) {
			if(o instanceof Int) {
				Int i = (Int) o;
				return value == i.value;
			}
			return false;
		}
		
		public int hashCode() {
			return value;
		}
		
		public String toString() {
			return Integer.toString(value);
		}
	}
	
	public static class Tuple extends Value {
		private final Value[] elements;
		
		public Tuple(Value... elements) {
			this.elements = elements;
		}
		
		public int size() {
			return elements.length;
		}
		
		public Value get(int i) {
			return elements[i];
		}
		
		public Value[] getAll() {
			return elements;
		}
		
		public boolean equals(Object o) {
			if(o instanceof Tuple) {
				Tuple t = (Tuple) o;
				return Arrays.equals(elements,t.elements);
			}
			return false;
		}
		
		public int hashCode() {
			return Arrays.hashCode(elements);
		}
		
		public String toString() {
			String r = "";
			for(int i=0;i!=elements.length;++i) {
				if(i != 0) {
					r += ", ";
				}
				r += elements[i];
			}
			return "{" + r + "}";
		}
	}
}
