package Beecrowd_codes_exercises;

/*

QUESTÃO
A ECI (Editio Chronica Incredibilis ou Editora de Crônicas Incríveis) é muito tradicional quando se trata de numerar as páginas de seus livros. 
Ela sempre usa a numeração romana para isso. 
E seus livros nunca ultrapassam as 999 páginas pois, quando necessário, dividem o livro em volumes.
Você deve escrever um programa que, dado um número arábico, mostra seu equivalente na numeração romana.
Lembre que I representa 1, V é 5, X é 10, L é 50, C é 100, D é 500 e M representa 1000.
Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular, mostre seu perímetro.

ENTRADA
A entrada é um número inteiro positivo N (0 < N < 1000).

SAÍDA
A saída é o número N escrito na numeração romana em uma única linha. Use sempre letras maiúsculas.

*/

import java.util.Scanner;

public class Bee_1960 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valoresNumericos = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] valoresRomanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int N = input.nextInt();
        int i = 0;
        while (N > 0) {
            if (N >= valoresNumericos[i]) {
                System.out.print(valoresRomanos[i]);
                N -= valoresNumericos[i];
            } else {
                i++;
            }
        }

        System.out.print("\n");
        input.close();
    }
}
