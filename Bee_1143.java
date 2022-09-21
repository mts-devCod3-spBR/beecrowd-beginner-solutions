package Beecrowd_codes_exercises;

/*

QUESTÃO
Escreva um programa que leia um valor inteiro N (1 < N < 1000).
Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

ENTRADA
O arquivo de entrada contém um número inteiro positivo N.

SAÍDA
Imprima a saída conforme o exemplo fornecido.

*/

import java.util.Scanner;

public class Bee_1143 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }

        input.close();
    }
}