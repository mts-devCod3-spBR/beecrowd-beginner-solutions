package Beecrowd_codes_exercises;

/*

QUESTÃO
Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
O último dado, que não entrará nos cálculos, contém o valor de idade negativa. 
Calcular e imprimir a idade média deste grupo de indivíduos.

ENTRADA
A entrada contém um número indeterminado de inteiros. 
A entrada será encerrada quando um valor negativo for lido.

SAÍDA
A saída contém um valor correspondente à média de idade dos indivíduos.
A média deve ser impressa com dois dígitos após o ponto decimal.

*/

import java.util.Scanner;

public class Bee_1154 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = 0;
        int qtdIdade = 0;
        double totalIdade = 0;
        while (idade >= 0) {
            idade = input.nextInt();
            if (idade >= 0) {
                qtdIdade++;
                totalIdade += idade;
            }
        }
        double media = totalIdade / qtdIdade;
        System.out.println(String.format("%.2f", media));
        input.close();
    }
}
