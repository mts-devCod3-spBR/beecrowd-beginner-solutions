package Beecrowd_codes_exercises;

/*

QUESTÃO
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 
A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), 
assumem que o resultado da divisão entre dois inteiros é outro inteiro.

ENTRADA
O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.

SAÍDA
A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo,
 com um espaço antes e um espaço depois da igualdade. O valor deverá ser apresentado com 3 casas após o ponto.

*/

import java.util.Scanner;

public class Bee_1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int cod1 = input.nextInt(); ~ Váriavel não utilizada.
        int qtd1 = input.nextInt();
        double valor1 = input.nextDouble();

        // int cod2 = input.nextInt(); ~ Váriavel não utilizada.
        int qtd2 = input.nextInt();
        double valor2 = input.nextDouble();

        double total = (qtd1 * valor1) + (qtd2 * valor2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
        input.close();
    }
}
