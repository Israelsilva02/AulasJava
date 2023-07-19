package Aula6;

import java.util.Scanner;
import java.util.Stack;
public class ExercicioStackpilha {

	public static void main(String[] args) {
		Stack<String> livros = new Stack<>();
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
                    System.out.println("Digite o nome do livro:");
                    leia.nextLine(); 
                    String nomeLivro = leia.nextLine();
                    adicionarLivro(livros, nomeLivro);
                    break;
                case 2:
                    listarLivros(livros);
                    break;
                case 3:
                    retirarLivro(livros);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void exibirMenu() {
        System.out.println("********* Menu ************************");
        System.out.println("1: Adicionar um novo livro");
        System.out.println("2: Listar todos os livros");
        System.out.println("3: Retirar um livro");
        System.out.println("0: Sair do programa");
        System.out.println("***************************************");
        System.out.println("Digite a opção desejada:");
    }

    public static void adicionarLivro(Stack<String> pilhaLivros, String nomeLivro) {
        pilhaLivros.push(nomeLivro);
        System.out.println("Livro adicionado à pilha.");
    }

    public static void listarLivros(Stack<String> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Livros na pilha:");
            for (String livro : pilhaLivros) {
                System.out.println(livro);
            }
        }
    }

    public static void retirarLivro(Stack<String> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha está vazia. Não é possível retirar um livro.");
        } else {
            String livroRetirado = pilhaLivros.pop();
            System.out.println("Livro " + livroRetirado + " retirado da pilha.");
        }
    }

	}


