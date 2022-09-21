package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

ENTRADA
A entrada contém um valor inteiro N (N < 10000).

SAÍDA
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.

*/

import java.util.Scanner;

public class Bee_1075 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1; i <= 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
        }
        input.close();
    }
}