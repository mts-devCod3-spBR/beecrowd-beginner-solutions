package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
indicando se os valores lidos são múltiplos entre si.

ENTRADA
A entrada contém valores inteiros.

SAÍDA
A saída deve conter uma das mensagens conforme descrito acima.

*/

import java.util.Scanner;

public class Bee_1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        input.close();
    }
}
