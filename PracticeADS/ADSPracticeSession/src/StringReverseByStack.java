import java.util.Stack;

public class StringReverseByStack {
	//create a function
	public static String reverseString(String input)
	{
		Stack<Character> s=new Stack<Character>();
		//push all character into the Stack
		for(char c:input.toCharArray()) {
			s.push(c);
		}
		// Pop all characters from the stack and build the reversed string
		StringBuilder reverse=new StringBuilder();
		while(!s.isEmpty())
		{
			reverse.append(s.pop());
		}
		return reverse.toString();
	}
	
	public static void main(String[] args) {
		String input="hello world";
		String reverese=reverseString(input);
		System.out.println("Original String::"+input);
		System.out.println("Reversed String::"+reverese);

	}

}
