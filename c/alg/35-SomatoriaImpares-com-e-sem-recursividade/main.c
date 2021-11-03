#include <stdio.h>

/*
35. Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
mostre o resultado da somatória dos números ímpares entre esses valores.
*/

void lerValores(int *numero1, int *numero2) {
  printf("Digite o primeiro numero do invervalo\n");
  scanf("%d", numero1);

  printf("Digite o segundo numero do intervalo\n");
  scanf("%d", numero2);
}

int somatoriaRecursiva(int menor, int maior) {
  int somado = 0;
  if(menor > maior) 
    return 0;
  if(menor % 2 == 1) 
    somado = menor;
  return somado += somatoriaRecursiva(menor+1, maior);
}

void definirMaiorMenor(int *menor, int *maior, int numero1, int numero2) {
  if(numero1 > numero2) {
    *maior = numero1;
    *menor = numero2;
  } else {
    *maior = numero2;
    *menor = numero1;
  }
}

int main(void) {
  int numero1, numero2, menor, maior;

  lerValores(&numero1, &numero2);

  definirMaiorMenor(&menor, &maior, numero1, numero2);

  printf("O valor da somatória dos numeros ímpares entre %d e %d é: %d", menor, maior, somatoriaRecursiva(menor, maior));

  return 0;
}