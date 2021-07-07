package introducao;

import java.util.Scanner;

public class IntroPOO {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		char genero;
		int ano, maisVelho = 0, maisNovo = 0, aux = 0;
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("Insira seu nome: ");
			nome = leia.next();
			leia.nextLine();
			
			System.out.println("Qual o seu gênero?");
			System.out.println("M - Masculino, F - Feminino, N - Neutro");
			genero = leia.next().toUpperCase().charAt(0);
			leia.nextLine();
			
			System.out.println("Insira seu ano de nascimento: ");
			ano = leia.nextInt();
			leia.nextLine();
			
			if ((2021-ano) > maisVelho) {
				maisVelho = (2021-ano);
				aux = maisVelho;
			} else if ((2021-ano) < aux) {
				maisNovo = (2021-ano);
			} else {
				System.out.println(" ");
			}
			
			System.out.println("Olá, sr/sra/sre ["+nome+"], bom dia! Sua idade é "+(2021-ano)+" anos.");
			leia.nextLine();
		}
		
		System.out.println("A maior idade é "+maisVelho);
		System.out.println("A menor idade é "+maisNovo);
		
		
		
			
		

	}

}
