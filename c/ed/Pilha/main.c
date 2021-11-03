#include <stdio.h>
#include <stdlib.h>

struct prato {
  char cor;
  struct prato *prox;
};

typedef struct prato Prato;

Prato *pilha;

Prato *pegarUltimo(Prato *pilha) {
  if(pilha->prox == NULL) 
    return pilha;
  return pegarUltimo(pilha->prox);
}

void push(char cor) {
  Prato *p = (Prato*) malloc(sizeof(Prato)); 
  p->cor = cor;
  p->prox = pilha;
  pilha = p;
}

void pop() {
  if(pilha != NULL) {
    pilha = pilha->prox;
  } else {
    printf("Pilha vazia\n");
  }
}

void imprime(Prato *p) {
  if(p != NULL) {
    printf("Cor do prato: %c\n", p->cor);
    imprime(p->prox);
  } else {
    printf("Pilha vazia\n");
  }
}

int main(void) {
  push('b');
  push('r');

  imprime(pilha);

  printf("Removendo da pilha\n");

  pop();

  imprime(pilha);
  return 0;
}