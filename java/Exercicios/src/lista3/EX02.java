package lista3;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num, totPar = 0, totImpar = 0, totInvalido = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Insira um número: ");
			num = leia.nextInt();
			
			if (num > 0) {
				if (num%2==0) {
					totPar++;
				} else {
					totImpar++;
				}
			} else {
				System.out.println("Número inválido.");
				totInvalido++;
			}
		}
		
		System.out.println("Total de números pares: "+totPar);
		System.out.println("Total de números ímpares: "+totImpar);
		System.out.println("Total de números inválidos: "+totInvalido);

	}

}
