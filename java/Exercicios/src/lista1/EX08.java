package lista1;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int custo, custoFabrica;
		
		System.out.println("Qual � o custo de f�brica do ve�culo? ");
		custoFabrica = leia.nextInt();
		
		custo = custoFabrica + ((custoFabrica*28)/100) + ((custoFabrica*45)/100);
		
		System.out.println("O custo para o consumidor ser� de " + custo + " R$");

	}

}
