package Objeto1;

public class Carro {
	//ATRIBUTOS
	public String nomeModelo;
	public int anoDoModelo;
	public String cor;
	public String motor;
	public boolean ligado;
	public int velocidade;
	
	//METODOS - transformar ações em métodos
	public void ligarCarro() {
		ligado = true;
		System.out.println("brrrrrr carro ligado");
	}
	
	public void desligarCarro() {
		if (velocidade == 0) {
			ligado = false;
		System.out.println("fuennnn desligou o carro");
		} else {
			System.out.println("desacelera fi");
		}
			}
	
	public void acelerar() {
		velocidade++;
		System.out.println("acelerouuuuuuuuu");
	}
	
	public void desacelerar() {
		velocidade--;
		System.out.println("desac e l e r o u");
	}
}
