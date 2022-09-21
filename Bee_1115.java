package Beecrowd_codes_exercises;

/*

QUESTÃO
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
Para cada ponto escrever o quadrante a que ele pertence. 
O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

ENTRADA
A entrada contém vários casos de teste. 
Cada caso de teste contém 2 valores inteiros.

SAÍDA
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.

*/

import java.util.Scanner;

public class Bee_1115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();
        while (X != 0 && Y != 0) {
            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else if (X > 0 && Y < 0) {
                System.out.println("quarto");
            }

            X = input.nextInt();
            Y = input.nextInt();
        }
        input.close();
    }
}
