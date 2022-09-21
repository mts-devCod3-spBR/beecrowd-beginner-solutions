package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia um valor inteiro, 
que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
e informe-o expresso no formato horas:minutos:segundos.

ENTRADA
O arquivo de entrada contém um valor inteiro N.

SAÍDA
Imprima o tempo lido no arquivo de entrada (segundos), 
convertido para horas:minutos:segundos, conforme exemplo fornecido.

*/

import java.util.Scanner;

public class Bee_1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int horas = N / 3600;
        int minutos = (N % 3600) / 60;
        int segundos = (N % 3600) % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
        input.close();
    }
}
