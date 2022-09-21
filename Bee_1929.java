package Beecrowd_codes_exercises;

/*

QUESTÕES
Ana e suas amigas estão fazendo um trabalho de geometria para o colégio, em que precisam formar vários triângulos, numa cartolina, com algumas varetas de comprimentos diferentes. 
Logo elas perceberam que não dá para formar triângulos com três varetas de comprimentos quaisquer: se uma das varetas for muito grande em relação às outras duas, não dá para formar o triângulo.
Neste problema, você precisa ajudar Ana e suas amigas a determinar se, dados os comprimentos de quatro varetas, é ou não é possível selecionar três varetas, dentre as quatro, 
e formar um triângulo.

ENTRADA
A entrada é composta por apenas uma linha contendo quatro números inteiros A, B, C e D (1 ≤ A, B, C, D ≤ 100).

SAÍDA
Seu programa deve produzir apenas uma linha contendo apenas um caractere, 
que deve ser ‘S’ caso seja possível formar o triângulo, ou ‘N’ caso não seja possível formar o triângulo.

*/

import java.util.Scanner;

public class Bee_1929 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();
		int MAIOR1, MAIOR2, MENOR1, MENOR2;

		if (A > B && A > C && A > D) {
			MAIOR1 = A;
			if (B > C && B > D) {
				MAIOR2 = B;
				MENOR1 = C;
				MENOR2 = D;
			} else if (C > D) {
				MAIOR2 = C;
				MENOR1 = B;
				MENOR2 = D;
			} else {
				MAIOR2 = D;
				MENOR1 = B;
				MENOR2 = C;
			}
		} else if (B > C && B > D) {
			MAIOR1 = B;
			if (A > C && A > D) {
				MAIOR2 = A;
				MENOR1 = C;
				MENOR2 = D;
			} else if (C > D) {
				MAIOR2 = C;
				MENOR1 = A;
				MENOR2 = D;
			} else {
				MAIOR2 = D;
				MENOR1 = C;
				MENOR2 = A;
			}
		} else if (C > D) {
			MAIOR1 = C;
			if (A > B && A > D) {
				MAIOR2 = A;
				MENOR1 = B;
				MENOR2 = D;
			} else if (B > D) {
				MAIOR2 = B;
				MENOR1 = A;
				MENOR2 = D;
			} else {
				MAIOR2 = D;
				MENOR1 = A;
				MENOR2 = B;
			}
		} else {
			MAIOR1 = D;
			if (A > B && A > C) {
				MAIOR2 = A;
				MENOR1 = B;
				MENOR2 = C;
			} else if (B > C) {
				MAIOR2 = B;
				MENOR1 = A;
				MENOR2 = C;
			} else {
				MAIOR2 = C;
				MENOR1 = A;
				MENOR2 = B;
			}
		}

		if ((MENOR1 + MENOR2 > MAIOR1) || (MENOR1 + MENOR2 > MAIOR2) ||
				(MENOR1 + MAIOR2 > MAIOR1) || (MENOR1 + MAIOR2 > MAIOR1) ||
				(MENOR2 + MAIOR2 > MAIOR1) || (MENOR2 + MAIOR2 > MAIOR1)) {
			System.out.println("S");

		} else {
			System.out.println("N");
		}

		input.close();
	}

}
