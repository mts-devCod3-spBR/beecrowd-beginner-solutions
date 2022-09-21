package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
Apresente a média ponderada para cada um destes conjuntos de 3 valores,
sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

ENTRADA
O arquivo de entrada contém um valor inteiro N na primeira linha. 
Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

SAÍDA
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.

*/

import java.util.Scanner;

public class Bee_1079 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            double valor1 = input.nextDouble();
            double valor2 = input.nextDouble();
            double valor3 = input.nextDouble();
            double media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;
            System.out.println(String.format("%.1f", media));
        }
        input.close();
    }
}
