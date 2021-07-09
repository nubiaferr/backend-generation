package entities;

public class Empresarial extends Account {
	public double limiteEmprestimo;

	public Empresarial(int numero, String nome, double limiteEmprestimo) {
		super(numero, nome);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void usarLimite (double valor) {
		super.credito(valor);
		this.limiteEmprestimo = limiteEmprestimo - valor;
	}
	
}
