package CAD_Ed;

public class Terceiro extends Funcionario {
	private double adicional;

	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	//sobreescrevi o metodo salario e importei os atributos com super.get
	//se eu mudar os atibutos pra protected, não preciso do super
	//Override só acontece de mae pra filha, do contrario é sobrecarga de metodo
	//Override acontece independente do atributo ser private ou protected
	@Override
	public double salario () {
		return (super.getHorasTrabalhadas()*super.getValorHora())+this.adicional;
	}
	
	
	
	
}
