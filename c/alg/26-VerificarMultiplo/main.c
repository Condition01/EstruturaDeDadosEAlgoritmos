#include <stdio.h>

/*
26. Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo
do menor.
*/

void lerNumeros(int *numero1, int *numero2) {
  printf("Digite o primeiro número\n");
  scanf("%d", numero1);

  printf("Digite o segundo número\n");
  scanf("%d", numero2);
}

int verificarSeMultiplo(int maior, int menor) {
  return maior % menor == 0 ? 1: 0;
}

void mostrarSeMultiplo(int numero1, int numero2) {
  int maior, menor, multiplo;

  if(numero1 > numero2) {
    maior = numero1;
    menor = numero2;
  } else {
    maior = numero2;
    menor = numero1;
  }

  multiplo = verificarSeMultiplo(maior, menor);

  if(multiplo == 1) {
    printf("O número %d é multiplo do número %d", maior, menor);

  } else {
    printf("O número %d NÃO é multiplo do número %d", maior, menor);
  }

}

int main(void) {
  int numero1, numero2;

  lerNumeros(&numero1, &numero2);

  mostrarSeMultiplo(numero1, numero2);

  return 0;
}