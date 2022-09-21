package Beecrowd_codes_exercises;

/*

QUESTÃO
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

ENTRADA
O arquivo de entrada contém 5 valores inteiros quaisquer.

SAÍDA
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
*/

import java.util.Scanner;

public class Bee_1065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd_par = 0;
        for (int i = 0; i < 5; i++) {
            int N = input.nextInt();
            if (N % 2 == 0) {
                qtd_par++;
            }
        }

        System.out.println(qtd_par + " valores pares");
        input.close();
    }
}
