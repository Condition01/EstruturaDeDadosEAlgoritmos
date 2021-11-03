#include <stdio.h>

/*
19. Receba 2 valores reais. Calcule e mostre o maior deles.
*/

float getMaior(float a, float b) {
  return a > b ? a : b;
}

int main(void) {
  float a,b;

  printf("Digite um valor para variável 'a'\n");
  scanf("%f", &a);

  printf("Digite um valor para variável 'b'\n");
  scanf("%f", &b);

  printf("O maior valor entre %.2f e %.2f é de %.2f", a, b, getMaior(a, b));

  return 0;
}