package Beecrowd_codes_exercises;

/*

QUESTÃO
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1013.png

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
Um segundo passo, portanto é necessário para chegar no resultado esperado.

ENTRADA
O arquivo de entrada contém três valores inteiros.

SAÍDA
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

*/

import java.util.Scanner;

public class Bee_1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        if (A > B && A > C) {
            System.out.println(A + " eh o maior");
        } else if (B > C) {
            System.out.println(B + " eh o maior");
        } else {
            System.out.println(C + " eh o maior");
        }

        input.close();
    }
}
