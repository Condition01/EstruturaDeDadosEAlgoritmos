#include <stdio.h>

/*
22. Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
crescente.
*/

void printArray(int *v) {
  printf("| %d | %d |\n", v[0], v[1]);
} 

int main(void) {
  int valores[2], fim, changer;

  fim = sizeof(valores)/sizeof(valores[0]);

  printf("o fim é %d\n", fim);

  printf("Digite o valor do primeiro número\n");
  scanf("%d", &valores[0]);

  printf("Digite o valor do segundo número\n");
  scanf("%d", &valores[1]);

  printf("------------------SORT------------------\n");
  printArray(valores);

  for(int i = 0; i < fim; i++) {
    for(int j = 1; j < (fim-i); j++) {
      if(valores[j-1] > valores[j]) {
          printf("troca do valor %d com valor %d\n", valores[j-1], valores[j]);
          changer = valores[j-1];
          valores[j-1] = valores[j];
          valores[j] = changer;
          printArray(valores);
        }
    }
  }

  return 0;
}