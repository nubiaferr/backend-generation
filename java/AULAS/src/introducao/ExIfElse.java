package introducao;

import java.util.Scanner;

public class ExIfElse {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um n�mero: ");
		num = leia.nextInt();
		
		if (num > 0) {
			if(num%2 == 0) {
				System.out.println(num+" � PAR");
			} else {
				System.out.println(num+" � �MPAR");
			}
		} else if (num == 0) {
			System.out.println(num+" � NEUTRO");
		} else {
			System.out.println(num+" � INV�LIDO");
		}
	}
 
}
