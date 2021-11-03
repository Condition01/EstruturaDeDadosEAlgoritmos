#include <stdio.h>

/*
16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
de desconto e o número de descendentes. Calcule o salário que serão as
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
Líquido. Exiba o salário a receber.
*/


float getSalBruto(float horasTrab, float valorHora) {
  return horasTrab * valorHora;
}

float getSalLiquido(float salBruto, float desconto, int numeroDescendentes) {
  float salLiq;
  salLiq = salBruto - (salBruto * desconto/100);
  salLiq += numeroDescendentes * 100;
  return salLiq;
}

int main(void) {
  float horasTrab, valorHora, percentualDesconto;
  int numeroDescendentes;

  printf("Digite a quantidade de horas trabalhadas\n");
  scanf("%f", &horasTrab);

  printf("Digite o seu valor hora\n");
  scanf("%f", &valorHora);

  printf("Digite o percentual de desconto\n");
  scanf("%f", &percentualDesconto);

  printf("Digite o numero de descendentes\n");
  scanf("%d", &numeroDescendentes);

  printf("O salario bruto total é de: %.2f\n", getSalBruto(horasTrab, valorHora));

  printf("O salario liquido total é de: %.2f\n", getSalLiquido(getSalBruto(horasTrab, valorHora), percentualDesconto, numeroDescendentes));

  return 0;
}