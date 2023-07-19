package Aula3;

import java.util.Scanner;

public class Exercicio1WhileLacos3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String continua = "s";
		int num1, num2, idade, resultado;
		 int vinteUm = 0;
		 int cinquenta = 0;

		while (continua.contentEquals("s")) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			

			if (idade < 21 && idade > 0) {
				System.out.println("Menor que 21 anos!");
				vinteUm++;
			}

			else if (idade > 50) {
				System.out.println("Maior que 50 anos!");
				cinquenta++;
				
			} else if (idade < 0) {
				System.out.println("Menor de 21 anos!");
				System.out.println(vinteUm);
				System.out.println("Maior de 50 anos!");
				System.out.println(cinquenta);
				break;

			}

		}
	}

}
