package TestandoJUnit;

public class Soma {
	public int valor1;
	public int valor2;
	public int resultado;
	
	
	public int somar(int valor1, int valor2) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		resultado = this.valor1 + this.valor2;
		
		return resultado;
		
		
	}
	
}
