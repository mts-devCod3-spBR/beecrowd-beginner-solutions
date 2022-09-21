package Beecrowd_codes_exercises;

/*

QUESTÃO
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Salário	Percentual de Reajuste
0 - 400.00 - 15%
400.01 - 800.00 - 12%
800.01 - 1200.00 - 10%
1200.01 - 2000.00 - 7%
Acima de 2000.00 - 4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

ENTRADA
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

SAÍDA
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.

*/

import java.util.Scanner;

public class Bee_1048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario = input.nextDouble();
        double novo_salario;
        int perc;
        if (salario >= 0 && salario <= 400) {
            perc = 15;
            novo_salario = salario + ((salario * perc) / 100);
            System.out.println(String.format("Novo salario: %.2f", novo_salario));
            System.out.println(String.format("Reajuste ganho: %.2f", novo_salario - salario));
            System.out.println("Em percentual: " + perc + " %");
        } else if (salario > 400 && salario <= 800) {
            perc = 12;
            novo_salario = salario + ((salario * perc) / 100);
            System.out.println(String.format("Novo salario: %.2f", novo_salario));
            System.out.println(String.format("Reajuste ganho: %.2f", novo_salario - salario));
            System.out.println("Em percentual: " + perc + " %");
        } else if (salario > 800 && salario <= 1200) {
            perc = 10;
            novo_salario = salario + ((salario * perc) / 100);
            System.out.println(String.format("Novo salario: %.2f", novo_salario));
            System.out.println(String.format("Reajuste ganho: %.2f", novo_salario - salario));
            System.out.println("Em percentual: " + perc + " %");
        } else if (salario > 1200 && salario <= 2000) {
            perc = 7;
            novo_salario = salario + ((salario * perc) / 100);
            System.out.println(String.format("Novo salario: %.2f", novo_salario));
            System.out.println(String.format("Reajuste ganho: %.2f", novo_salario - salario));
            System.out.println("Em percentual: " + perc + " %");
        } else {
            perc = 4;
            novo_salario = salario + ((salario * perc) / 100);
            System.out.println(String.format("Novo salario: %.2f", novo_salario));
            System.out.println(String.format("Reajuste ganho: %.2f", novo_salario - salario));
            System.out.println("Em percentual: " + perc + " %");
        }

        input.close();
    }
}
