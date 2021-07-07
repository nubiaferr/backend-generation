package ObjetosLista5;

public class Aviao2 {

		public int rodas;
		public String modelo, tipo;
		public boolean noAr;
		public int velocidade;
		public boolean ligado;


		public void ligar() {
			ligado = true;
		}
		public void desligar() {
			ligado = false;
		}

		public void decolando() {
			for (int x=1; x<=10; x++) {
				aumentarVelocidade();
			}

			noAr=true;

		}

		public void pousar() {
			for (int x=1; x<=10; x++) {
				diminuirVelocidade();
			}
			noAr=false;

		}

		public void aumentarVelocidade() {
			velocidade++;
		}

		public void aumentarVelocidade(int acrescimo) {
			velocidade = velocidade + acrescimo;
		}

		public void diminuirVelocidade() {
			velocidade--;
		}

		public void diminuirVelocidade(int decrescimo) {
			velocidade-= decrescimo;
		}

	}

