package controller;

public class StaticStack {
	public String [] pilha;
	public int topo;
	
	public StaticStack(int n) {
		this.topo = -1;
		this.pilha = new String[n];
	}
	
	public boolean isEmpty() {
		if(this.topo == -1) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(this.topo == this.pilha.length-1) {
			return true;
		}
		return false;
	}
	public int getSize() {
		if(isEmpty()) {
			return 0;
		}
		return this.topo+1;
	}
	public Object showTop() { //é object porque a minha pilha pode ser de qualquer coisa(lembrando que uma estrutura de dados deve ser homogenea)
		if(isEmpty()) {
			return null;
		}
		return this.pilha[this.topo];
	}
	public void empilhar(String element) {
		if(!isFull()) {
			this.pilha[++topo] = element; //a ultima posição da pilha recebe o elemento
		}
	}
	public Object desimpilhar() {
		if(isEmpty()) {
			return null;
		}
		return this.pilha[this.topo--];
	}
}
