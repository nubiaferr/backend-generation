package banco_guanabara;

public class TesteBanco {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco ();
		p1.setTipo("CC");
		p1.setDono("João");
		p1.setNumConta(1111);
		p1.abrirConta("CC");
		p1.estadoAtual();
		
		p1.depositar(150);
		p1.fecharConta();
		p1.sacar(200);
		p1.fecharConta();
		
		p1.estadoAtual();
		
	}

}
