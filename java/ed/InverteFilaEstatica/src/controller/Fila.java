package controller;

public class Fila {
	private int fila[];
	private int primeiro;
	private int ultimo;

	public Fila(int size) {
		this.fila = new int[size];
		this.primeiro = -1;
		this.ultimo = -1;
	}

	public int getSize() {
		return this.ultimo - this.primeiro + 1;
	}

	public boolean isEmpty() {
		return this.ultimo == -1;
	}

	public boolean isFull() {
		return this.ultimo == this.fila.length - 1;
	}

	public int showFront() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		}
		return this.fila[this.primeiro];
	}

	public void enfileirar(int element) {
		if (isEmpty()) {
			this.fila[++this.primeiro] = element;
			this.ultimo++;
		} else if (isFull()) {
			System.err.println("EmptyQueueException!");
		} else {
			this.fila[++this.ultimo] = element;
		}
	}

	public int desenfileirar() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		}else {
			int size = this.fila.length-1;
			int temp = this.fila[this.primeiro];
			for(int i=0;i<size;i++) {
				this.fila[i] = this.fila[i+1];
			}
			this.ultimo--;
			return temp;
		}
	}
	
	public void inverteFila() throws EmptyQueueException {
		int size = getSize();
		Pilha pilha = new Pilha();
		for(int i=0;i<size;i++) {
			pilha.push(desenfileirar());
		}
		for(int i=0;i<size;i++) {
			try {
				enfileirar(pilha.pop());
			} catch (EmptyStackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
