package Beecrowd_codes_exercises;

/*

QUESTÃO
Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, 
passando para a próxima linha a cada X números.

ENTRADA
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

SAÍDA
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo. 
Não deve haver espaço em branco após o último valor da linha.

*/

import java.util.Scanner;

public class Bee_1145 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = 1; i <= y; i++) {
            System.out.print(i);
            if (i % x == 0)
                System.out.println("");
            else
                System.out.print(" ");

        }
        input.close();
    }
}
