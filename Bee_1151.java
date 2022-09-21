package Beecrowd_codes_exercises;

/* 

QUESTÃO
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. 
Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. 
Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

ENTRADA
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

SAÍDA
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. 
Não deve haver espaço após o último valor.

*/

import java.util.Scanner;

public class Bee_1151 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sucessor, antecessor = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
            if (i == N) {
                System.out.println(antecessor);
            } else {
                System.out.print(antecessor + " ");
            }

            sucessor = antecessor + atual;
            antecessor = atual;
            atual = sucessor;
        }

        input.close();
    }

}
