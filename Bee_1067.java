package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
um valor por linha, inclusive o X, se for o caso.

ENTRADA
O arquivo de entrada contém 1 valor inteiro qualquer.

SAÍDA
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

*/

import java.util.Scanner;

public class Bee_1067 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
