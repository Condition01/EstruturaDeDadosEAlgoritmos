package view;

import controller.DynamicDeque;
import controller.EmptyDequeException;

public class Principal {
	public static void main(String[] args) {
		DynamicDeque deque = new DynamicDeque();
		deque.enqueueEsq(2);
		deque.enqueueEsq(1);
		deque.enqueueEsq(1);
		deque.enqueueDir(2);
		deque.enqueueDir(2);
		deque.enqueueDir(2);
		deque.enqueueDir(3);
		
		try {
			deque.dequeueEsq();
			System.out.println(deque.getSizeDir());
		} catch (EmptyDequeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
