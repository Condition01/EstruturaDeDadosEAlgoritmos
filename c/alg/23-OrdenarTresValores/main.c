#include <stdio.h>

/*
23. Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
necessariamente em ordem. Mostre os 4 números em ordem crescente.
*/

static int arraySize;

void printArray(int *v, int pos) {
  if(pos >= arraySize) {
    printf("|\n");
    return;
  }
  printf("| %d  ", v[pos]);
  printArray(v, ++pos);
} 

void swap(int *a, int *b){ 
    int temp = *a; 
    *a = *b; 
    *b = temp; 
} 

void bubbleSort(int *v, int n){ 
    if (n < 1)return; 
 
    for (int i=0; i<n; i++) 
        if (v[i] > v[i+1]) {
          swap(&v[i], &v[i+1]); 
          printArray(v, 0);
        }
        
    bubbleSort(v, n-1); 
} 


void bubbleSort2(int *v, int n){ 
    if (n < 1)return; 
 
    for (int j=1; j < n; j++) 
        if (v[j-1] > v[j]) {
          swap(&v[j-1], &v[j]); 
          printArray(v, 0);
        }
    bubbleSort2(v, n-1); 
} 

int * getArray( ) {

    static int r[7];

    r[0] = 11;
    r[1] = 3;
    r[2] = 4;


    arraySize = sizeof(r)/sizeof(r[0]);

    printf("Digite um valor inteiro aleatório para o array 'r'\n");
    scanf("%d", &r[3]);

    r[4] = 10;
    r[5] = 7;
    r[6] = 8;

   return r;
}

int main(void) {

  int *valores, tam;

  valores = getArray();

  printArray(valores, 0);

  bubbleSort(valores, arraySize-1);
  // bubbleSort2(valores, arraySize);
  
}