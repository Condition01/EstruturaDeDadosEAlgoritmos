package Controller;

import Model.Node;

public class Lista {
	protected Node head;
	protected Node tail;
	protected int size;

	public Lista() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return (this.size == 0);
	}

	public void insertFirst(Node n) {
		n.setNext(head);
		head = n;
		size++;
		if (size == 1) {
			tail = head;
		}

	}

	public void insertLast(Node n) {
		if (isEmpty()) {
			insertFirst(n);
		} else {
			n.setNext(null);
			tail.setNext(n);
			tail = n;
			this.size++;
		}
	}

	public void insertAfter(Node n, int pos) {
		if (pos < 0 || pos >= size) {
			System.err.println("posição invalida");
		}if(pos == size - 1) {
			insertLast(n);
		} else {
			Node current = head;
			int posAtual = 0;
			while (posAtual < pos) {
				current = current.getNext();
				posAtual++;
			}
			n.setNext(current.getNext());
			current.setNext(n);
			this.size++;

		}
	}

	public void insertBefore(Node n, int pos) {
		if (pos < 0 || pos >= size) {
			System.err.println("posição invalida");
		} else {
			Node current = head;
			Node previous = null;
			int posAtual = 0;
			while (posAtual < pos) {
				previous = current;
				current = current.getNext();
				posAtual++;
			}
			n.setNext(current);
			previous.setNext(n);
			this.size++;

		}
	}

	public void removeFirst() {
		if (isEmpty()) {
			System.err.println("Lista vazia!");
		} else if (this.size == 1) {
			this.head = this.tail = null;
			this.size--;
		} else {
			this.head = this.head.getNext();
			this.size--;
		}
	}

	public void removelast() {
		if (isEmpty()) {
			System.err.println("Lista vazia!");
		} else if (size == 1) {
			removeFirst();
		} else {
			Node current = this.head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(null);
			this.tail = current;
			this.size--;
		}
	}

	public void removeAfter(int pos) {
		if (pos < 0 || pos >= size || isEmpty()) {
			System.err.println("Lista vazia ou index invalido!");
		}if(pos == size - 1) {
			System.err.println("Erro ultimo da lista!");
		} else {
			int posAtual = 0;
			Node current = this.head;
			while (posAtual < pos) {
				current = current.getNext();
				posAtual++;
			}
			current.setNext(current.getNext().getNext());
			if (current.getNext() == null) {
				this.tail = current;
			}
			this.size--;
		}
	}

	public Node getFirst() {
		if (isEmpty()) {
			System.err.println("Lista vazia!");
			return null;
		} else {
			return this.head;
		}
	}

	public Node getLast() {
		if (isEmpty()) {
			System.err.println("Lista vazia");
			return null;
		} else {
			return this.tail;
		}
	}

	public Node get(int pos) {
		if(isEmpty()) {
			System.err.println("Lista vazia!");
			return null;
		}
		if (pos < 0 || pos >= size) {
			System.err.println("Posição invalida!");
			return null;
		}else {
			Node current = head;
			int posAtual = 0;
			while(posAtual<pos){
				current = current.getNext();
				posAtual++;
			}
			return current;
		}
	}
	public void print() {
		Node current = head;
		while(current !=null) {
			System.out.print(current.getElement() + " ");
			current = current.getNext();
		}
	}
	public void invertList() {
		Node atual = this.head;
		Node proximo = this.head;
		Node temp = this.head;
		while(proximo !=null) {
			temp = temp.getNext();
			proximo.setNext(atual);
			atual = proximo;
			proximo = temp;
		}
		this.head.setNext(null);
		this.head = atual;
	}
	public void findMiddle() {
		if(isEmpty()) {
			System.err.println("Lista vazia!");
		}else {
			Node previous = this.head;
			Node current = this.head;
			while( current != null && current.getNext() != null) { //tem que validar os dois, pq null não tem getNext();
				previous = previous.getNext();
				current = current.getNext().getNext();
			}
			System.out.println(previous.getElement());
		}
	}
	
}
