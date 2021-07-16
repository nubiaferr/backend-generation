package teste_marcos;

public class Loja {
	private String nomeProd;
	private double valorProd;
	
	public Loja(String nomeProd, double valorProd) {
		super();
		this.nomeProd = nomeProd;
		this.valorProd = valorProd;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public double getValorProd() {
		return valorProd;
	}
	public void setValorProd(double valorProd) {
		this.valorProd = valorProd;
	}
	public String toString() {
		return "[Nome do produto: " + this.nomeProd+" - Valor: R$" + this.valorProd+"]";
	}
}
