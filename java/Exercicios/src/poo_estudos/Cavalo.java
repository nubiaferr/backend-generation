package poo_estudos;

public class Cavalo extends Animal{
	private boolean correr;

	public Cavalo(String nome, int idade, boolean emiteSom, boolean correr) {
		super(nome, idade, emiteSom);
		this.correr = correr;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	public String correr() {
		correr = true;
		String corrida = "*galopandooooo*";
		return corrida;
	}
	
	@Override
	public String emitirSom() {
		String som = "*hheeheeeheheh*";
		return som;
	}

}
