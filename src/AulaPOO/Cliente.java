package AulaPOO;


public class Cliente {
	private String nome;
	private String email;
	private String logradouro;
	private String telefone;
	private int idade;
	private boolean ativo;

	
	public Cliente(String nome,String email, String logradouro, String telefone, int idade, boolean ativo) {
		this.nome = nome;
		this.email = email;
		this.logradouro = logradouro;
		this.telefone = telefone;
		this.idade = idade;
		this.ativo = ativo;
	}

	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String setEmail(String email) {
		return email;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return logradouro;
	}

	public void setEndereco(String endereco) {
		this.logradouro = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Endereço: " + logradouro);
		System.out.println("Telefone: " + telefone);
		System.out.println("Idade: " + idade);
		System.out.println("Ativo: " + ativo);
	}
}
