package Beecrowd_codes_exercises;

/*

QUESTÃO
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)
e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = https://resources.beecrowd.com.br/gallery/images/problems/UOJ_1015.pngw

ENTRADA
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante:
 x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

SAÍDA
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

*/

import java.util.Scanner;

public class Bee_1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distancia = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        distancia = Math.sqrt(distancia);
        System.out.println(String.format("%.4f", distancia));
        input.close();
    }
}