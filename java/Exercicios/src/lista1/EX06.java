package lista1;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		double d;
		
		System.out.println("Digite X1: ");
		x1 = leia.nextInt();

		System.out.println("Digite X2: ");
		x2 = leia.nextInt();
		
		System.out.println("Digite Y1: ");
		y1 = leia.nextInt();
		
		System.out.println("Digite Y2: ");
		y2 = leia.nextInt();
		
		d = Math.sqrt(((Math.pow((x2-x1), 2))+(Math.pow((x2-x1), 2))));
		
		System.out.printf("\nO valor de d é %.2f", d);
	}

}
