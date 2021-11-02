package view;

import controller.Deque;
import controller.EmptyQueueException;

public class Main {
	public static void main(String[] args) {
		Deque deque = new Deque();
		deque.enqueueFront(1);
		deque.enqueueFront(2);
		deque.enqueueFront(3);
		try {
			System.out.println(deque.showFront());
			deque.dequeueBack();
			System.out.println(deque.showBack());
		} catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
