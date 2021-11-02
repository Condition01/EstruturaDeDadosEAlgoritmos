package view;

import controller.EmptyQueueException;
import controller.Queue;

public class Main {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enfileirar(1);
		queue.enfileirar(4);
		queue.enfileirar(2);
		try {
			queue.desenfileirar();
		} catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
