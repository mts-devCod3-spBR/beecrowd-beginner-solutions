package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

ENTRADA
A entrada contém um valor inteiro N (2 < N < 1000).

SAÍDA
Imprima a tabuada de N, conforme o exemplo fornecido.

*/

import java.util.Scanner;

public class Bee_1078 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + N + " = " + i * N);
		}
		input.close();
	}
}
