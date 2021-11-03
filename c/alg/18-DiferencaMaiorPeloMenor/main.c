#include <stdio.h>

/*
18. Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do
maior pelo menos valor.
*/

void mostraDiferenca(int valor1, int valor2) {
  char maior, menor;

  int diff = valor1 - valor2;
  if(valor1 > valor2) {
    diff = valor1 - valor2;
    maior = '1';
    menor = '2';
  } else {
    diff = valor2 - valor1;
    maior = '2';
    menor = '1';
  }

  printf("O valor da diferneça entre 'valor%c'e 'valor%c' é de %d", maior, menor, diff);
}

int main(void) {
  int valor1, valor2;
 

  printf("Digite um valor para a variavel 'valor1'\n");
  scanf("%d", &valor1);
  
  printf("Digite um valor para a variavel 'valor2'\n");
  scanf("%d", &valor2);

  mostraDiferenca(valor1, valor2);
  return 0;
}