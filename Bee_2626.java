package Beecrowd_codes_exercises;

/*

QUESTÃO
Dodô, Leo e Pepper passam várias madrugadas conversando, em algum lugar do Condomínio Jardim Botânico IV. 
Diversos assuntos astrais ganham pauta nestas conversas homéricas. Nas últimas sessões, Dodô tem falado do jogo de RPG que ele e Leo estão inventando, 
Leo (para “variar”, mas com razão) tem falado do gênero musical heavy metal e Pepper ficou fascinado com a história da mitologia grega contada por Leo.
Os garotos resolveram adotar uma estratégia para dividir as sessões igualmente entre os assuntos, de modo que eles possam especular cada um ao máximo e 
chegarem a conclusões astronômicas. Eles irão jogar “pedra, papel e tesoura” para decidir o assunto da sessão de hoje, 
e então irão alternar os assuntos nas próximas sessões. Dadas as jogadas de Dodô, Leo e Pepper, nesta ordem, 
você deve determinar o assunto da sessão de hoje.

ENTRADA
A entrada é composta por vários casos de teste e termina com fim de arquivo. Cada caso de teste é composto por uma única linha, 
que contém as jogadas de cada um dos garotos, como mostrado nos exemplos.

SAÍDA
Para cada caso de teste, imprima uma única linha com a mensagem "Os atributos dos monstros vao ser inteligencia, sabedoria..." 
para indicar que Dodô é o vencedor, a mensagem "Iron Maiden's gonna get you, no matter how far!" para indicar que Leo é o vencedor, 
a mensagem "Urano perdeu algo muito precioso..." para indicar que Pepper é o vencedor, ou a mensagem "Putz vei, o Leo ta demorando muito pra jogar..." 
se houver empate.

*/

import java.util.Scanner;

public class Bee_2626 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String FRASE_DODO = "Os atributos dos monstros vao ser inteligencia, sabedoria...";
        String FRASE_LEO = "Iron Maiden's gonna get you, no matter how far!";
        String FRASE_PEPPER = "Urano perdeu algo muito precioso...";
        String FRASE_EMPATE = "Putz vei, o Leo ta demorando muito pra jogar...";
        while (input.hasNext()) {
            String ESCOLHA_DODO = input.next();
            String ESCOLHA_LEO = input.next();
            String ESCOLHA_PEPPER = input.next();
            if (ESCOLHA_DODO.equals("papel") && ESCOLHA_LEO.equals("papel") && ESCOLHA_PEPPER.equals("tesoura"))
                System.out.println(FRASE_PEPPER);
            else if (ESCOLHA_DODO.equals("papel") && ESCOLHA_LEO.equals("pedra") && ESCOLHA_PEPPER.equals("pedra"))
                System.out.println(FRASE_DODO);
            else if (ESCOLHA_DODO.equals("papel") && ESCOLHA_LEO.equals("tesoura") && ESCOLHA_PEPPER.equals("papel"))
                System.out.println(FRASE_LEO);
            else if (ESCOLHA_DODO.equals("pedra") && ESCOLHA_LEO.equals("papel") && ESCOLHA_PEPPER.equals("pedra"))
                System.out.println(FRASE_LEO);
            else if (ESCOLHA_DODO.equals("pedra") && ESCOLHA_LEO.equals("pedra") && ESCOLHA_PEPPER.equals("papel"))
                System.out.println(FRASE_PEPPER);
            else if (ESCOLHA_DODO.equals("pedra") && ESCOLHA_LEO.equals("tesoura") && ESCOLHA_PEPPER.equals("tesoura"))
                System.out.println(FRASE_DODO);
            else if (ESCOLHA_DODO.equals("tesoura") && ESCOLHA_LEO.equals("papel") && ESCOLHA_PEPPER.equals("papel"))
                System.out.println(FRASE_DODO);
            else if (ESCOLHA_DODO.equals("tesoura") && ESCOLHA_LEO.equals("pedra") && ESCOLHA_PEPPER.equals("tesoura"))
                System.out.println(FRASE_LEO);
            else if (ESCOLHA_DODO.equals("tesoura") && ESCOLHA_LEO.equals("tesoura") && ESCOLHA_PEPPER.equals("pedra"))
                System.out.println(FRASE_PEPPER);
            else
                System.out.println(FRASE_EMPATE);
        }
        input.close();
    }
}