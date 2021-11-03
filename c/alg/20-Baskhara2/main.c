#include <stdio.h>
#include <math.h>

/*
20. Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
exista, calcule e mostre.
*/

float getDelta(float a, float b, float c) {
  return (b*b) - 4 * a * c;
}

float getRR(float a, float b, float delta, char op) {
  float sqrDelta = sqrt(delta);
  if(op == 'n') sqrDelta *= -1;
  return (-b + sqrDelta) / (2*a);
}

float getRRUnica(float a, float b) {
  return (-b + 0) / (2*a);
}

int main(void) {
  float a, b, c, delta;

  printf("Digite o valor de 'a'\n");
  scanf("%f", &a);

  printf("Digite o valor de 'b'\n");
  scanf("%f", &b);

  printf("Digite o valor de 'c'\n");
  scanf("%f", &c);

  delta = getDelta(a,b,c);

  printf("delta é %f\n", delta);

  if(delta > 0) {
    printf("A equação possuí duas raízes reais");
    printf("O valor de x' é: %.2f\n", getRR(a, b, delta, 'p'));
    printf("O valor de x'' é: %.2f\n", getRR(a, b, delta, 'n'));
  } else if(delta == 0) {
    printf("A equação possuí uma unica raíz real\n");
    printf("O valor de x a partir da FUNÇÃO ORIGINAL é: %.2f\n", getRR(a, b, delta, 'p'));
    printf("O valor de x a partir da FUNÇÃO ÚNICA é: %.2f\n", getRRUnica(a, b));
  } else {
     printf("Para o calculo ser válido é necessario existir pelo menos uma raíz real");
  }

  return 0;
}