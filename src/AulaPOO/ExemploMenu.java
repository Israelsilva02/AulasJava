package AulaPOO;

import conta.model.Conta;

public class ExemploMenu {

	public static void main(String[] args) {
		
			Conta c1 = new Conta(123456, 123, 1, "Maria dos Santos", 2500.0f);
    	c1.visualiza();
    
    	Conta c2 = new Conta(123456, 123, 1, "João da Silva", 2000.0f);
    	c2.visualiza();
    
    	c1.setSaldo(100000.0f);
    	c1.setTitular("Maria Joaquina");
    	c1.visualiza();

	}

}