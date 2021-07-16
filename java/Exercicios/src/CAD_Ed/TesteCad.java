package CAD_Ed;

public class TesteCad {

	public static void main(String[] args) {
	
		
		Funcionario func1 = new Funcionario("AE342", 40, 20.50);
		Terceiro ter1 = new Terceiro("EI9867", 80, 15.00, 100.20);
		
		
		System.out.println("FUNCIONÁRIO CLT");
		System.out.println("Funcionário: "+func1.getMatricula());
		System.out.println("Salário atual: R$ "+func1.salario());
		
		System.out.println("FUNCIONÁRIO TERCEIRO");
		System.out.println("Funcionário: "+ter1.getMatricula());
		System.out.println("Salário atual: R$ "+ter1.salario());
		
	
		

	}

}
