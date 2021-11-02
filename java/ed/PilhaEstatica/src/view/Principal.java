package view;

import controller.EmptyStackException;
import controller.FullStackException;
import controller.Pilha;

public class Principal {
	public static void main(String[] args) throws FullStackException, EmptyStackException {
		Pilha pilha = new Pilha(5);
		pilha.push(4);
		pilha.push(3);
		pilha.push(2);
		pilha.push(1);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.pop();
		
	}
}
