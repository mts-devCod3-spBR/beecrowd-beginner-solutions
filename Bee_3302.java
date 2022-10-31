/* 

QUESTÃO
Roumes era um aluno acima da média. Nas provas de matemática, ele sempre tirava nota máxima, 
acertando todas as contas, mas o segredo dele não estava em fazer contas corretamente. 
Ele interpretava o que via no ambiente a sua volta e conseguia deduzir as respostas para as questões. 
Você também pode ser alguém especial, igual a Roumes.

ENTRADA
A entrada consiste em vários casos de teste. Cada caso contém um número N, representando a quantidade de perguntas. 
Nas N linhas seguintes, aparece o que você viu para chegar na resposta.

SAÍDA
Para cada pergunta feita, imprima a palavra ‘resposta’, seguida por um espaço, depois pelo número da pergunta, 
por dois pontos, um espaço e a resposta.

*/

import java.util.Scanner;
public class Bee_3302 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int number = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int j = 0; j < n; j++){
            System.out.println("reposta " + (j + 1) + ": " + arr[j]);
        }
    }
}