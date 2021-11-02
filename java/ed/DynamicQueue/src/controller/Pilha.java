package controller;
import model.Node;
import controller.EmptyStackException;

public class Pilha {
	private Node topo;
	private int size;
	
	public Pilha() {
		this.topo = null;
		this.size = 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.topo == null;
	}
	
	public void empilhar(int element){
		Node novo = new Node(element);
		novo.setNext(this.topo);
		this.topo = novo;
		this.size++;
	}
	
	public int desempilhar() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}else {
			int removed = this.topo.getElement();
			this.topo = topo.getNext();
			this.size--;
			return removed;
		}
	}
	
	public int showTop() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}else {
			return this.topo.getElement();
		}
	}
}
