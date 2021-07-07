package Programa;

import java.util.Scanner;

import Objeto1.Pessoa;

public class CadFriends {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Pessoa amigo1 = new Pessoa(); //instanciei o objeto importando
		Pessoa amigo2 = new Pessoa();
		Pessoa amigo3 = new Pessoa();
		
		System.out.println("Digite o nome: ");
		amigo1.nome = leia.next().toUpperCase();
		
				
		System.out.println("Digite o ano de nascimento: ");
		amigo1.anoNascimento = leia.nextInt();
		
				
		System.out.println("Digite o nome 2: ");
		amigo2.nome = leia.next().toUpperCase();
		amigo2.anoNascimento = 2012;
		
		System.out.printf("Meus amigos são %s e %s", amigo1.nome, amigo2.nome);
		
		if((amigo1.calculaIdade(2021))>(amigo2.calculaIdade(2021))) {
			System.out.printf("\n%s é mais velha que %s\n", amigo1.nome, amigo2.nome);
			amigo1.mostrarIdade();//chamei um método
		} else if ((amigo1.calculaIdade(2021))<(amigo2.calculaIdade(2021))) {
			System.out.printf("\n%s é mais velho que %s\n", amigo2.nome, amigo1.nome);
			amigo2.mostrarIdade();
		} else {
			System.out.printf("\n%s tem a mesma idade que %s", amigo1.nome, amigo2.nome);
		}
		
		
	}

}
