package ProgramasLista5;

import ObjetosLista5.Conta;

public class ContaPrograma {

	public static void main(String[] args) {
		
		Conta cliente1 = new Conta(1, 100.60, 1000.00);//conta instanciada com construtora
		
		System.out.println(cliente1.getNumero()); //s� assim pra exibir o n�mero 
		
		cliente1.setNumero(8); //assim da pra mudar o dado, mas posso deletar esse m�todo
		
		System.out.println(cliente1.getNumero()); //s� assim pra exibir o n�mero 
		
		cliente1.imprimeExtrato();
		
		cliente1.sacar(200.00);
		
		cliente1.imprimeExtrato();
		
		cliente1.sacar(20.00);
		
		cliente1.imprimeExtrato();
		
		cliente1.sacar(-100);
		
		cliente1.imprimeExtrato();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
