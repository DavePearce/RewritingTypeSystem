package types.core;

import java.io.*;
import java.util.*;
import java.math.BigInteger;
import wyautl.util.BigRational;
import wyautl.io.*;
import wyautl.core.*;
import wyrw.core.*;
import wyrw.util.AbstractRewriteRule;
import wyrl.core.*;
import wyrl.core.Type;
import wyrl.util.Runtime;
import wyrl.util.Pair;

public final class TypesOptimised {
	// term Void
	public final static int K_Void = 0;
	public final static Automaton.Term Void = new Automaton.Term(K_Void);

	// term Any
	public final static int K_Any = 1;
	public final static Automaton.Term Any = new Automaton.Term(K_Any);

	// term Int
	public final static int K_Int = 2;
	public final static Automaton.Term Int = new Automaton.Term(K_Int);

	// term $7<Tuple(^[$2<^Type<$7|Primitive<Any|Void|Int>|Not($2)|Or(^{$2...})|And(^{$2...})|Canonical(^{$41<^PositiveAtom<Any|Int|Tuple(^[$41...])>>,^NegibleAtom<Void|Not($51<^PosibleAtom<Any|Void|Int|Tuple(^[$51...])|Intersect(^[$41,$41])>>)>...})|Intersect(^[$41,$41])>>...])>
	public final static int K_Tuple = 3;
	public final static int Tuple(Automaton automaton, int... r0) {
		int r1 = automaton.add(new Automaton.List(r0));
		return automaton.add(new Automaton.Term(K_Tuple, r1));
	}
	public final static int Tuple(Automaton automaton, List<Integer> r0) {
		int r1 = automaton.add(new Automaton.List(r0));
		return automaton.add(new Automaton.Term(K_Tuple, r1));
	}

	// term $4<Not($2<^Type<$4|Primitive<Any|Void|Int>|Tuple(^[$2...])|Or(^{$2...})|And(^{$2...})|Canonical(^{$41<^PositiveAtom<Any|Int|Tuple(^[$41...])>>,^NegibleAtom<Void|Not($51<^PosibleAtom<Any|Void|Int|Tuple(^[$51...])|Intersect(^[$41,$41])>>)>...})|Intersect(^[$41,$41])>>)>
	public final static int K_Not = 4;
	public final static int Not(Automaton automaton, int r0) {
		return automaton.add(new Automaton.Term(K_Not, r0));
	}

	// term $7<Or($5<^{$2<^Type<$7|Primitive<Any|Void|Int>|Tuple(^[$2...])|Not($2)|And($5)|Canonical(^{$41<^PositiveAtom<Any|Int|Tuple(^[$41...])>>,^NegibleAtom<Void|Not($51<^PosibleAtom<Any|Void|Int|Tuple(^[$51...])|Intersect(^[$41,$41])>>)>...})|Intersect(^[$41,$41])>>...}>)>
	public final static int K_Or = 5;
	public final static int Or(Automaton automaton, int... r0) {
		int r1 = automaton.add(new Automaton.Set(r0));
		return automaton.add(new Automaton.Term(K_Or, r1));
	}
	public final static int Or(Automaton automaton, List<Integer> r0) {
		int r1 = automaton.add(new Automaton.Set(r0));
		return automaton.add(new Automaton.Term(K_Or, r1));
	}

	// term $7<And($5<^{$2<^Type<$7|Primitive<Any|Void|Int>|Tuple(^[$2...])|Not($2)|Or($5)|Canonical(^{$41<^PositiveAtom<Any|Int|Tuple(^[$41...])>>,^NegibleAtom<Void|Not($51<^PosibleAtom<Any|Void|Int|Tuple(^[$51...])|Intersect(^[$41,$41])>>)>...})|Intersect(^[$41,$41])>>...}>)>
	public final static int K_And = 6;
	public final static int And(Automaton automaton, int... r0) {
		int r1 = automaton.add(new Automaton.Set(r0));
		return automaton.add(new Automaton.Term(K_And, r1));
	}
	public final static int And(Automaton automaton, List<Integer> r0) {
		int r1 = automaton.add(new Automaton.Set(r0));
		return automaton.add(new Automaton.Term(K_And, r1));
	}

	// term Intersect(^[$2<^PositiveAtom<Int|Any|Tuple(^[$2...])>>,$2])
	public final static int K_Intersect = 7;
	public final static int Intersect(Automaton automaton, int... r0) {
		int r1 = automaton.add(new Automaton.List(r0));
		return automaton.add(new Automaton.Term(K_Intersect, r1));
	}
	public final static int Intersect(Automaton automaton, List<Integer> r0) {
		int r1 = automaton.add(new Automaton.List(r0));
		return automaton.add(new Automaton.Term(K_Intersect, r1));
	}

	// term Canonical(^{$2<^PositiveAtom<Int|Any|Tuple(^[$2...])>>,^NegibleAtom<Void|Not($16<^PosibleAtom<Void|Int|Any|Tuple(^[$16...])|Intersect(^[$2,$2])>>)>...})
	public final static int K_Canonical = 8;
	public final static int Canonical(Automaton automaton, int... r0) {
		int r1 = automaton.add(new Automaton.Set(r0));
		return automaton.add(new Automaton.Term(K_Canonical, r1));
	}
	public final static int Canonical(Automaton automaton, List<Integer> r0) {
		int r1 = automaton.add(new Automaton.Set(r0));
		return automaton.add(new Automaton.Term(K_Canonical, r1));
	}

	// term Root($2<^Type<Primitive<Any|Void|Int>|Tuple(^[$2...])|Not($2)|Or(^{$2...})|And(^{$2...})|Canonical(^{$44<^PositiveAtom<Any|Int|Tuple(^[$44...])>>,^NegibleAtom<Void|Not($54<^PosibleAtom<Any|Void|Int|Tuple(^[$54...])|Intersect(^[$44,$44])>>)>...})|Intersect(^[$44,$44])>>)
	public final static int K_Root = 9;
	public final static int Root(Automaton automaton, int r0) {
		return automaton.add(new Automaton.Term(K_Root, r0));
	}

