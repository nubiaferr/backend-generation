package ObjetosLista5;

public class ProdutoEletronico {
	public String nomeDoProduto;
	public String geracao;
	public String marca;
	public int bateria = 25;
	public boolean ligado;
	public boolean carregarNaTomada;
	public boolean tirarFoto;
	public boolean ouvirMusica;
	
	public boolean ligar() {
		if (bateria > 10) {
			ligado = true;
		} else {
			ligado = false;
		}
		
		return ligado;
	}

	public boolean desligar() {
		if (bateria < 10) {
			ligado = false;
		} else {
			ligado = true;
		}
		
		return ligado;
	}
	
	public int recarregar() {
		carregarNaTomada = true;
		if (bateria < 100) {
			bateria++;
		}
		return bateria;
	}
	
	
	public boolean fotografar() {
		while (ligado = true) {
			tirarFoto = true;
			bateria--;
		}
		return tirarFoto;
	}
	
	public boolean musica() {
		while (ligado = true) {
			ouvirMusica = true;
			bateria--;
		}
		return ouvirMusica;
	}
}
