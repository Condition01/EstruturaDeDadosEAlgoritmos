package view;

import controller.EmptyQueueException;
import controller.Fila;
import controller.Pilha;

public class Main {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Fila fila = new Fila(5);
		fila.enfileirar(4);
		fila.enfileirar(5);
		fila.enfileirar(6);
		fila.enfileirar(7);
		fila.enfileirar(8);
		try {
			fila.inverteFila();
		} catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
