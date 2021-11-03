#include <stdio.h>

/*
14. Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
*/

void mostrar3oAngulo(int a, int b) {
  if(a+b >= 180) {
    printf("Triangulo inválido.");
  } else {
    printf("O terceiro angulo é de %dº graus", 180-(a+b));
  }
}

int main(void) {
  int a,b;

  printf("Digite o primeiro angulo do triangulo\n");
  scanf("%d", &a);

  printf("Digite o segundo angulo do triangulo\n");
  scanf("%d", &b);

  mostrar3oAngulo(a, b);

  return 0;
}