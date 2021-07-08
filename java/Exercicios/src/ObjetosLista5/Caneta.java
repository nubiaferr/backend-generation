package ObjetosLista5;

public class Caneta {
	public String cor;
	public String modelo;
	public double ponta;
	public int carga;
	public boolean tampada;
	
	public void status() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Uma caneta "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Tampada? "+this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro, caneta tampada!");
		} else {
			System.out.println("Rabiscando...");
		}
		
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
}
