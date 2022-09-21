package Beecrowd_codes_exercises;

/*

QUESTÕES
Giovanna adora o Natal. As festas, a família, decorações natalinas e principalmente os famosos pisca pisca led. 
Porém, esse ano a pequena Gio ficou triste ao perceber que seu jogo de luzes está quebrado. Algumas luzes ainda funcionam, outras não. 
Giovanna quer, obviamente, consertar seu objeto preferido mas não tem lâmpadas o suficiente pra substituir todas as queimadas 
então resolveu fazer o seguinte: dividir o pisca pisca em grupos ordenados de 50 lâmpadas e em cada grupo só consertar a maior quantidade de 
lâmpadas consecutivas queimadas.

Por serem muitos grupos, a tarefa se tornou tediosa e para tentar remediar isso, Giovanna, observando a semelhança dos grupos 
com representação binária de números quando imaginava lâmpadas queimadas como 1's e lâmpadas funcionais como 0's, 
decidiu pensar neles efetivamente como números e escreveu as 
representações decimais desses binários então tentou descobrir a quantidade de lâmpadas a serem trocadas a partir dessas anotações.
Sua tarefa é, dado as anotações de Gio, diga quantas lâmpadas serão trocadas em cada grupo.

ENTRADA
A primeira linha da entrada contém um número inteiro N (1 ≤ N ≤ 103) representando a quantidade de grupos que Giovanna anotou. 
As próximas N linhas contém um inteiro X cada uma representando o equivalente decimal do número que representa o grupo.

SAÍDA
A saída consiste de N linhas cada uma contendo o tamanho da maior sequência de lâmpadas consecutivas queimadas em cada grupo, 
respeitando a ordem de entrada dos grupos.

*/

import java.util.Scanner;

public class Bee_2718{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            long X = input.nextLong();
            int sequenciaMaxima = 0;
            int sequenciaAtual = 0;
            while (X > 0) {
                if (X % 2 == 1) {
                    sequenciaAtual++;
                } else {
                    if (sequenciaAtual > sequenciaMaxima) {
                        sequenciaMaxima = sequenciaAtual;
                    }

                    sequenciaAtual = 0;
                }

                X /= 2;
            }

            if (sequenciaAtual > sequenciaMaxima) {
                sequenciaMaxima = sequenciaAtual;
            }

            System.out.println(sequenciaMaxima);
            input.close();
        }
    }
}