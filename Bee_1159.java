package Beecrowd_codes_exercises;

/*

QUESTÃO
O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X for igual a 0). 
Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par. 
Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, 
por exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.

ENTRADA
O arquivo de entrada contém muitos valores inteiros. O último valor do arquivo é zero.

SAÍDA
Imprima a saida conforme a explicação acima e o exemplo abaixo.

*/

import java.util.Scanner;

public class Bee_1159 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		while (X != 0) {
			int sum = 0;
			for (int i = X, k = 1; k <= 5; i++) {
				if (i % 2 == 0) {
					sum += i;
					k += 1;
				}
			}
			System.out.print(sum + "\n");
			X = input.nextInt();
		}
		input.close();
	}
}
