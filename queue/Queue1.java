package queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		
		Queue<String> q = new ArrayDeque<>();
		q.add("orange");
		q.add("limon");
		q.add("lime");
		q.add("grapefruit");
		System.out.println(q);
		
		//removing items removes from the beginning of the queue
		System.out.println("item removed: " + q.remove());
		System.out.println("item removed: " + q.remove());
		System.out.println(q);
		
		//adding new items will add them at the back of the queue
		q.add("banana");
		q.add("apple");
		q.add("watermelon");
		System.out.println(q);
		
		//remove vs poll
		System.out.println("item removed: " + q.remove());
		System.out.println("item removed: " + q.remove());
		System.out.println("item removed: " + q.remove());
		System.out.println("item removed: " + q.remove());
		System.out.println("item removed: " + q.remove());
		System.out.println(q);
		
		try {
			System.out.println("item removed: " + q.remove());
		} catch(NoSuchElementException nsee) {
			System.out.printf("Calling remove() to an empty queue produces an exception %s.%n", nsee);
		}
		System.out.print("Calling poll() to an empty queue: ");
		System.out.println(q.poll());
		
	}

}
