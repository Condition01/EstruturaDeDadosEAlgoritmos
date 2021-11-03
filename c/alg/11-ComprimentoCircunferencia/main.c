#include <stdio.h>

/*
11. Receba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferência.
*/

float pi = 3.14;

float getComprimento(float raio) {
  return 2*pi*raio;
}

int main(void) {
  float raio;

  printf("Digite o valor do raio\n");
  scanf("%f", &raio);

  printf("O valor do comprimento da circunferência de raio %f é de: %.2f", raio, getComprimento(raio));

  return 0;
}