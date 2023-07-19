package Aula2;

import java.util.Scanner;

public class ExercicioLacoSwitch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigoProduto, nomeProduto, opcao;
		int quantidade;
		double valorCachorro = 10.00, valorSalada = 15.00, valorBacon = 18.00, valorBauru = 12.00, valorRefri = 8.00, valorSuco = 13.00;
		
		
		System.out.println("Digite o codigo do seu pedido: ");
		System.out.println("[1] Cachorro Quente");
		System.out.println("[2] X-Salada");
		System.out.println("[3] X-Bacon");
		System.out.println("[4] Bauru");
		System.out.println("[5] Refrigerante");
		System.out.println("[6] Suco de laranja");
		codigoProduto = leia.nextInt();
		
		System.out.println("Quantos produtos vai querer: ");
		quantidade = leia.nextInt();
		
		switch (codigoProduto) { 
		 
	
			 case 1: {
				System.out.println("Opção 1-Cachorro Quente " + quantidade * valorCachorro);
				break;
			}
			 case 2: {
				System.out.println("Opção 2-X-Salada " + quantidade * valorSalada);
				break;
			}
			 case 3: {
				System.out.println("Opção 3-X-Bacon "+ quantidade*valorBacon);
				break;
			}
			 case 4: {
				System.out.println("Opção 4-Bauru "+ quantidade*valorBauru);
				break;
				
			}
			 case 5: {
				System.out.println("Opção 5-Refrigerante "+ quantidade*valorRefri);
				break;
			}
			 case 6: {
				System.out.println("Opção 6-Suco de laranja "+ quantidade*valorSuco);
				break;
		 
			}
			
			
			
		 }
	}
}

		
		
	


