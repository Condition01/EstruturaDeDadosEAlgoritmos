#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*
2. Criar e coletar um vetor [100] inteiro e exibir:
  a. O maior e o menor valor;
  b. A média dos valores.
*/

void resgatarMaiorMenor(int *maior, int *menor, int *v, int pos, int len) {
  if(pos >= len)
    return;
  if(v[pos] > *maior)
    *maior = v[pos];
  if(v[pos] < *menor)
    *menor = v[pos];
  resgatarMaiorMenor(maior, menor, v, pos+1, len);
}

float media(int *v, int len) {
  int soma = 0;
  for(int i = 0; i < len; i++) {
    soma += v[i];
  }
  return (float) soma/len;
}

float mediaRecursiva(int *v, int pos, int len, int soma) {
  if(pos >= len)
    return (float) soma/len;
  soma += v[pos];
  return mediaRecursiva(v, pos+1, len, soma);
}

int main(void) {
  srand(time(NULL)); 
  
  int len = 200;
  int v[len];
  for(int i = 0; i <= len; i++) {
    v[i] = rand() % 201;
  }

  int maior = v[0];
  int menor = maior;

  resgatarMaiorMenor(&maior, &menor, v, 0, len);

  printf("O maior número de 'v' é %d e o menor é %d\n", maior, menor);

  printf("O valor da média dos valores presentes é de %.2f\n", media(v, len));
  printf("O valor da média 'RECURSIVA' dos valores presentes é de %.2f", mediaRecursiva(v, 0,len, 0));

  return 0;
}