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
		return this.ultimo == null;
	}
	
	public int getSize() {
		if(this.primeiro == null) {
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
	
	public void enqueue(int element) {
		if(isEmpty()) {
			Node novo = new Node(element);
			this.primeiro = novo;
			this.ultimo = this.primeiro;
		}else if(this.primeiro == this.ultimo){
			Node novo = new Node(element);
			if(this.primeiro.getElement() > element) {
				novo.setNext(this.primeiro);
				this.primeiro = novo;
			}else {
				this.ultimo.setNext(novo);
				this.ultimo = novo;
			}
		}else {
			enqueueEspecial(element);
		}
	}
	
	public void enqueueEspecial(int element) {
		Node previous = null;
		Node current = this.primeiro;
		if(this.primeiro.getElement() > element) {
			Node novo = new Node(element);
			novo.setNext(this.primeiro);
			this.primeiro = novo;
		}else {
			boolean achado = true;
			while(current.getNext() != null && achado) {
				previous = current;
				current = current.getNext();
				if(current.getElement() > element) {
					Node novo = new Node(element);
					novo.setNext(current);
					previous.setNext(novo);
					current = novo;
					achado = false;
				}
			}
			if(achado && current.getElement()>element) {
				Node novo = new Node(element);
				novo.setNext(this.ultimo);
				previous.setNext(novo);
			}else if(achado) {
				Node novo = new Node(element);
				this.ultimo.setNext(novo);
				this.ultimo = novo;
			}
		}
	}
	
	public int desenfileirar() throws ExceQue{
		if(isEmpty()) {
			throw new ExceQue();
		}else if(getSize() == 1){
			int temp = this.primeiro.getElement();
			this.primeiro = null;
			this.ultimo = this.primeiro;
			return temp;
		}else {
			int temp = this.primeiro.getElement();
			this.primeiro = this.primeiro.getNext();
			return temp;
		}
	}
	public int showFront() throws ExceQue{
		if(isEmpty()) {
			throw new ExceQue(); 
		}else {
			return this.primeiro.getElement();
		}
	}
	
}
