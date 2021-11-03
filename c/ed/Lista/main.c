#include <stdio.h>
#include <stdlib.h>

struct ponto {
  float x;
  float y;
  struct ponto *prox;
};

typedef struct ponto Ponto;

Ponto *listaPontos;
int length = 0;

void addInicio(float x, float y) {
  Ponto *p = (Ponto*) malloc(sizeof(Ponto));

  p->x = x;
  p->y = y;
  p->prox = listaPontos;

  listaPontos = p;

  length++;
}

Ponto* pegarUltimo(Ponto *p) {
  if(p->prox == NULL)
    return p;
  return pegarUltimo(p->prox);
}

void addFinal(float x, float y) {
  Ponto *p = (Ponto*) malloc(sizeof(Ponto));

  p->x = x;
  p->y = y;
  p->prox = NULL;

  if(listaPontos == NULL) {
    listaPontos = p;
  } else {
    Ponto *ultimo;
    ultimo = pegarUltimo(listaPontos);
    ultimo->prox = p;
  }

  length++;
}

void addPos(int x, int y, int pos) {
  Ponto *p = (Ponto*) malloc(sizeof(Ponto));

  p->x = x;
  p->y = y;
  p->prox = NULL;

  if(length < pos) {
     printf("Não é possivel inserir na posição desejada, pois a lista têm apenas %d itens\n", length);
        return;
  }

  if(pos == 0) {
    p->prox = listaPontos;
    listaPontos = p;
  } else {
    Ponto *aux = listaPontos;

    for(int i = 0; i < pos-1; i++) {
      aux = aux->prox;
    }

    p->prox = aux->prox;
    aux->prox = p;
  }

  length++;
}

void remover(int pos) {
  if(pos >= length) {
     printf("Não é possivel remover na posição desejada, pois a lista têm apenas %d itens\n", length);
        return;
  }

  if(pos == 0) {
    listaPontos = listaPontos->prox;
  } else {
    Ponto *aux = listaPontos;
    for(int i = 0; i < pos-1; i++) {
      aux = aux->prox;
    }
    aux->prox = aux->prox->prox;
  }

  length--;
}

void removerRecursivo(int aux, Ponto *p) {
  if(aux > 0 && p->prox == NULL) {
     printf("Não é possivel remover na posição desejada, pois a lista têm apenas %d itens\n", length);
  } else {
    if(aux == 0 || aux == 1) {
      if(aux == 0) {
        listaPontos = listaPontos->prox;
      } else {
        p->prox = p->prox->prox;
      }
    } else {
      removerRecursivo(aux-1, p->prox);
    }
    length--;
  }
}

void addPosRecursivo(int x, int y, int aux, Ponto *p) {
  if(p == NULL) {
    printf("Não é possivel inserir na posição desejada, pois a lista têm apenas %d itens\n", length);
  } else {
    if(aux == 0 || aux == 1) {
        Ponto *p2 = (Ponto*) malloc(sizeof(Ponto));
        p2->x = x;
        p2->y = y;

        if(aux == 0) {
          p2->prox = p;
          listaPontos = p2;
        } else {
          p2->x = x;
          p2->y = y;
          p2->prox = p->prox;
          p->prox = p2;
        }
        length++;
      } else {
        addPosRecursivo(x, y, aux-1, p->prox);
      }
  }
}

void mostrarLista(Ponto *lista) {
  if(lista == NULL)
    return;
  printf("x,y: (%.1f,%.1f)\n", lista->x, lista->y);
  mostrarLista(lista->prox);
}

int main(void) {

  // add(1,5);

  addFinal(1,5);
  // addFinal(3,4);
  // addPos(5, 5, 2);
  // addPosRecursivo(5,7,3,listaPontos);
  // addPosRecursivo(5,7,0,listaPontos);
  // addPosRecursivo(8,8,4,listaPontos);

  // remover(4);
  // remover(2);
  removerRecursivo(0, listaPontos);

  mostrarLista(listaPontos);

  printf("O tamanho da lista é de %d", length);

  return 0;
}