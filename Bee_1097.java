package Beecrowd_codes_exercises;

/*

QUESTÃO
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

ENTRADA
Não há nenhuma entrada neste problema.

SAÍDA
Imprima a sequencia conforme exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=9
I=3 J=8
I=3 J=7
...
I=9 J=15
I=9 J=14
I=9 J=13

*/

public class Bee_1097 {
	public static void main(String[] args) {
		int i = 1, j = 7;
		while (i <= 9) {
			for (int k = 0; k < 3; k++) {
				System.out.println("I=" + i + " J=" + j);
				j--;
			}
			j += 5;
			i += 2;
		}
	}
}
