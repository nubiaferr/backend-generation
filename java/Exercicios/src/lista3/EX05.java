package lista3;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Insira um n�mero: ");
			num = leia.nextInt();
			soma+=num;
			
		} while(num != 0);
		
		System.out.println("Soma de n�meros digitados at� o n�mero 0: "+soma);

	}

}
