package controller;

import model.Node;

public class Queue {
	private Node primeiro;
	private Node ultimo;
	
	public Queue() {
		this.primeiro = null;
		this.ultimo = null;
	}
	
	public boolean isEmpty() {
		return this.primeiro == null;
	}
	
	public int getSize() {
		if(isEmpty()) {
			return 0;
		}else if(this.primeiro == this.ultimo) {
			return 1;
		}else {
			int size = 0;
			Node current = this.primeiro;
			while(current != null) {
				current = current.getNext();
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
			Node previous = null;
			Node current = this.primeiro;
			Node previousFound = null;
			Node found = null;
			while(current != null) {	
				if(found == null || current.getElement()<found.getElement()) {
					previousFound = previous;
					found = current;
				}
				previous = current;
				current = current.getNext();
			}
			int temp = found.getElement();
			if(previousFound == null) {
				this.primeiro = this.primeiro.getNext();
			}else {
				previousFound.setNext(previousFound.getNext().getNext());
				if(previousFound.getNext() == null) {
					this.ultimo = previousFound;
				}
			}
			return temp;
		}
	}
	
	public int showFront() throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}else {
			return this.ultimo.getElement();
		}
	}
}
