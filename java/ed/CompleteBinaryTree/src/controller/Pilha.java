package controller;

import model.Node;

public class Pilha {
	private Node[] pilha;
	private int topo;
	
	public Pilha(int size) {
		this.pilha = new Node[size];
		this.topo = -1;
	}
	
	public boolean isEmpty() {
		return this.topo == -1;
	}
	
	public boolean isFull() {
		return this.topo == this.pilha.length-1;
	}
	
	public int showFront() {
		return this.pilha[this.topo].element;
	}
	
	public void empilhar(Node element) {
		if(isFull()) {
			System.err.println("pilha cheia!");
		}else {
			pilha[++topo] = element;
		}
	}
	
	public Node desempilhar() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}else {
			Node temp = this.pilha[topo];
			topo--;
			return temp;
		}
	}
	
	
}
