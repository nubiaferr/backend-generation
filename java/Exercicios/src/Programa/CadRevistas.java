package Programa;

import java.util.Scanner;

import Objeto1.Pessoa;

public class CadRevistas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Pessoa cliente1 = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		cliente1.nome = leia.next();
		
		System.out.println("Digite seu ano de nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		
		if(cliente1.calculaIdade(2021) >= 18) {
			System.out.println("Venda aprovada");
		} else {
			System.out.println("Venda restrita");
		}

	}

}
