package ProgramasLista5;

import java.util.Scanner;

import ObjetosLista5.Aviao;

public class AviaoPrograma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Aviao voo1 = new Aviao();
		
		System.out.println("Insira companhia a�rea: ");
		voo1.companhia = leia.next();
		
		System.out.println("Insira n�mero do voo: ");
		voo1.numeroVoo = leia.nextInt();
		
		System.out.println("Que horas s�o? ");
		voo1.horaDeVoo = leia.next();
		
		System.out.println(voo1.infoVoo(voo1.companhia, voo1.numeroVoo, voo1.horaDeVoo));
		
	}

}
