package relacionamentoClasses_guanabara;

import java.util.Random;

public class Luta {
	private Luatdor desafiado; //dado = instancia de classe - relacionei as classes
	private Luatdor desafiante;//agregação - tipo "tem um"
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Luatdor l1, Luatdor l2) { //retorna tipo abstrato
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); //instanciando um numero random
			
			switch (vencedor) {
			case 0:
				System.out.println(" ");
				System.out.println("EMPATOU!");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				break;
			case 1:
				System.out.println(" ");
				System.out.println("VIITÓRIA DE "+this.desafiado.getNome()+" !!!!");
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				break;
			case 2:
				System.out.println(" ");
				System.out.println("VIITÓRIA DE "+this.desafiante.getNome()+" !!!!");
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
				break;
			}
			
		}
	}

	public Luatdor getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Luatdor desafiado) {
		this.desafiado = desafiado;
	}

	public Luatdor getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Luatdor desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
