package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

ENTRADA
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. 
Pelo menos um destes números será positivo.

SAÍDA
O primeiro valor de saída é a quantidade de valores positivos. 
A próxima linha deve mostrar a média dos valores positivos digitados.

*/

import java.util.Scanner;

public class Bee_1064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double numero;

        for (int i = 0; i < 6; i++) {
            numero = input.nextDouble();
            if (numero > 0) {
                cont++;
                media += numero;
            }
        }

        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));

        input.close();
    }

}