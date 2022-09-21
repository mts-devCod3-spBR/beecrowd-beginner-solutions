package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste de dois inteiros X e Y. 
Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar. 
Por exemplo:
para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13

ENTRADA
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

SAÍDA
Imprima a soma dos consecutivos números ímpares a partir do valor X.

*/

import java.util.Scanner;

public class Bee_1158 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int X, Y;
		int SOMA = 0, COUNT = 0;
		for (int i = 0; i < N; i++) {
			COUNT = 0;
			SOMA = 0;
			X = input.nextInt();
			Y = input.nextInt();
			while (COUNT < Y) {
				if (X % 2 != 0) {
					SOMA += X;
					COUNT++;
				}
				X++;
			}
			System.out.println(SOMA);
		}
		input.close();
	}
}
