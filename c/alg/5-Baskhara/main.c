#include <stdio.h>
#include <math.h>

/*
5. Receba os coeficientes A, B e C de uma equação do 2º grau
(AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a
equação possue2 raízes).
*/

float getDelta(float a, float b, float c) {
  return (b*b) - 4 * a * c;
}

float getRR(float a, float b, float delta, char op) {
  float sqrDelta = sqrt(delta);
  if(op == 'n') sqrDelta *= -1;
  b *= -1;
  return (b + sqrDelta) / 2*a;
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
    printf("O valor de x' é: %.2f\n", getRR(a, b, delta, 'p'));
    printf("O valor de x'' é: %.2f\n", getRR(a, b, delta, 'n'));
  } else {
    printf("Para o calculo ser válido duas raízes reais precisam existir");
  }

  return 0;
}