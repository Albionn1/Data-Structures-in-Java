package Stacks;

public class Main {

	public static void main(String[] args) {
		
		// StringReverser testing
//		String str = "Albion Berisha";
//		
//		var reverser = new StringReverser();
//	
//		var result = reverser.reverse(str);
//		
//		System.out.println(result);
		// StringReverser testing ends here
		
		//---------------------------------
		
		// Expression class testing
		
//		String expr = "(5 + 3)";
//		
//		Expression exp = new Expression();
//		var expResult = exp.isBalanced(expr);
//		
//		System.out.println(expResult);
		
		// Expression Testing ends here
		
		//----------------------------------
		
		// Implementing Stacks using Arrays StackArray class
		
		StackArray stack = new StackArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.peek();
		System.out.println(stack.peek());
	}

}
