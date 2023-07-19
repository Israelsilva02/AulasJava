package Aula2;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int proat, trab;
		
		System.out.println("Digite sua nota de proatividade: ");
		proat = leia.nextInt();
		
		System.out.println("Digite sua nota de trabalho em equipe: ");
		trab = leia.nextInt();
		
		
		/*System.out.println("\n É preciso ter as duas nota 4: ");
		if (proat == 4 && trab == 4) {
			System.out.println(" Parabéns! duas nota 4!! ");
		} else {
			System.out.println(" Sinto muito você não possui duas nota 4!! ");
		}*/
		
		
		
		System.out.println("\n É preciso ter as duas notas 4 ou pelo menos uma nota 4: ");
		if (proat == 4 || trab == 4) {
			System.out.println(" Parabens! voce obteve pelo menos uma nota 4!! ");
		} else {
			System.out.println(" Sinto muito você não tem nenhuma nota 4!! ");
		}

		
		
		
		
	}

}
