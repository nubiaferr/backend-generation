package ObjetosLista5;

public class Aviao {
	public int numeroVoo;
	public String companhia;
	public String horaDeVoo;
	public boolean atrasado;
	
	public boolean getAtraso(String horaDeVoo) {
		if (horaDeVoo.equals("18h00")) {
			atrasado = false;
		} else {
			atrasado = true;
		}
		return atrasado;
	}
	
	public String infoVoo(String companhia, int numeroVoo, String horaDeVoo) {
		String info = "Voo "+numeroVoo+" | "+companhia+" | Agendado para "+horaDeVoo+" | STATUS DE ATRASO: "+getAtraso(horaDeVoo);
		return info;
	}
}
