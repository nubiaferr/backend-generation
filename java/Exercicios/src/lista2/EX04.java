package lista2;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int par, impar;
		int num;
		
		System.out.println("Insira um n�mero: ");
		num = leia.nextInt();
		
		if(num%2 == 0) {
			par = (int) Math.sqrt(num);
			System.out.println(num+" � PAR E SUA RA�Z QUADRADA � "+par);
			
		} else {
			impar = (int) Math.pow(num,2);
			System.out.println(num+" � �MPAR E ELEVADO AO QUADRADO � "+impar);
		}  

	}

}
