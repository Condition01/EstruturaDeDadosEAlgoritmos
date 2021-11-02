package controller;

import model.Node;

public class Deque {
	private Node primeiro;
	private Node ultimo;

	public boolean isEmpty() {
		return this.ultimo == null;
	}

	public int getSize() {
		if (isEmpty()) {
			return 0;
		} else if (this.primeiro == this.ultimo) {
			return 1;
		} else {
			Node current = this.primeiro;
			int size = 0;
			while (current != null) {
				current = current.getNext();
				size++;
			}
			return size;
		}
	}

	public void enqueueFront(int element) {
		if (isEmpty()) {
			Node novo = new Node(element);
			this.primeiro = novo;
			this.ultimo = this.primeiro;
		} else {
			Node novo = new Node(element, null, this.ultimo);
			this.ultimo.setNext(novo);
			this.ultimo = novo;
		}
	}

	public void enqueueBack(int element) {
		if (isEmpty()) {
			Node novo = new Node(element);
			this.primeiro = novo;
			this.ultimo = this.primeiro;
		} else {
			Node novo = new Node(element, this.primeiro, null);
			this.primeiro.setPrevious(novo);
			this.primeiro = novo;
		}
	}

	public int dequeueFront() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else if (this.primeiro == this.ultimo) {
			int temp = this.primeiro.getElement();
			this.primeiro = null;
			this.ultimo = this.primeiro;
			return temp;
		} else {
			int temp = this.primeiro.getElement();
			this.primeiro = this.primeiro.getNext();
			this.primeiro.setPrevious(null);
			return temp;
		}
	}

	public int dequeueBack() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else if (this.primeiro == this.ultimo) {
			int temp = this.ultimo.getElement();
			this.primeiro = null;
			this.ultimo = this.primeiro;
			return temp;
		} else {
			int temp = this.ultimo.getElement();
			this.ultimo = this.ultimo.getPrevious();
			this.ultimo.setNext(null);
			return temp;
		}
	}

	public int showFront() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else {
			return this.primeiro.getElement();
		}
	}

	public int showBack() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else {
			return this.ultimo.getElement();
		}
	}
}
