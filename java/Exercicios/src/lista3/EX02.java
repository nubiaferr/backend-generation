package lista3;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, totPar = 0, totImpar = 0, totInvalido = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Insira um n�mero: ");
			num = leia.nextInt();
			
			if (num > 0) {
				if (num%2==0) {
					totPar++;
				} else {
					totImpar++;
				}
			} else {
				System.out.println("N�mero inv�lido.");
				totInvalido++;
			}
		}
		
		System.out.println("Total de n�meros pares: "+totPar);
		System.out.println("Total de n�meros �mpares: "+totImpar);
		System.out.println("Total de n�meros inv�lidos: "+totInvalido);

	}

}
