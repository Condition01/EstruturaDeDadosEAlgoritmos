#include <stdio.h>

/*
44. Receba o número da base e do expoente. Calcule e mostre o valor da
potência.
*/

int calcPow(int base, int exp) {
  int resultado = base;
  if(exp == 0)
    return 1;
  for(int i = 1; i < exp; i++) {
    resultado *= base;
  }
  return resultado;
}

int calcPowRecursivo(int base, int exp) {
  if(exp == 0)
    return 1;
  if(exp == 1)
    return base;
  return base * calcPowRecursivo(base, exp-1);
}

void lerDados(int *base, int *exp) {
  printf("Digite o valor da base que deseja ver a potência\n");
  scanf("%d",base);
  printf("Digite o valor do expoênte que deseja ver a potência\n");
  scanf("%d", exp);
}

int main(void) {
  int base, exp;

  lerDados(&base, &exp);

  printf("O valor da potência de %d^%d é de %d", base, exp, calcPowRecursivo(base, exp));

  return 0;
}