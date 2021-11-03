#include <stdio.h>

/*
42. Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
*/

float calcularSerie() {
  float numerador, denominador, serie;
  numerador = 1;
  denominador = numerador;

  do {
    serie += (numerador/denominador);
    numerador++;
    denominador += 2;
  } while(numerador < 50);

  printf("Ultimo valor do numerador: %.1f e Ultimo valor do denominador %.1f\n", numerador, denominador);
  return serie;
}

float calcularSerieRecursiva(float numerador, float denominador) {
  if(numerador < 50){
    return numerador/denominador + calcularSerieRecursiva(numerador+1, denominador+2);
  } else {
    printf("Ultimo valor (VERSÃO RECUSRIVA) do numerador: %.1f e Ultimo valor do denominador %.1f\n", numerador, denominador);
    return 0;
  }
}

int main(void) {
  printf("Valor da serie: %.1f\n", calcularSerie());
  printf("Valor da serie RECURSIVA: %.1f\n", calcularSerieRecursiva(1,1));
  return 0;
}