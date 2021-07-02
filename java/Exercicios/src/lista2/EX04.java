package lista2;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int par, impar;
		int num;
		
		System.out.println("Insira um número: ");
		num = leia.nextInt();
		
		if(num%2 == 0) {
			par = (int) Math.sqrt(num);
			System.out.println(num+" É PAR E SUA RAÍZ QUADRADA É "+par);
			
		} else {
			impar = (int) Math.pow(num,2);
			System.out.println(num+" É ÍMPAR E ELEVADO AO QUADRADO É "+impar);
		}  

	}

}
