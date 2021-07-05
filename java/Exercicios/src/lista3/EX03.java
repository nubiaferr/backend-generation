package lista3;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, gender, mood, amostra = 1;
		final int LIMITE = 3;
		int totCalmo = 0, totNervoso = 0, totAgressivo = 0, totFNervosa = 0, totHAgressivo = 0, totOCalmo =0;
		int tot40Nervoso=0, tot18Calmo = 0;
		char op = 'S';
		
		while (op == 'S' && amostra <= LIMITE) {
			System.out.println("--------------------------");
			System.out.println("Olá, participe da pesquisa");
			System.out.println("Você é o(a) participante "+amostra);
			System.out.println("--------------------------");
			
			do {
				System.out.println("Insira sua idade: ");
				idade = leia.nextInt();
				
				if (idade < 0) {
					System.out.println("Idade inválida, digite novamente.");
				}
			} while (idade < 0);
		
			
				System.out.println("Insira seu gênero: ");
				System.out.println(" 1 - F");
				System.out.println(" 2 - M");
				System.out.println(" 3 - Outro");
				System.out.println("--------------------------");
				System.out.println("Insira o comando: ");
				gender = leia.nextInt();
			
			
				System.out.println("Como descreveria seu temperamento?");
				System.out.println(" 1 - Calmo(a)");
				System.out.println(" 2 - Nervoso(a)");
				System.out.println(" 3 - Agressivo(a)");
				System.out.println("--------------------------");
				System.out.println("Insira o comando: ");
				mood = leia.nextInt();
					
			System.out.println("Deseja cadastrar mais algum participante? S/N");
			op = leia.next().toUpperCase().charAt(0);
			amostra++;
			
				
			if (mood == 1) {
				totCalmo++; //total pessoas calmas
				if (idade < 18) {
					tot18Calmo++;
				}//calmos abaixo de 18
			} else if (mood == 2) {
				totNervoso++; //total pessoas nervosas
				if (idade > 40) {
					tot40Nervoso++;
				}//nervosos acima de 40
			} else {
				totAgressivo++; //total pessoas agressivas
			}
			
			
			if (gender == 1 && mood == 2) {
				totFNervosa++; //total mulheres nervosas
			} else if (gender == 2 && mood == 3) {
				totHAgressivo++; //total homens agressivos
			} else if (gender == 3 && mood == 1) {
				totOCalmo++; //total outros calmos
			} else {
				System.out.println("");
			}
			
			
		}
		
		System.out.println("Total de pessoas calmas: "+totCalmo);
		System.out.println("Total de mulheres nervosas: "+totFNervosa);
		System.out.println("Total de homens agressivos: "+totHAgressivo);
		System.out.println("Total de outros calmos: "+totOCalmo);
		System.out.println("Total de pessoas com mais de 40 anos nervosas: "+tot40Nervoso);
		System.out.println("Total de pessoas com menos de 18 anos calmas: "+tot18Calmo);
		
		

	}

}
