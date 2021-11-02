package model;

public class Node {
	private int element;
	private Node next;
	private Node previous;
	
	public Node(int element) {
		this.element = element;
		this.next = null;
		this.previous = null;
	}
	public Node(Node p, Node n, int element) {
		this.element = element;
		this.next = n;
		this.previous = p;
	}
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
}
