package CAD_Ed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste2List {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
		List <Funcionario> lista = new ArrayList<>(); //lista do tipo funcionario
		int numero;
		
		System.out.println("CADASTRO DE FUNCIONARIOS");
		System.out.println("Quantos funcionários deseja cadastrar? ");
		numero = leia.nextInt();
		
		for (int x = 1; x <=numero; x++) {
			System.out.println("Terceirizado? S/N");
			char op = leia.next().charAt(0);
			System.out.println("Matricula? ");
			String matricula = leia.next();
			System.out.println("Horas trabalhadas? ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Valor por horas trabalhadas? ");
			double valorHora = leia.nextDouble();
			
			if (op == 'S') {
				System.out.println("Valor do adicional: R$ ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(matricula, horasTrabalhadas, valorHora, adicional));
			} else if (op == 'N') {
				lista.add(new Funcionario(matricula, horasTrabalhadas, valorHora));
			} else {
				System.out.println("Resposta inválida");
			}
		}
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		for (Funcionario emp:lista) {
			System.out.println("Matrícula do colaborador: "+emp.getMatricula());
			System.out.println("Salário: R$ "+emp.salario());
		}
		

	}

}
