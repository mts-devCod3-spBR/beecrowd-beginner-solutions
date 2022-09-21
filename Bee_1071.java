package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia 2 valores inteiros X e Y. 
A seguir, calcule e mostre a soma dos números impares entre eles.

ENTRADA
O arquivo de entrada contém dois valores inteiros.

SAÍDA
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores 
ímpares que estão entre os valores fornecidos na entrada 
que deverá caber em um inteiro.

*/

import java.util.Scanner;

public class Bee_1071 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		int SOMA = 0;
		if (X < Y) {
			for (int i = X + 1; i < Y; i++) {
				if (i % 2 != 0) {
					SOMA += i;
				}
			}
		} else {
			for (int i = Y + 1; i < X; i++) {
				if (i % 2 != 0) {
					SOMA += i;
				}
			}
		}

		System.out.println(SOMA);
		input.close();
	}
}
