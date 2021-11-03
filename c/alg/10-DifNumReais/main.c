#include <stdio.h>

/*
10. Receba 2 números reais. Calcule e mostre a diferença desses valores.
*/

float getDiff(float a, float b) {
  float diff = a - b;
  return diff > 0 ? diff : diff * -1;
}

int main(void) {
  float a,b;

  printf("Digite o número a\n");
  scanf("%f", &a);

  printf("Digite o número a\n");
  scanf("%f", &b);

  printf("A diferença dos valores entre 'a' e 'b' é: %.2f", getDiff(a, b));

  return 0;
}