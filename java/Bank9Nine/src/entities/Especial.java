package entities;

public class Especial extends Account {
	
	public double limite;

	public Especial(int numero, String nome, double limite) {
		super(numero, nome);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void usarLimite (double valor) {
		super.credito(valor);
		this.limite = limite - valor;
		
	}
}
