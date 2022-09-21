package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, 
quantos valores digitados foram ímpares,
 quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha,
não esquecendo o final de linha após cada uma.

*/

import java.util.Scanner;

public class Bee_1066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd_positivos = 0;
        int qtd_negativos = 0;
        int qtd_pares = 0;
        int qtd_impar = 0;
        for (int i = 0; i < 5; i++) {
            double n = input.nextInt();
            if (n > 0) {
                qtd_positivos++;
            }

            if (n < 0) {
                qtd_negativos++;
            }

            if (n % 2 == 0) {
                qtd_pares++;
            }

            if (n % 2 != 0) {
                qtd_impar++;
            }

        }
        System.out.println(qtd_pares + " valor(es) par(es)");
        System.out.println(qtd_impar + " valor(es) impar(es)");
        System.out.println(qtd_positivos + " valor(es) positivo(s)");
        System.out.println(qtd_negativos + " valor(es) negativo(s)");
        input.close();
    }
}
