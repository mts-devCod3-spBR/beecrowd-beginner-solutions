package Beecrowd_codes_exercises;

/*

QUESTÃO
O microblog Twitter é conhecido por limitar as postagens em 140 caracteres. Conferir se um texto vai caber em um tuíte é sua tarefa.

ENTRADA
A entrada é uma linha de texto T (1 ≤ |T| ≤ 500).

SAÍDA
A saída é dada em uma única linha. Ela deve ser "TWEET" (sem as aspas) se a linha de texto T tem até 140 caracteres. 
Se T tem mais de 140 caracteres, a saída deve ser "MUTE".

*/

import java.util.Scanner;

public class Bee_2165 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String T = input.nextLine();
        System.out.println(T.length() > 140 ? "MUTE" : "TWEET");
        input.close();
    }
}
