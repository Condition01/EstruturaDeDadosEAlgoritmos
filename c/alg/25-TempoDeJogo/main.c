#include <stdio.h>

/*
25. Receba a hora de início e de final de um jogo (HH,MM) sabendo que o
tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
*/

int validaHoraMinuto(int *horaInicial, int *minutoInicial, int *horaFinal, int *minutoFinal) {
    if(*horaInicial > 23 || *horaFinal > 23) {
      printf("Um hora inválida foi inserida\n");
    } else if(*minutoInicial > 59 || *minutoFinal > 59) {
      printf("Um minuto inválido foi inserido");
    } else {
      return 1;
    }
    return 0;
}

void inputHoraMinuto(int *horaInicial, int *minutoInicial, int *horaFinal, int *minutoFinal) {
  int valid = 0;

  while(valid != 1) {
    printf("Digite a hora de inicio\n");
    scanf("%d", horaInicial);

    printf("Digite o minuto de inicio\n");
    scanf("%d", minutoInicial);

    printf("Digite a hora de final\n");
    scanf("%d", horaFinal);

    printf("Digite o minuto de final\n");
    scanf("%d", minutoFinal);

    valid = validaHoraMinuto(horaInicial, minutoInicial, horaFinal, minutoFinal);
  }
  
}

void ajustarHoraFinal(int horaInicial, int minutoInicial, int *horaFinal, int *minutoFinal) {
  if(*horaFinal == horaInicial && *minutoFinal == minutoInicial)
    *horaFinal += 24;

  if(*horaFinal < horaInicial) 
    *horaFinal += 24;

  if(*minutoFinal < minutoInicial)
    *minutoFinal += 60; 
}

int main(void) {
  int horaInicial, minutoInicial, horaFinal, minutoFinal;

  inputHoraMinuto(&horaInicial, &minutoInicial, &horaFinal, &minutoFinal);

  ajustarHoraFinal(horaInicial, minutoInicial, &horaFinal, &minutoFinal);

  printf("O jogo durou %d horas e %d minutos", 
    horaFinal - horaInicial, 
    minutoFinal - minutoInicial);

  return 0;
}