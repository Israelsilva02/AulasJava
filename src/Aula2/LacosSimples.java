package Aula2;

import java.util.Scanner;

public class LacosSimples {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num;

		System.out.println("Digite um número: ");
		num = leia.nextInt();

		if (num == 1) {
			System.out.println("Conta paga no debito!");
		}
		else if(num == 2){
			System.out.println("Conta paga no Credito!");
		}
			else {
		
			System.out.println("Número invalido!");
		}

	}

}
