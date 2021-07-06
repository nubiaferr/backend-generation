package introducao;

import java.util.Scanner;

public class ExemploArray {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String alunos [ ] = new String[4]; //jeito 1
		String alunas[] = {"A", "B", "C", "D"}; //maneira javascript mais profissa
		int notas [] = new int [4];
		
		System.out.println("Insira um nome: ");
		//alunes[].class = leia.next();
		
		
		alunos[0] = "Nubia";
		
		System.out.println(alunas.length); //funções pré programadas de array
		
		for(int i = 0; i < alunas.length; i++) {
			System.out.println(alunas[i]);
		} //for tradicional com length
		
		for(String i : alunas) {
			System.out.println(i);
		}// for each (for of do JS) 
		
		//perguntando coisas pra por no array
		//for(int i = 0; i < alunos.length; i++) {
			//System.out.println("Aluno "+(i+1)+": "+alunos[i].toUpperCase());//concatenando com for 
			//System.out.println("Insira sua nota: ");
			//notas[i] = leia.nextInt();
			
		//}
		
		
		//comparação de strings -> .equals 
		if (alunos[0].equals("Nubia")) {
			System.out.println("deu certo");
		}
		
		
		

	}

}
