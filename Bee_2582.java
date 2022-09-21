package Beecrowd_codes_exercises;

/*

QUESTÕES
System of a Download é uma famosa banda de Hacker Metal! Certa vez, eles criaram um dispositivo, com seis botões, numerados de 0 a 5, 
e colocaram nesse dispositivo os seus 11 maiores sucessos. Para tocar uma destas músicas, é preciso pressionar dois botões. Com isso, 
os números destes dois botões são somados, e então toca-se a música correspondente ao número da soma, conforme a relação abaixo:

0 - PROXYCITY
1 - P.Y.N.G.
2 - DNSUEY!
3 - SERVERS
4 - HOST!
5 - CRIPTONIZE
6 - OFFLINE DAY
7 - SALT
8 - ANSWER!
9 - RAR?
10 - WIFI ANTENNAS


Por exemplo, se os botões pressionados forem 3 e 4, irá tocar a música 7 - SALT
Escreva um programa que, dados os dois botões que forem pressionados, determine qual música irá tocar.

ENTRADA
Um número inteiro C será informado, que será a quantidade de casos de teste. Cada caso tem dois valores inteiros, X e Y, 
representando quais botões foram pressionados.

SAÍDA
Para cada caso de teste, imprima o nome da música correspondente.

*/

import java.util.Scanner;

public class Bee_2582 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int C = input.nextInt();
            for (int i = 0; i < C; i++) {
                int X = input.nextInt();
                int Y = input.nextInt();
                int SOMA = X + Y;
                if (SOMA == 0)
                    System.out.println("PROXYCITY");
                else if (SOMA == 1)
                    System.out.println("P.Y.N.G.");
                else if ( SOMA== 2)
                    System.out.println("DNSUEY!");
                else if (SOMA == 3)
                    System.out.println("SERVERS");
                else if (SOMA == 4)
                    System.out.println("HOST!");
                else if (SOMA == 5)
                    System.out.println("CRIPTONIZE");
                else if (SOMA == 6)
                    System.out.println("OFFLINE DAY");
                else if (SOMA == 7)
                    System.out.println("SALT");
                else if (SOMA == 8)
                    System.out.println("ANSWER!");
                else if (SOMA == 9)
                    System.out.println("RAR?");
                else if (SOMA == 10)
                    System.out.println("WIFI ANTENNAS");
            }
        }

        input.close();
    }
}