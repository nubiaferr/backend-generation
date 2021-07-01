package lista1;

import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		int num, horas, minutos, segundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Diga um número e vamos converter para horas, minutos e segundos: ");
		num = leia.nextInt();
		
		horas = (num/60); 
		minutos = (num % 60);
		segundos = (num % 60) % 60;
		
		System.out.println("Isso totaliza " + horas + " horas, " + minutos + " minutos, e " + segundos + " segundos.");
		
	}
}
