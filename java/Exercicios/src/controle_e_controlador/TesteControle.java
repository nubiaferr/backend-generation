package controle_e_controlador;

public class TesteControle {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.maisVolume();
		c.maisVolume();
		c.maisVolume();
		c.maisVolume();
		c.abrirMenu();
		c.ligarMudo();
		c.pause();
		c.desligar();
		c.abrirMenu();
		c.maisVolume();
		c.ligar();
		c.desligarMudo();
		c.abrirMenu();
		c.fecharMenu();
		
	}

}
