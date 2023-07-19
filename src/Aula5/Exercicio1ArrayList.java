package Aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		String cor;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 5 cores: ");
		
		
		for(int = 0 ; i < 5; i++) {
			String cor = leia.nextLine();
			cores.add(cor);
			
			System.out.println("Cores adicionadas: ");
			
			for( String cor : cores) {
				System.out.println(cores);
			}
			
			Collections.sort(cores);
			
			System.out.println("Cores em ordem crescente: ");
			for(String cor : cores) {
				System.out.println(cores);
			}
			
	
            }

	}

}
