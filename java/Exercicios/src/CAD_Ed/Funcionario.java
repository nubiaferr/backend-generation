package CAD_Ed;

public class Funcionario {
	private String matricula;
	private int horasTrabalhadas;
	private double valorHora;
	
	
	public Funcionario(String matricula, int horasTrabalhadas, double valorHora) {
		super();
		this.matricula = "CADED-0-"+matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	
	//sobrecarga (override)
	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double salario () {
		return this.horasTrabalhadas*this.valorHora;
	}
	
	
	
	
	
}
