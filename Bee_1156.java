package Beecrowd_codes_exercises;

/*

QUESTÃO
Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

ENTRADA
Não há nenhuma entrada neste problema.

SAÍDA
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.

*/

public class Bee_1156 {
    public static void main(String[] args) {
        double S = 1;
        double i, j;
        for (i = 3, j = 2; i <= 39; i += 2, j *= 2) {
            S += i / j;
        }

        System.out.println(String.format("%.2f", S));
    }
}
