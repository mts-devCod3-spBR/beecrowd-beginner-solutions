package Beecrowd_codes_exercises;

/*

QUESTÃO
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
 A seguir, calcule e mostre o valor da conta a pagar.

https://resources.beecrowd.com.br/gallery/images/problems/UOJ_1038_pt.png

ENTRADA
O arquivo de entrada contém dois valores inteiros correspondentes ao código e 
à quantidade de um item conforme tabela acima.

SAÍDA
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

*/

import java.util.Scanner;

public class Bee_1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo_item = input.nextInt();
        int qtd_item = input.nextInt();
        double preco_total;
        switch (codigo_item) {
            case 1:
                preco_total = 4 * qtd_item;
                System.out.println(String.format("Total: R$ %.2f", preco_total));
                break;
            case 2:
                preco_total = 4.50 * qtd_item;
                System.out.println(String.format("Total: R$ %.2f", preco_total));
                break;
            case 3:
                preco_total = 5 * qtd_item;
                System.out.println(String.format("Total: R$ %.2f", preco_total));
                break;
            case 4:
                preco_total = 2 * qtd_item;
                System.out.println(String.format("Total: R$ %.2f", preco_total));
                break;
            case 5:
                preco_total = 1.50 * qtd_item;
                System.out.println(String.format("Total: R$ %.2f", preco_total));
                break;
        }
        input.close();
    }
}
