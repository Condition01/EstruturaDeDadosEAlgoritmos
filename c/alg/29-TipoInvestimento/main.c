#include <stdio.h>

/*
29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do
investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
*/
typedef struct {
  int tipoInvestimento;
  float valorInvestido;
} Investimento;

void lerEntradas(int *tipoInvestimento, float *valorInvestido) {
  printf("Digite 1 para investir em poupança\nDigite 2 para investir em renda fixa\n");
  scanf("%d", tipoInvestimento);

  printf("Digite o valor que deseja investir\n");
  scanf("%f", valorInvestido);
}

float calcularValorApos30Dias(Investimento *investimento) {
  float valorFinal;
  if(investimento->tipoInvestimento == 1) {
    valorFinal = investimento->valorInvestido + (investimento->valorInvestido * 0.03);
  } else {
    valorFinal = investimento->valorInvestido + (investimento->valorInvestido * 0.05);
  }
  return valorFinal;
}

int main(void) {
  Investimento Investimento;

  lerEntradas(&Investimento.tipoInvestimento, &Investimento.valorInvestido);

  printf("O valor final (corrigido) após 30 dias de investimento é de: %.2f", calcularValorApos30Dias(&Investimento));

  return 0;
}