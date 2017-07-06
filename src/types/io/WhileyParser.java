package types.io;

import java.util.ArrayList;

import types.core.SyntacticType;

public class WhileyParser {
	private String input;
	private int index;
	public WhileyParser(String input) {
		this.input = input;
		this.index = 0;
	}

	public SyntacticType parse() {
		SyntacticType lhs = parseUnion();
		skipWhiteSpace();

		return lhs;
	}

	public SyntacticType parseUnion() {
		SyntacticType lhs = parseIntersection();
		if(lookahead() == '|') {
			match("|");
			SyntacticType rhs = parseIntersection();
			return new SyntacticType.Union(lhs,rhs);
		} else {
			return lhs;
		}
	}

	public SyntacticType parseIntersection() {
		SyntacticType lhs = parseArray();
		if(lookahead() == '&') {
			match("&");
			SyntacticType rhs = parseArray();
			return new SyntacticType.Intersection(lhs,rhs);
		} else {
			return lhs;
		}
	}

	public SyntacticType parseArray() {
		SyntacticType term = parseTerm();
		while (index < input.length() && input.charAt(index) == '[') {
			match("[");
			match("]");
			term = new SyntacticType.Tuple(term);
		}
		return term;
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
			if (word.equals("int") || word.equals("bool") || word.equals("byte") || word.equals("null")) {
				// replace all of these with just int.
				return SyntacticType.Int;
			} else if (word.equals("any")) {
				return SyntacticType.Any;
			} else if (word.equals("void")) {
				return SyntacticType.Void;
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
		ArrayList<SyntacticType> elements = new ArrayList<>();
		elements.add(parse());
		String identifier = readIdentifier(); // skip identifiers
		while (expecting('}', ',') == ',') {
			match(",");
			elements.add(parse());
			identifier = readIdentifier(); // skip identifiers
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

	public char lookahead() {
		skipWhiteSpace();
		if(index < input.length()) {
			return input.charAt(index);
		} else {
			return 0;
		}
	}

	private String readWord() {
		int start = index;
		while (index < input.length() && Character.isLetter(input.charAt(index))) {
			index++;
		}
		return input.substring(start, index);
	}

	private String readIdentifier() {
		int start = index;
		while (index < input.length() && Character.isJavaIdentifierPart(input.charAt(index))) {
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
