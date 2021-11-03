#include <stdio.h>

/*
28. Receba o preço atual e a média mensal de um produto. Calcule e mostre o
novo preço sabendo que:
Venda Mensal Preço Atual Preço Novo
< 500 < 30 + 10%
>= 500 e < 1000 >= 30 e < 80 +15%
>= 1000 >= 80 - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
*/

typedef struct {
  float precoAtual;
  float mediaMensal;
} Produto;

void lerEntradas(Produto *produto) {
  printf("Digite o preço atual\n");
  scanf("%f", &produto->precoAtual);

  printf("Digite a média mensal\n");
  scanf("%f", &produto->mediaMensal);
}

float calcularNovoPreco(Produto *produto) {
  float precoNovo;

  if(produto->mediaMensal < 500 && produto->precoAtual < 30) {
    precoNovo = produto->precoAtual + (produto->precoAtual * 0.10);
  } else if ((produto->mediaMensal >= 500 && produto->mediaMensal < 1000) &&
    (produto->precoAtual >= 30 && produto->precoAtual < 80)) {
    precoNovo = produto->precoAtual + (produto->precoAtual * 0.15);
  } else if (produto->mediaMensal >= 1000 && produto->precoAtual >= 80) {
    precoNovo = produto->precoAtual + (produto->precoAtual * 0.05);
  } else {
    precoNovo = produto->precoAtual;
  }

  return precoNovo;
}

int main(void) {
  Produto produto;

  lerEntradas(&produto);

  printf("O novo preco é igual a %.2f", calcularNovoPreco(&produto));

  return 0;
}