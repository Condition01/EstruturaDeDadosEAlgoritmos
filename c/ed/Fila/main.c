#include <stdio.h>
#include <stdlib.h>

struct pessoa {
  int senha;
  struct pessoa *prox;
};

typedef struct pessoa Pessoa;

Pessoa *fila;

Pessoa *pegarUltimo(Pessoa *fila) {
  if(fila->prox == NULL) 
    return fila;
  return pegarUltimo(fila->prox);
}

void add(int senha) {
  Pessoa *p = (Pessoa*) malloc(sizeof(Pessoa));
  p->senha = senha;

  if(fila == NULL) {
    fila = p;
  } else {
    Pessoa *ultimo = pegarUltimo(fila);
    ultimo->prox = p;
  }
}

void rem() {
  if(fila == NULL) {
    printf("Fila vazia\n");
  } else {
    fila = fila->prox;
  }
}

void imprime(Pessoa *f) {
  if(f != NULL) {
    printf("Senha da pessoa: %d\n", f->senha);
    imprime(f->prox);
  }
}

int main(void) {
  add(1);
  add(2);
  add(3);

  imprime(fila);

  printf("Remoção de dois elementos\n");

  rem();
  rem();

  imprime(fila);
  return 0;
}