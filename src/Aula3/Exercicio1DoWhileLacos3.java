package Aula3;

import java.util.Scanner;

public class Exercicio1DoWhileLacos3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int soma = 0,quantidade = 0,numero;

        do {
            System.out.print("Digite um número inteiro: ");
            numero = leia.nextInt();
            
            if (numero != 0 && numero % 3 == 0) {
                soma = soma +numero;
                quantidade++;
            }
        } while (numero != 0);

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("A média de todos os números múltiplos de 3 é: " + media);
        } else {
            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
        }

        leia.close();
    }
}
