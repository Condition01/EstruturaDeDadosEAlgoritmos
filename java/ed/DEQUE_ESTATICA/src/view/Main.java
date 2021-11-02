package view;

import controller.Deque;
import controller.EmptyDequeException;
import controller.FullDequeException;

public class Main {
	public static void main(String[] args) throws FullDequeException, EmptyDequeException {
		Deque deque = new Deque(5);
		deque.insertDir(4);
		deque.insertDir(3);
		deque.insertDir(4);
		deque.insertDir(5);
		//deque.insertDir(4);
		deque.insertEsq(5);
		deque.removeDir();
		deque.insertEsq(3);
		//deque.insertDir(4);
		
		System.out.println(deque.showFrontDir());
		System.out.println(deque.showFrontEsq());
		System.out.println(deque.getSizeDir());
	}
}
