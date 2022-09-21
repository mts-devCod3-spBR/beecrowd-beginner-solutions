package Beecrowd_codes_exercises;

/*

QUESTÃO
Ultimamente, diversas pessoas estão indo à Dra. Cláudia Café com Leite para saber se estão consumindo a quantidade recomendada diária de vitamina C. 
Isso tem a deixado exausta, e por isso ela lhe pediu para escrever um programa que, dado o consumo diário de alimentos ricos em vitamina C por uma pessoa, 
indique o quanto essa pessoa deve consumir a mais ou a menos para atingir o recomendado.
Para tal, você poderá utilizar a tabela a seguir:

Alimentos ricos em Vitamina C	Quantidade de Vitamina C
suco de laranja	                    120 mg
morango fresco	                    85 mg
mamao	                            85 mg
goiaba vermelha	                    70 mg
manga	                            56 mg
laranja	                            50 mg
brocolis	                        34 mg

Considere que o consumo diário recomendado de vitamina C está entre 110 mg e 130 mg, inclusive.

ENTRADA
Cada caso de teste é composto um inteiro T (1 ≤ T ≤ 7) indicando que a pessoa consome diariamente T alimentos entre os 7 alimentos da tabela. 
Em seguida, haverá T linhas com um inteiro N e um alimento (totalmente em caixa baixa e sem acentuações), 
indicando que a pessoa consome uma quantidade N daquele alimento. A entrada termina com T = 0.

SAÍDA
Para cada caso de teste (T), se o consumo ultrapassou o limite recomendado, imprima "Menos X mg", 
em que X representa a quantidade a menos a ser consumida para atingir o limite recomendado; 
se o consumo não atingiu o recomendado, imprima "Mais X mg", em que X representa a quantidade a mais para atingir o recomendado; 
se o consumo está dentro do intervalo recomendado, imprima "X mg", em que X representa a quantidade consumida diariamente pela pessoa.

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bee_2486 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> c = new HashMap<String, Integer>();

        c.put("suco de laranja", 120);
        c.put("morango fresco", 85);
        c.put("mamao", 85);
        c.put("goiaba vermelha", 70);
        c.put("manga", 56);
        c.put("laranja", 50);
        c.put("brocolis", 34);
        int t = 1;
        while (t != 0) {
            t = Integer.parseInt(input.nextLine());
            if (t != 0) {
                int vitaminas = 0;
                for (int z = 0; z < t; z++) {
                    int quant = Integer.parseInt(input.next());
                    String entrada = input.nextLine();
                    entrada = new StringBuilder(entrada).reverse().toString();
                    entrada = entrada.substring(0, entrada.length() - 1);
                    entrada = new StringBuilder(entrada).reverse().toString();
                    if (c.containsKey(entrada))
                        vitaminas += c.get(entrada) * quant;
                }
                if (vitaminas > 130)
                    System.out.printf("Menos %d mg\n", vitaminas - 130);
                else if (vitaminas < 110)
                    System.out.printf("Mais %d mg\n", 110 - vitaminas);
                else
                    System.out.printf("%d mg\n", vitaminas);
            }
        }

        input.close();
    }
}