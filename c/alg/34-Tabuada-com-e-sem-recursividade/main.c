#include <stdio.h>

/*
34. Receba um número. Calcule e mostre os resultados da tabuada desse número
*/

void mostraTabuada(int numero) {
  for(int i = 1; i <= 10; i++) {
    printf("%i x %i = %i\n", numero, i, numero * i);
  }
}

void mostraTabuadaRecursiva(int numero, int multiplicador) {
  if(multiplicador > 10)
    return;
  printf("%i x %i = %i\n", numero, multiplicador, numero * multiplicador);
  mostraTabuadaRecursiva(numero, multiplicador + 1);
}

int main(void) {
  int numero;

  printf("Digite um número que deseja ver a tabuada\n");
  scanf("%d", &numero);

  mostraTabuada(numero);

  printf("Recursividade --------\n");

  mostraTabuadaRecursiva(numero, 1);

  return 0;
}