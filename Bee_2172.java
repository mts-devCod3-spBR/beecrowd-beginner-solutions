package Beecrowd_codes_exercises;

/*

QUESTÃO
Prog e Cackto começaram recentemente a jogar um jogo de RPG chamado Fortaleza. 
Neste, para o jogador evoluir de nível o mesmo precisa derrotar monstros, nos quais dá um valor de experiência (XP) para o jogador.
A produtora do jogo, Jogos Extremos, anunciou que na próxima semana irá realizar o primeiro evento XP 
no qual aumentará a experiência dos monstros em X vezes. Como Prog e Cackto estão em um nível muito alto no qual 
os monstros tem um valor muito alto de pontos de experiência, eles estão tendo dificuldades de calcular 
a quantidade de pontos de experiência que os monstros terão durante o evento. Você pode ajudá-los?

ENTRADA
Haverá diversos casos de teste. Cada caso de teste contém dois valores X (0 < X ≤ 3) 
indicando o valor de aumento da EXP dos monstros e M (10 ≤ M ≤ 232-1) indicando o valor de EXP do monstro. 
A entrada termina com os valores X == 0 e M == 0, nos quais não devem ser processados.

SAÍDA
Para cada caso, seu programa deverá mostrar um valor E, referente ao novo EXP do monstro.

*/

import java.util.Scanner;

public class Bee_2172 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    	int X = input.nextInt();
    	double M = input.nextDouble();
    	double XP;
    	while(M != 0 && X != 0) {
    		XP = X * M;
    		System.out.println(String.format("%.0f", XP));
    		X = input.nextInt();
    		M = input.nextDouble();
    	}

        input.close();
    }
}
