package ProgramasLista5;

import java.util.Scanner;

import ObjetosLista5.Cliente;

public class ClientePrograma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		System.out.println("Olá, insira seu nome: ");
		cliente1.nomeCompleto = leia.next();
		
		System.out.println("Insira seu cadastro: ");
		cliente1.cadastro = leia.next();
		
		System.out.println("Insira seu aniversário (DD/MM): ");
		cliente1.aniversario = leia.next();
		
		System.out.print(cliente1.saudacao(cliente1.nomeCompleto, cliente1.cadastro));
		//System.out.println(cliente1.promocao(cliente1.aniversario));
		

	}

}
