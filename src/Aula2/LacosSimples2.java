package Aula2;

import java.util.Scanner;

public class LacosSimples2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Boolean persistencia;
		int opcao;

		System.out.println("Digite 1 para verificar sua persistência ou 2 para sair:");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Se você estiver tendo persistência digite -true- caso não esteja digite -false-.");
			persistencia = leia.nextBoolean();

			if (persistencia == true) {
				System.out.println("Por falta de persistência você não conseguiu se formar!");

			} else {
				System.out.println("Por demostrar muita persistência voce conseguiu se formar!");

			}

			break;

		case 2:
			System.out.println("Volte sempre!.");

			break;
		default:
			System.out.println("Opção inválida!");
		

	}

	}
}
