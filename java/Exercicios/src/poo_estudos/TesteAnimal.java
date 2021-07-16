package poo_estudos;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro("Doguinho", 2, true, true);
		Animal cavalo = new Cavalo("Pocotóti", 5, true, true);
		Animal preguica = new Preguica("Piguiça", 1, true, true);
		
		System.out.println("Oi! Eu sou o "+cachorro.getNome()+" e eu faço "+cachorro.emitirSom());
		System.out.println("Oi! Eu sou o "+cavalo.getNome()+" e eu faço "+cavalo.emitirSom());
		System.out.println("Oi! Eu sou o "+preguica.getNome()+" e eu faço "+preguica.emitirSom());
		
	}

}
