#include <stdio.h>

/*
2. Receba o salário de um funcionário e mostre o novo salário com reajuste
de 15%.
*/

int main(void) {

  float salario;

  printf("Digite o salário do funcionário\n");

  scanf("%f", &salario);

  printf("Aplicando reajuste...\n");

  salario *= 1.15;

  printf("O salario atual do funcionário é %.2f", salario);

  return 0;
}