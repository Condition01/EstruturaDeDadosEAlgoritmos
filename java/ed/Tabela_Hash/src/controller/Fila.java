package controller;

import model.Node;

public class Fila {
	private Node primeiro;
	private Node ultimo;
	
	public Fila() {
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
			int size = 0;
			Node temp = this.primeiro;
			while(temp != null) {
				temp = temp.getNext();
				size++;
			}
			return size;
		}
	}
	
	public void enfileirar(int element) {
		if(isEmpty()) {
			Node novo = new Node(element);
			this.primeiro = novo;
			this.ultimo = this.primeiro;
		}else {
			Node novo = new Node(element);
			this.ultimo.setNext(novo);
			this.ultimo = novo;
		}
	}
	
	public int desenfileirar() throws EmptyQueueException{
		if(isEmpty()) {
			throw new EmptyQueueException();
		}else if(this.primeiro == this.ultimo) {
			int temp = this.primeiro.getElement();
			this.primeiro = null;
			this.ultimo = null;
			return temp;
		}else {
			int temp = this.primeiro.getElement();
			this.primeiro = this.primeiro.getNext();
			return temp;
		}
	}
	
	public int showFront() throws EmptyQueueException{
		if(isEmpty()) {
			throw new EmptyQueueException();
		}else {
			return this.primeiro.getElement();
		}
	}
}
