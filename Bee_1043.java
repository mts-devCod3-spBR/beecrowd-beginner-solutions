package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
Area = XX.X

ENTRADA
A entrada contém três valores reais.

SAÍDA
O resultado deve ser apresentado com uma casa decimal.

*/

import java.util.Scanner;
import static java.lang.Math.abs;

public class Bee_1043 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double A, B, C;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		if (((abs(B - C) < A) & (A < B + C)) & ((abs(A - C) < B) & (B < A + C)) & ((abs(A - B) < C) & (C < A + B))) {
			System.out.println("Perimetro = " + (A + B + C));
		} else {
			System.out.println("Area = " + (((A + B) * C) / 2));
		}

		input.close();
	}
}