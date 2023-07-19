package Aula5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class Exercicio1ArrayListSet {

	public static void main(String[] args) {

		Set<Integer> integerSet = new HashSet<>();

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite 10 valores inteiros que não seja repetidos:");

		int contar = 0;
		while (contar < 10) {
			int valor = leia.nextInt();

			if (integerSet.contains(valor)) {
				System.out.println("Valor repetido. Digite outro valor.");
				continue;
			}

			integerSet.add(valor);
			contar++;
		}

		System.out.println("Elementos da Collection Set:");
		Iterator<Integer> iterator = integerSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}