package Beecrowd_codes_exercises;

/*

QUESTÕES
Como se sabe, existe um corvo com três olhos. O que não se sabia é que o corvo com três olhos pode prever o resultado da loteria de Westeros. 
Enquanto todos os outros corvos coletam as apostas, o corvo de três olhos já sabe o resultado, e quando Bran sonha com o corvo, o corvo conta o resultado.
 O problema é que Bran apesar de lembrar do sonho, não consegue interpretá-lo sozinho em tempo hábil. 
 A sua tarefa é fazer um programa para interpretar o sonho de Bran e calcular o resultado da loteria.

Durante o sonho, o corvo pisca diversas vezes e grita apenas 3 vezes. A cada grito um número do resultado da loteria é calculado.

Cada piscada do corvo comunica um número em binário. Um olho aberto significa 1 e um olho fechado significa 0. 
O olho da esquerda é o mais significativo e o da direita é o menos significativo. A cada piscada, este número deve ser somado, 
e quando o corvo grita, essa soma é um resultado.

ENTRADA
A entrada descreve, em cada linha, em sequência, ou um grito ou uma piscada do corvo.
Um grito é representado pela string caw caw
Uma piscada é representada por três caracteres * ou -, representando, respectivamente, um olho aberto ou um olho fechado, da esquerda para a direita.
Lembre-se que o corvo tem 3 olhos.
Os números sorteados na loteria não excedem 1000.

SAÍDA
A saída são três linhas, cada linha com um número da loteria.

*/

import java.util.Scanner;

public class Bee_1848 {
	
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int N, flag;
        String corvo;
        for (int i = 0; i < 3; i++) {
        	N = 0;
        	flag = 0;
        	while (flag == 0) {
        		corvo = input.nextLine();
        		switch (corvo) {
	        		case "--*":
                        N += 1; 
                        break;
	        		case "-*-": 
                        N += 2; 
                        break;
	        		case "-**": 
                        N += 3; 
                        break;
	        		case "*--": 
                        N += 4; 
                        break;
	        		case "*-*": 
                        N += 5; 
                        break;
	        		case "**-": 
                        N += 6; 
                        break;
	        		case "***": 
                        N += 7; 
                        break;
	        		default: 
                        flag = 1; 
                        break;
        		}
        	}
        	System.out.println(N);
        }

        input.close();
    }
	
}
