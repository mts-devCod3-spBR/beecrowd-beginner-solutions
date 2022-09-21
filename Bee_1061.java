package Beecrowd_codes_exercises;

/*

QUESTÃO
Pedrinho está organizando um evento em sua Universidade. 
O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. 
O problema é que Pedrinho quer calcular o tempo que o evento vai durar, 
uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, 
você deverá ajudar Pedrinho a calcular a duração deste evento.

ENTRADA
Como entrada, na primeira linha vai haver a descrição “Dia”, 
seguido de um espaço e o dia do mês no qual o evento vai começar. 
Na linha seguinte, será informado o momento no qual o evento vai iniciar,
 no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, 
 indicando o término do evento.

SAÍDA
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.

*/

import java.util.Scanner;

public class Bee_1061 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int w1, x1, y1, z1;
		int w2, x2, y2, z2;
		// String dia; - Váriavel não utilizada.

		// dia = input.next(); - Váriavel não utilizada.
		w1 = input.nextInt();
		x1 = input.nextInt();
		input.next();
		y1 = input.nextInt();
		input.next();
		z1 = input.nextInt();

		// dia = input.next(); - Váriavel não utilizada.
		w2 = input.nextInt();
		x2 = input.nextInt();
		input.next();
		y2 = input.nextInt();
		input.next();
		z2 = input.nextInt();

		int inicio = (w1 * 24 * 60 * 60) + (x1 * 60 * 60) + (y1 * 60) + z1;
		int fim = (w2 * 24 * 60 * 60) + (x2 * 60 * 60) + (y2 * 60) + z2;

		int segundosTotal = fim - inicio;

		int dias = segundosTotal / (24 * 60 * 60);
		int resto = segundosTotal % (24 * 60 * 60);
		System.out.println(dias + " dia(s)");

		int horas = resto / (60 * 60);
		resto = resto % (60 * 60);
		System.out.println(horas + " hora(s)");

		int minutos = resto / 60;
		resto = resto % 60;
		System.out.println(minutos + " minuto(s)");

		int segundos = resto;
		System.out.println(segundos + " segundo(s)");

		input.close();
	}
}
