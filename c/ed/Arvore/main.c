#include <stdio.h>
#include <stdlib.h>

/*
ARVORE
*/

struct nodo {
  int valor;
  struct nodo *esq;
  struct nodo *dir;
};

typedef struct nodo Nodo;

Nodo* create(int valor) {
  Nodo *n = malloc(sizeof(Nodo));
  n->valor = valor;
  n->esq = NULL;
  n->dir = NULL;
  return n;
}

void imprimir(Nodo *n) {
  if(n == NULL) 
    return;
  printf("%d\n", n->valor);
  imprimir(n->esq);
  imprimir(n->dir);
}
/*
PILHA
*/

struct nodoPilha {
  Nodo *item;
  struct nodoPilha *prox;
};

int tamPilha = 0;

typedef struct nodoPilha NodoPilha;

NodoPilha *pilha;

NodoPilha *pegarUltimo(NodoPilha *pilha) {
  if(pilha->prox == NULL) 
    return pilha;
  return pegarUltimo(pilha->prox);
}

void push(Nodo *item) {
  NodoPilha *p = (NodoPilha*) malloc(sizeof(NodoPilha)); 
  p->item = item;
  p->prox = pilha;
  tamPilha++;
  pilha = p;
}

Nodo *pop() {
  Nodo *retorno;
  if(pilha != NULL) {
    retorno = pilha->item;
    pilha = pilha->prox;
    tamPilha--;
  } else {
    printf("Pilha vazia\n");
  }
  return retorno;
}

void imprimirArvoreComPilha(Nodo *n) {
  Nodo *aux;
  while(n != NULL) {
    printf("%d\n", n->valor);
    
    aux = n;
    if(n->esq != NULL) {
      n = n->esq;
    }else {
      n = n->dir;
      while(n == NULL && tamPilha > 0) {
        n = pop();
        n = n->dir;
      }
    }
    push(aux);
  }
}

int main(void) {
  
  Nodo *n5 =  create(5);
  Nodo *n2 =  create(2);
  Nodo *n1 =  create(1);
  Nodo *n8 =  create(8);
  Nodo *n4 =  create(4);

  n5->esq = n2;
  n2->esq = n1;
  n5->dir = n8;
  n2->dir = n4;

  imprimirArvoreComPilha(n5);

  return 0;
}