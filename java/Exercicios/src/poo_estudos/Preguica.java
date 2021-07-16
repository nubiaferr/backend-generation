package poo_estudos;

public class Preguica extends Animal {
	private boolean suboEmArvore;

	public Preguica(String nome, int idade, boolean emiteSom, boolean suboEmArvore) {
		super(nome, idade, emiteSom);
		this.suboEmArvore = suboEmArvore;
	}

	public boolean isSuboEmArvore() {
		return suboEmArvore;
	}

	public void setSuboEmArvore(boolean suboEmArvore) {
		this.suboEmArvore = suboEmArvore;
	}
	

	public String subirNaArvore() {
		suboEmArvore = true;
		String subida = "*subindooooOOoo*";
		return subida;
	}
	
	@Override
	public String emitirSom() {
		String som = "*???? sei la*";
		return som;
	}
}
