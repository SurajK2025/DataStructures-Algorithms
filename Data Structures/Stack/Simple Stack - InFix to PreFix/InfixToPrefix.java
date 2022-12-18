package infixToPrefix;

import java.util.Stack;

public class InfixToPrefix {
	private static boolean isOperand(char ch) {
		return ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z'));
	}

	private static int getPriority(char ch) {
		if (ch == '-' || ch == '+') return 1;
		else if (ch == '*' || ch == '/') return 2;
		return 0;
	}

	static String infixToPrefix(String infix) {
		Stack<Character> operators = new Stack<Character>();
		Stack<String> operands = new Stack<String>();

		for (int i = 0; i < infix.length(); i++){
			char ch = infix.charAt(i);
			
			if (ch == '(') operators.push(ch);
			
			else if (isOperand(ch)) operands.push(ch + "");

			else if (ch == ')'){
				while (!operators.empty() && operators.peek() != '(') {
					String first = operands.pop();
					String second = operands.pop();
					char op = operators.pop();
					String tmp = op + second + first;
					operands.push(tmp);
				}
				operators.pop();
			}
			
			else
			{
				while (!operators.empty() && getPriority(ch)<=getPriority(operators.peek())) {	
					String first = operands.pop();
					String second = operands.pop();
					char op = operators.pop();
					String tmp = op + second + first;
					operands.push(tmp);
				}
				operators.push(ch);
			}
		}
		
		while (!operators.empty()){
			String first = operands.pop();
			String second = operands.pop();
			char op = operators.pop();
			String tmp = op + second + first;
			operands.push(tmp);
		}
		return operands.peek();
	}
}
