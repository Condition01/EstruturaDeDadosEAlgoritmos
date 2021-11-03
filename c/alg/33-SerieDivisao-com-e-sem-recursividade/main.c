#include <stdio.h>

/*
33. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
*/

float calcSerie(int denominador) {
  float serie = 0;
  for(int i = 1; i <= denominador; i++) {
    serie += (float) 1/i;
  }
  return serie;
}

float calcSerieRecursivo(int denominadorFinal) {
  if(denominadorFinal == 1)
    return 1;
  return (float) 1/denominadorFinal + calcSerieRecursivo(denominadorFinal-1);
}

int main(void) {
  int numero;

  printf("Digite o número representando o denominador final da serie\n");
  scanf("%d", &numero);

  printf("O valor final da serie é: %f\n", calcSerie(numero));

  printf("O valor final da serie, com recursividade, é: %f\n", calcSerieRecursivo(numero));

  return 0;
}