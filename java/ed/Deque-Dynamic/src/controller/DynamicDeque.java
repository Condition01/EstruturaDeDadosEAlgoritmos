package controller;

import model.Node;

public class DynamicDeque {
	private Node primeiroEsq;
	private Node ultimoEsq;
	private Node primeiroDir;
	private Node ultimoDir;

	public DynamicDeque() {
		this.primeiroEsq = null;
		this.ultimoEsq = null;
		this.primeiroDir = null;
		this.ultimoDir = null;
	}

	public boolean isEmptyEsq() {
		return this.ultimoEsq == null;
	}

	public boolean isEmptyDir() {
		return this.ultimoDir == null;
	}

	public void enqueueEsq(int element) {
		if (isEmptyEsq()) {
			Node novo = new Node(element);
			this.primeiroEsq = novo;
			this.ultimoEsq = this.primeiroEsq;
			this.ultimoEsq.setNext(this.ultimoDir);
		} else {
			Node novo = new Node(element);
			this.ultimoEsq.setNext(novo);
			this.ultimoEsq = novo;
			this.ultimoEsq.setNext(this.ultimoDir);
			if(this.ultimoDir != null) {
				this.ultimoDir.setNext(this.ultimoEsq);
			}
		}
	}

	public void enqueueDir(int element) {
		if (isEmptyDir()) {
			Node novo = new Node(element);
			this.primeiroDir = novo;
			this.ultimoDir = this.primeiroDir;
			this.ultimoDir.setNext(this.ultimoEsq);
		} else {
			Node novo = new Node(element);
			this.ultimoDir.setNext(novo);
			this.ultimoDir = novo;
			this.ultimoDir.setNext(this.ultimoEsq);
			if(this.ultimoEsq != null) {
				this.ultimoEsq.setNext(this.ultimoDir);
			}
		}
	}

	public int dequeueEsq() throws EmptyDequeException {
		if (isEmptyEsq()) {
			throw new EmptyDequeException();
		} else if (this.primeiroEsq == this.ultimoEsq) {
			int temp = this.primeiroEsq.getElement();
			this.primeiroEsq = null;
			this.ultimoEsq = null;
			return temp;
		} else {
			int temp = this.primeiroEsq.getElement();
			this.primeiroEsq = this.primeiroEsq.getNext();
			return temp;
		}
	}

	public int dequeueDir() throws EmptyDequeException {
		if (isEmptyDir()) {
			throw new EmptyDequeException();
		} else if (this.primeiroDir == this.ultimoDir) {
			int temp = this.primeiroDir.getElement();
			this.primeiroDir = null;
			this.ultimoDir = null;
			return temp;
		} else {
			int temp = this.primeiroDir.getElement();
			this.primeiroDir = this.primeiroDir.getNext();
			return temp;
		}
	}

	public int showFrontEsq() throws EmptyDequeException {
		if (isEmptyDir()) {
			throw new EmptyDequeException();
		} else {
			return this.primeiroEsq.getElement();
		}
	}

	public int showFrontDir() throws EmptyDequeException {
		if (isEmptyDir()) {
			throw new EmptyDequeException();
		} else {
			return this.primeiroDir.getElement();
		}
	}

	public int getSizeEsq()throws EmptyDequeException {
		if (isEmptyEsq()) {
			throw new EmptyDequeException();
		}else {
			int cont = 0;
			Node current = this.primeiroEsq;
			while(current != this.ultimoDir) {
				current = current.getNext();
				cont++;
			}
			return cont;
		}
	}
	
	public int getSizeDir()throws EmptyDequeException {
		if (isEmptyDir()) {
			throw new EmptyDequeException();
		}else {
			int cont = 0;
			Node current = this.primeiroDir;
			while(current != this.ultimoEsq) {
				current = current.getNext();
				cont++;
			}
			return cont;
		}
	}
}
