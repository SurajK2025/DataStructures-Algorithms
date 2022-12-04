package infixToPostfix;

import static infixToPostfix.InfixToPostFix.convertToPostfix;
public class Tester {

	public static void main(String[] args) {
		String infix = "A*(B-C)/D+E";
		System.out.println("Infix String: "+infix);
		System.out.println("Postfix String: "+convertToPostfix(infix));
	}
}