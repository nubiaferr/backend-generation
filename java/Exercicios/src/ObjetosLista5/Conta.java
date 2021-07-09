package ObjetosLista5;

public class Conta {
	//Dados protegidos
	private int numero;
	private double saldo;
	private double limite;
	

	
	
	public Conta(int numero, double saldo, double limite) { //método construtor - regra do jogo
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}

	
	//encapsulamento - Getters and Setters

	public int getNumero() {
		return numero;
	} //mostra numero


	public void setNumero(int numero) {
		this.numero = numero;
	} //altera numero - posso deletar pra ninguem mexer




	public double getSaldo() {
		return saldo;
	}




	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}




	public double getLimite() {
		return limite;
	}




	public void setLimite(double limite) {
		this.limite = limite;
	}



	//metodos proprios

	public void sacar(double valorSaque) {
		if (valorSaque > saldo) {
			System.out.println("Saldo inválido");
		} else if (valorSaque <= 0) {
			System.out.println("Valor digitado inválido.");
		} else {
			saldo-=valorSaque;
			System.out.println("Saque realizado.");
		}
		
	}
	
	public void depositar(double valorDeposito) {
		saldo+=valorDeposito;
	}
	
	public void imprimeExtrato() {
		System.out.println("Conta "+this.numero+" - Saldo Atual: R$"+this.saldo);
	}
	
}
