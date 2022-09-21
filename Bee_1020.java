package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

ENTRADA
O arquivo de entrada contém um valor inteiro.

SAÍDA
Imprima a saída conforme exemplo fornecido.

*/

import java.util.Scanner;

public class Bee_1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        int qtdAno = valor / 365;
        int qtdMes = (valor % 365) / 30;
        int qtdDias = (valor % 365) % 30;
        System.out.println(qtdAno + " ano (s)");
        System.out.println(qtdMes + " mes (es)");
        System.out.println(qtdDias + " dia (s)");
        input.close();
    }
}
