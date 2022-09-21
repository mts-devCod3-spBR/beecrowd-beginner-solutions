package Beecrowd_codes_exercises;

/*

QUESTÃO
Números em ponto flutuante podem ser bastante extensos para mostrar. Nesses casos, é conveniente usar a notação científica.
Você deve escrever um programa que, dado um número em ponto flutuante, mostre este número na notação científica: 
sempre mostre o sinal da mantissa; sempre mostre 4 casas decimais na mantissa; use o caractere 'E' para separar a mantissa do expoente; 
sempre mostre o sinal do expoente; e mostre o expoente com pelo menos 2 dígitos.

ENTRADA
A entrada é um número em ponto flutuante de dupla precisão X (de acordo com o padrão IEEE 754-2008). 
Nunca haverá um número com mais de 110 caracteres nem com mais de 6 casas decimais.

SAÍDA
A saída é o número X em uma única linha na notação científica detalhada acima. Veja os exemplos abaixo.

*/

import java.util.Scanner;

public class Bee_1958 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X = input.nextDouble();
        System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));
        input.close();
    }
}
