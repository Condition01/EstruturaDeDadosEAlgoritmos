#include <stdio.h>

/*
36. Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
*/

void lerDados(int *denominadorP) {
  printf("Digite o denominador\n");
  scanf("%d", denominadorP);
}

float calcFatorial(int numero) {
  int fat = 1;
  for(int i=numero; i>1; i--) {
    fat *= i;
  }
  return fat;
} 

float calcFatorialRecursivo(int numero) {
  if(numero < 2)
    return 1;
  return numero *  calcFatorialRecursivo(numero - 1);
}

float calcSequencia(int *denominadorP) {
  float seqResult;
  for(int i=1;i<=*denominadorP;i++) {
    seqResult += (float) 1/calcFatorial(i);
  }
  return seqResult;
}

float calcSequenciaRecursivo(int inicio, int denominadorFinal) {
  if(inicio > denominadorFinal) {
    return 0;
  }
  return (float) 1/calcFatorialRecursivo(inicio) + calcSequenciaRecursivo(inicio+1, denominadorFinal);
}

int main(void) {
  int denominador;

  lerDados(&denominador);

  printf("O resultado da sequência é %f\n", calcSequencia(&denominador));
  printf("O resultado da sequência RECURSIVA é %f\n", calcSequenciaRecursivo(1, denominador));
  return 0;
}