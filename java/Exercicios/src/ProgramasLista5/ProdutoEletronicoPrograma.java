package ProgramasLista5;

import java.util.Scanner;

import ObjetosLista5.ProdutoEletronico;

public class ProdutoEletronicoPrograma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		celular.nomeDoProduto = "Iphone";
		celular.marca = "Apple";
		celular.geracao = "10";
		
		celular.ligar();
		System.out.printf("Seu %s está ligado \n", celular.nomeDoProduto);
		System.out.println("Vamos ouvir musica...");
		celular.musica();
		celular.musica();
		celular.musica();
		celular.musica();
		celular.musica();
		celular.musica();
		celular.musica();
		celular.musica();
		System.out.println("Status da bateria: "+celular.bateria+"%");
		
		if (celular.bateria >= 30) {
			System.out.println("Bateria ainda tá ok");
		} else if (celular.bateria >= 10 && celular.bateria < 30) {
			System.out.println("Bateria em modo ECONOMIA");
		} else {
			System.out.println("Desligando a qualquer momento...");
		}
		
		if (celular.bateria == 0) {
			celular.desligar();
			System.out.println("Desligou. Carregue imediatamente.");
		}
	
	
	

		//System.out.println(celular.bateria);
		
		

	}

}
