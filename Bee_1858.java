package Beecrowd_codes_exercises;

/*

QUESTÕES
Ramsay: "(...) você vence se conseguir adivinhar quem eu sou e por que estou torturando você."
Theon deve pensar rápido e adivinhar quem é seu algoz! Entretanto, Ramsay já decidiu o que ele irá fazer depois que Theon der sua resposta.
Theon pode dizer que seu algoz é alguma dentre N pessoas. Considere que as pessoas são numeradas de 1 a N. 
Se Theon responder que seu algoz é a pessoa i, Ramsay irá atingi-lo Ti vezes.
Sua tarefa é ajudar Theon a determinar qual deve ser sua resposta de forma a minimizar o número de vezes que ele será atingido.

ENTRADA
A primeira linha contém um inteiro N (1 ≤ N ≤ 100). A segunda linha contém N inteiros T1, T2, ..., TN (0 ≤ Ti ≤ 20).

SAÍDA
Imprima uma linha contendo o número da pessoa que Theon deve dizer ser seu algoz. Se existe mais de uma resposta possível, imprima a menor.

*/

import java.util.Scanner;

public class Bee_1858 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int T, MENOR = 0;  
        int POSICAO = 0;
        for (int i = 1; i <= N; i++) {
            T = input.nextInt();
            if (i == 1) {
                POSICAO = 1;
                MENOR = T;
            } else if (T < MENOR) {
                POSICAO = i;
                MENOR = T;
            }
        }

        System.out.println(POSICAO);
        input.close();
    }

}
