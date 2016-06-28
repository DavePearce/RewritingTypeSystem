package types.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Provides an implementation of subtyping based on the rewrite rules found in
 * Types.wyrl.
 * 
 * @author David J. Pearce
 *
 */
public class WhileySubtypeOperator {

	/**
	 * Test whether one type is a super type of another.
	 * 
	 * @param sup
	 * @param sub
	 * @return
	 * @throws IOException 
	 */
	public static boolean isSubtype(SyntacticType sup, SyntacticType sub)  {
		wyil.lang.Type whileySuperType = toWhileyType(sup);
		wyil.lang.Type whileySubType = toWhileyType(sub);
		return wyil.lang.Type.isSubtype(whileySuperType, whileySubType);
	}
	
	public static wyil.lang.Type toWhileyType(SyntacticType type) {
		if (type instanceof SyntacticType.Int) {
			return wyil.lang.Type.T_INT;
		} else if (type instanceof SyntacticType.Any) {
			return wyil.lang.Type.T_ANY;
		} else if (type instanceof SyntacticType.Negation) {
			SyntacticType.Negation neg = (SyntacticType.Negation) type;
			wyil.lang.Type element = toWhileyType(neg.getElement());
			return wyil.lang.Type.Negation(element);
		} else if (type instanceof SyntacticType.Tuple) {
			SyntacticType.Tuple t = (SyntacticType.Tuple) type;
			SyntacticType[] elements = t.getElements();
			Map<String, wyil.lang.Type> fields = new HashMap<>();
			for (int i = 0; i != elements.length; ++i) {
				wyil.lang.Type ft = toWhileyType(elements[i]);
				fields.put("r" + i, ft);
			}
			return wyil.lang.Type.Record(false, fields);
		} else if (type instanceof SyntacticType.Union) {
			SyntacticType.Union t = (SyntacticType.Union) type;
			SyntacticType[] elements = t.getElements();
			wyil.lang.Type[] children = new wyil.lang.Type[elements.length];
			for (int i = 0; i != elements.length; ++i) {
				children[i] = toWhileyType(elements[i]);
			}
			return wyil.lang.Type.Union(children);
		} else {
			SyntacticType.Intersection t = (SyntacticType.Intersection) type;
			SyntacticType[] elements = t.getElements();
			wyil.lang.Type[] children = new wyil.lang.Type[elements.length];
			for (int i = 0; i != elements.length; ++i) {
				children[i] = wyil.lang.Type.Negation(toWhileyType(elements[i]));
			}
			return wyil.lang.Type.Negation(wyil.lang.Type.Union(children));
		}
	}
}
