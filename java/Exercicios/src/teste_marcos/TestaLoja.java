package teste_marcos;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaLoja {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		ArrayList<Loja> produtos = new ArrayList<>();

		System.out.println("Quantos produtos você quer add: ");
		int numProd = ler.nextInt();
		int i;

		for (i = 0; i < numProd; i++) {
			System.out.println("Nome do Produto: ");
			String nomeProd = ler.next(); //so mudei pra next e manti a linha de baixo
			ler.nextLine();
			//me deve 10 conto
			System.out.println("Valor do Produto: ");
			double valorProd = ler.nextDouble();
			

			produtos.add(new Loja(nomeProd, valorProd));

		}
		//Object u;
		for (Loja u : produtos) {
			System.out.println(u);
		}

		int resposta;
		do {
			System.out.println();
			System.out.println("Deseja remover um item? \n 1-Sim | 2-Não");
			resposta = ler.nextInt();
			if (resposta == 1) {
				System.out.println();
				System.out.println("Selecione o indice do produto: ");
				i = ler.nextInt();
				produtos.get(i);
				produtos.remove(i - 1);
				for (i = 0; i < produtos.size(); i++) {
					System.out.println(produtos.get(i));
				}
			}

		} while (resposta == 1);
		System.out.println("Programa finalizado");


	}

}
