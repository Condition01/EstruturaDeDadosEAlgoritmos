#include <stdio.h>

/*
30. Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a
idade em anos, meses e dias, considerando os anos bissextos.
*/

typedef struct {
  int size;
  int dias[12];
} Meses;

typedef struct {
  int ano;
  int mes;
  int dia;
} Tempo;

void inicializarMeses(Meses *mesesAno) {
  mesesAno->dias[0] = 31;
  mesesAno->dias[1] = 28;
  mesesAno->dias[2] = 31;
  mesesAno->dias[3] = 30;
  mesesAno->dias[4] = 31;
  mesesAno->dias[5] = 30;
  mesesAno->dias[6] = 31;
  mesesAno->dias[7] = 31;
  mesesAno->dias[8] = 30;
  mesesAno->dias[9] = 31;
  mesesAno->dias[10] = 30;
  mesesAno->dias[11] = 31;
  
  mesesAno->size = 12;
}

void lerEntrada(Tempo *tempo, char *tipoData) {
  printf("Digite o ano %s\n", tipoData);
  scanf("%d", &tempo->ano);

  printf("Digite o mes %s\n", tipoData);
  scanf("%d", &tempo->mes);

  printf("Digite o dia %s\n", tipoData);
  scanf("%d", &tempo->dia);
}

int validaDias(int mes, int dia, int diaValido, Meses *mesesAno) {
  // ele sempre olha pro 'mês' da frente, pois os dias são acrecimos a este.

  if(diaValido == 1) {
    if(mes == 12) 
      mes = 0;
    int qtdDias = mesesAno->dias[mes];
    if(dia < qtdDias) 
      return 1;
  }
  return 0;
}

int logarErroEFinalizar(char *msg) {
  printf("%s", msg);
  return 0;
}

int pegarDiasBixestos(anoInicial, anoAtual, mesAtual, diaAtual) {
  int qtdDiasBixestos = 0;
  
  if(mesAtual < 2 || (mesAtual == 2 && diaAtual < 29))
    anoAtual--;

  for(int i=anoInicial; i <= anoAtual; i++) {
    if(i % 4 == 0) 
      qtdDiasBixestos++;
  }

  return qtdDiasBixestos;
}

void calcularEMostrarTempoDeVida(Tempo *nascimento, Tempo *atual, Meses *mesesAno) {
  int anos, meses, dias;

  anos = atual->ano - nascimento->ano;
  meses = atual->mes - nascimento->mes;
  dias = atual->dia - nascimento->dia;
  
  if(atual->mes < nascimento->mes) {
    meses += 12;
    anos--;
  }

  if(atual->dia < nascimento->dia) {
    int mesIndice = atual->mes - 2;
    
    if(mesIndice < 0)
      mesIndice = 11;
    
    printf("Mês %d -> Dias: %d\n",mesIndice+1, mesesAno->dias[mesIndice]);

    dias += mesesAno->dias[mesIndice];

    //lógica do bixesto (1 representa segundo mês do array)
    if(mesIndice == 1 && (atual->ano % 400 == 0 || (atual->ano % 4 == 0 && atual->ano % 100 != 0))) {
      dias++;    
    }

    if(meses == 0){
      meses = 11;
      anos--;
    } else {
      meses--;
    }
    
  }

  printf("Você tem %d anos %d meses e %d dias de vida", anos, meses, dias);

}

int main(void) {
  Tempo nascimento, atual;
  Meses meses;

  lerEntrada(&nascimento, "de nascimento");
  lerEntrada(&atual, "atual");
  inicializarMeses(&meses);

  if (nascimento.ano > atual.ano) 
    return logarErroEFinalizar("ERRO, ano de nascimento inválido");

  if (nascimento.ano == atual.ano)  {
    if(nascimento.mes > atual.mes)
      return logarErroEFinalizar("ERRO, mês de nascimento inválido");
    if(nascimento.mes == atual.mes && nascimento.dia > atual.dia)
      return logarErroEFinalizar("ERRO, dia de nascimento inválido");
  }

  if(nascimento.mes > 12 || atual.mes > 12) {
    return logarErroEFinalizar("ERRO, mês de nascimento inválido");
  }

  int diaValido = 1;
  diaValido = validaDias(nascimento.mes, nascimento.dia, diaValido, &meses);
  diaValido = validaDias(atual.mes, atual.dia, diaValido, &meses);

  if(diaValido == 0) 
    return logarErroEFinalizar("ERRO, Quantidade de dias inconsistêntes inseridas");

  calcularEMostrarTempoDeVida(&nascimento, &atual, &meses);

  return 0;
}

