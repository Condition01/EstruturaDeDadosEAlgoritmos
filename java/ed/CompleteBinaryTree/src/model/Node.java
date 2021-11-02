package model;

public class Node {
	public int element;
	public Node esq;
	public Node dir;
	
	public Node(int element) {
		this.element = element;
	}
	
	public Node(int element, Node e, Node d) {
		this.element = element;
		esq = e;
		dir = d;
	}
}
