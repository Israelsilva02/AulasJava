package Aula2;
import java.util.Scanner;

public class Exercicio1Laco {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor da letra A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor da letra B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor da letra C: ");
		c = leia.nextInt();
		
		if(a+b>c) {
			System.out.println("A soma de A + B é maior que C!");
			
		}
		else if(a+b<c) {
			System.out.println("A soma de A + B é maior que C!");
			
		}
		else if(a+b==c) {
			System.out.println("A soma de A + B é maior que C!");	
		}
		else {
			System.out.println("Erro de informações!!!!!!!");
		}
	
		
	}

}
