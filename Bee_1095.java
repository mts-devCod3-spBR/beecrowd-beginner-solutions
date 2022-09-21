package Beecrowd_codes_exercises;

/* 

QUESTÃO
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

ENTRADA
Não há nenhuma entrada neste problema.

SAÍDA
Imprima a sequencia conforme exemplo abaixo

Exemplo de Saída

I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0

*/

public class Bee_1095 {
	public static void main(String[] args) {

		int i = 1, j = 60;

		while (j >= 0) {
			System.out.printf("I=%d J=%d\n", i, j);
			i = i + 3;
			j = j - 5;
		}

	}
}
