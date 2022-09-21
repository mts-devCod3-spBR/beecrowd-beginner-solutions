package Beecrowd_codes_exercises;

/*

QUESTÃO
Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe. A cada jogo, seu auxiliar anota quantas tentativas de saques, 
bloqueios e ataques cada um de seus jogadores fez, bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos). 
Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todo tiveram sucesso.

ENTRADA
A entrada é dada pelo número de jogadores N (1 ≤ N ≤ 100), seguido pelo nome de cada um dos jogadores. Abaixo do nome de cada jogador, 
seguem duas linhas com três inteiros cada. Na primeira linha S, B e A (0 ≤ S,B,A ≤ 10000) representam a quantidade de tentativas de saques, 
bloqueios e ataques e na segunda linha, S1, B1 e A1 (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) com o número de saques, 
bloqueios e ataques deste jogador que tiveram sucesso.

SAÍDA
A saída deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.

*/

import java.util.Scanner;

public class Bee_2310{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int QTD_JOGADORES = input.nextInt();
		//String NOME_JOGADOR = ""; ~ Variável não utilizada.
		double PERC_S = 0.0, PERC_A = 0.0, PERC_B = 0.0;
		double S = 0, B = 0, A = 0;
		double S1 = 0, S2 = 0, S3 = 0;

		for (int i = 0 ; i < QTD_JOGADORES ; i++){
			//NOME_JOGADOR = input.next(); ~ Variável não utilizada.
			S += input.nextDouble();
			B += input.nextDouble();
			A += input.nextDouble();
			S1 += input.nextDouble();
			S2 += input.nextDouble();
			S3 += input.nextDouble();
		}

		PERC_S = S1 * 100.00 / S;
		PERC_B = S2 * 100.00 / B;
		PERC_A = S3 * 100.00 / A;

		System.out.println(String.format("Pontos de Saque: %.2f %%.", PERC_S));
        System.out.println(String.format("Pontos de Bloqueio: %.2f %%.", PERC_B));
        System.out.println(String.format("Pontos de Ataque: %.2f %%.", PERC_A));
        input.close();
    }
}