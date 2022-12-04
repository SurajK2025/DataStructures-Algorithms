package infixToPrefix;

import static infixToPrefix.InfixToPrefix.infixToPrefix;

public class Tester {
	public static void main(String[] args) {
		String infix = "(A-B/C)*(A/K-L)";
		System.out.println(infixToPrefix(infix));
	}
}