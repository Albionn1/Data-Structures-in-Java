package LinkedLists;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); // edhe var list = new LinkedList(); bon
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		System.out.println(list.getKthFromTheEnd(1));
	}

}
