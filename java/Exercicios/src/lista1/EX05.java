package lista1;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, media;
		
		System.out.println("Cálculo de média de notas");
		
		System.out.println("Digite a nota 1: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		n3 = leia.nextDouble();
		
		media = ((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.println("Sua média é de " + media);

	}

}