	private final static class Reduction_0 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_0(Pattern.Term pattern) {
			super(pattern);
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Not) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				if(Runtime.accepts(type0,automaton,automaton.get(r1), SCHEMA)) {
					int[] state = {r0, r1};
					activations.add(new Reduction.Activation(this,null,state));
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.Term r2 = Void;
			int r3 = automaton.add(r2);
			if(r0 != r3) {
				return automaton.rewrite(r0, r3);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_1 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_1(Pattern.Term pattern) {
			super(pattern);
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Or) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.Collection c1 = (Automaton.Collection) s1;
				if(c1.size() == 1) {
					for(int r3=0;r3!=c1.size();++r3) {
						int r2 = c1.get(r3);
						if(Runtime.accepts(type1,automaton,automaton.get(r2), SCHEMA)) {
							int[] state = {r0, r1, r2, r3};
							activations.add(new Reduction.Activation(this,null,state));
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r3 = state[3];
			Automaton.Term r4 = Void;
			int r5 = automaton.add(r4);
			if(r0 != r5) {
				return automaton.rewrite(r0, r5);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_2 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_2(Pattern.Term pattern) {
			super(pattern);
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Or) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.Collection c1 = (Automaton.Collection) s1;
				if(c1.size() >= 1) {
					for(int r3=0;r3!=c1.size();++r3) {
						int r2 = c1.get(r3);
						Automaton.State s2 = automaton.get(r2);
						if(s2.kind == K_Or) {
							Automaton.Term t2 = (Automaton.Term) s2;
							int r4 = t2.contents;
							Automaton.State s4 = automaton.get(r4);
							Automaton.Collection c4 = (Automaton.Collection) s4;
							int[] state = {r0, r1, r2, r3, r4, 0, 0};
							activations.add(new Reduction.Activation(this,null,state));
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r3 = state[3];
			Automaton.Collection c4 = (Automaton.Collection) automaton.get(state[4]);
			int[] c4children = new int[c4.size() - 0];
			for(int s4i=0, s4j=0; s4i != c4.size();++s4i) {
				c4children[s4j++] = c4.get(s4i);
			}
			Automaton.Set r5 = new Automaton.Set(c4children);
			Automaton.Collection c1 = (Automaton.Collection) automaton.get(state[1]);
			int[] c1children = new int[c1.size() - 1];
			for(int s1i=0, s1j=0; s1i != c1.size();++s1i) {
				if(s1i == r3) { continue; }
				c1children[s1j++] = c1.get(s1i);
			}
			Automaton.Set r6 = new Automaton.Set(c1children);
			Automaton.Set r7 = r5.append(r6); // t1s append t2s
			int r8 = automaton.add(r7);
			Automaton.Term r9 = new Automaton.Term(K_Or, r8);
			int r10 = automaton.add(r9);
			if(r0 != r10) {
				return automaton.rewrite(r0, r10);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_3 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_3(Pattern.Term pattern) {
			super(pattern);
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_And) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.Collection c1 = (Automaton.Collection) s1;
				if(c1.size() >= 1) {
					for(int r3=0;r3!=c1.size();++r3) {
						int r2 = c1.get(r3);
						Automaton.State s2 = automaton.get(r2);
						if(s2.kind == K_And) {
							Automaton.Term t2 = (Automaton.Term) s2;
							int r4 = t2.contents;
							Automaton.State s4 = automaton.get(r4);
							Automaton.Collection c4 = (Automaton.Collection) s4;
							int[] state = {r0, r1, r2, r3, r4, 0, 0};
							activations.add(new Reduction.Activation(this,null,state));
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r3 = state[3];
			Automaton.Collection c4 = (Automaton.Collection) automaton.get(state[4]);
			int[] c4children = new int[c4.size() - 0];
			for(int s4i=0, s4j=0; s4i != c4.size();++s4i) {
				c4children[s4j++] = c4.get(s4i);
			}
			Automaton.Set r5 = new Automaton.Set(c4children);
			Automaton.Collection c1 = (Automaton.Collection) automaton.get(state[1]);
			int[] c1children = new int[c1.size() - 1];
			for(int s1i=0, s1j=0; s1i != c1.size();++s1i) {
				if(s1i == r3) { continue; }
				c1children[s1j++] = c1.get(s1i);
			}
			Automaton.Set r6 = new Automaton.Set(c1children);
			Automaton.Set r7 = r5.append(r6); // t1s append t2s
			int r8 = automaton.add(r7);
			Automaton.Term r9 = new Automaton.Term(K_And, r8);
			int r10 = automaton.add(r9);
			if(r0 != r10) {
				return automaton.rewrite(r0, r10);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_4 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_4(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 6(1)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Intersect) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				int r2 = l1.get(0);
				int r3 = l1.get(1);
				boolean r4 = r2 == r3;         // t1 eq t2
				if(r4) { // REQUIRES
					int[] state = {r0, r1, r2, r3};
					activations.add(new Reduction.Activation(this,null,state));
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r2 = state[2]; // t1
			int r3 = state[3]; // t2
			if(r0 != r2) {
				return automaton.rewrite(r0, r2);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_5 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_5(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 6(2)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Intersect) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				int r2 = l1.get(0);
				if(Runtime.accepts(type0,automaton,automaton.get(r2), SCHEMA)) {
					int r3 = l1.get(1);
					int[] state = {r0, r1, r2, r3};
					activations.add(new Reduction.Activation(this,null,state));
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r3 = state[3]; // t
			if(r0 != r3) {
				return automaton.rewrite(r0, r3);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_6 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_6(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 6(3)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Intersect) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				int r2 = l1.get(0);
				int r3 = l1.get(1);
				if(Runtime.accepts(type0,automaton,automaton.get(r3), SCHEMA)) {
					int[] state = {r0, r1, r2, r3};
					activations.add(new Reduction.Activation(this,null,state));
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r2 = state[2]; // t
			if(r0 != r2) {
				return automaton.rewrite(r0, r2);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_7 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_7(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 6(4)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Intersect) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				int r2 = l1.get(0);
				if(Runtime.accepts(type4,automaton,automaton.get(r2), SCHEMA)) {
					int r3 = l1.get(1);
					if(Runtime.accepts(type5,automaton,automaton.get(r3), SCHEMA)) {
						int[] state = {r0, r1, r2, r3};
						activations.add(new Reduction.Activation(this,null,state));
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.Term r4 = Void;
			int r5 = automaton.add(r4);
			if(r0 != r5) {
				return automaton.rewrite(r0, r5);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_8 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_8(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 6(5)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Intersect) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				int r2 = l1.get(0);
				if(Runtime.accepts(type5,automaton,automaton.get(r2), SCHEMA)) {
					int r3 = l1.get(1);
					if(Runtime.accepts(type4,automaton,automaton.get(r3), SCHEMA)) {
						int[] state = {r0, r1, r2, r3};
						activations.add(new Reduction.Activation(this,null,state));
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.Term r4 = Void;
			int r5 = automaton.add(r4);
			if(r0 != r5) {
				return automaton.rewrite(r0, r5);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_9 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_9(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 6(6)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Intersect) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				int r2 = l1.get(0);
				Automaton.State s2 = automaton.get(r2);
				if(s2.kind == K_Tuple) {
					Automaton.Term t2 = (Automaton.Term) s2;
					int r3 = t2.contents;
					Automaton.State s3 = automaton.get(r3);
					Automaton.List l3 = (Automaton.List) s3;
					int r5 = l1.get(1);
					Automaton.State s5 = automaton.get(r5);
					if(s5.kind == K_Tuple) {
						Automaton.Term t5 = (Automaton.Term) s5;
						int r6 = t5.contents;
						Automaton.State s6 = automaton.get(r6);
						Automaton.List l6 = (Automaton.List) s6;
						Automaton.List r4 = l3;
						Automaton.List r7 = l6;
						Automaton.Int r8 = r4.lengthOf(); // |ns|
						Automaton.Int r9 = r7.lengthOf(); // |ms|
						boolean r10 = !r8.equals(r9);  // |ns| neq |ms|
						if(r10) { // REQUIRES
							int[] state = {r0, r1, r2, r3, 0, r5, r6, 0};
							activations.add(new Reduction.Activation(this,null,state));
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.List r4 = ((Automaton.List) automaton.get(state[3])).sublist(0);
			Automaton.List r7 = ((Automaton.List) automaton.get(state[6])).sublist(0);
			Automaton.Term r8 = Void;
			int r9 = automaton.add(r8);
			if(r0 != r9) {
				return automaton.rewrite(r0, r9);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_10 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_10(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 6(7)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Tuple) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				Automaton.List r2 = l1;
				Automaton.List t3 = new Automaton.List();
				boolean r3 = false;
				outer:
				for(int i4=0;i4<r2.size();i4++) {
					int r4 = (int) r2.get(i4);
					boolean r5 = Runtime.accepts(type6, automaton, r4, SCHEMA); // t is ^Void
					if(r5) {
						r3 = true;
						break outer;
					}
				}
				if(r3) { // REQUIRES
					int[] state = {r0, r1, 0};
					activations.add(new Reduction.Activation(this,null,state));
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.List r2 = ((Automaton.List) automaton.get(state[1])).sublist(0);
			Automaton.Term r3 = Void;
			int r4 = automaton.add(r3);
			if(r0 != r4) {
				return automaton.rewrite(r0, r4);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_11 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_11(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 6(8)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Intersect) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				int r2 = l1.get(0);
				Automaton.State s2 = automaton.get(r2);
				if(s2.kind == K_Tuple) {
					Automaton.Term t2 = (Automaton.Term) s2;
					int r3 = t2.contents;
					Automaton.State s3 = automaton.get(r3);
					Automaton.List l3 = (Automaton.List) s3;
					int r5 = l1.get(1);
					Automaton.State s5 = automaton.get(r5);
					if(s5.kind == K_Tuple) {
						Automaton.Term t5 = (Automaton.Term) s5;
						int r6 = t5.contents;
						Automaton.State s6 = automaton.get(r6);
						Automaton.List l6 = (Automaton.List) s6;
						Automaton.List r4 = l3;
						Automaton.List r7 = l6;
						Automaton.Int r8 = r4.lengthOf(); // |ns|
						Automaton.Int r9 = r7.lengthOf(); // |ms|
						boolean r10 = r8.equals(r9);   // |ns| eq |ms|
						if(r10) { // REQUIRES
							int[] state = {r0, r1, r2, r3, 0, r5, r6, 0};
							activations.add(new Reduction.Activation(this,null,state));
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.List r4 = ((Automaton.List) automaton.get(state[3])).sublist(0);
			Automaton.List r7 = ((Automaton.List) automaton.get(state[6])).sublist(0);
			Automaton.Int r9 = new Automaton.Int(0); // 0
			Automaton.Int r10 = r4.lengthOf(); // |ns|
			Automaton.List r11 = Runtime.rangeOf(automaton,r9,r10); // 0 range |ns|
			Automaton.List t8 = new Automaton.List();
			for(int i12=0;i12<r11.size();i12++) {
				Automaton.Int r12 = (Automaton.Int) automaton.get(r11.get(i12));;
				int r13 = r4.indexOf(r12);     // ns[i]
				int r14 = r7.indexOf(r12);     // ms[i]
				Automaton.List r15 = new Automaton.List(r13, r14); // [ns[i]ms[i]]
				int r16 = automaton.add(r15);
				Automaton.Term r17 = new Automaton.Term(K_Intersect, r16);
				int r18 = automaton.add(r17);
				t8.add(r18);
			}
			Automaton.List r8 = t8;
			int r19 = automaton.add(r8);
			Automaton.Term r20 = new Automaton.Term(K_Tuple, r19);
			int r21 = automaton.add(r20);
			if(r0 != r21) {
				return automaton.rewrite(r0, r21);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_12 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_12(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 7(1)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Not) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				if(s1.kind == K_Not) {
					Automaton.Term t1 = (Automaton.Term) s1;
					int r2 = t1.contents;
					int[] state = {r0, r1, r2};
					activations.add(new Reduction.Activation(this,null,state));
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r2 = state[2]; // t
			if(r0 != r2) {
				return automaton.rewrite(r0, r2);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_13 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_13(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 7(2)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Not) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				if(s1.kind == K_Or) {
					Automaton.Term t1 = (Automaton.Term) s1;
					int r2 = t1.contents;
					Automaton.State s2 = automaton.get(r2);
					Automaton.Collection c2 = (Automaton.Collection) s2;
					int[] state = {r0, r1, r2, 0};
					activations.add(new Reduction.Activation(this,null,state));
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.Collection c2 = (Automaton.Collection) automaton.get(state[2]);
			int[] c2children = new int[c2.size() - 0];
			for(int s2i=0, s2j=0; s2i != c2.size();++s2i) {
				c2children[s2j++] = c2.get(s2i);
			}
			Automaton.Set r3 = new Automaton.Set(c2children);
			Automaton.List t4 = new Automaton.List();
			for(int i5=0;i5<r3.size();i5++) {
				int r5 = (int) r3.get(i5);
				Automaton.Term r6 = new Automaton.Term(K_Not, r5);
				int r7 = automaton.add(r6);
				t4.add(r7);
			}
			Automaton.Set r4 = new Automaton.Set(t4.toArray());
			int r8 = automaton.add(r4);
			Automaton.Term r9 = new Automaton.Term(K_And, r8);
			int r10 = automaton.add(r9);
			if(r0 != r10) {
				return automaton.rewrite(r0, r10);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_14 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_14(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 7(3)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Not) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				if(s1.kind == K_And) {
					Automaton.Term t1 = (Automaton.Term) s1;
					int r2 = t1.contents;
					Automaton.State s2 = automaton.get(r2);
					Automaton.Collection c2 = (Automaton.Collection) s2;
					int[] state = {r0, r1, r2, 0};
					activations.add(new Reduction.Activation(this,null,state));
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.Collection c2 = (Automaton.Collection) automaton.get(state[2]);
			int[] c2children = new int[c2.size() - 0];
			for(int s2i=0, s2j=0; s2i != c2.size();++s2i) {
				c2children[s2j++] = c2.get(s2i);
			}
			Automaton.Set r3 = new Automaton.Set(c2children);
			Automaton.List t4 = new Automaton.List();
			for(int i5=0;i5<r3.size();i5++) {
				int r5 = (int) r3.get(i5);
				Automaton.Term r6 = new Automaton.Term(K_Not, r5);
				int r7 = automaton.add(r6);
				t4.add(r7);
			}
			Automaton.Set r4 = new Automaton.Set(t4.toArray());
			int r8 = automaton.add(r4);
			Automaton.Term r9 = new Automaton.Term(K_Or, r8);
			int r10 = automaton.add(r9);
			if(r0 != r10) {
				return automaton.rewrite(r0, r10);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_15 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_15(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 7(4)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_And) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.Collection c1 = (Automaton.Collection) s1;
				if(c1.size() >= 1) {
					for(int r3=0;r3!=c1.size();++r3) {
						int r2 = c1.get(r3);
						Automaton.State s2 = automaton.get(r2);
						if(s2.kind == K_Or) {
							Automaton.Term t2 = (Automaton.Term) s2;
							int r4 = t2.contents;
							Automaton.State s4 = automaton.get(r4);
							Automaton.Collection c4 = (Automaton.Collection) s4;
							int[] state = {r0, r1, r2, r3, r4, 0, 0};
							activations.add(new Reduction.Activation(this,null,state));
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r3 = state[3];
			Automaton.Collection c4 = (Automaton.Collection) automaton.get(state[4]);
			int[] c4children = new int[c4.size() - 0];
			for(int s4i=0, s4j=0; s4i != c4.size();++s4i) {
				c4children[s4j++] = c4.get(s4i);
			}
			Automaton.Set r5 = new Automaton.Set(c4children);
			Automaton.Collection c1 = (Automaton.Collection) automaton.get(state[1]);
			int[] c1children = new int[c1.size() - 1];
			for(int s1i=0, s1j=0; s1i != c1.size();++s1i) {
				if(s1i == r3) { continue; }
				c1children[s1j++] = c1.get(s1i);
			}
			Automaton.Set r6 = new Automaton.Set(c1children);
			Automaton.List t7 = new Automaton.List();
			for(int i8=0;i8<r5.size();i8++) {
				int r8 = (int) r5.get(i8);
				Automaton.Set r9 = r6.appendFront(r8); // x append ys
				int r10 = automaton.add(r9);
				Automaton.Term r11 = new Automaton.Term(K_And, r10);
				int r12 = automaton.add(r11);
				t7.add(r12);
			}
			Automaton.Set r7 = new Automaton.Set(t7.toArray());
			int r13 = automaton.add(r7);
			Automaton.Term r14 = new Automaton.Term(K_Or, r13);
			int r15 = automaton.add(r14);
			if(r0 != r15) {
				return automaton.rewrite(r0, r15);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_16 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_16(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 7(5a)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Tuple) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				if(l1.size() >= 1) {
					int r2 = l1.get(0);
					Automaton.State s2 = automaton.get(r2);
					if(s2.kind == K_Or) {
						Automaton.Term t2 = (Automaton.Term) s2;
						int r3 = t2.contents;
						Automaton.State s3 = automaton.get(r3);
						Automaton.Collection c3 = (Automaton.Collection) s3;
						int[] state = {r0, r1, r2, r3, 0, 0};
						activations.add(new Reduction.Activation(this,null,state));
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.Collection c3 = (Automaton.Collection) automaton.get(state[3]);
			int[] c3children = new int[c3.size() - 0];
			for(int s3i=0, s3j=0; s3i != c3.size();++s3i) {
				c3children[s3j++] = c3.get(s3i);
			}
			Automaton.Set r4 = new Automaton.Set(c3children);
			Automaton.List r5 = ((Automaton.List) automaton.get(state[1])).sublist(1);
			Automaton.List t6 = new Automaton.List();
			for(int i7=0;i7<r4.size();i7++) {
				int r7 = (int) r4.get(i7);
				Automaton.List r8 = r5.appendFront(r7); // r append ts
				int r9 = automaton.add(r8);
				Automaton.Term r10 = new Automaton.Term(K_Tuple, r9);
				int r11 = automaton.add(r10);
				t6.add(r11);
			}
			Automaton.Set r6 = new Automaton.Set(t6.toArray());
			int r12 = automaton.add(r6);
			Automaton.Term r13 = new Automaton.Term(K_Or, r12);
			int r14 = automaton.add(r13);
			if(r0 != r14) {
				return automaton.rewrite(r0, r14);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_17 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_17(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 7(5b)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Tuple) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				if(l1.size() >= 2) {
					int r2 = l1.get(0);
					int r3 = l1.get(1);
					Automaton.State s3 = automaton.get(r3);
					if(s3.kind == K_Or) {
						Automaton.Term t3 = (Automaton.Term) s3;
						int r4 = t3.contents;
						Automaton.State s4 = automaton.get(r4);
						Automaton.Collection c4 = (Automaton.Collection) s4;
						int[] state = {r0, r1, r2, r3, r4, 0, 0};
						activations.add(new Reduction.Activation(this,null,state));
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r2 = state[2]; // t1
			Automaton.Collection c4 = (Automaton.Collection) automaton.get(state[4]);
			int[] c4children = new int[c4.size() - 0];
			for(int s4i=0, s4j=0; s4i != c4.size();++s4i) {
				c4children[s4j++] = c4.get(s4i);
			}
			Automaton.Set r5 = new Automaton.Set(c4children);
			Automaton.List r6 = ((Automaton.List) automaton.get(state[1])).sublist(2);
			Automaton.List t7 = new Automaton.List();
			for(int i8=0;i8<r5.size();i8++) {
				int r8 = (int) r5.get(i8);
				Automaton.List r9 = new Automaton.List(r2, r8); // [t1r]
				Automaton.List r10 = r9.append(r6); // [t1r] append ts
				int r11 = automaton.add(r10);
				Automaton.Term r12 = new Automaton.Term(K_Tuple, r11);
				int r13 = automaton.add(r12);
				t7.add(r13);
			}
			Automaton.Set r7 = new Automaton.Set(t7.toArray());
			int r14 = automaton.add(r7);
			Automaton.Term r15 = new Automaton.Term(K_Or, r14);
			int r16 = automaton.add(r15);
			if(r0 != r16) {
				return automaton.rewrite(r0, r16);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_18 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_18(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 7(6a)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Tuple) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				if(l1.size() >= 1) {
					int r2 = l1.get(0);
					Automaton.State s2 = automaton.get(r2);
					if(s2.kind == K_And) {
						Automaton.Term t2 = (Automaton.Term) s2;
						int r3 = t2.contents;
						Automaton.State s3 = automaton.get(r3);
						Automaton.Collection c3 = (Automaton.Collection) s3;
						int[] state = {r0, r1, r2, r3, 0, 0};
						activations.add(new Reduction.Activation(this,null,state));
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.Collection c3 = (Automaton.Collection) automaton.get(state[3]);
			int[] c3children = new int[c3.size() - 0];
			for(int s3i=0, s3j=0; s3i != c3.size();++s3i) {
				c3children[s3j++] = c3.get(s3i);
			}
			Automaton.Set r4 = new Automaton.Set(c3children);
			Automaton.List r5 = ((Automaton.List) automaton.get(state[1])).sublist(1);
			Automaton.List t6 = new Automaton.List();
			for(int i7=0;i7<r4.size();i7++) {
				int r7 = (int) r4.get(i7);
				Automaton.List r8 = r5.appendFront(r7); // r append ts
				int r9 = automaton.add(r8);
				Automaton.Term r10 = new Automaton.Term(K_Tuple, r9);
				int r11 = automaton.add(r10);
				t6.add(r11);
			}
			Automaton.Set r6 = new Automaton.Set(t6.toArray());
			int r12 = automaton.add(r6);
			Automaton.Term r13 = new Automaton.Term(K_And, r12);
			int r14 = automaton.add(r13);
			if(r0 != r14) {
				return automaton.rewrite(r0, r14);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_19 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_19(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 7(6b)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Tuple) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				if(l1.size() >= 2) {
					int r2 = l1.get(0);
					int r3 = l1.get(1);
					Automaton.State s3 = automaton.get(r3);
					if(s3.kind == K_And) {
						Automaton.Term t3 = (Automaton.Term) s3;
						int r4 = t3.contents;
						Automaton.State s4 = automaton.get(r4);
						Automaton.Collection c4 = (Automaton.Collection) s4;
						int[] state = {r0, r1, r2, r3, r4, 0, 0};
						activations.add(new Reduction.Activation(this,null,state));
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r2 = state[2]; // t1
			Automaton.Collection c4 = (Automaton.Collection) automaton.get(state[4]);
			int[] c4children = new int[c4.size() - 0];
			for(int s4i=0, s4j=0; s4i != c4.size();++s4i) {
				c4children[s4j++] = c4.get(s4i);
			}
			Automaton.Set r5 = new Automaton.Set(c4children);
			Automaton.List r6 = ((Automaton.List) automaton.get(state[1])).sublist(2);
			Automaton.List t7 = new Automaton.List();
			for(int i8=0;i8<r5.size();i8++) {
				int r8 = (int) r5.get(i8);
				Automaton.List r9 = new Automaton.List(r2, r8); // [t1r]
				Automaton.List r10 = r9.append(r6); // [t1r] append ts
				int r11 = automaton.add(r10);
				Automaton.Term r12 = new Automaton.Term(K_Tuple, r11);
				int r13 = automaton.add(r12);
				t7.add(r13);
			}
			Automaton.Set r7 = new Automaton.Set(t7.toArray());
			int r14 = automaton.add(r7);
			Automaton.Term r15 = new Automaton.Term(K_And, r14);
			int r16 = automaton.add(r15);
			if(r0 != r16) {
				return automaton.rewrite(r0, r16);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_20 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_20(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 7(7a)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Tuple) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				if(l1.size() >= 1) {
					int r2 = l1.get(0);
					Automaton.State s2 = automaton.get(r2);
					if(s2.kind == K_Not) {
						Automaton.Term t2 = (Automaton.Term) s2;
						int r3 = t2.contents;
						int[] state = {r0, r1, r2, r3, 0};
						activations.add(new Reduction.Activation(this,null,state));
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r3 = state[3]; // t1
			Automaton.List r4 = ((Automaton.List) automaton.get(state[1])).sublist(1);
			Automaton.Term r5 = Any;
			int r6 = automaton.add(r5);
			Automaton.List r7 = r4.appendFront(r6); // Any append ts
			int r8 = automaton.add(r7);
			Automaton.Term r9 = new Automaton.Term(K_Tuple, r8);
			Automaton.List r10 = r4.appendFront(r3); // t1 append ts
			int r11 = automaton.add(r10);
			Automaton.Term r12 = new Automaton.Term(K_Tuple, r11);
			int r13 = automaton.add(r12);
			Automaton.Term r14 = new Automaton.Term(K_Not, r13);
			int r15 = automaton.add(r9);
			int r16 = automaton.add(r14);
			Automaton.Set r17 = new Automaton.Set(r15, r16); // {lhsrhs}
			int r18 = automaton.add(r17);
			Automaton.Term r19 = new Automaton.Term(K_And, r18);
			int r20 = automaton.add(r19);
			if(r0 != r20) {
				return automaton.rewrite(r0, r20);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_21 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_21(Pattern.Term pattern) {
			super(pattern);
			put("name","Def 7(7b)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Tuple) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.List l1 = (Automaton.List) s1;
				if(l1.size() >= 2) {
					int r2 = l1.get(0);
					int r3 = l1.get(1);
					Automaton.State s3 = automaton.get(r3);
					if(s3.kind == K_Not) {
						Automaton.Term t3 = (Automaton.Term) s3;
						int r4 = t3.contents;
						int[] state = {r0, r1, r2, r3, r4, 0};
						activations.add(new Reduction.Activation(this,null,state));
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r2 = state[2]; // t1
			int r4 = state[4]; // t2
			Automaton.List r5 = ((Automaton.List) automaton.get(state[1])).sublist(2);
			Automaton.Term r6 = Any;
			int r7 = automaton.add(r6);
			Automaton.List r8 = new Automaton.List(r2, r7); // [t1Any]
			Automaton.List r9 = r8.append(r5); // [t1Any] append ts
			int r10 = automaton.add(r9);
			Automaton.Term r11 = new Automaton.Term(K_Tuple, r10);
			Automaton.List r12 = new Automaton.List(r2, r4); // [t1t2]
			Automaton.List r13 = r12.append(r5); // [t1t2] append ts
			int r14 = automaton.add(r13);
			Automaton.Term r15 = new Automaton.Term(K_Tuple, r14);
			int r16 = automaton.add(r15);
			Automaton.Term r17 = new Automaton.Term(K_Not, r16);
			int r18 = automaton.add(r11);
			int r19 = automaton.add(r17);
			Automaton.Set r20 = new Automaton.Set(r18, r19); // {lhsrhs}
			int r21 = automaton.add(r20);
			Automaton.Term r22 = new Automaton.Term(K_And, r21);
			int r23 = automaton.add(r22);
			if(r0 != r23) {
				return automaton.rewrite(r0, r23);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_22 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_22(Pattern.Term pattern) {
			super(pattern);
			put("name","Fig 2(1a)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_And) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.Collection c1 = (Automaton.Collection) s1;
				if(c1.size() >= 1) {
					for(int r3=0;r3!=c1.size();++r3) {
						int r2 = c1.get(r3);
						if(Runtime.accepts(type1,automaton,automaton.get(r2), SCHEMA)) {
							int[] state = {r0, r1, r2, r3, 0};
							activations.add(new Reduction.Activation(this,null,state));
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r3 = state[3];
			Automaton.Collection c1 = (Automaton.Collection) automaton.get(state[1]);
			int[] c1children = new int[c1.size() - 1];
			for(int s1i=0, s1j=0; s1i != c1.size();++s1i) {
				if(s1i == r3) { continue; }
				c1children[s1j++] = c1.get(s1i);
			}
			Automaton.Set r4 = new Automaton.Set(c1children);
			Automaton.Term r5 = Void;
			int r6 = automaton.add(r5);
			if(r0 != r6) {
				return automaton.rewrite(r0, r6);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_23 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_23(Pattern.Term pattern) {
			super(pattern);
			put("name","Fig 2(1b)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Canonical) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.Collection c1 = (Automaton.Collection) s1;
				for(int r3=0;r3!=c1.size();++r3) {
					int r2 = c1.get(r3);
					if(Runtime.accepts(type1,automaton,automaton.get(r2), SCHEMA)) {
						int[] state = {r0, r1, r2, r3, 0};
						activations.add(new Reduction.Activation(this,null,state));
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r3 = state[3];
			Automaton.Collection c1 = (Automaton.Collection) automaton.get(state[1]);
			int[] c1children = new int[c1.size() - 1];
			for(int s1i=0, s1j=0; s1i != c1.size();++s1i) {
				if(s1i == r3) { continue; }
				c1children[s1j++] = c1.get(s1i);
			}
			Automaton.Set r4 = new Automaton.Set(c1children);
			Automaton.Term r5 = Void;
			int r6 = automaton.add(r5);
			if(r0 != r6) {
				return automaton.rewrite(r0, r6);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_24 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_24(Pattern.Term pattern) {
			super(pattern);
			put("name","Fig 2(2)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_And) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.Collection c1 = (Automaton.Collection) s1;
				if(c1.size() >= 2) {
					for(int r3=0;r3!=c1.size();++r3) {
						int r2 = c1.get(r3);
						if(Runtime.accepts(type3,automaton,automaton.get(r2), SCHEMA)) {
							for(int r5=0;r5!=c1.size();++r5) {
								if(r5 == r3) { continue; }
								int r4 = c1.get(r5);
								if(Runtime.accepts(type3,automaton,automaton.get(r4), SCHEMA)) {
									int[] state = {r0, r1, r2, r3, r4, r5, 0};
									activations.add(new Reduction.Activation(this,null,state));
								}
							}
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r2 = state[2]; // t1
			int r3 = state[3];
			int r4 = state[4]; // t2
			int r5 = state[5];
			Automaton.Collection c1 = (Automaton.Collection) automaton.get(state[1]);
			int[] c1children = new int[c1.size() - 2];
			for(int s1i=0, s1j=0; s1i != c1.size();++s1i) {
				if(s1i == r3 || s1i == r5) { continue; }
				c1children[s1j++] = c1.get(s1i);
			}
			Automaton.Set r6 = new Automaton.Set(c1children);
			Automaton.List r7 = new Automaton.List(r2, r4); // [t1t2]
			int r8 = automaton.add(r7);
			Automaton.Term r9 = new Automaton.Term(K_Intersect, r8);
			int r10 = automaton.add(r9);
			Automaton.Set r11 = r6.appendFront(r10); // Intersect([t1t2]) append ts
			int r12 = automaton.add(r11);
			Automaton.Term r13 = new Automaton.Term(K_And, r12);
			int r14 = automaton.add(r13);
			if(r0 != r14) {
				return automaton.rewrite(r0, r14);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_25 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_25(Pattern.Term pattern) {
			super(pattern);
			put("name","Fig 2(3)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Canonical) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.Collection c1 = (Automaton.Collection) s1;
				if(c1.size() >= 2) {
					for(int r3=0;r3!=c1.size();++r3) {
						int r2 = c1.get(r3);
						for(int r5=0;r5!=c1.size();++r5) {
							if(r5 == r3) { continue; }
							int r4 = c1.get(r5);
							Automaton.State s4 = automaton.get(r4);
							if(s4.kind == K_Not) {
								Automaton.Term t4 = (Automaton.Term) s4;
								int r6 = t4.contents;
								if(Runtime.accepts(type3,automaton,automaton.get(r6), SCHEMA)) {
									int[] c1children = new int[c1.size() - 2];
									for(int s1i=0, s1j=0; s1i != c1.size();++s1i) {
										if(s1i == r3 || s1i == r5) { continue; }
										c1children[s1j++] = c1.get(s1i);
									}
									Automaton.Set r7 = new Automaton.Set(c1children);
									boolean r8 = r2 == r6;         // t1 eq t2
									if(r8) { // REQUIRES
										int[] state = {r0, r1, r2, r3, r4, r5, r6, 0};
										activations.add(new Reduction.Activation(this,null,state));
									}
								}
							}
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r2 = state[2]; // t1
			int r3 = state[3];
			int r5 = state[5];
			int r6 = state[6]; // t2
			Automaton.Collection c1 = (Automaton.Collection) automaton.get(state[1]);
			int[] c1children = new int[c1.size() - 2];
			for(int s1i=0, s1j=0; s1i != c1.size();++s1i) {
				if(s1i == r3 || s1i == r5) { continue; }
				c1children[s1j++] = c1.get(s1i);
			}
			Automaton.Set r7 = new Automaton.Set(c1children);
			Automaton.Term r8 = Void;
			int r9 = automaton.add(r8);
			if(r0 != r9) {
				return automaton.rewrite(r0, r9);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_26 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_26(Pattern.Term pattern) {
			super(pattern);
			put("name","Fig 2(4)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Canonical) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				Automaton.Collection c1 = (Automaton.Collection) s1;
				if(c1.size() >= 2) {
					for(int r3=0;r3!=c1.size();++r3) {
						int r2 = c1.get(r3);
						for(int r5=0;r5!=c1.size();++r5) {
							if(r5 == r3) { continue; }
							int r4 = c1.get(r5);
							Automaton.State s4 = automaton.get(r4);
							if(s4.kind == K_Not) {
								Automaton.Term t4 = (Automaton.Term) s4;
								int r6 = t4.contents;
								if(Runtime.accepts(type1,automaton,automaton.get(r6), SCHEMA)) {
									int[] state = {r0, r1, r2, r3, r4, r5, r6, 0};
									activations.add(new Reduction.Activation(this,null,state));
								}
							}
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r2 = state[2]; // p
			int r3 = state[3];
			int r4 = state[4]; // x
			int r5 = state[5];
			Automaton.Collection c1 = (Automaton.Collection) automaton.get(state[1]);
			int[] c1children = new int[c1.size() - 2];
			for(int s1i=0, s1j=0; s1i != c1.size();++s1i) {
				if(s1i == r3 || s1i == r5) { continue; }
				c1children[s1j++] = c1.get(s1i);
			}
			Automaton.Set r7 = new Automaton.Set(c1children);
			Automaton.Set r8 = r7.appendFront(r2); // p append ts
			int r9 = automaton.add(r8);
			Automaton.Term r10 = new Automaton.Term(K_Canonical, r9);
			int r11 = automaton.add(r10);
			if(r0 != r11) {
				return automaton.rewrite(r0, r11);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_27 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_27(Pattern.Term pattern) {
			super(pattern);
			put("name","Fig 2(5a)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Root) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				if(s1.kind == K_And) {
					Automaton.Term t1 = (Automaton.Term) s1;
					int r2 = t1.contents;
					Automaton.State s2 = automaton.get(r2);
					Automaton.Collection c2 = (Automaton.Collection) s2;
					if(c2.size() >= 1) {
						for(int r4=0;r4!=c2.size();++r4) {
							int r3 = c2.get(r4);
							if(Runtime.accepts(type3,automaton,automaton.get(r3), SCHEMA)) {
								boolean m2_1 = true;
								for(int i5=0;i5!=c2.size();++i5) {
									if(i5 == r4) { continue; }
									int r5 = c2.get(i5);
									if(Runtime.accepts(type8,automaton,automaton.get(r5), SCHEMA)) {
										continue;
									}
									m2_1 = false;
									break;
								}
								if(m2_1) {
									int[] state = {r0, r1, r2, r3, r4, 0};
									activations.add(new Reduction.Activation(this,null,state));
								}
							}
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r3 = state[3]; // p
			int r4 = state[4];
			Automaton.Collection c2 = (Automaton.Collection) automaton.get(state[2]);
			int[] c2children = new int[c2.size() - 1];
			for(int s2i=0, s2j=0; s2i != c2.size();++s2i) {
				if(s2i == r4) { continue; }
				c2children[s2j++] = c2.get(s2i);
			}
			Automaton.Set r5 = new Automaton.Set(c2children);
			Automaton.List t6 = new Automaton.List();
			for(int i7=0;i7<r5.size();i7++) {
				int r7 = (int) r5.get(i7);
				Automaton.Term r8 = (Automaton.Term) automaton.get(r7);
				int r9 = r8.contents;
				Automaton.List r10 = new Automaton.List(r3, r9); // [p*n]
				int r11 = automaton.add(r10);
				Automaton.Term r12 = new Automaton.Term(K_Intersect, r11);
				int r13 = automaton.add(r12);
				Automaton.Term r14 = new Automaton.Term(K_Not, r13);
				int r15 = automaton.add(r14);
				t6.add(r15);
			}
			Automaton.Set r6 = new Automaton.Set(t6.toArray());
			Automaton.Set r16 = r6.appendFront(r3); // p append rs
			int r17 = automaton.add(r16);
			Automaton.Term r18 = new Automaton.Term(K_Canonical, r17);
			int r19 = automaton.add(r18);
			Automaton.Term r20 = new Automaton.Term(K_Root, r19);
			int r21 = automaton.add(r20);
			if(r0 != r21) {
				return automaton.rewrite(r0, r21);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_28 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_28(Pattern.Term pattern) {
			super(pattern);
			put("name","Fig 2(5b)");
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Root) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				Automaton.State s1 = automaton.get(r1);
				if(s1.kind == K_Or) {
					Automaton.Term t1 = (Automaton.Term) s1;
					int r2 = t1.contents;
					Automaton.State s2 = automaton.get(r2);
					Automaton.Collection c2 = (Automaton.Collection) s2;
					if(c2.size() >= 1) {
						for(int r4=0;r4!=c2.size();++r4) {
							int r3 = c2.get(r4);
							Automaton.State s3 = automaton.get(r3);
							if(s3.kind == K_And) {
								Automaton.Term t3 = (Automaton.Term) s3;
								int r5 = t3.contents;
								Automaton.State s5 = automaton.get(r5);
								Automaton.Collection c5 = (Automaton.Collection) s5;
								if(c5.size() >= 1) {
									for(int r7=0;r7!=c5.size();++r7) {
										int r6 = c5.get(r7);
										if(Runtime.accepts(type3,automaton,automaton.get(r6), SCHEMA)) {
											boolean m5_1 = true;
											for(int i8=0;i8!=c5.size();++i8) {
												if(i8 == r7) { continue; }
												int r8 = c5.get(i8);
												if(Runtime.accepts(type8,automaton,automaton.get(r8), SCHEMA)) {
													continue;
												}
												m5_1 = false;
												break;
											}
											if(m5_1) {
												int[] state = {r0, r1, r2, r3, r4, r5, r6, r7, 0, 0};
												activations.add(new Reduction.Activation(this,null,state));
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			int r4 = state[4];
			int r6 = state[6]; // p
			int r7 = state[7];
			Automaton.Collection c5 = (Automaton.Collection) automaton.get(state[5]);
			int[] c5children = new int[c5.size() - 1];
			for(int s5i=0, s5j=0; s5i != c5.size();++s5i) {
				if(s5i == r7) { continue; }
				c5children[s5j++] = c5.get(s5i);
			}
			Automaton.Set r8 = new Automaton.Set(c5children);
			Automaton.Collection c2 = (Automaton.Collection) automaton.get(state[2]);
			int[] c2children = new int[c2.size() - 1];
			for(int s2i=0, s2j=0; s2i != c2.size();++s2i) {
				if(s2i == r4) { continue; }
				c2children[s2j++] = c2.get(s2i);
			}
			Automaton.Set r9 = new Automaton.Set(c2children);
			Automaton.List t10 = new Automaton.List();
			for(int i11=0;i11<r8.size();i11++) {
				int r11 = (int) r8.get(i11);
				Automaton.Term r12 = (Automaton.Term) automaton.get(r11);
				int r13 = r12.contents;
				Automaton.List r14 = new Automaton.List(r6, r13); // [p*n]
				int r15 = automaton.add(r14);
				Automaton.Term r16 = new Automaton.Term(K_Intersect, r15);
				int r17 = automaton.add(r16);
				Automaton.Term r18 = new Automaton.Term(K_Not, r17);
				int r19 = automaton.add(r18);
				t10.add(r19);
			}
			Automaton.Set r10 = new Automaton.Set(t10.toArray());
			Automaton.Set r20 = r10.appendFront(r6); // p append rs
			int r21 = automaton.add(r20);
			Automaton.Term r22 = new Automaton.Term(K_Canonical, r21);
			int r23 = automaton.add(r22);
			Automaton.Set r24 = r9.appendFront(r23); // Canonical(p append rs) append ts
			int r25 = automaton.add(r24);
			Automaton.Term r26 = new Automaton.Term(K_Or, r25);
			int r27 = automaton.add(r26);
			Automaton.Term r28 = new Automaton.Term(K_Root, r27);
			int r29 = automaton.add(r28);
			if(r0 != r29) {
				return automaton.rewrite(r0, r29);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	private final static class Reduction_29 extends AbstractRewriteRule implements ReductionRule {

		public Reduction_29(Pattern.Term pattern) {
			super(pattern);
		}

		public final void probe(Automaton automaton, int target, List<Reduction.Activation> activations) {
			int r0 = target;
			Automaton.State s0 = automaton.get(r0);
			if(s0.kind == K_Root) {
				Automaton.Term t0 = (Automaton.Term) s0;
				int r1 = t0.contents;
				if(Runtime.accepts(type1,automaton,automaton.get(r1), SCHEMA)) {
					int[] state = {r0, r1};
					activations.add(new Reduction.Activation(this,null,state));
				}
			}
		}

		public final int apply(Automaton automaton, int[] state) {
			int nStates = automaton.nStates();
			int r0 = state[0];
			Automaton.Term r2 = Void;
			int r3 = automaton.add(r2);
			if(r0 != r3) {
				return automaton.rewrite(r0, r3);
			}
			automaton.resize(nStates);
			return Automaton.K_VOID;
		}

	}
	// =========================================================================
	// Schema
	// =========================================================================

	public static final Schema SCHEMA = new Schema(new Schema.Term[]{
		// Void
		Schema.Term("Void"),
		// Any
		Schema.Term("Any"),
		// Int
		Schema.Term("Int"),
		// $7<Tuple(^[$2<^Type<$7|Primitive<Any|Void|Int>|Not($2)|Or(^{$2...})|And(^{$2...})|Canonical(^{$41<^PositiveAtom<Any|Int|Tuple(^[$41...])>>,^NegibleAtom<Void|Not($51<^PosibleAtom<Any|Void|Int|Tuple(^[$51...])|Intersect(^[$41,$41])>>)>...})|Intersect(^[$41,$41])>>...])>
		Schema.Term("Tuple",Schema.List(true)),
		// $4<Not($2<^Type<$4|Primitive<Any|Void|Int>|Tuple(^[$2...])|Or(^{$2...})|And(^{$2...})|Canonical(^{$41<^PositiveAtom<Any|Int|Tuple(^[$41...])>>,^NegibleAtom<Void|Not($51<^PosibleAtom<Any|Void|Int|Tuple(^[$51...])|Intersect(^[$41,$41])>>)>...})|Intersect(^[$41,$41])>>)>
		Schema.Term("Not",Schema.Or(Schema.Any, Schema.Or(Schema.Term("Any"), Schema.Term("Void"), Schema.Term("Int")), Schema.Term("Tuple",Schema.List(true)), Schema.Term("Or",Schema.Set(true)), Schema.Term("And",Schema.Any), Schema.Term("Canonical",Schema.Set(true,Schema.Or(Schema.Any, Schema.Any, Schema.Term("Tuple",Schema.List(true))))), Schema.Term("Intersect",Schema.List(true,Schema.Any,Schema.Any)))),
		// $7<Or($5<^{$2<^Type<$7|Primitive<Any|Void|Int>|Tuple(^[$2...])|Not($2)|And($5)|Canonical(^{$41<^PositiveAtom<Any|Int|Tuple(^[$41...])>>,^NegibleAtom<Void|Not($51<^PosibleAtom<Any|Void|Int|Tuple(^[$51...])|Intersect(^[$41,$41])>>)>...})|Intersect(^[$41,$41])>>...}>)>
		Schema.Term("Or",Schema.Set(true)),
		// $7<And($5<^{$2<^Type<$7|Primitive<Any|Void|Int>|Tuple(^[$2...])|Not($2)|Or($5)|Canonical(^{$41<^PositiveAtom<Any|Int|Tuple(^[$41...])>>,^NegibleAtom<Void|Not($51<^PosibleAtom<Any|Void|Int|Tuple(^[$51...])|Intersect(^[$41,$41])>>)>...})|Intersect(^[$41,$41])>>...}>)>
		Schema.Term("And",Schema.Set(true)),
		// Intersect(^[$2<^PositiveAtom<Int|Any|Tuple(^[$2...])>>,$2])
		Schema.Term("Intersect",Schema.List(true,Schema.Or(Schema.Term("Int"), Schema.Term("Any"), Schema.Term("Tuple",Schema.List(true))),Schema.Any)),
		// Canonical(^{$2<^PositiveAtom<Int|Any|Tuple(^[$2...])>>,^NegibleAtom<Void|Not($16<^PosibleAtom<Void|Int|Any|Tuple(^[$16...])|Intersect(^[$2,$2])>>)>...})
		Schema.Term("Canonical",Schema.Set(true,Schema.Or(Schema.Term("Int"), Schema.Term("Any"), Schema.Term("Tuple",Schema.List(true))))),
		// Root($2<^Type<Primitive<Any|Void|Int>|Tuple(^[$2...])|Not($2)|Or(^{$2...})|And(^{$2...})|Canonical(^{$44<^PositiveAtom<Any|Int|Tuple(^[$44...])>>,^NegibleAtom<Void|Not($54<^PosibleAtom<Any|Void|Int|Tuple(^[$54...])|Intersect(^[$44,$44])>>)>...})|Intersect(^[$44,$44])>>)
		Schema.Term("Root",Schema.Or(Schema.Or(Schema.Term("Any"), Schema.Term("Void"), Schema.Term("Int")), Schema.Term("Tuple",Schema.List(true)), Schema.Term("Not",Schema.Any), Schema.Term("Or",Schema.Set(true)), Schema.Term("And",Schema.Any), Schema.Term("Canonical",Schema.Set(true,Schema.Or(Schema.Any, Schema.Any, Schema.Term("Tuple",Schema.List(true))))), Schema.Term("Intersect",Schema.List(true,Schema.Any,Schema.Any))))
	});

	// =========================================================================
	// Types
	// =========================================================================

	// Any
	private static Type type0 = Runtime.Type("2C0tLTIc2Av3w$");
	// Void
	private static Type type1 = Runtime.Type("2GLxLPZCWDggIk2");
	// $11<Type<Primitive<Any|Void|Int>|Tuple(^[^$11...])|Not(^$11)|Or(^{^$11...})|And(^{^$11...})|Canonical(^{$41<^PositiveAtom<Any|Int|Tuple(^[$41...])>>,^NegibleAtom<Void|Not($51<^PosibleAtom<Any|Void|Int|Tuple(^[$51...])|Intersect(^[$41,$41])>>)>...})|Intersect(^[$41,$41])>>
	private static Type type2 = Runtime.Type("e53GKTkK5_0Jm_LQdGMPqK5KJK6RgK5CDx5SZwZRo3ZQZGOBJNixaQdCLNgGOZZQoKaRnKqNo4bPsdrU85Q596Qco7ugJABGIFi_r3DlmI3OpQdGq3OlXLoZZQoC0MgoKBNh_MQwp7vVLAddHIYg5Atka9hC1EilmQYonPgZr7fhmAvd1UYsIUgsr7zo6A7536FxqRdGMPqKLFoxLQegSFQsJOb_aNgKLFoxLQegP7lXl7C5D5jwNc1al77_OkXa0h0JjCMPXlLO0GrQhd1jl7xoOkXbG7QxOg0el7B5d5hcPBHb0AtkPcHfl7wsPkmfGJNh_Ms596QZQB1bWiGAv5YgNgNBH6x5tsQcmjl78WRkHml7A5gZnmW9B6YkIn0AD6lV_ME6QVSBXXGqGAP6GIE");
	// $17<PositiveAtom<Int|Any|Tuple(^[^$17...])>>
	private static Type type3 = Runtime.Type("eFR$pQn_5SdOMO0GrQhGIHiGr3vk1Eo3ZQtCWEgw2KJK6RgKa9QCXHgZnHeko78p3AD4IE7xo5NCXDOpXLlL");
	// Int
	private static Type type4 = Runtime.Type("2C8t5SIc2Av3w$");
	// $7<Tuple(^[$2<^Type<$7|Primitive<Any|Void|Int>|Not($2)|Or(^{$2...})|And(^{$2...})|Canonical(^{$41<^PositiveAtom<Any|Int|Tuple(^[$41...])>>,^NegibleAtom<Void|Not($51<^PosibleAtom<Any|Void|Int|Tuple(^[$51...])|Intersect(^[$41,$41])>>)>...})|Intersect(^[$41,$41])>>...])>
	private static Type type5 = Runtime.Type("e5JGKSklLO3GKTkKa9QC1EgZIEesn7uw2A7GO$_RdpLPo_aS_GYIjG68E86C0t5OJ524aQjtLPY45QJ58t5S_8rR_C5Sl_3TuxMXlaWml5NCmDOpXLo3ZQtC0Mgo4GLxLPZClMgV5C8t5SIc5Af4YMdlq5hCXHipmQYg3EgZr7wgmAvd1UYkJUgsr7Cp6A7536FxqRdGMPqKLFoxLQegSFQsJOb_aNgKLFoxLQegP7lXl7C5D5jwNc1al7D_OkXa0h0JjCMPXlLO0GrQhd1jl7ApOkXbG7dxOg0el7B5d5hcPBHb0AtkPcHfl7usPkmfGJT_5Qs596QZQB1bWiGAv5YgNgNBH6x5tsQcmjl7EWRkHml7A5gZnmW9B6YcIn0AD6ls4QE6QVSBXXGqGAP6GHE");
	// ^Void
	private static Type type6 = Runtime.Type("3GLxLPZCWDggY9w3x$");
	// NegibleAtom<Void|Not($6<^PosibleAtom<Void|Int|Any|Tuple(^[$6...])|Intersect(^[$31<^PositiveAtom<Int|Any|Tuple(^[$31...])>>,$31])>>)>
	private static Type type7 = Runtime.Type("UGQsJOb_aNgKLFoxLQ3OpQdGq3vk1EosoQoGQ$pQn_aNgKLFoxLQewq7yV3A84HE9hlHYc2Iho3C8t5SIw3ANGIFi_r3PlmLJGKSklLOYV3Ats_9UCHMclHPJ58t5S_8rR_C5SGpILRdqUQkq7zoLAiGR$pQn_5SdOMO0GrQhd1al7t_r7ScMDvd1UYgLUgsr7tlHD75eZNBHM95ggN3ILRlNgGYl7stNomYGs3");
	// Not($2<^PositiveAtom<Int|Any|Tuple(^[$2...])>>)
	private static Type type8 = Runtime.Type("hFYIjG6l0JjCMPo_aS_43Sjpa9TCXDwkHEoZZQoClEgV3C0tLTIc3AAG4Kp06Q_C1EgZYIewo7CW4AO4IHBdp5QCmDRpHMWE");

	// =========================================================================
	// Patterns
	// =========================================================================

	private final static Pattern.Term pattern0 = new Pattern.Term("Not",
		new Pattern.Leaf(type0),
		null);
	private final static Pattern.Term pattern1 = new Pattern.Term("Or",
		new Pattern.Set(false, new Pair[]{
			new Pair(new Pattern.Leaf(type1),null)}),
		null);
	private final static Pattern.Term pattern2 = new Pattern.Term("Or",
		new Pattern.Set(true, new Pair[]{
			new Pair(new Pattern.Term("Or",
				new Pattern.Set(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "t1s")}),
				null),null), 
			new Pair(new Pattern.Leaf(type2), "t2s")}),
		null);
	private final static Pattern.Term pattern3 = new Pattern.Term("And",
		new Pattern.Set(true, new Pair[]{
			new Pair(new Pattern.Term("And",
				new Pattern.Set(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "t1s")}),
				null),null), 
			new Pair(new Pattern.Leaf(type2), "t2s")}),
		null);
	private final static Pattern.Term pattern4 = new Pattern.Term("Intersect",
		new Pattern.List(false, new Pair[]{
			new Pair(new Pattern.Leaf(type3), "t1"), 
			new Pair(new Pattern.Leaf(type3), "t2")}),
		null);
	private final static Pattern.Term pattern5 = new Pattern.Term("Intersect",
		new Pattern.List(false, new Pair[]{
			new Pair(new Pattern.Leaf(type0),null), 
			new Pair(new Pattern.Leaf(type3), "t")}),
		null);
	private final static Pattern.Term pattern6 = new Pattern.Term("Intersect",
		new Pattern.List(false, new Pair[]{
			new Pair(new Pattern.Leaf(type3), "t"), 
			new Pair(new Pattern.Leaf(type0),null)}),
		null);
	private final static Pattern.Term pattern7 = new Pattern.Term("Intersect",
		new Pattern.List(false, new Pair[]{
			new Pair(new Pattern.Leaf(type4),null), 
			new Pair(new Pattern.Leaf(type5),null)}),
		null);
	private final static Pattern.Term pattern8 = new Pattern.Term("Intersect",
		new Pattern.List(false, new Pair[]{
			new Pair(new Pattern.Leaf(type5),null), 
			new Pair(new Pattern.Leaf(type4),null)}),
		null);
	private final static Pattern.Term pattern9 = new Pattern.Term("Intersect",
		new Pattern.List(false, new Pair[]{
			new Pair(new Pattern.Term("Tuple",
				new Pattern.List(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "ns")}),
				null),null), 
			new Pair(new Pattern.Term("Tuple",
				new Pattern.List(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "ms")}),
				null),null)}),
		null);
	private final static Pattern.Term pattern10 = new Pattern.Term("Tuple",
		new Pattern.List(true, new Pair[]{
			new Pair(new Pattern.Leaf(type2), "ns")}),
		null);
	private final static Pattern.Term pattern11 = new Pattern.Term("Intersect",
		new Pattern.List(false, new Pair[]{
			new Pair(new Pattern.Term("Tuple",
				new Pattern.List(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "ns")}),
				null),null), 
			new Pair(new Pattern.Term("Tuple",
				new Pattern.List(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "ms")}),
				null),null)}),
		null);
	private final static Pattern.Term pattern12 = new Pattern.Term("Not",
		new Pattern.Term("Not",
			new Pattern.Leaf(type2),
			"t"),
		null);
	private final static Pattern.Term pattern13 = new Pattern.Term("Not",
		new Pattern.Term("Or",
			new Pattern.Set(true, new Pair[]{
				new Pair(new Pattern.Leaf(type2), "ts")}),
			null),
		null);
	private final static Pattern.Term pattern14 = new Pattern.Term("Not",
		new Pattern.Term("And",
			new Pattern.Set(true, new Pair[]{
				new Pair(new Pattern.Leaf(type2), "ts")}),
			null),
		null);
	private final static Pattern.Term pattern15 = new Pattern.Term("And",
		new Pattern.Set(true, new Pair[]{
			new Pair(new Pattern.Term("Or",
				new Pattern.Set(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "xs")}),
				null),null), 
			new Pair(new Pattern.Leaf(type2), "ys")}),
		null);
	private final static Pattern.Term pattern16 = new Pattern.Term("Tuple",
		new Pattern.List(true, new Pair[]{
			new Pair(new Pattern.Term("Or",
				new Pattern.Set(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "rs")}),
				null),null), 
			new Pair(new Pattern.Leaf(type2), "ts")}),
		null);
	private final static Pattern.Term pattern17 = new Pattern.Term("Tuple",
		new Pattern.List(true, new Pair[]{
			new Pair(new Pattern.Leaf(type2), "t1"), 
			new Pair(new Pattern.Term("Or",
				new Pattern.Set(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "rs")}),
				null),null), 
			new Pair(new Pattern.Leaf(type2), "ts")}),
		null);
	private final static Pattern.Term pattern18 = new Pattern.Term("Tuple",
		new Pattern.List(true, new Pair[]{
			new Pair(new Pattern.Term("And",
				new Pattern.Set(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "rs")}),
				null),null), 
			new Pair(new Pattern.Leaf(type2), "ts")}),
		null);
	private final static Pattern.Term pattern19 = new Pattern.Term("Tuple",
		new Pattern.List(true, new Pair[]{
			new Pair(new Pattern.Leaf(type2), "t1"), 
			new Pair(new Pattern.Term("And",
				new Pattern.Set(true, new Pair[]{
					new Pair(new Pattern.Leaf(type2), "rs")}),
				null),null), 
			new Pair(new Pattern.Leaf(type2), "ts")}),
		null);
	private final static Pattern.Term pattern20 = new Pattern.Term("Tuple",
		new Pattern.List(true, new Pair[]{
			new Pair(new Pattern.Term("Not",
				new Pattern.Leaf(type2),
				"t1"),null), 
			new Pair(new Pattern.Leaf(type2), "ts")}),
		null);
	private final static Pattern.Term pattern21 = new Pattern.Term("Tuple",
		new Pattern.List(true, new Pair[]{
			new Pair(new Pattern.Leaf(type2), "t1"), 
			new Pair(new Pattern.Term("Not",
				new Pattern.Leaf(type2),
				"t2"),null), 
			new Pair(new Pattern.Leaf(type2), "ts")}),
		null);
	private final static Pattern.Term pattern22 = new Pattern.Term("And",
		new Pattern.Set(true, new Pair[]{
			new Pair(new Pattern.Leaf(type1),null), 
			new Pair(new Pattern.Leaf(type2), "ts")}),
		null);
	private final static Pattern.Term pattern23 = new Pattern.Term("Canonical",
		new Pattern.Set(true, new Pair[]{
			new Pair(new Pattern.Leaf(type1),null), 
			new Pair(new Pattern.Leaf(type7), "ts")}),
		null);
	private final static Pattern.Term pattern24 = new Pattern.Term("And",
		new Pattern.Set(true, new Pair[]{
			new Pair(new Pattern.Leaf(type3), "t1"), 
			new Pair(new Pattern.Leaf(type3), "t2"), 
			new Pair(new Pattern.Leaf(type2), "ts")}),
		null);
	private final static Pattern.Term pattern25 = new Pattern.Term("Canonical",
		new Pattern.Set(true, new Pair[]{
			new Pair(new Pattern.Leaf(type3), "t1"), 
			new Pair(new Pattern.Term("Not",
				new Pattern.Leaf(type3),
				"t2"),null), 
			new Pair(new Pattern.Leaf(type7), "ts")}),
		null);
	private final static Pattern.Term pattern26 = new Pattern.Term("Canonical",
		new Pattern.Set(true, new Pair[]{
			new Pair(new Pattern.Leaf(type3), "p"), 
			new Pair(new Pattern.Term("Not",
				new Pattern.Leaf(type1),
				null), "x"), 
			new Pair(new Pattern.Leaf(type7), "ts")}),
		null);
	private final static Pattern.Term pattern27 = new Pattern.Term("Root",
		new Pattern.Term("And",
			new Pattern.Set(true, new Pair[]{
				new Pair(new Pattern.Leaf(type3), "p"), 
				new Pair(new Pattern.Leaf(type8), "ns")}),
			null),
		null);
	private final static Pattern.Term pattern28 = new Pattern.Term("Root",
		new Pattern.Term("Or",
			new Pattern.Set(true, new Pair[]{
				new Pair(new Pattern.Term("And",
					new Pattern.Set(true, new Pair[]{
						new Pair(new Pattern.Leaf(type3), "p"), 
						new Pair(new Pattern.Leaf(type8), "ns")}),
					null),null), 
				new Pair(new Pattern.Leaf(type2), "ts")}),
			null),
		null);
	private final static Pattern.Term pattern29 = new Pattern.Term("Root",
		new Pattern.Leaf(type1),
		null);
	// =========================================================================
	// rules
	// =========================================================================

	public static final InferenceRule[] inferences = new InferenceRule[]{

	};
	public static final ReductionRule[] reductions = new ReductionRule[]{
		new Reduction_0(pattern0),
		new Reduction_1(pattern1),
		new Reduction_2(pattern2),
		new Reduction_3(pattern3),
		new Reduction_4(pattern4),
		new Reduction_5(pattern5),
		new Reduction_6(pattern6),
		new Reduction_7(pattern7),
		new Reduction_8(pattern8),
		new Reduction_9(pattern9),
		new Reduction_10(pattern10),
		new Reduction_11(pattern11),
		new Reduction_12(pattern12),
		new Reduction_13(pattern13),
		new Reduction_14(pattern14),
		new Reduction_15(pattern15),
		new Reduction_16(pattern16),
		new Reduction_17(pattern17),
		new Reduction_18(pattern18),
		new Reduction_19(pattern19),
		new Reduction_20(pattern20),
		new Reduction_21(pattern21),
		new Reduction_22(pattern22),
		new Reduction_23(pattern23),
		new Reduction_24(pattern24),
		new Reduction_25(pattern25),
		new Reduction_26(pattern26),
		new Reduction_27(pattern27),
		new Reduction_28(pattern28),
		new Reduction_29(pattern29)
	};


	// =========================================================================
	// Main Method
	// =========================================================================

	public static void main(String[] args) throws IOException {
		new wyrl.ConsoleRewriter(SCHEMA,inferences,reductions).readEvaluatePrintLoop();
	}
}
