package Beecrowd_codes_exercises;

/*

QUESTÃO
Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma de A + i para cada i com os valores (0 <= i <= N-1). 
Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.

ENTRADA
A entrada contém somente valores inteiros, podendo ser positivos ou negativos. 
Todos os valores estão na mesma linha.

SAÍDA
A saída contém apenas um valor inteiro.

*/

import java.util.Scanner;

public class Bee_1149 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int N = input.nextInt();
        int soma = 0;
        while (N <= 0) {
            N = input.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            soma += A;
            A++;
        }
        System.out.println(soma);

        input.close();
    }
}
