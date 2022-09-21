/* 

package Beecrowd_codes_exercises;



QUESTÃO
Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). 
Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

ENTRADA
O arquivo de entrada contém um número não determinado de valores M e N. 
A última linha de entrada vai conter um número nulo ou negativo.

SAÍDA
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.



import java.util.Scanner;

public class Bee_1101 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X, Y;

		while (((X = input.nextInt()) > 0) && ((Y = input.nextInt()) > 0)) {
			int sum = 0;
			if (X > Y) {
				for (Y = Y; Y <= X; Y++) {
					sum += Y;
					System.out.print(Y + " ");
				}
				System.out.print("Sum=" + sum + "\n");
			} else {
				for (X = X; X <= Y; X++) {
					sum += X;
					System.out.print(X + " ");
				}
				System.out.print("Sum=" + sum + "\n");
			}
		}

		input.close();
	}
}

*/