package ObjetosLista5;

public class Cliente {

	public String nomeCompleto;
	public String aniversario;
	public String cadastro;
	public boolean desconto;
	
	public boolean promocao(String aniversario) {
		
		if (aniversario.equals("17/07")) {
			desconto = true;
			System.out.println("PARAB�NS! Temos um desconto dispon�vel para voc� hoje.");
		} else {
			desconto = false;
			System.out.println("Tenha um �timo dia!");
			
		}
		return desconto;
	}
	
	public String saudacao(String nomeCompleto, String cadastro) {
		String saudacao = "ol�, "+nomeCompleto+"! Seu cadastro � "+cadastro;
		return saudacao;
	}
}
