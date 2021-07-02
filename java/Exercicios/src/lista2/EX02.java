package lista2;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		if (a>=b && b>=c && a>=c) {
			System.out.println("Ordem: "+c+", "+b+", "+a);
		} else if (a>=c && c>=b && a>=b) {
			System.out.println("Ordem: "+b+", "+c+", "+a);
		} else if (b>=a && a>=c && b>=c) {
			System.out.println("Ordem: "+c+", "+a+", "+b);
		} else if (b>=a && c>=a && b>=c){
			System.out.println("Ordem: "+a+", "+c+", "+b);
		} else if (c>=a && b>=a && c>=b) {
			System.out.println("Ordem: "+a+", "+b+", "+c);
		} else if (c>=a && a>=b && c>=a) {
			System.out.println("Ordem: "+b+", "+a+", "+c);
		} else {
			System.out.println("Todos são iguais.");
		}
		

	}

}
