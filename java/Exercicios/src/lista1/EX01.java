package lista1;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		int anos, anoHoje, meses, mesHoje, dias, diaHoje, diasPorAno, diasPorMes, diasTotal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Vamos calcular há quantos dias você está na Terra!");
		
		System.out.println("Em que ano estamos?");
		anoHoje = leia.nextInt();
		
		System.out.println("Em que ano você nasceu?");
		anos = leia.nextInt();
		
		System.out.println("Em que mês estamos?");
		mesHoje = leia.nextInt();
		
		System.out.println("E em que mês você nasceu?");
		meses = leia.nextInt();
		
		System.out.println("Que dia do mês é hoje?");
		diaHoje = leia.nextInt();
		
		System.out.println("Em que dia você nasceu?");
		dias = leia.nextInt();
		
		diasPorAno = ((anoHoje-anos)*365);
		diasPorMes =((mesHoje-meses)*30);
		
		diasTotal = (diaHoje-dias) + diasPorAno + diasPorMes;
		
		System.out.println("Você está aqui há "+diasTotal+" dias!");

	}

}
