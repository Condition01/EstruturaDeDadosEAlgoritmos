#include <stdio.h>

/*
12. Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 17 anos.
*/

int getIdadeMais17(int anoNasc, int anoAtual) {
  return anoAtual - anoNasc + 17;
}

int main(void) {
  int anoAtual, anoNasc;

  printf("Digite o ano de nascimento\n");
  scanf("%d", &anoNasc);

  printf("Digite o ano atual\n");
  scanf("%d", &anoAtual);

  printf("A idade que você terá daqui 17 anos é: %d", getIdadeMais17(anoNasc, anoAtual));

  return 0;
}