package Aula3;

import java.util.Scanner;

public class Exercicio1ForLacos3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String continua;
		int num1, num2;
		int num = 10;

		System.out.println("Digite o número: ");
		num1 = leia.nextInt();

		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();

		if (num1 < num2) {
			System.out.println("Intervalo inválido");
		} else if (num1 > num2) {
			System.out.println("");
			for (int i = 1; i <= 100; i++)

				System.out.println("Deseja continuar? (s/n)");
			continua = leia.next();

		}

	}
}
