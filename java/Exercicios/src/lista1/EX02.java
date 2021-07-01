package lista1;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		int num, anos, meses, dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Diga um número e vamos converter para anos, meses e dias: ");
		num = leia.nextInt();
		
		anos = (num/365);
		meses = (num % 365)/30;
		dias = (num % 365) % 30;
		
		System.out.println("Isso totaliza " + anos + " anos, " + meses + " meses, e " + dias + " dias.");

	}

}
