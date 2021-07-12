package banco_guanabara;

public class TesteConta {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		p1.depositar(100);
		p1.sacar(150);
		p1.fecharConta();
		p1.estadoAtual();
		
		ContaBanco p2 = new ContaBanco();
		System.out.println(" ");
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.sacar(100);
		p2.estadoAtual();
		
	}

}
