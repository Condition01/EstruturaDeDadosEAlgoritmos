#include <stdio.h>

/*
8. Receba o valor de um depósito em poupança. Calcule e mostre o valor
após 1 mês de aplicação sabendo que rende 1,3% a. m.
*/

float getRenda(float value, int qtdMeses) {
  for(int i = 0; i < qtdMeses; i++) {
    value += value * 0.013;
  }
  return value;
}

int main(void) {
  float value;
  int qtdMeses;
  
  printf("Digite o valor investido\n");
  scanf("%f", &value);

  printf("Digite a quantidade de meses que o valor foi investido\n");
  scanf("%d", &qtdMeses);

  printf("Ao final do investimento, o valor total acumulado é de: %.2f", getRenda(value, qtdMeses));
}