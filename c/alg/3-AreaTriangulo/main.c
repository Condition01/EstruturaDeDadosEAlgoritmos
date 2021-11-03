#include <stdio.h>

/*
3. Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
*/

float getArea(float a, float b) {
  float value =  a*b/2.0;
  return value;
}

int main(void) {
  float base, altura;

  printf("Digite a base do triangulo\n");

  scanf("%f", &base);

  printf("Digite a altura do triangulo\n");

  scanf("%f", &altura);

  printf("A area do triangulo é: %.2f", getArea(base, altura));
  

  return 0;
}