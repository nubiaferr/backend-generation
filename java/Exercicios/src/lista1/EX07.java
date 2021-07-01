package lista1;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, e, f;
		double x,y;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de c: ");
		c = leia.nextInt();
		
		System.out.println("Digite o valor de d: ");
		d = leia.nextInt();
		
		System.out.println("Digite o valor de e: ");
		e = leia.nextInt();
		
		System.out.println("Digite o valor de f: ");
		f = leia.nextInt();
		
		x = (((c*e)-(b*f))/((a*e)-(b*d)));
		y = (((a*f)-(c*d))/((a*e)-(b*d)));
		
		System.out.println("O valor de X é " + x + " e de Y é " + y);
		
		
		
		
		
		

	}

}
