package Beecrowd_codes_exercises;

/*

QUESTÃO
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

ENTRADA
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

SAÍDA
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
 sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 
 O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

*/

import java.util.Scanner;

public class Bee_1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double area_triangulo = (A * C) / 2.0;
        double area_circulo = (3.14159 * Math.pow(C, 2));
        double area_trapezio = ((A + B) * C) / 2.0;
        double area_quadrado = B * B;
        double area_retangulo = A * B;

        System.out.println(String.format("TRIANGULO: %.3f", area_triangulo));
        System.out.println(String.format("CIRCULO: %.3f", area_circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", area_trapezio));
        System.out.println(String.format("QUADRADO: %.3f", area_quadrado));
        System.out.println(String.format("RETANGULO: %.3f", area_retangulo));
        input.close();
    }
}