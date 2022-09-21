package Beecrowd_codes_exercises;

/*

QUESTÃO
Bino e Cino são colegas inseparáveis. Bino gosta de criar desafios matemáticos para Cino resolver. 
Desta vez, Bino gerou uma lista de números e perguntou ao Cino quantos números da lista são múltiplos de 2, 3, 4 e 5.
Esse desafio pode parecer simples, porém, quando a lista contém muitos números, Cino se confunde e acaba errando alguns cálculos. 
Para ajudar Cino, faça um programa para resolver o desafio de Bino.

ENTRADA
A primeira linha da entrada consiste em um inteiro N (1 ≤ N ≤1000), representando a quantidade de números na lista de Bino.
A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), representando os números da lista de Bino.

SAÍDA
Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 presentes na lista. 
Observe a formatação da saída nos exemplos, pois ela deve ser seguida rigorosamente.

*/

import java.util.Scanner;

public class Bee_2060 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int numero, qtdMultiplo_2 = 0, qtdMultiplo_3 = 0, qtdMultiplo_4 = 0, qtdMultiplo_5 = 0;
		for (int i = 0; i < N; i++) {
			numero = input.nextInt();
			if (numero % 2 == 0) {
				qtdMultiplo_2++;
			}

			if (numero % 3 == 0) {
				qtdMultiplo_3++;
			}

			if (numero % 4 == 0) {
				qtdMultiplo_4++;
			}

			if (numero % 5 == 0) {
				qtdMultiplo_5++;
			}
		}
				
		System.out.println(qtdMultiplo_2 + " Multiplo(s) de 2");
		System.out.println(qtdMultiplo_3 + " Multiplo(s) de 3");
		System.out.println(qtdMultiplo_4 + " Multiplo(s) de 4");
		System.out.println(qtdMultiplo_5 + " Multiplo(s) de 5");
		input.close();
	}
}