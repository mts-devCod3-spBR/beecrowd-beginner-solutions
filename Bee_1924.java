package Beecrowd_codes_exercises;

/*

QUESTÕES
Está para nascer alguém mais indeciso do que Vitória. Apesar dela saber que é uma ótima programadora, 
daquelas que possui projetos na área de TI publicados e diversos outros em andamento, ela não tem certeza se vai seguir na área. 
Há noites que ela diz que não quer Computação, há dias que ela diz que quer alguma Engenharia, em outros ela quer qualquer outro curso, 
já chegou até a pensar em algum de Humanas, que pecado!

Mas você está aqui pra ajudá-la. A sua tarefa é bem simples, será dado uma lista com diversos nomes de cursos de graduação e 
você terá que imprimir o nome do curso que Vitória deve fazer.

ENTRADA
A primeira linha de entrada contém um inteiro 1 ≤ n ≤ 2000, que representa a quantidade de cursos a serem considerados. 
Cada uma das próximas n linhas irá conter uma cadeia de caracteres S, 1 ≤ |S| ≤ 100, representando o nome do curso.

SAÍDA
Imprima o nome do curso que Vitória deve fazer, sem acentuação.

*/

import java.util.Scanner;

public class Bee_1924 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for (int i = 0; i < N; i++) {
			//String curso = input.next(); ~ Variável não utilizada.
		}

		System.out.println("Ciencia da Computacao");

		input.close();
	}

}
