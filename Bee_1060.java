package Beecrowd_codes_exercises;

/*

QUESTÃO
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.

ENTRADA
Seis valores, negativos e/ou positivos.

SAÍDA
Imprima uma mensagem dizendo quantos valores positivos foram lidos.

*/

import java.util.Scanner;

public class Bee_1060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd_positivos = 0;
        for (int i = 0; i < 6; i++) {
            double n = input.nextInt();
            if (n >= 0) {
                qtd_positivos++;
            }
        }

        System.out.println(qtd_positivos + " valores positivos.");
        input.close();
    }
}
