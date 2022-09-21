package Beecrowd_codes_exercises;

/*

QUESTÃO
Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.

ENTRADA
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

SAÍDA
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.

*/

import java.util.Scanner;

public class Bee_1132 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		int SOMA = 0;
		if (X > Y) {
			for (int i = Y; i <= X; i++) {
				if (i % 13 != 0)
					SOMA += i;
			}
		} else {
			for (int i = X; i <= Y; i++) {
				if (i % 13 != 0)
					SOMA += i;
			}
		}

		System.out.println(SOMA);

		input.close();
	}
}
