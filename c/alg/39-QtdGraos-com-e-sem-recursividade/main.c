#include <stdio.h>

/*
39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 1 2 3 4 ... 64
Qte: 1 2 4 8 ... N
*/

long long int pegarQtdGraosRecursivo(int casa, long long int valor) {
  if(casa > 64)
    return valor;
  return pegarQtdGraosRecursivo(casa+1, valor*2);
}

long long int pegarQtdGraos(long long int valor) {
  for(int i = 1; i <= 64; i++) {
    valor *= 2;
  }
  return valor;
}

int main(void) {
  printf("A quantidade de grãos é igual a: %lld\n", pegarQtdGraos(1));
  printf("A quantidade de grãos RECURSIVO é igual a: %lld\n", pegarQtdGraosRecursivo(1, 1));
  return 0;
}