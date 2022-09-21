package Beecrowd_codes_exercises;

/*

QUESTÃO
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório
 o qual ela é responsável. Ela quer saber no final do ano, 
 quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, 
o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

ENTRADA
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) 
que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), 
indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

SAÍDA
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação
 ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.

*/

import java.util.Scanner;

public class Bee_1094 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int totalC = 0;
		int totalR = 0;
		int totalS = 0;
		for (int i = 0; i < N; i++) {
			int Quantia = input.nextInt();
			char Tipo = input.next().charAt(0);
			switch (Tipo) {
				case 'C':
					totalC += Quantia;
					break;
				case 'R':
					totalR += Quantia;
					break;
				case 'S':
					totalS += Quantia;
					break;
			}
		}

		int total = totalC + totalR + totalS;
		double mediaCoelhos = (totalC * 100) / (double) total;
		double mediaRatos = (totalR * 100) / (double) total;
		double mediaSapos = (totalS * 100) / (double) total;
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + totalC);
		System.out.println("Total de ratos: " + totalR);
		System.out.println("Total de sapos: " + totalS);
		System.out.println(String.format("Percentual de coelhos: %.2f", mediaCoelhos) + " %");
		System.out.println(String.format("Percentual de ratos: %.2f", mediaRatos) + " %");
		System.out.println(String.format("Percentual de sapos: %.2f", mediaSapos) + " %");

		input.close();
	}
}
