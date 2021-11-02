package view;

import controller.Heap;

public class Main {
	public static void main(String[] args) {
		Heap heap = new Heap(20);
		heap.inserir(4);
		heap.inserir(1);
		heap.inserir(10);
		heap.inserir(8);
		heap.inserir(9);
		heap.inserir(20);
	}
}
