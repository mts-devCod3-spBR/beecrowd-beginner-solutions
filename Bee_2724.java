package Beecrowd_codes_exercises;

/*

QUESTÃO
Juvenal comportou-se muito bem este ano, já que gosta muito de química e queria muito ganhar um kit Alquimia. 
Entretanto, Juvenal pediu para incluir alguns elementos perigosos em seu kit. Seu Noel não podendo negar o pedido 
( afinal, como dizer não para a criança mais bem comportada do planeta?) pediu para o pobre elfo Patatatitu garantir que o presente fosse seguro.

Patatatitu sabe muito sobre química, e conhece todos os compostos perigosos que podem ser feitos com os elementos disponíveis no kit de Juvenal. 
Assim, decidiu enviar um cd junto com o presente, contendo um programa que afira a segurança dos experimentos de Juvenal. Todos concordam que a 
criança mais bem-comportada do planeta nunca faria uma experiência sem antes checar sua segurança conforme as instruções. 
Porém Patatatitu não sabe programar e está atrás de ajuda. Você poderia ajudá-lo?

Para facilitar, Patatatitu explica que um composto perigoso é formado a partir da mistura de elementos na ordem de sua fórmula atômica e 
respeitando as devidas proporções. Neste kit de química é possível apenas adicionar um elemento por vez, em diferentes quantidades. 
Assim para formar trifluoreto de cloro (ClF3), um composto muito perigoso, deve-se adicionar um átomo cloro (Cl) e três de flúor (F3), 
independentemente do que for adicionado antes ou depois. ClF4 não é um composto perigoso, pois está fora de proporção. 
De forma similar caso Mg2F seja um composto perigoso, Mg2Fe será seguro, visto que flúor (F) é um elemento distinto de ferro (Fe).

ENTRADA
A entrada consiste de um inteiro N (0 < N < 10) que indica o número de casos de teste. Cada caso de teste consiste em um inteiro T (0 < T < 51) 
que indica o número de compostos perigosos possíveis, caso os elementos sejam incluídos na ordem e proporções mostradas. Seguem T linhas, 
cada uma contendo uma string de até 50 caracteres representando uma formula que gera um composto perigoso caso os elementos sejam misturados 
na ordem e proporções que são apresentados. Após isso, é dado um inteiro U (0 < U < 51) que indica a quantia de experiencias que Juvenal irá realizar. 
Seguem U linhas cada uma contendo uma string de até 50 caracteres representando os elementos que Juvenal utilizara na ordem e proporções em que 
serão adicionados.

SAÍDA
A saída consiste de U linhas por caso de teste, as quais devem informar se Juvenal deve prosseguir ou abortar o  U-ésimo  experimento do caso teste. 
Caso deva abortar imprima "Abortar", caso seja seguro imprima "Prossiga".Deixe uma linha em branco entre cada caso de teste.

*/

import java.util.Scanner;

public class Bee_2724 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());	//número de casos de teste
		for (int i=0 ; i<n ; i++) {
			
			int t = Integer.parseInt(sc.nextLine());//número de compostos perigosos possíveis
			String[] formula = new String[t];
			for (int x=0 ; x<t ; x++)
				formula[x] = sc.nextLine();
			
			int u = Integer.parseInt(sc.nextLine());//quantidade experiencias que Juvenal irá realizar
			String[] teste = new String[u];
			for (int x=0 ; x<u ; x++)
				teste[x] = sc.nextLine();
			
			for (int y=0 ; y<u ; y++) {
				int ok=0;
				for (int x=0 ; x<t ; x++) {
					//System.out.println("existe formula no teste?" + teste[y].indexOf(formula[x]));
					if(teste[y].indexOf(formula[x]) != -1){
						String[] checaProx = teste[y].split(formula[x]);
						//System.out.println(checaProx.length);
						if (checaProx.length>1) {
							String[] checa = checaProx[1].split("");
							//se for letra maiuscula -->soma ok
							//				ou
							//se não for número ------->soma ok
							if(!isLowerCase(checa[0]) && !isNotNumber(checa[0]))
								ok++;
						}
						else
							ok++;
					}
				}
				if (ok!=0) System.out.println("Abortar");
				else System.out.println("Prossiga");
			}
			if(i<n-1) System.out.println();
		}
		sc.close();
	}

	private static boolean isNotNumber(String string) {
		char[] c = string.toCharArray();
		//System.out.println("é numero " + Character.isDigit(c[0]));
		return Character.isDigit(c[0]);
	}

	private static boolean isLowerCase(String string) {
		//System.out.println("é minusculo " + string.toLowerCase().equals(string));
	    return string.toLowerCase().equals(string);  
	}
}