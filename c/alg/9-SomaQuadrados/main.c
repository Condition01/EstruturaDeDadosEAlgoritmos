#include <stdio.h>

/*
9. Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.

*/

float getSomaQuadrados(float a, float b) {
  return (a*a) + (b*b);
}

int main(void) {
  float a, b;

  printf("Digite o primeiro número\n");
  scanf("%f", &a);

  printf("Digite o segundo número\n");
  scanf("%f", &b);

  printf("O valor da soma dos quadrados é: %.2f", getSomaQuadrados(a, b));

  return 0;
}