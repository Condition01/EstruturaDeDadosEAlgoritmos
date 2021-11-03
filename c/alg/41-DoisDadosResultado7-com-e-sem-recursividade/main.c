#include <stdio.h>

/*
41. Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
resultado 7.
*/

void printDados7() {
  for(int i = 1; i<=6; i++) {
    for(int j = 1; j <= 6; j++) {
      if(i + j == 7)
        printf("%d + %d == 7\n", i, j);
    }
  }
}

void printDadosRecursivo(int numero1, int numero2) {
  if(numero1 == 6 && numero2 == 6) 
    return;

  if(numero1 + numero2 == 7)
    printf("%d + %d == 7\n", numero1, numero2);

  if(numero2 == 6) {
    printDadosRecursivo(numero1+1, 1);
  } else {
    printDadosRecursivo(numero1, numero2+1);
  }  
}

int main(void) {

  printDados7();

  printf("RECURSIVO\n");

  printDadosRecursivo(1, 1);

  return 0;
}