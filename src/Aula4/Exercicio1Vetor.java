package Aula4;

import java.util.Scanner;

public class Exercicio1Vetor {
	public static void main(String[] args) {
		int vetorNumero[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = leia.nextInt();

		int posicao = -1;

		for (int i = 0; i < vetorNumero.length; i++) {
			if (vetorNumero[i] == numero) {
				posicao = i;
				break;
			}
		}

		if (posicao != -1) {
			System.out.println("O número " + numero + " foi encontrado na posição " + posicao);
		} else {
			System.out.println("Não foi encontrado!");
		}
	}
}
