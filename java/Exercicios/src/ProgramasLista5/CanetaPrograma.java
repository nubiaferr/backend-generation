package ProgramasLista5;

import ObjetosLista5.Caneta;

public class CanetaPrograma {

	public static void main(String[] args) {
		Caneta c1 = new Caneta ();
		c1.modelo = "Esfereográfica";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		
		c1.tampar();		
		//c1.destampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Hidrográfica";
		c2.cor = "Preta";
				
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}

}
