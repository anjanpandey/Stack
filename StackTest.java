import java.util.*; 


public class StackTest {

	public static void main(String[] args) {
		isPalindrome("Ama");
	}
	
	
	
	public static boolean isPalindrome(String input) {
		
		Stack<Character> charStack = new Stack<Character>();
       
		char letter; 
		String test="";
		
		for (int i=0; i<input.length(); i++) {
			letter = input.charAt(i);
			charStack.push(letter); 
		}
		
		while (!charStack.isEmpty()) {
			test += charStack.pop();  
		}
		
		if (test.equalsIgnoreCase(input)) {
			System.out.println("It is a palindrom. The reverse word of "+input+" is also "+test+".");
			return true; 
		}
		
		else {
			System.out.println("It is not a palindrome.");
			return false; 
		}
		
	}

}
