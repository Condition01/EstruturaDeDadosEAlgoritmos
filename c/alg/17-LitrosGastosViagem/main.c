#include <stdio.h>

/*
17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/

float consumoLTS = 12.00;

float getDistanciaPercorrida(float velocidadeMedia, float tempoPercurso) {
  return velocidadeMedia * tempoPercurso;
}

float getTempoPercurso(float horas, float minutos) {
  float tempoPercurso;
  tempoPercurso = (horas * 60) + minutos;
  tempoPercurso /= 60;
  return tempoPercurso;
}

float getConsumoEmLitros(float distanciaPercorrida) {
  return distanciaPercorrida/consumoLTS;
}

int main(void) {
  float velocidadeMedia, distanciaPercorrida;
  int horas, minutos;

  printf("Digite a velocidade média\n");
  scanf("%f", &velocidadeMedia);

  printf("Digite a quantidade de horas gastas\n");
  scanf("%d", &horas);
  
  printf("Digite a quantidade de minutos gastos\n");
  scanf("%d", &minutos);

  distanciaPercorrida = getDistanciaPercorrida(velocidadeMedia, getTempoPercurso(horas, minutos));

  printf("A viagem consumiu aproximadamente: %.2f litros de combustivel", getConsumoEmLitros(distanciaPercorrida));

  return 0; 
}