package view;

import controller.DynamicQueue;
import controller.EmptyQueueException;

public class Principal {
	public static void main(String[] args) {
		DynamicQueue queue = new DynamicQueue();
		queue.enqueue(4);
		queue.enqueue(3);
		queue.enqueue(4);
		try {
			queue.dequeue();
			
			queue.dequeue();
			queue.dequeue();
			System.out.println(queue.getSize());
		} catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
