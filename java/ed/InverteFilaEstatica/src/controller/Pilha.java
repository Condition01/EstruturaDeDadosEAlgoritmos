package controller;

import model.Node;

public class Pilha {
	private Node topo;
	private int size = 0;
	
	public Pilha() {
		this.topo = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return this.topo == null;
	}
	
	public int showTop() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return this.topo.getElement();
	}
	
	public void push(int element) {
		if(isEmpty()) {
			Node novo = new Node(element);
			this.topo = novo;
			size++;
		}else {
			Node novo = new Node(element);
			novo.setNext(this.topo);
			this.topo = novo;
			size++;
		}
	}
	
	public int pop() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}else {
			int temp = this.topo.getElement();
			this.topo = this.topo.getNext();
			size--;
			return temp;
		}
	}
}
