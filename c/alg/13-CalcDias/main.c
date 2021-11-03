#include <stdio.h>

/*
13. Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
durará esse alimento sabendo que a pessoa consome 50g ao dia.
*/

int getQtdDiasAlimento(float kgsAlimento) {
  return kgsAlimento/0.05;
}

int main(void) {
  float kgsAlimento;

  printf("Digite a qtd de kilos de um alimento\n");
  scanf("%f", &kgsAlimento);

  printf("Esse alimento durará aproximadamente: %d dias", getQtdDiasAlimento(kgsAlimento));
  return 0;
}