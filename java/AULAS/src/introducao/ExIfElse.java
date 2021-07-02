package introducao;

import java.util.Scanner;

public class ExIfElse {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um número: ");
		num = leia.nextInt();
		
		if (num > 0) {
			if(num%2 == 0) {
				System.out.println(num+" É PAR");
			} else {
				System.out.println(num+" É ÍMPAR");
			}
		} else if (num == 0) {
			System.out.println(num+" É NEUTRO");
		} else {
			System.out.println(num+" É INVÁLIDO");
		}
	}
 
}
