package Beecrowd_codes_exercises;

/*

QUESTÃO
Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
Calcule e imprima a média semestral. 
Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). C
ada nota deve ser validada separadamente.

ENTRADA
A entrada contém vários valores reais, positivos ou negativos. 
O programa deve ser encerrado quando forem lidas duas notas válidas.

SAÍDA
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. 
O valor deve ser apresentado com duas casas após o ponto decimal.

*/

import java.util.Scanner;

public class Bee_1117 {
    public static void main(String[] args) {

        double notas, media, totalNotas = 0, totalNotasAceitas = 0;
        Scanner input = new Scanner(System.in);

        while (totalNotasAceitas != 2) {
            notas = input.nextFloat();
            if (notas >= 0.0 && notas <= 10.0) {
                totalNotas += notas;
                totalNotasAceitas += 1;
            } else {
                System.out.println("nota invalida");
            }
        }

        media = totalNotas / 2;
        System.out.println(String.format("media = %.2f", media));
        input.close();

    }

}
