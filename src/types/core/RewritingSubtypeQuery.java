package types.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import wyautl.core.Automaton;
import wyautl.core.Automata;
import wyautl.io.PrettyAutomataWriter;
import wyrw.core.*;
import wyrw.util.*;

/**
 * Provides an implementation of subtyping based on the rewrite rules found in
 * TypesOptimised.wyrl.
 *
 * @author David J. Pearce
 *
 */
public class RewritingSubtypeQuery implements SubtypeQuery {
	/**
	 * This records the number of rewrites for the last call to isSubtype. This
	 * is used to report rewriting statistics.
	 */
	public static int numRewrites;

	/**
	 * Responsible for holding the rewrite space
	 */
	private Reduction rewrite;

	/**
	 * The actual rewriter responsible for rewriting the automaton
	 */
	private Rewriter rewriter;

	public RewritingSubtypeQuery(SyntacticType sup, SyntacticType sub) {
		SyntacticType res = new SyntacticType.Intersection(sub, new SyntacticType.Negation(sup));
		Automaton automaton = toAutomaton(res);
		rewrite = new Reduction(TypesOptimised.SCHEMA, null, TypesOptimised.reductions);
		rewriter = new LinearRewriter(rewrite, LinearRewriter.UNFAIR_HEURISTIC);
		rewrite.initialise(automaton);
	}

	/**
	 * Test whether one type is a super type of another.
	 *
	 * @param sup
	 * @param sub
	 * @return
	 * @throws IOException
	 */
	@Override
	public void exec()  {
		// grind 10000 steps (if necessary)
		rewriter.apply(10000);
	}

	@Override
	public boolean result() {
		// Store stats
		numRewrites = rewrite.steps().size();
		// Get the final automaton and determine whether or not it reduced to
		// void. If it did, then we have a subtype. Otherwise, we don't.
		List<Rewrite.State> states = rewrite.states();
		Automaton reducedAutomaton = states.get(states.size()-1).automaton();
		//
		int root = reducedAutomaton.getRoot(0);
		// Check whether the root state is void or not
		return reducedAutomaton.get(root).kind == TypesOptimised.K_Void;
	}


	/**
	 * This is useful for debugging purposes. It prints out the full reduction
	 * that took place. This helps to know why a rule did or did not apply.
	 *
	 * @param rewrite
	 */
	public static void printReduction(Rewrite rewrite,SyntacticType sup, SyntacticType sub) {
		System.out.println(sup + " :> " + sub);
		System.out.println("--");
		List<Rewrite.State> states = rewrite.states();
		List<Rewrite.Step> steps = rewrite.steps();
		println(states.get(0).automaton());
		for (int i = 0; i != steps.size(); ++i) {
			Rewrite.Step step = steps.get(i);
			System.out.print("==> ");
			println(states.get(step.after()).automaton());
		}
	}

	public static void println(Automaton automaton) {
		print(automaton);
		System.out.println();
	}

	public static void println(int root, Automaton automaton) {
		print(root,automaton);
		System.out.println();
	}

	public static void print(Automaton automaton) {
		PrettyAutomataWriter writer = new PrettyAutomataWriter(System.out, TypesOptimised.SCHEMA);
		try {
			writer.write(automaton);
			writer.flush();
		} catch (IOException e) {

		}
	}

	public static void print(int root, Automaton automaton) {
		List<Automaton.State> states = new ArrayList<>();
		root = Automata.extract(automaton, root, states);
		Automaton subaut = new Automaton(states.toArray(new Automaton.State[states.size()]));
		subaut.setRoot(0, root);
		print(subaut);
	}

	private static Automaton toAutomaton(SyntacticType type) {
		Automaton automaton = new Automaton();
		int root = toAutomaton(type, automaton);
		root = TypesOptimised.Root(automaton, root);
		automaton.setRoot(0, root);
		return automaton;
	}

	private static int toAutomaton(SyntacticType type, Automaton automaton) {
		if (type instanceof SyntacticType.Int) {
			return automaton.add(TypesOptimised.Int);
		} else if (type instanceof SyntacticType.Any) {
			return automaton.add(TypesOptimised.Any);
		} else if (type instanceof SyntacticType.Negation) {
			SyntacticType.Negation neg = (SyntacticType.Negation) type;
			int element = toAutomaton(neg.getElement(), automaton);
			return TypesOptimised.Not(automaton, element);
		} else if (type instanceof SyntacticType.Tuple) {
			SyntacticType.Tuple tuple = (SyntacticType.Tuple) type;
			SyntacticType[] elements = tuple.getElements();
			int[] children = new int[elements.length];
			for (int i = 0; i != elements.length; ++i) {
				children[i] = toAutomaton(elements[i], automaton);
			}
			return TypesOptimised.Tuple(automaton, children);
		} else if (type instanceof SyntacticType.Union) {
			SyntacticType.Union union = (SyntacticType.Union) type;
			SyntacticType[] elements = union.getElements();
			int[] children = new int[elements.length];
			for (int i = 0; i != elements.length; ++i) {
				children[i] = toAutomaton(elements[i], automaton);
			}
			return TypesOptimised.Or(automaton, children);
		} else {
			SyntacticType.Intersection intersection = (SyntacticType.Intersection) type;
			SyntacticType[] elements = intersection.getElements();
			int[] children = new int[elements.length];
			for (int i = 0; i != elements.length; ++i) {
				children[i] = toAutomaton(elements[i], automaton);
			}
			return TypesOptimised.And(automaton, children);
		}
	}
}
