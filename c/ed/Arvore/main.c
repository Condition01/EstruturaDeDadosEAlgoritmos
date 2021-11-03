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

void add(Nodo *n, int valor) {
  if(valor < n->valor) {
    if(n->esq == NULL)
      n->esq = create(valor);
    else
      add(n->esq, valor);
  } else {
    if(n->dir == NULL)
      n->dir = create(valor);
    else
      add(n->dir, valor);
  }
}

void rem(Nodo *n, int valor) {
  Nodo *filho = n;
  Nodo *pai;

  do {
    pai = filho;
    if(valor < filho->valor)
      filho = filho->esq;
    else if(valor > filho->valor)
      filho = filho->dir;
  } while(filho != NULL && filho->valor != valor);

  if(filho != NULL) {
    if(filho->esq == NULL && filho->dir == NULL) { //CASO NULL-NULL (0 FILHOS)
      if(pai->esq == filho) pai->esq = NULL;
      if(pai->dir == filho) pai->dir = NULL;
    }

    if(filho->esq != NULL && filho->dir == NULL) { //CASO (1 FILHO A ESQUERDA)
      if(pai->esq == filho) pai->esq = filho->esq;
      if(pai->dir == filho) pai->dir = filho->esq;
    }

    if(filho->dir != NULL && filho->esq == NULL) { //CASO (1 FILHO A DIREITA)
      if(pai->esq == filho) pai->esq = filho->dir;
      if(pai->dir == filho) pai->dir = filho->dir;
    }

    if(filho->esq != NULL && filho->dir != NULL) { //CASO (2FILHOS)
      if(filho->esq->dir == NULL) {
        printf("passou\n");
        filho->valor = filho->esq->valor;
        filho->esq = filho->esq->esq;
      } else {
        Nodo *p = filho->esq;
        Nodo *aux = p;
        while(p->dir != NULL ){
          aux = p;
          p = p->dir;
        }
        aux ->dir = NULL;
        filho->valor = p->valor;
      }
    }
  }
}

int main(void) {
  
  Nodo *raiz;

  raiz = create(8);

  add(raiz, 4);
  add(raiz, 2);
  add(raiz, 1);
  add(raiz, 6);
  add(raiz, 5);
  add(raiz, 12);
  add(raiz, 10);
  add(raiz, 14);
  add(raiz, 11);
  add(raiz, 13);
  add(raiz, 15);

  rem(raiz, 4);


  // Nodo *n2 =  create(2);
  // Nodo *n1 =  create(1);
  // Nodo *n8 =  create(8);
  // Nodo *n4 =  create(4);

  printf("Imprime RECURSIVO (PRE-ORDER)\n");
  imprimir(raiz);
  printf("Imprime com PILHA (PRE-ORDER)\n");
  imprimirArvoreComPilha(raiz);

  return 0;
}