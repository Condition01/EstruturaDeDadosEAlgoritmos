#include <stdio.h>

/*
37. Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
N’nésimo termo.
*/

void lerDados(int *termoP){
  printf("Digite o numero de termos da sequência de fibonacci que deseja ver \n");
  scanf("%d", termoP);
}

void trocaSeq(int *anterior, int *atual) {
  int aux;
  aux = *atual;
  *atual = *atual + *anterior;
  *anterior = aux;
}

void mostrarFibonacci(int *termoP) {
  int anterior = 0, atual = 1;

  for(int i = 0; i <= *termoP; i ++) {
    if(i == 0) {
      printf("%d ", anterior);
    } else {
      printf("%d ", atual);
      trocaSeq(&anterior, &atual);
    }
  }
}

void mostrarFibonacciRecursivo(int anterior, int atual, int termoFinal) {
  if(termoFinal < 1) 
    return;

  if(anterior == 0) 
    printf("%d ", anterior);

  printf("%d ", atual);

  trocaSeq(&anterior, &atual);

  mostrarFibonacciRecursivo(anterior, atual, termoFinal - 1);
}

int pegarTermoComRecursao(int termo) {
  if(termo == 0 || termo == 1)    
    return termo;
  return pegarTermoComRecursao(termo-1) + pegarTermoComRecursao(termo-2);
}

void mostrarFiboRecursivoAprimorado(int inicio, int termo) {
  if(inicio <= termo) {
    printf("%d ", pegarTermoComRecursao(inicio));
    mostrarFiboRecursivoAprimorado(inicio + 1, termo);
  }
}

int main(void) {
  int termo;

  lerDados(&termo);

  printf("COM LAÇO: \n");

  mostrarFibonacci(&termo);

  printf("\nRECURSIVO COM SWAP: \n");

  mostrarFibonacciRecursivo(0, 1, termo);

  printf("\nRECURSIVO COM FUNÇÃO FIBONACCI:\n");

  mostrarFiboRecursivoAprimorado(0, termo);

  return 0;
}