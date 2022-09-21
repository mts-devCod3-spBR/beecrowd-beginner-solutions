package Beecrowd_codes_exercises;

/*

QUESTÃO
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
o valor que recebe por hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

ENTRADA
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, 
representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

SAÍDA
Imprima o número e o salário do funcionário, conforme exemplo fornecido, 
com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.

*/

import java.util.Scanner;

public class Bee_1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NUMERO_FUNC = input.nextInt();
        int HORAS_FUNC = input.nextInt();
        double VALOR_HORA = input.nextDouble();
        double SALARIO = HORAS_FUNC * VALOR_HORA;
        System.out.println("NUMBER = " + NUMERO_FUNC);
        System.out.println(String.format("SALARY = U$ %.2f", SALARIO));
        input.close();
    }
}