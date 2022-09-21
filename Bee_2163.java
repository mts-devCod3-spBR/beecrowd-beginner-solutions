package Beecrowd_codes_exercises;

/*

QUESTÃO
Há muito tempo atrás, em uma galáxia muito, muito distante...
Após o declínio do Império, sucateiros estão espalhados por todo o universo procurando por um sabre de luz perdido. 
Todos sabem que um sabre de luz emite um padrão de ondas específico: 42 cercado por 7 em toda a volta. 
Você tem um sensor de ondas que varre um terreno com N x M células. Veja o exemplo abaixo para um terreno 4 x 7 com um sabre de luz nele 
(na posição (2, 4)).

https://resources.beecrowd.com.br/gallery/images/contests/935.png

Você deve escrever um programa que, dado um terreno N x M, procura pelo padrão do sabre de luz nele. 
Nenhuma varredura tem mais do que um padrão de sabre de luz.

ENTRADA
A primeira linha da entrada tem dois números positivos N e M, representando, respectivamente, o número de linhas 
e de colunas varridos no terreno (3 ≤ N, M ≤ 1000). Cada uma das próximas N linhas tem M inteiros, 
que descrevem os valores lidos em cada célula do terreno (-100 ≤ Tij ≤ 100, para 1 ≤ i ≤ N e 1 ≤ j ≤ M).

SAÍDA
A saída é uma única linha com 2 inteiros X e Y separados por um espaço. Eles representam a coordenada (X,Y) do sabre de luz, 
caso encontrado. Se o terreno não tem um padrão de sabre de luz, X e Y são ambos zero.

*/

import java.util.Scanner;

public class Bee_2163 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int achou = 0;
        int N = input.nextInt();
        int M = input.nextInt();
        int[][] terreno = new int[N][M];
        int sabreL = 0, sabreC = 0;
        for (int L = 0; L < N; L++)
            for (int C = 0; C < M; C++)
                terreno[L][C] = input.nextInt();
        for (int L = N - 1; L >= 0; L--)
            for (int C = M - 1; C >= 0; C--)
                if (terreno[L][C] == 42)
                    if (L - 1 >= 0 && C - 1 >= 0 && L + 1 < N && C + 1 < M)
                        if (terreno[L - 1][C - 1] == 7 &&
                                terreno[L - 1][C] == 7 &&
                                terreno[L - 1][C + 1] == 7 &&
                                terreno[L][C - 1] == 7 &&
                                terreno[L][C + 1] == 7 &&
                                terreno[L + 1][C - 1] == 7 &&
                                terreno[L + 1][C] == 7 &&
                                terreno[L + 1][C + 1] == 7) {
                            sabreL = L;
                            sabreC = C;
                            achou = 1;
                        }
        if (achou == 1){
            System.out.printf("%d %d\n", sabreL + 1, sabreC + 1);
        }else{
            System.out.println("0 0");
        }
        
        input.close();
    }
}
