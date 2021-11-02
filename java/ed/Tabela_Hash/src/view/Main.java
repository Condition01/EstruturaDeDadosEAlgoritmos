package view;

import controller.Fila;
import model.Node;
public class Main {
	public static void main(String[] args) {
		Fila[] tabelaHash = new Fila[5];
		tabelaHash = tabelaConstruct(tabelaHash);
		
		tabelaHash = inserir(tabelaHash, 50);
	}
	static int functionHash(int n, int m) {
		System.out.println(n % m);
		return n % m;
	}
	static Fila[] inserir(Fila[] tabelaHash,int element) {
		int key = functionHash(element, tabelaHash.length-1);
		tabelaHash[key].enfileirar(element);
		return tabelaHash;
	}
	static Fila[] tabelaConstruct(Fila[] tabelaHash) {
		int size = tabelaHash.length;
		for(int i = 0;i<size;i++) {
			tabelaHash[i] = new Fila();
		}
		return tabelaHash;
	}
}
