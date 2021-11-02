package controller;

import controller.EmptyStackException;

public class Pilha {
	private int pilha[];
	private int topo;
	
	public Pilha(int tamanho) {
		this.pilha = new int[tamanho];
		this.topo = -1;
	}
	
	public boolean isEmpty() {
		return this.topo == -1;
	}
	
	public boolean isFull() {
		int tamanhoVet = this.pilha.length - 1;
		return this.topo == tamanhoVet;
	}
	
	public int getSize() {
		return this.topo+1;
	}
	
	public int showTop() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}else {
			return this.pilha[this.topo];
		}
	}
	
	public void push(int element) throws FullStackException{
		if(isFull()) {
			throw new FullStackException();
		}else {
			this.pilha[++this.topo] = element;
		}
	}
	
	public int pop() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}else {
			return this.pilha[this.topo--];
		}
	}
}
