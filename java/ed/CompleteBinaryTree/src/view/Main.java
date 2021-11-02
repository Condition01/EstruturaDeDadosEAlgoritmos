package view;

import controller.Tree;

public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.inserir(tree.raiz, 50);
		tree.inserir(tree.raiz, 40);
		tree.inserir(tree.raiz, 60);
		tree.inserir(tree.raiz, 35);
		tree.inserir(tree.raiz, 45);
		tree.inserir(tree.raiz, 55);
		tree.inserir(tree.raiz, 65);
		tree.inserir(tree.raiz, 43);
		tree.inserir(tree.raiz, 47);
		tree.posOrdem(tree.raiz);
		
		tree.remove(tree.raiz, tree.raiz, 40);
		System.out.println(tree.printTree(tree.raiz));

	}
}
