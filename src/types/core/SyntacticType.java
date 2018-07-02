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
	 * A singleton object representing the primitive void type
	 */
	public static final SyntacticType Void = new Negation(Any);

	/**
	 * Determine whether this type accepts a give value or not. This defines the
	 * meaning of types in terms of a semantic interpretation.
	 *
	 * @param v
	 * @return
	 */
	public abstract boolean accepts(Value v);

	/**
	 * Generate a string version suitable for use with Rascal.
	 *
	 * @return
	 */
	public abstract String toRascalString();

	/**
	 * Represents the primitive integer type
	 *
	 * @author David J. Pearce
	 *
	 */
	public static class Int extends SyntacticType {
		private Int() {}
		@Override
		public String toString() {
			return "int";
		}
		@Override
		public String toRascalString() {
			return "Int()";
		}
		@Override
		public boolean accepts(Value v) {
			return v instanceof Value.Int;
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

		@Override
		public String toString() {
			return "any";
		}
		@Override
		public String toRascalString() {
			return "Any()";
		}
		@Override
		public boolean accepts(Value v) {
			return true;
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
		@Override
		public boolean equals(Object o) {
			if(o instanceof Negation) {
				Negation n = (Negation) o;
				return element.equals(n.element);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return element.hashCode();
		}

		@Override
		public String toString() {
			return "!" + element;
		}
		@Override
		public String toRascalString() {
			return "Not(" + element.toRascalString() + ")";
		}
		@Override
		public boolean accepts(Value v) {
			return !element.accepts(v);
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

		@Override
		public boolean equals(Object o) {
			if(o instanceof Tuple) {
				Tuple t = (Tuple) o;
				return Arrays.equals(elements, t.elements);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return Arrays.hashCode(elements);
		}

		@Override
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

		@Override
		public String toRascalString() {
			String r = "Tuple([";
			for(int i=0;i!=elements.length;++i) {
				if(i!=0) {
					r = r + ", ";
				}
				r = r + elements[i].toRascalString();
			}
			return r + "])";
		}

		@Override
		public boolean accepts(Value v) {
			if (v instanceof Value.Tuple) {
				Value.Tuple t = (Value.Tuple) v;
				if (t.size() == elements.length) {
					for (int i = 0; i != elements.length; ++i) {
						if (!elements[i].accepts(t.get(i))) {
							return false;
						}
					}
					return true;
				}
			}
			return false;
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

		@Override
		public boolean equals(Object o) {
			if(o instanceof Intersection) {
				Intersection t = (Intersection) o;
				return Arrays.equals(elements, t.elements);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return Arrays.hashCode(elements);
		}
		@Override
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

		@Override
		public String toRascalString() {
			String r = "And({";
			for (int i = 0; i != elements.length; ++i) {
				if (i != 0) {
					r = r + ", ";
				}
				r = r + elements[i].toRascalString();
			}
			return r + "})";
		}

		@Override
		public boolean accepts(Value v) {
			for(SyntacticType t : elements) {
				if(!t.accepts(v)) {
					return false;
				}
			}
			return true;
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

		@Override
		public boolean equals(Object o) {
			if(o instanceof Union) {
				Union t = (Union) o;
				return Arrays.equals(elements, t.elements);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return Arrays.hashCode(elements);
		}
		@Override
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

		@Override
		public String toRascalString() {
			String r = "Or({";
			for (int i = 0; i != elements.length; ++i) {
				if (i != 0) {
					r = r + ", ";
				}
				r = r + elements[i].toRascalString();
			}
			return r + "})";
		}

		@Override
		public boolean accepts(Value v) {
			for(SyntacticType t : elements) {
				if(t.accepts(v)) {
					return true;
				}
			}
			return false;
		}
	}
}
