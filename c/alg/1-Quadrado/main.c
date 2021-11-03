#include <stdio.h>

/*
1. Coletar o valor do lado de um quadrado, calcular sua área e apresentar o
resultado.
*/

int getArea(int a, int b) {
  return a*b;
}

int main(void) {
  int lado1, lado2;

  printf("Digite o valor do primeiro lado do quadrado %d\n", lado1);
  scanf("%d", &lado1);

  printf("Digite o valor do segundo lado do quadrado %d\n", lado2);
  scanf("%d", &lado2);

  printf("O valor da area do quadrado é: %d", getArea(lado1, lado2));

  return 0;
}