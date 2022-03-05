package Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
//		Queue<Integer> queue = new ArrayDeque<>();
//		
//		queue.add(10);
//		queue.add(20);
//		queue.add(30);
//		System.out.println(queue);
//		Queues.reverse(queue); //Queues.reverse() method from Queues Class
//		System.out.println(queue);
		//-------------ArrayQueue Class--------------
//		ArrayQueue queue = new ArrayQueue(5);
//		queue.dequeue();
//		var front = queue.dequeue();
//		queue.enqueue(10);
//		queue.enqueue(20);
//		queue.enqueue(30);
//		queue.enqueue(40);
//		queue.enqueue(50);
//		queue.enqueue(60);
//		queue.enqueue(70);
//		queue.dequeue();
//		queue.enqueue(80);
//		 
//		System.out.println(front);
//		System.out.println(queue);
//		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		
//		queue.enqueue(10);
//		queue.enqueue(20);
//		queue.enqueue(30);
//		queue.dequeue();
//		queue.dequeue();
// 		var first = queue.dequeue();
//		System.out.println(first);
		
		//-------------Priority Queue------------
		PriorityQueue queue = new PriorityQueue();
		queue.add(5);
		queue.add(3);
		queue.add(6);
		queue.add(1);
		queue.add(4);
		System.out.println(queue);
		while(!queue.isEmpty())
			System.out.println(queue.remove());
	}

}
