package View;

import Controller.Lista;
import Model.Node;

public class Main {
	public static void main(String[] args) {
		Lista list  = new Lista();
		list.insertFirst(new Node(1));
		list.insertFirst(new Node(2));
		list.insertFirst(new Node(5));
		list.insertFirst(new Node(3));
		list.insertFirst(new Node(3));
		list.findMiddle();
	}

}
