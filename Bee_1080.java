package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

ENTRADA
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

SAÍDA
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

*/

import java.util.Scanner;

public class Bee_1080 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maior = 0;
		int posMaior = 1;
		int N;
		for (int i = 1; i <= 100; i++) {
			N = input.nextInt();
			if (i == 1) {
				maior = N;
				posMaior = 1;
			} else if (N > maior) {
				maior = N;
				posMaior = i;
			}
		}
		System.out.println(maior);
		System.out.println(posMaior);
		input.close();
	}
}