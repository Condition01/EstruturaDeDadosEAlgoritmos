#include <stdio.h>

/*
45. Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
*/

float gerarResultadoSerie(int numerador) {
  int denominador = numerador;
  float serie = 0;
  for(int i = numerador; i <= 15 ; i++) {
    serie += (float) i/(i*i);
  }
  return serie;
} 

float gerarResultadoSerieRecursivo(float numerador) {
  if(numerador > 15) 
    return 0;
  return (numerador/(numerador*numerador)) + gerarResultadoSerieRecursivo(numerador+1);
} 

int main(void) {
  printf("O valor final da serie é de %.2f\n", gerarResultadoSerie(1));
  printf("O valor final da serie 'RECURSIVA' é de %.2f\n", gerarResultadoSerieRecursivo(1));
  return 0;
}