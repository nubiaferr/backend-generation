package poo_estudos;

public class MetodoSobrecarregado {

	public void testaOverride() {
		System.out.printf("Salário em número inteiro: %d \n", salario(1000)); //metodo no lugar de atributo
		System.out.printf("Salário em número inteiro: %f \n", salario(7.500));
	}
	
	public int salario(int valorInt) { //retorna int
		System.out.printf("Salário com argumento inteiro: %d \n", valorInt);
		return valorInt*valorInt;
	}
	
	public double salario(double valorDouble) { //mesmo nome, retorna double
		System.out.printf("Salário com argumento double: %f \n", valorDouble);
		return valorDouble*valorDouble;
	}
	
}
