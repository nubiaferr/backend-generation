package poo_estudos;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro("Doguinho", 2, true, true);
		Animal cavalo = new Cavalo("Pocot�ti", 5, true, true);
		Animal preguica = new Preguica("Pigui�a", 1, true, true);
		
		System.out.println("Oi! Eu sou o "+cachorro.getNome()+" e eu fa�o au au! "+cachorro.emitirSom());
		System.out.println("Oi! Eu sou o "+cavalo.getNome()+" e eu fa�o hehehrrrr! "+cavalo.emitirSom());
		System.out.println("Oi! Eu sou o "+preguica.getNome()+" e eu fa�o ??? sei la que barulho! "+cachorro.emitirSom());
		
	}

}
