package Queues;
import java.util.Queue;
import java.util.Stack;
public class Queues {
	public static void reverse(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();
		
		while(!queue.isEmpty())
			stack.push(queue.remove());
		while(!stack.isEmpty())
			queue.add(stack.pop());
	}
}
