package Beecrowd_codes_exercises;

/*

QUESTÃO
Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais e todos os lados tem o mesmo comprimento. 
Um polígono simples é aquele cujos segmentos de reta não se interceptam. 
Abaixo pode-se ver vários mosaicos feitos por polígonos regulares.

https://www.urionlinejudge.com.br/gallery/images/contests/C_1.jpg

Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular, mostre seu perímetro.

ENTRADA
A entrada tem dois inteiros positivos: N e L, que são, respectivamente, 
o número de lados e o comprimento de cada lado de um polígono regular (3 ≤ N ≤ 1000000 and 1 ≤ L ≤ 4000).

SAÍDA
A saída é o perímetro P do polígono regular em uma única linha.

*/

import java.util.Scanner;

public class Bee_1959 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();
        long L = input.nextLong();
        long P = N * L;
        System.out.println(P);
        input.close();
    }
}
