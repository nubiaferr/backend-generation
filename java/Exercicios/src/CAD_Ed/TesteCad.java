package CAD_Ed;

public class TesteCad {

	public static void main(String[] args) {
	
		
		Funcionario func1 = new Funcionario("AE342", 40, 20.50);
		Terceiro ter1 = new Terceiro("EI9867", 80, 15.00, 100.20);
		
		
		System.out.println("FUNCION�RIO CLT");
		System.out.println("Funcion�rio: "+func1.getMatricula());
		System.out.println("Sal�rio atual: R$ "+func1.salario());
		
		System.out.println("FUNCION�RIO TERCEIRO");
		System.out.println("Funcion�rio: "+ter1.getMatricula());
		System.out.println("Sal�rio atual: R$ "+ter1.salario());
		
	
		

	}

}
