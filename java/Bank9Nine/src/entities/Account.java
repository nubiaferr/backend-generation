package entities;

public class Account {
		
		//atributos
		private int numero;
		private String nome;
		private double saldo;
		
		//construtor
		public Account(int numero, String nome) {
			super();
			this.numero = numero;
			this.nome = nome;
		}
		
		//encapsulamento
		public int getNumero() {
			return numero;
		}

		/*public void setNumero(int numero) {
			this.numero = numero;
		}*/ //proteçao total = sem set no numero

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		//metodos
		
		public void credito(double valorCredito) {
			this.saldo = this.saldo + valorCredito;
		}
		
		public void debito(double valorDebito) {
			if (valorDebito <= 0) {
				System.out.println("Valor inserido inválido.");
			} else if (valorDebito > saldo) {
				System.out.println("Valor indisponível.");
			} else {
				this.saldo = this.saldo - valorDebito;
				System.out.println("Valor debitado: R$ "+valorDebito);
				System.out.println("Novo saldo: R$ "+this.saldo);
			}
			
		}
		
		
		
		
		
	
		
		


}
