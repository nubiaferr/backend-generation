package lista2;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c, maior = 0;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		if (a>b && a>c) {
			maior = a;
		} else if (b>a && b>c) {
			maior = b;	
		} else if (c>a && c>b) {
			maior = c;
		} else {
			System.out.println("Não há número maior.");
		}
		
		System.out.println("O maior número é "+maior);
		
		
		
	}

}
