package Beecrowd_codes_exercises;

/*

QUESTÃO
A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS.
Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. 
Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. 
Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos times em uma nova partida, 
caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente. 
Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". 
Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima. 
Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.

*/

import java.util.Scanner;

public class Bee_1131 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int qtdGolsInter;
		int qtdGolsGremio;
		int continuar = 1;
		int qtdGrenais = 0;
		int qtdVitoriasGremio = 0;
		int qtdVitoriasInter = 0;
		int empates = 0;

		while (continuar == 1) {
			qtdGrenais++;
			qtdGolsInter = input.nextInt();
			qtdGolsGremio = input.nextInt();
			if (qtdGolsInter > qtdGolsGremio)
				qtdVitoriasInter++;
			else if (qtdGolsGremio > qtdGolsInter)
				qtdVitoriasGremio++;
			else
				empates++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			continuar = input.nextInt();
			while (continuar != 1 && continuar != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				continuar = input.nextInt();
			}
		}

		System.out.println(qtdGrenais + " grenais");
		System.out.println("Inter:" + qtdVitoriasInter);
		System.out.println("Gremio:" + qtdVitoriasGremio);
		System.out.println("Empates:" + empates);
		if (qtdVitoriasInter > qtdVitoriasGremio)
			System.out.println("Inter venceu mais");
		else if (qtdVitoriasGremio > qtdVitoriasInter)
			System.out.println("Gremio venceu mais");
		else
			System.out.println("Nao houve vencedor");

		input.close();
	}

}
