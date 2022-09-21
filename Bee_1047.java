package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

ENTRADA
Quatro números inteiros representando a hora de início e fim do jogo.

SAÍDA
Mostre a seguinte mensagem: "O JOGO DUROU X HORA(S) E Y MINUTO(S)"

*/

import java.util.Scanner;

public class Bee_1047 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hInicial = input.nextInt();
		int mInicial = input.nextInt();
		int hFinal = input.nextInt();
		int mFinal = input.nextInt();
		int horas = hFinal - hInicial;
		int minutos = mFinal - mInicial;

		if (horas < 0) {
			horas = 24 + (hFinal - hInicial);
		}

		if (minutos < 0) {
			minutos = 60 + (mFinal - mInicial);
			horas--;
		}

		if (hInicial == hFinal && mInicial == mFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else {
			System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
		}

		input.close();
	}

}