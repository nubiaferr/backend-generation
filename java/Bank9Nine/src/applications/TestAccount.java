package applications;

import java.util.Scanner;

import entities.Account;
import entities.Especial;
import entities.Poupanca;

public class TestAccount {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valor;
		String nome;
		int numero;
		/*	
		
		System.out.println("Digite o nome do cliente: ");
		nome = leia.next();

		System.out.println("Digite o número da conta: ");
		numero = leia.nextInt();
		
		Account cli1 = new Account(numero, nome);
		
		System.out.println("Cliente: "+cli1.getNome());
		System.out.println("Conta: "+cli1.getNumero());
		
		System.out.println("Digite o valor do crédito: ");
		valor = leia.nextDouble();
		cli1.credito(valor);
		System.out.println("Saldo atual: R$ "+cli1.getSaldo());
		
		System.out.println("Digite o valor do débito: ");
		valor = leia.nextDouble();
		cli1.debito(valor);
		System.out.println("Saldo atual: R$ "+cli1.getSaldo());
		
		
		//
		
		Poupanca cp1 = new Poupanca(5, "Marcos", 15);
		
		System.out.println("Cliente: "+cp1.getNome());
		System.out.println("Conta: "+cp1.getNumero());
		
		System.out.println("Digite o valor do crédito: ");
		valor = leia.nextDouble();
		cp1.credito(valor);
		System.out.println("Saldo atual: R$ "+cp1.getSaldo());
		
		System.out.println("Digite o valor do débito: ");
		valor = leia.nextDouble();
		cp1.debito(valor);
		System.out.println("Saldo atual: R$ "+cp1.getSaldo());
		
		//
		 * */
		 
		
		Especial ce1 = new Especial(18, "Maria", 1000.00);
		ce1.getNome();
		System.out.println("Saldo atual: R$ "+ce1.getSaldo());
		System.out.println("Digite o valor do débito: ");
		valor = leia.nextDouble();
		
		//ce1.debito(valor);
		 if (ce1.getSaldo()+ce1.getLimite() < valor) {
			System.out.println("Valor indisponível.");
			System.out.println("Saldo atual: R$ "+ce1.getSaldo());
			System.out.println("Limite disponível: R$ "+ce1.getLimite());
		} else if (ce1.getSaldo() < valor) {
				double diferenca = valor - ce1.getSaldo();
				ce1.usarLimite(diferenca);
				System.out.println("Saldo atual: R$ "+ce1.getSaldo());
				System.out.println("Limite disponível: R$ "+ce1.getLimite());
		} else {
			ce1.debito(valor);
		}
		
	}

}
