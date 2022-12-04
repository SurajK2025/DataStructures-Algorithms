package infixToPostfix;

import java.util.Stack;

public class InfixToPostFix {
	public static int precedence(char ch) {
		if(ch == '+' || ch == '-') return 1;
		else if(ch == '*' || ch == '/') return 2;
		else return 0;
	}
	
	public static String convertToPostfix(String exp) {
		Stack<String> postfix = new Stack<>();
		Stack<Character> operators = new Stack<>();
		
		for(int i=0; i<exp.length(); i++) {
			char ch = exp.charAt(i);
			
			if(ch == '(') operators.push(ch);
			
			else if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
				postfix.push(ch+"");
			
			else if(ch==')') {
				while(operators.peek()!='(') {
					char op = operators.pop();
					String first = postfix.pop();
					String second = postfix.pop();
					String newPostfix = second+first+op;
					postfix.push(newPostfix);
				}
				operators.pop();
			}
			
			else if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {
				while(operators.size()>0 && operators.peek()!='(' && precedence(ch)<=precedence(operators.peek())) {
					char op = operators.pop();
					String first = postfix.pop();
					String second = postfix.pop();
					String newPostfix = second+first+op;
					postfix.push(newPostfix);
				}
				operators.push(ch);
			}
		}
		
		while(operators.size()>0) {
			char op = operators.pop();
			String first = postfix.pop();
			String second = postfix.pop();
			String newPostfix = second+first+op;
			postfix.push(newPostfix);
		}
		
		return postfix.pop();
	}
}
