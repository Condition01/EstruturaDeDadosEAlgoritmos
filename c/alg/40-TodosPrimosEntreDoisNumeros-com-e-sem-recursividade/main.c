#include <stdio.h>

/*
40. Receba 2 números inteiros. Verifique e mostre todos os números primos
existentes entre eles.
*/

void lerDados(int *maior, int *menor) {
  int numero1, numero2;

  printf("Digite o primeiro numero\n");
  scanf("%d", &numero1);

  printf("Digite o segundo numero\n");
  scanf("%d", &numero2);

  if(numero1 > numero2) {
    *maior = numero1;
    *menor = numero2;
  } else {
    *maior = numero2;
    *menor = numero1;
  }

}

int verificarPrimo(int numero) {
  int qtdDivisoes = 0;
  for(int i = 1; i <= numero ; i++) {
    if(numero % i == 0)
      qtdDivisoes++;
  }
  return qtdDivisoes;
}

int verificarPrimoRecursivo(int inicio, int numero) {
  int primo = 0;
  if(inicio > numero)
    return 0;
  primo = numero % inicio == 0 ? 1: primo;
  return primo + verificarPrimoRecursivo(inicio+1, numero);
}


void mostrarTodosPrimos(int maior, int menor) {
  for(int i = menor; i <= maior; i++) {
    int ePrimo = verificarPrimo(i);
    if(ePrimo == 2)
      printf("Primo: %d\n", i);
  }
}

void mostrarPrimosRecursivo(int maior, int menor) {
  if(maior >= menor) {
    int ePrimo = verificarPrimoRecursivo(1, menor);
    if(ePrimo == 2)
      printf("Primo: %d\n", menor);
    mostrarPrimosRecursivo(maior, menor+1);
  }
}

int main(void) {
  int maior, menor;

  lerDados(&maior, &menor);

  mostrarTodosPrimos(maior, menor);

  printf("RECUSRIVO\n");

  mostrarPrimosRecursivo(maior, menor);
  
  return 0;
}