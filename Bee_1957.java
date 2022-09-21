package Beecrowd_codes_exercises;

/*

QUESTÃO
Os dados armazenados no computador estão em binário. Uma forma econômica de ver estes números é usar a base 16 (hexadecimal).
Sua tarefa consiste em escrever um programa que, dado um número natural na base 10, mostre sua representação em hexadecimal.

ENTRADA
A entrada é um número inteiro positivo V na base 10 (1 ≤ V ≤ 2 x 109).

SAÍDA
A saída é o mesmo número V na base 16 em uma única linha (não esqueça do caractere de fim-de-linha). Use letras maiúsculas, conforme os exemplos.

*/

import java.util.Scanner;

public class Bee_1957 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int V = input.nextInt();
        String convHexadecimal = Integer.toHexString(V).toUpperCase();
        System.out.println(convHexadecimal);
        input.close();
    }
}
