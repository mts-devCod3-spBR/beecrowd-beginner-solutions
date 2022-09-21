package Beecrowd_codes_exercises;

/*

QUESTÃO
A fórmula de Binet é uma forma de calcular números de Fibonacci.

https://resources.beecrowd.com.br/gallery/images/contests/944.png

Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.

ENTRADA
A entrada é um número natural n (0 < n ≤ 50).

SAÍDA
A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.

*/

import java.util.Scanner;

public class Bee_2164 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    	double N = input.nextInt();
    	double fib = (Math.pow((1 + Math.sqrt(5)) / 2, N) - Math.pow((1 - Math.sqrt(5)) / 2, N)) / Math.sqrt(5);
    	System.out.println(String.format("%.1f", fib));

        input.close();
    }
}
