//https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            
            Deque<Character> stack = new ArrayDeque<>();
            boolean isBalanced = true;

            for (int i = 0; i < input.length(); i++) {
                char character = input.charAt(i);

                if (character == '{' || character == '[' || character == '(') {
                    stack.push(character);
                } else {
                    if (stack.isEmpty()) {
                        isBalanced = false;
                        break;
                    }

                    char savedCharacter = stack.pop();
                    if ((savedCharacter == '(' && character != ')') ||
                        (savedCharacter == '{' && character != '}') ||
                        (savedCharacter == '[' && character != ']')) {
                        isBalanced = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                isBalanced = false;
            }

            System.out.println(isBalanced);
        }
    }
}
