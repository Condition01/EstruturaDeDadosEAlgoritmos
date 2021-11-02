package view;

import controller.HeapSort;
import controller.Heap;

public class Main {
	public static void main(String[] args) {
		int vetor[] = {12,11,13,5,7};
		int a;
		HeapSort heap = new HeapSort();
		heap.heapSort(vetor);
		for(int i=0;i<vetor.length;i++) {
			System.out.print( " " +  vetor[i] + " ");
		}
		
	}
}
