#include <stdio.h>

/*
27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
duração (minutos). Calcule e mostre a velocidade média em km/h.
*/

void lerValores(int *numeroVoltas, float *extensaoCicuito, int *tempoDuracao) {
  printf("Digite o número de voltas\n");
  scanf("%d", numeroVoltas);

  printf("Digite a extensão do circuito\n");
  scanf("%f", extensaoCicuito);

  printf("Digite o tempo de duração em minutos\n");
  scanf("%d", tempoDuracao);
}

float getDistanciaPercorrida(int numeroVoltas, int extensaoCicuito) {
  return (float) numeroVoltas * extensaoCicuito / 1000;
}

float getVelocidadeMedia(float deltaS, float deltaT) {
  return deltaS / deltaT;
}

int main(void) {
  int numeroVoltas, tempoDuracao;
  float extensaoCicuito, distanciaPercorrida, duracaoHoras;

  lerValores(&numeroVoltas, &extensaoCicuito, &tempoDuracao);

  distanciaPercorrida = getDistanciaPercorrida(numeroVoltas, extensaoCicuito);

  duracaoHoras = (float) (tempoDuracao)/60;

  printf("A velocidade media foi de %.2f km/h\n", getVelocidadeMedia(distanciaPercorrida, duracaoHoras));
  return 0;
}