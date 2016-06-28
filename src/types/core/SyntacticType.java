package types.core;

import java.util.Arrays;

/**
 * Provides a simple representation of types as classes. This is essentially an
 * Abstract Syntax Tree from which we can generate the appropriate forms for the
 * two implementations (e.g. WyRL automata).
 * 
 * @author David J. Pearce
 *
 */
public abstract class SyntacticType {
	
	/**
	 * A singleton object representing the primitive integer type
	 */
	public static final Int Int = new Int();
	
	/**
	 * A singleton object representing the primitive any type
	 */
	public static final Any Any = new Any();
	
	/**
	 * Represents the primitive integer type
	 * 
	 * @author David J. Pearce
	 *
	 */
	public static class Int extends SyntacticType {
		private Int() {}
		public String toString() {
			return "int";
		}
	}
	
	/**
	 * Represents the primitive any type
	 * 
	 * @author David J. Pearce
	 *
	 */
	public static class Any extends SyntacticType {
		private Any() {}
		
		public String toString() {
			return "any";
		}
	}
	
	/**
	 * Represents the negation type
	 * 
	 * @author David J. Pearce
	 *
	 */
	public static class Negation extends SyntacticType {
		private SyntacticType element;
		
		public Negation(SyntacticType element) {
			this.element = element;
		}
		
		public SyntacticType getElement() {
			return element;
		}
		
		public boolean equals(Object o) {
			if(o instanceof Negation) {
				Negation n = (Negation) o;
				return element.equals(n.element);
			}
			return false;
		}
		
		public int hashCode() {
			return element.hashCode();
		}
		
		public String toString() {
			return "!" + element;
		}
	}
	
	/**
	 * Represents the compound tuple type
	 * 
	 * @author David J. Pearce
	 *
	 */
	public static class Tuple extends SyntacticType {
		private SyntacticType[] elements;
		
		public Tuple(SyntacticType... elements) {
			this.elements = elements;
		}
		
		public SyntacticType[] getElements() {
			return elements;
		}
		
		public boolean equals(Object o) {
			if(o instanceof Tuple) {
				Tuple t = (Tuple) o;
				return Arrays.equals(elements, t.elements);
			}
			return false;
		}
		
		public int hashCode() {
			return Arrays.hashCode(elements);
		}
		
		public String toString() {
			String r = "{";
			for(int i=0;i!=elements.length;++i) {
				if(i!=0) {
					r = r + ", ";
				}
				r = r + elements[i].toString();
			}
			return r + "}";
		}
	}
	
	/**
	 * Represents the compound intersection type
	 * 
	 * @author David J. Pearce
	 *
	 */
	public static class Intersection extends SyntacticType {
		private SyntacticType[] elements;

		public Intersection(SyntacticType... elements) {
			this.elements = elements;
		}

		public SyntacticType[] getElements() {
			return elements;
		}
		
		public boolean equals(Object o) {
			if(o instanceof Intersection) {
				Intersection t = (Intersection) o;
				return Arrays.equals(elements, t.elements);
			}
			return false;
		}
		
		public int hashCode() {
			return Arrays.hashCode(elements);
		}
		public String toString() {
			String r = "(";
			for (int i = 0; i != elements.length; ++i) {
				if (i != 0) {
					r = r + " & ";
				}
				r = r + elements[i].toString();
			}
			return r + ")";
		}
	}
	
	/**
	 * Represents the compound union type
	 * 
	 * @author David J. Pearce
	 *
	 */
	public static class Union extends SyntacticType {
		private SyntacticType[] elements;

		public Union(SyntacticType... elements) {
			this.elements = elements;
		}

		public SyntacticType[] getElements() {
			return elements;
		}
		
		public boolean equals(Object o) {
			if(o instanceof Union) {
				Union t = (Union) o;
				return Arrays.equals(elements, t.elements);
			}
			return false;
		}
		
		public int hashCode() {
			return Arrays.hashCode(elements);
		}
		public String toString() {
			String r = "(";
			for (int i = 0; i != elements.length; ++i) {
				if (i != 0) {
					r = r + " | ";
				}
				r = r + elements[i].toString();
			}
			return r + ")";
		}
	}
}
