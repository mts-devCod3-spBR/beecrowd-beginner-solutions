package Beecrowd_codes_exercises;

/*

QUESTÃO
Preencher formulários é uma tarefa simples. Mas é preciso conferir se o espaço reservado para os dados é suficiente.
Sua tarefa é, dada uma linha de texto, indicar se ele cabe ou não cabe em um formulário com 80 caracteres.

ENTRADA
A entrada é uma linha de texto L (1 ≤ |L| ≤ 500).

SAÍDA
A saída é dada em uma única linha. Ela deve ser "YES" (sem as aspas) se a linha de texto L tem até 80 caracteres. 
Se L tem mais de 80 caracteres, a saída deve ser "NO".

*/

import java.util.Scanner;

public class Bee_2160 {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	String nome = input.nextLine();
    	System.out.println(nome.length() > 80 ? "NO" : "YES");
        input.close();
    }
	
}
