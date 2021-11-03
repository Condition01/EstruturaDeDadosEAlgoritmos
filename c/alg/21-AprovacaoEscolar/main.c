#include <stdio.h>

/*
21. Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:

a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.
*/

void mostrarResultados(float media) {
  if(media >= 6) {
    printf("APROVADO");
  } else if (media >= 3 && media < 6) {
    printf("EXAME");
  } else {
    printf("RETIDO");
  }
}

int main(void) {
  float notaAtual, notaTotal = 0;

  for(int i = 0; i < 4; i++) {
    printf("Digite a nota numero %d\n", i+1); 
    scanf("%f", &notaAtual);
    notaTotal += notaAtual;
  }
  
  mostrarResultados(notaTotal /= 4);

  return 0;
}