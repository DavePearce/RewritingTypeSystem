package types.io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import types.core.SyntacticType;
import types.core.Types;
import wyautl.core.Automaton;

public class Parser {
	private String input;
	private int index;
	public Parser(String input) {
		this.input = input;
		this.index = 0;
	}

	public SyntacticType parse() {
		SyntacticType lhs = parseUnionIntersection();
		skipWhiteSpace();

		return lhs;
	}

	public SyntacticType parseUnionIntersection() {
		SyntacticType lhs = parseTerm();
		skipWhiteSpace();

		if(index < input.length()) {
			char lookahead = input.charAt(index);

			if(lookahead == '&') {
				return parseIntersection(lhs);				
			} else if(lookahead == '|') {
				return parseUnion(lhs);				
			}
		}

		return lhs;
	}

	public SyntacticType parseUnion(SyntacticType first) {
		ArrayList<SyntacticType> types = new ArrayList<SyntacticType>();
		types.add(first);
		while(expecting('|',')','}',EOF) == '|') {
			match("|");
			types.add(parseTerm());
		}
		SyntacticType[] typeArray = new SyntacticType[types.size()];
		return new SyntacticType.Union(types.toArray(typeArray));
	}
	
	public SyntacticType parseIntersection(SyntacticType first) {
		ArrayList<SyntacticType> types = new ArrayList<SyntacticType>();
		types.add(first);
		while(expecting('&',')','}',EOF) == '&') {
			match("&");
			types.add(parseTerm());
		}
		SyntacticType[] typeArray = new SyntacticType[types.size()];
		return new SyntacticType.Intersection(types.toArray(typeArray));
	}
		
	public SyntacticType parseTerm() {
		skipWhiteSpace();
		char lookahead = input.charAt(index);

		if (lookahead == '(') {
			return parseBracketed();
		} else if (lookahead == '{') {
			return parseTuple();
		} else if (lookahead == '!') {
			return parseNegation();			
		} else {	
			String word = readWord();
			if (word.equals("int")) {
				return SyntacticType.Int;
			} else if (word.equals("any")) {
				return SyntacticType.Any;
			} else {
				throw new RuntimeException("unknown keyword or variable: "
						+ word);
			}
		}
	}

	private SyntacticType parseBracketed() {
		match("(");
		SyntacticType root = parse();
		match(")");
		return root;
	}

	private SyntacticType parseTuple() {
		match("{");
		ArrayList<SyntacticType> elements = new ArrayList<SyntacticType>();
		elements.add(parse());
		while (expecting('}', ',') == ',') {
			match(",");
			elements.add(parse());
		}
		match("}");
		SyntacticType[] elementArray = new SyntacticType[elements.size()];
		return new SyntacticType.Tuple(elements.toArray(elementArray));
	}
	
	private SyntacticType parseNegation() {
		match("!");
		SyntacticType type = parseTerm();
		return new SyntacticType.Negation(type);
	}
	
	private String readWord() {
		int start = index;
		while (index < input.length() && Character.isLetter(input.charAt(index))) {
			index++;
		}
		return input.substring(start, index);
	}

	/**
	 * Try and match one of the expected strings. If one of the expecting is
	 * EOF, then we are allowed to match the EOF as well.
	 * 
	 * @param expecting
	 * @return
	 */
	private char expecting(char... expecting) {
		skipWhiteSpace();
		char lookahead;
		if (index < input.length()) {
			lookahead = input.charAt(index);
		} else {
			lookahead = EOF;
		}
		if (contains(expecting, lookahead)) {
			return lookahead;
		}
		// problem
		error();
		throw new RuntimeException(); // dead code
	}
	
	private void match(String text) {
		skipWhiteSpace();
		if (input.startsWith(text, index)) {
			index += text.length();
		} else {
			error();
		}
	}

	private void skipWhiteSpace() {
		while (index < input.length() && (input.charAt(index) == ' ' || input.charAt(index) == '\n')) {
			index = index + 1;
		}
	}

	private void error() {
		final String msg = "Cannot parse character '"
			+ input.charAt(index)
		    + "' at position " + index + " of input '" + input + "'\n";
		throw new RuntimeException(msg);
	}
	
	private boolean contains(char[] chars, char c) {
		for(int i=0;i!=chars.length;++i) {
			if(chars[i] == c) {
				return true;
			}
		}
		return false;
	}
	
	private static final char EOF = 3;
}
