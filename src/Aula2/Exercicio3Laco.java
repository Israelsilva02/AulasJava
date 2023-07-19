package Aula2;

import java.util.Scanner;

public class Exercicio3Laco {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean primeiraDoacao;

		System.out.println("Digite o nome do doador: ");
		nome = leia.next();

		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();

		System.out.println("Primeira doação:  -true- para (sim) -false- para (não) ");
		primeiraDoacao = leia.nextBoolean();

	if (idade < 18) {
			System.out.println("Não está apto para doar!");

		} else if (idade >= 60 && idade <= 69 && primeiraDoacao == true) {

			System.out.println("Não está apto para doar!");

		}
		else {
			System.out.println("Está apto para doar!");
		}

	}
}
