#include <stdio.h>

/*
7. Receba os valores do comprimento, largura e altura de um paralelepípedo.
Calcule e mostre seu volume.
*/

float getVolume(float comprimento, float largura, float altura) {
  return comprimento * largura * altura;
}

int main(void) {
  float comprimento, largura, altura;

  printf("Digite o comprimento do paralelepipedo\n");
  scanf("%f", &comprimento);

  printf("Digite a largura do paralelepipedo\n");
  scanf("%f", &largura);

  printf("Digite a altura do paralelepipedo\n");
  scanf("%f", &altura);

  printf("O valor do comprimento x largura x altura é: %.2f\n", getVolume(comprimento, largura, altura));

  return 0;
}