package Beecrowd_codes_exercises;

/*

QUESTÃO
Você fica tão feliz no natal que tem vontade de gritar para todo mundo: "Feliz natal!!". 
Pra colocar toda essa felicidade pra fora, você montou um programa que, colocado um índice I de felicidade, 
seu grito de natal é mais animado.

ENTRADA
A entrada é composta por um inteiro I (1 < I ≤ 104) que representa o índice de felicidade.

SAÍDA
A saída é composta pela frase "Feliz natal!", sendo repetidas I vezes a última letra a da frase. 
Uma quebra de linha é necessária após a impressão da frase.

*/

import java.util.Scanner;

public class Bee_2483 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String qtdA = "";
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            qtdA += "a";
        }

        System.out.println("Feliz nat" + qtdA + "l!");
        input.close();
    }
}