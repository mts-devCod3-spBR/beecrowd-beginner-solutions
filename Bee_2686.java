package Beecrowd_codes_exercises;

/*

QUESTÃO
Novamente Júlio pede sua ajuda, ele esqueceu de um pequeno detalhe. Como o seu o programa anterior só informava uma saudação, 
ele pediu que transformasse o grau do Sol/Lua em HH:MM:SS. Então caso aceite: dado um grau relativo a posição do Sol/Lua, 
refaça o sistema só que agora além da saudação de cada período do dia, informe exatamente as horas, os minutos e segundos.

ENTRADA
A entrada contem um pontos flutuantes M (0 ≥ M < 360) representando a posição, em graus,do Sol/Lua em relação a terra. 
Como eles andam em constante movimento seu programa receberá diversos casos a cada segundo(EOF).

SAÍDA
Imprima qual período do dia ele se encontra: "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!", 
e na linhas de baixo exiba as horas, minutos e segundos (HH:MM:SS).

*/

import java.util.Scanner;

public class Bee_2686 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			double C = input.nextDouble();

			if (C <= 360) {
				if (C < 90 || C == 360)
					System.out.println("Bom Dia!!");
				else if (C < 180)
					System.out.println("Boa Tarde!!");
				else if (C < 270)
					System.out.println("Boa Noite!!");
				else if (C < 360)
					System.out.println("De Madrugada!!");
				else
					System.out.println("Bom Dia!!");

				Double H;
				if (C >= 270) {
					H = ((C - 270.0) * 4.0) / 60.0;
				} else {
					H = ((C * 4.0) / 60.0) + 6.0;
				}

				Double M = (H * 60.0) % 60.0;
				Double S = (M * 60.0) % 60.0;

				if (S > 59) {
					S = 0.0;
					M += 1.0;
				}

				System.out.printf("%02d:%02d:%02d%n", H.intValue(), M.intValue(), S.intValue());
			}
		}

		input.close();
	}

}