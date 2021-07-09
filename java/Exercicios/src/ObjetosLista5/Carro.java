package ObjetosLista5;

public class Carro {
	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	
	public void liga() {
		System.out.println("O carro está ligando...");
	}
	
	public void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	public int pegaMarcha() {
		if (this.velocidadeAtual < 0) {
			return -1;
		} else if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		} else if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		} else {
			return 3;
		}
	}
	
	}
