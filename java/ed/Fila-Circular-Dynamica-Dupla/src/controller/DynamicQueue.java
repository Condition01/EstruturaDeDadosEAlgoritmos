package controller;

import model.Node;

public class DynamicQueue {
	private Node primeiro;
	private Node ultimo;
	
	public DynamicQueue() {
		this.primeiro = null;
		this.ultimo = null;
	}
	
	public boolean isEmpty() {
		return this.ultimo == null;
	}
	
	public int getSize() {
		if(isEmpty()) {
			return 0;
		}else if(this.primeiro == this.ultimo) {
			return 1;
		}else {
			int size = 1;
			Node current = this.primeiro;
			while(current != this.ultimo) {
				current = current.getNext();
				size++;
			}
			return size;
		}
		
	}
	
	public int showFront() throws EmptyQueueException{
		if(isEmpty()) {
			throw new EmptyQueueException();
		}else {
			return this.primeiro.getElement();
		}
	}
	
	public void enqueue(int element) {
		if(isEmpty()) {
			Node novo = new Node(element);
			this.primeiro = novo;
			this.ultimo = this.primeiro;
			this.ultimo.setNext(this.primeiro);
			this.primeiro.setPrevious(this.ultimo);
		}else {
			Node novo = new Node(element);
			this.ultimo.setNext(novo);
			novo.setPrevious(this.ultimo); // seta o ultimo como anterior
			novo.setNext(this.primeiro); // seta o proximo como o primeiro
			this.ultimo = novo;
			this.primeiro.setPrevious(this.ultimo);		}
	}
	
	public int dequeue() throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}else if(this.primeiro == this.ultimo){
			int temp = this.primeiro.getElement();
			this.primeiro = null;
			this.ultimo = null;
			return temp;
		}else {
			int temp = this.primeiro.getElement();
			this.primeiro = this.primeiro.getNext();
			this.primeiro.setPrevious(this.ultimo);
			this.ultimo.setNext(this.primeiro);
			return temp;
		}
	}
}
