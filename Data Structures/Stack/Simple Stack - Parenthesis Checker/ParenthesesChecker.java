package com.stackImpl4;

public class ParenthesesChecker {
	public static void main(String[] args) {

		MyStack<Character> myStack1 = new MyStack<>(25);

		String pattern = "{<>}<()>{}";
		System.out.println(pattern);
		
		char[] ptrnArray = pattern.toCharArray();
		boolean flag = true;
		
		try {
			for(int i=0; i<ptrnArray.length; i++) {
				//{[()<>()}
				if( ptrnArray[i] == '{' || ptrnArray[i] == '(' || ptrnArray[i] == '[' || ptrnArray[i] == '<')
					myStack1.push(ptrnArray[i]);
				
				else if(ptrnArray[i] == '>' && myStack1.peek() == '<') 
					myStack1.pop();
				
				else if(ptrnArray[i] == '}' && myStack1.peek() == '{') 
					myStack1.pop();
				
				else if(ptrnArray[i] == ']' && myStack1.peek() == '[') 
					myStack1.pop();
			
				else if(ptrnArray[i] == ')' && myStack1.peek() == '(') 
					myStack1.pop();
				
				else
					flag=false;
			}
		}
		catch(Exception e) { 
			flag=false;
		}
		
		if(flag)
			System.out.println("Perfect Pattern.");
		else
			System.out.println("ImPerfect Pattern.");
	}
}
