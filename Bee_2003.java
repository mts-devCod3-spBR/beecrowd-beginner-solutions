package Beecrowd_codes_exercises;

/*

QUESTÃO
Domingo é dia de feira. Logo de manhã muitas pessoas se deslocam para o polo de lazer da Parangaba, onde acontece uma feira, 
conhecida por ser a maior da cidade. Na feira da Parangaba você pode encontrar de tudo.
Todos os domingos, Bino faz compras na feira. Ele sempre marca com seu amigo Cino de se encontrarem no terminal de ônibus da Parangaba às 8h, 
para irem juntos comprar na feira. Porém, muitas vezes Bino acorda muito tarde e se atrasa para o encontro com seu amigo.

Sabendo que Bino leva de 30 a 60 minutos para chegar ao terminal. Diga o atraso máximo de Bino.

ENTRADA
A entrada consiste em múltiplos casos teste. Cada caso de tese contém uma única linha contendo um horário H (5:00 ≤ H ≤ 9:00) que Bino acordou. 
A entrada termina com final de arquivo (EOF).

SAÍDA
Para cada caso de teste, imprima "Atraso maximo: X" (sem aspas), X indica o atraso maximo (em minutos) de Bino no encontro com Cino.

*/

import java.util.Scanner;

public class Bee_2003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String[] relogio = input.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            switch (hora) {
                case (7):
                    System.out.println("Atraso maximo: " + min);
                    break;
                case (8):
                    System.out.println("Atraso maximo: " + (60 + min));
                    break;
                case (9):
                    System.out.println("Atraso maximo: " + (120 + min));
                    break;
                default:
                    System.out.println("Atraso maximo: 0");
            }
        }
        
        input.close();
    }
}