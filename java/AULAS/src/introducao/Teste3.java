package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Teste3 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);//classe que determina os padr�es locais
		
		Scanner leia = new Scanner(System.in);//criei um leia no Java importando uma biblioteca
		
		int anoNascimento;
		double salario;
		String nome;//String � classe, n�o tipo, ent�o tem m�todos pr�prios 
		
		System.out.println("Digite o nome: ");
		nome = leia.next(); //pedi o m�todo next para string
		
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt(); //next int para inteiros
		
		System.out.println("Digite o sal�rio: ");
		salario = leia.nextDouble(); //next double 
		
		System.out.printf("Ol�, %s! Sua idade � %d anos e seu sal�rio � R$ %.2f!", nome, (2021-anoNascimento), salario);
	}

}
