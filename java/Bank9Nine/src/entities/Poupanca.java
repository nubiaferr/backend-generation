package entities;

public class Poupanca extends Account{ //herda as coisas da conta mae (Account)
	
	private int diaAniversario;

	public Poupanca(int numero, String nome, int diaAniversario) {
		super(numero, nome);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	
	
	
	
}
