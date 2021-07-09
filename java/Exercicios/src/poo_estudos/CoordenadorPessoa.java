package poo_estudos;

public class CoordenadorPessoa extends Pessoa {
	private String cursoCoordenado;

	public CoordenadorPessoa(String nome, int matricula, String cursoCoordenado) {
		super(nome, matricula);
		this.cursoCoordenado = cursoCoordenado;
	}

	public String getCursoCoordenado() {
		return cursoCoordenado;
	}

	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}
	
	
}
