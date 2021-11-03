#include <stdio.h>

/*
32. Receba um número inteiro. Calcule e mostre o seu fatorial.
*/

int fatorial(int numero) {
  int fat = numero;
  for(int i = numero-1; i > 1; i--) {
    fat *= i;
  }
  return fat;
}

int fatorialRecursivo(int numero) {
  if(numero < 2)
    return 1;
  return numero * fatorialRecursivo(numero - 1);
}

int fatorialRecursivoPonteiro(int *numero) {
  if(*numero < 2)
    return 1;
  int original = *numero;
  *numero -= 1;
  return original * fatorialRecursivoPonteiro(numero);
}

int main(void) {
  int numero;
  
  printf("Digite um número para saber seu fatorial\n");
  scanf("%d", &numero);

  printf("O fatorial do número é %d\n", fatorial(numero));

  printf("O fatorial do número, com recursividade, é %d\n", fatorialRecursivo(numero));

  printf("O fatorial do número, com recursividade e ponteiros, é %d\n", fatorialRecursivoPonteiro(&numero));

  return 0;
}