package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Teste3 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);//classe que determina os padrões locais
		
		Scanner leia = new Scanner(System.in);//criei um leia no Java importando uma biblioteca
		
		int anoNascimento;
		double salario;
		String nome;//String é classe, não tipo, então tem métodos próprios 
		
		System.out.println("Digite o nome: ");
		nome = leia.next(); //pedi o método next para string
		
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt(); //next int para inteiros
		
		System.out.println("Digite o salário: ");
		salario = leia.nextDouble(); //next double 
		
		System.out.printf("Olá, %s! Sua idade é %d anos e seu salário é R$ %.2f!", nome, (2021-anoNascimento), salario);
	}

}
