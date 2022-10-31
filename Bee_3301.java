/* 

QUESTÃO
Tio Patinhas era um milionário que vivia em sua mansão, e tinha três sobrinhos: Huguinho, Zezinho e Luisinho. 
Ele se confundia facilmente entre os três sobrinhos, pois eram bem parecidos, apesar de terem idades diferentes. 
Um dia, os três fizeram uma aposta com o tio: se ele acertasse quem era o sobrinho do meio, ou seja, nem o mais novo, 
nem o mais velho, eles dariam uma moeda de ouro para ele, e se ele errasse, teria que dar uma moeda de ouro para cada um. 
Assim, o tio pede a tua ajuda para que ele possa ganhar essa aposta.

ENTRADA
A entrada consiste em vários casos de teste. Cada caso contém três valores inteiros H, Z e L, 
que representam as idades de Huguinho, Zezinho e Luisinho, respectivamente. 

SAÍDA
Para cada caso de teste imprima o nome do sobrinho do meio, com letras minúsculas.

*/

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int Z = sc.nextInt();
        int L = sc.nextInt();
        if(H > Z && H < L || H < Z && H > L){
            System.out.println("huguinho");
        }else if(Z > H && Z < L || Z < H && Z > L){
            System.out.println("zezinho");
        }else{
            System.out.println("luisinho");
        }
    }
}