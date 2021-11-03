#include <stdio.h>

/*
31. Calcule e mostre o quadrado dos números entre 10 e 150.
*/

// como usa referência dos ponteiros, utiliza sempre o mesmo espaço de memória
void sequenciaQuadradosRecursivo(int *numero) {
  if(*numero > 150)
    return;
  printf("O valor do quadrado de %d é igual a %d\n", *numero, *numero * *numero);
  *numero += 1;
  sequenciaQuadradosRecursivo(numero); 
}

void sequenciaQuadrados(int numero) {
  for(int i=numero; i <= 150; i++) {
    printf("O valor do quadrado de %d é igual a %d\n", i, i * i);
  }
}

int main(void) {
  int numero = 10;

  sequenciaQuadrados(10);

  printf("Versão recursiva");

  sequenciaQuadradosRecursivo(&numero);

  return 0;
}