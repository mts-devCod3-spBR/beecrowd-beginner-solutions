package Beecrowd_codes_exercises;

/*

 QUESTÃO
 Todo ano bissexto é realizado o exame geral de matemática da Nlogônia. 
 Todos os cidadões da nação são avaliados a fim de se estudar o 
 desenvolvimento lógico e matemático do país ao longo dos anos.
 Após as correções, os cidadões são ordenadados de acordo com suas notas 
 (quanto maior, melhor) e recebem descontos no imposto de renda de acordo 
 com sua qualificação.
 O Escritório Central de Estatística (ECE) é encarregado de processar os 
 dados das notas obtidas no exame. Entretanto este ano, Vasya, um dos 
 responsáveis, está internado no hospital com gripe H1N1 e você foi contratado 
 para realizar o seu trabalho.
 
 Escreva um programa que dado o número de habitantes da Nlogônia e todas as 
 notas obtidas, responda as consultas para retornar a nota do cidadão que 
 ficou em determinada posição.
 
 ENTRADA
 A entrada contém vários casos de teste. A primeira linha de cada caso contém 
 dois inteiros N (1 <= N <= 100), Q (1 <= Q <= 100), o número de habitantes 
 do país e o número de consultas, respectivamente.
 As N linhas seguintes contém, cada uma, a nota ni obtida pelo i-ésimo cidadão 
 (0 <= ni <= 30000).
 As próximas Q linhas contém cada uma uma consulta, a posição pi 
 (1 <= pi <= N) a qual a ECE está interessada em saber a nota.
 A entrada termina com fim-de-arquivo (EOF).
 
 SAÍDA
 Para cada caso de teste, imprima, para cada consulta, uma linha contendo a 
 nota do cidadão que ficou classificado na posição pi.
 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bee_2534 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int n = input.nextInt();
			int q = input.nextInt();
			//int[] ns = new int[n];
			int[] saida = new int[q];
			List<Integer> lista = new ArrayList<Integer>();
			
			for(int i=0 ; i<n ; i++)
				lista.add(input.nextInt());
			
			Collections.sort(lista);
			Collections.reverse(lista);
			
			for(int i=0 ; i<q ; i++)
				saida[i] = input.nextInt();
			
			for(int i=0 ; i<q ; i++)
				System.out.println(lista.get(saida[i]-1));
		}
		input.close();
	}
}