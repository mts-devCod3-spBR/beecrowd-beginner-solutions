package Beecrowd_codes_exercises;

/*

QUESTÃO
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

ENTRADA
Não há nenhuma entrada neste problema.

SAÍDA
Imprima a sequencia conforme exemplo abaixo

Exemplo de Saída

I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=7
I=3 J=6
I=3 J=5
...
I=9 J=7
I=9 J=6
I=9 J=5

*/

public class Bee_1096 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			for (int j = 7; j > 4; j--) {
				System.out.println("I=" + i + " J=" + j);
			}
			i += 2;
		}
	}
}
