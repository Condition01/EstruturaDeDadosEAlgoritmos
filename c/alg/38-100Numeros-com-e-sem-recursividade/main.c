#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*

*/

typedef struct {
  int *n;
  int length;
} Numeros;

void lerDados(Numeros *numeros) {
  srand(time(NULL));

  printf("Digite a quantidade de números que deseja visualizar\n");
  scanf("%d", &numeros->length);

  numeros->n = malloc(numeros->length * sizeof(int));

  for(int i=0; i<numeros->length; i++) {
    numeros->n[i] = rand() % numeros->length;
    printf("COMPLETANDO ARRAY: pos: %d -> valor: %d\n",i, numeros->n[i]);
  }
}

void mostrarMaiorMenor(Numeros *numeros) {
  int maior, menor;
  
  for(int i=0; i<numeros->length; i++) {
    printf("MAIOR - MENOR: pos: %d -> valor: %d\n",i, numeros->n[i]);

    if(i == 0) {
      maior = numeros->n[i];
      menor = numeros->n[i];
    }
    if(numeros->n[i] > maior)
      maior = numeros->n[i];

    if(numeros->n[i] < menor)
      menor = numeros->n[i];
  }
  
  printf("O maior número mostrado é %d \n", maior);
  printf("O menor número mostrado é %d \n", menor);
}

void pegaMaiorMenorRecursivo(int *maior, int *menor, Numeros *numeros, int pos) {
  if(pos == numeros->length)
    return;
  
  if(pos == 0) {
    *maior = numeros->n[pos];
    *menor = numeros->n[pos];
  }

  if(numeros->n[pos] > *maior)
    *maior = numeros->n[pos];

  if(numeros->n[pos] < *menor)
    *menor = numeros->n[pos];

  pegaMaiorMenorRecursivo(maior, menor, numeros, pos+1);
}

int main(void) {
  Numeros numeros;

  lerDados(&numeros);

  printf("Numero pos[0]: %d\n", numeros.n[0]);
  printf("Numero pos[99]: %d\n", numeros.n[99]);

  mostrarMaiorMenor(&numeros);

  int maior, menor;

  pegaMaiorMenorRecursivo(&maior, &menor, &numeros, 0);

  printf("-------------RECURSÃO-------------------\n");
  printf("O maior número mostrado é %d \n", maior);
  printf("O menor número mostrado é %d \n", menor);
  
  return 0;
}