package Aula6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1QueueFila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner leia = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = leia.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    leia.nextLine(); 
                    String nomeCliente = leia.nextLine();
                    adicionarCliente(fila, nomeCliente);
                    break;
                case 2:
                    listarClientes(fila);
                    break;
                case 3:
                    chamarCliente(fila);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void exibirMenu() {
        System.out.println("******** Menu do Banco ****************************");
        System.out.println("[1] Adicionar um novo cliente na fila");
        System.out.println("[2] Listar todos os clientes na fila");
        System.out.println("[3] Chamar (retirar) uma pessoa da fila");
        System.out.println("[0] Sair do programa");
        System.out.println("******************************************");
        System.out.println("Digite a opção desejada: ");
    }

    public static void adicionarCliente(Queue<String> fila, String nomeCliente) {
        fila.add(nomeCliente);
        System.out.println("Cliente adicionado à fila com sucesso.");
    }

    public static void listarClientes(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Clientes na fila:");
            for (String cliente : filaClientes) {
                System.out.println(cliente);
            }
        }
    }

    public static void chamarCliente(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("A fila está vazia!");
        } else {
            String clienteChamado = filaClientes.poll();
            System.out.println("Cliente " + clienteChamado + " chamado e removido da fila.");
        }
    }
}
