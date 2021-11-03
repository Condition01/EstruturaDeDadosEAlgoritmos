#include <stdio.h>

/*
24. Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3
*/

void mostrarSeDivisivel(int *valor) {
  if(*valor % 2 == 0 && *valor % 3 == 0) {
    printf("Valor divisível por 2 e por 3");
    return;
  }
  printf("Valor NÃO divisível por 2 e por 3");
}

int main(void) {
  int valor;

  printf("Digite um valor inteiro\n");
  scanf("%d", &valor);
  mostrarSeDivisivel(&valor);
 
  return 0;
}