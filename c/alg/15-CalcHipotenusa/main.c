#include <stdio.h>
#include <math.h>

/*
15. Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre
a hipotenusa.
*/

float getHipotenusa(float b, float c) {
  return sqrt((b*b) + (c*c));
}

int main(void) {
  float b,c;
  
  printf("Digite o valor do cateto 'b'\n");
  scanf("%f", &b);

  printf("Digite o valor do cateto 'c'\n");
  scanf("%f", &c);

  printf("O valor da hipotenusa é de %.2f", getHipotenusa(b, c));

  return 0;
}