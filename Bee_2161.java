package Beecrowd_codes_exercises;

/*

QUESTÃO
Uma das formas de calcular a raiz quadrada de um número natural é pelo método das frações periódicas continuadas. 
Esse método usa como denominador uma repetição de frações. Essa repetição pode ser feita uma quantidade específica de vezes.
Por exemplo, ao repetir 2 vezes a fração continuada para calcular a raiz quadrada de 10, temos a fórmula abaixo.

https://resources.beecrowd.com.br/gallery/images/contests/933.png

Sua tarefa é, dado o número N de repetições, calcular o valor aproximado da raiz quadrada de 10.

ENTRADA
A entrada é um número natural N (0 ≤ N ≤ 100), que indica o número de repetições do denominador na fração continuada.

SAÍDA
A saída é o valor aproximado da raiz quadrada com 10 casas decimais.

*/

import java.util.Scanner;

public class Bee_2161 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    	double N = input.nextInt();
        double x = 0.0;
    	for (int i = 0; i < N; i++) {
            x += 6.0;
            x = (1.0 / x);
    	}
        x += 3.0;
    	System.out.println(String.format("%.10f", x));
        input.close();
    }
}
