package lista3;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, tot21=0, tot50=0;
		
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		while (idade != -99 && idade > 0) {
			if (idade < 21) {
				tot21++;
				System.out.println("Insira sua idade: ");
				idade = leia.nextInt();
			} else if (idade > 50) {
				tot50++;
				System.out.println("Insira sua idade: ");
				idade = leia.nextInt();
			} else {
				System.out.println("Insira sua idade: ");
				idade = leia.nextInt();
			}
		}
			
			System.out.println("Total de pessoas com menos de 21 anos: "+tot21);
			System.out.println("Total de pessoas com mais de 50 anos: "+tot50);
	
}
}