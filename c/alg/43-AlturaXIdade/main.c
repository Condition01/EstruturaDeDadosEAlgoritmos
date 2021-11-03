#include <stdio.h>

/*
43. Calcule e mostre quantos anos serão necessários para que Ana seja maior que
Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
e cresce 2 cm ao ano.
*/

typedef struct {
  char *nome;
  float tamanho;
  float crescimento;
} Pessoa;

void acrescentarIdade(Pessoa *p) {
  p->tamanho += p->crescimento/100;
  printf("%s -> %.2f\n", p->nome, p->tamanho);
}

int calcularQtdAnosMaior(Pessoa *menor, Pessoa *maior) {
  int anos = 0;
  while(menor->tamanho < maior->tamanho) {
    acrescentarIdade(menor);
    acrescentarIdade(maior);
    anos++;
  }
  return anos;
}

int calcularQtdAnosMaiorRecursivo(Pessoa *menor, Pessoa *maior) {
  if(menor->tamanho > maior->tamanho) {
    return 0;
  } else {
    acrescentarIdade(menor);
    acrescentarIdade(maior);
    return 1 + calcularQtdAnosMaiorRecursivo(menor, maior);
  }
}

int main(void) {
  Pessoa ana;
  ana.nome = "Ana";
  ana.tamanho = 1.10;
  ana.crescimento = 3;

  Pessoa maria;
  maria.nome = "Maria";
  maria.tamanho = 1.5;
  maria.crescimento = 2;  

  printf("A quantidade de anos que %s levou para ficar maior que %s foi de %d anos",ana.nome, maria.nome, calcularQtdAnosMaiorRecursivo(&ana, &maria));

  return 0;
}