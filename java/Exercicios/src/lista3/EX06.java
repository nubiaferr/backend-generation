package lista3;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0, c = -1, media;
		
		do {
			System.out.println("Insira um n�mero: ");
			num = leia.nextInt();
			
			if (num%3==0) {
				soma+=num;
				c++;
				System.out.println("� multiplo de 3");
			}
						
		} while(num != 0);
		
		media = soma/c;
		System.out.println("Total de n�meros multiplos de 3: "+c);
		System.out.println("Soma de todos os m�ltiplos de 3: "+soma);
		System.out.println("M�dia da soma dos n�meros multiplos de 3: "+media);

	}

}
