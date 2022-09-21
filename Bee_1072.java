package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

ENTRADA
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 
SAÍDA
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.

*/

import java.util.Scanner;

public class Bee_1072 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int cont_in = 0;
		int cont_out = 0;
		for (int i = 0; i < N; i++) {
			int numero = input.nextInt();
			if (numero >= 10 && numero <= 20) {
				cont_in++;
			} else {
				cont_out++;
			}
		}

		System.out.println(cont_in + " in");
		System.out.println(cont_out + " out");

		input.close();
	}
}
