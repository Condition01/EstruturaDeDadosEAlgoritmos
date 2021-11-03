#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*
1. Criar e coletar um vetor [50] inteiro. Calcular e exibir:
  a. A média dos valores entre 10 e 200;
  b. A soma dos números ímpares.
*/

void resgatarMaiorMenor(int *maior, int *menor, int *v, int pos) {
  if(pos >= 50)
    return;
  if(v[pos] > *maior)
    *maior = v[pos];
  if(v[pos] < *menor)
    *menor = v[pos];
  resgatarMaiorMenor(maior, menor, v, pos+1);
}

float mediaEntre10And200(int *v) {
  float soma=0;
  int len = 50;
  for (int i = 0; i < len; i++) {
    if(v[i] >= 10 && v[i] <= 200)
      soma += v[i];
  }
  printf("Soma antes da divisão: %.2f\n", soma);
  return soma != 0 ? (float) soma/len : 0;
}

float mediaEntre10And200Recursivo(int *v, int pos, int len, int soma) {
  if(pos >= len)
    return (float) soma/len;
  if(v[pos] >= 10 && v[pos] <= 200)
      soma += v[pos];
  return mediaEntre10And200Recursivo(v, pos+1, len, soma);
}

int somaImpares(int *v) {
  int soma = 0;
  for(int i = 0; i < 50; i++) {
    if(v[i] % 2 == 1)
      soma += v[i];
  }
  return soma;
}

int somaImparesRecursiva(int *v, int pos) {
  if(pos >= 50) {
    return 0;
  }
  int soma; 
  soma = v[pos] % 2 == 1? v[pos] : 0;
  return soma + somaImparesRecursiva(v, pos+1);
}

void printArray(int *v) {
  for (int i = 0; i <= 50; i++) {
    printf("%d\n", v[i]);
  }
}

int main(void) {
  // int maior, menor;
  srand(time(NULL)); 

  int v[50];
  for(int i = 0; i <= 50; i++) {
    v[i] = rand() % 201;
  }

  int maior = v[0];
  int menor = maior;

  resgatarMaiorMenor(&maior, &menor, v, 0);

  // printf("O maior número de 'v' é %d e o menor é %d\n", maior, menor);

  printf("O valor da soma dos números impares é de %d\n", somaImpares(v));

  printf("O valor da soma dos números impares 'RESCURSIVA' é de %d\n", somaImparesRecursiva(v, 0));

  printf("O valor da media dos números entre 10 e 200 é de %.2f\n", mediaEntre10And200(v));

  printf("O valor da media dos números entre 10 e 200 'RECURSIVA' é de %.2f", mediaEntre10And200Recursivo(v, 0 , 50, 0));

  return 0;
}