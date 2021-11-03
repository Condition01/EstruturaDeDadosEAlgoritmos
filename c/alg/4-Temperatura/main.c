#include <stdio.h>

/*
4. Receba a temperatura em graus Celsius. Calcule e mostre a sua
temperatura convertida em fahrenheit F = (9*C+160) /5.
*/

float getTemp(float celsiusTemp) {
  return (celsiusTemp * 9/5) + 32;
}

int main(void) {
  float celsiusTemp;

  printf("Digite a temperatura em Cº\n");
  scanf("%f", &celsiusTemp);

  printf("A temperatura em celsius é: %.2f", getTemp(celsiusTemp));

  return 0;
}