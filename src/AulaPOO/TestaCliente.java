package AulaPOO;

public class TestaCliente {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Israel", "raelzin99@gmail.com", "Rua Doutor diogo, 1201", "123456789", 89, true);
		Cliente cliente2 = new Cliente("Pokemon","charizardpoke@hotmail.com", "Rua pokelandia, 1222", "987654321", 93, false);

		
		System.out.println("Informações cadastradas do Primeiro Cliente:");
		cliente1.visualizar();

		System.out.println();

		System.out.println("Informações cadastradas do Segundo Cliente:");
		cliente2.visualizar();
	}
}
