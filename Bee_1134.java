package Beecrowd_codes_exercises;

/*

QUESTÃO
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
O programa será encerrado quando o código informado for o número 4.

ENTRADA
A entrada contém apenas valores inteiros e positivos.

SAÍDA
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

*/

import java.util.Scanner;

public class Bee_1134 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tipo = 0;
        int qtdGasolina = 0;
        int qtdAlcool = 0;
        int qtdDiesel = 0;
        while (tipo != 4) {
            tipo = input.nextInt();
            if (tipo == 1) {
                qtdAlcool++;
            } else if (tipo == 2) {
                qtdGasolina++;
            } else if (tipo == 3) {
                qtdDiesel++;
            } else if (tipo == 4) {
                System.out.println("MUITO OBRIGADO");
            } else {
                while (tipo > 4 && tipo < 1) {
                    tipo = input.nextInt();
                }
            }
        }

        System.out.println("Alcool: " + qtdAlcool);
        System.out.println("Gasolina: " + qtdGasolina);
        System.out.println("Diesel: " + qtdDiesel);
        input.close();
    }
}
