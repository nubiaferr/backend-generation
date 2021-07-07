package ProgramasLista5;

import ObjetosLista5.Aviao2;

public class Aviao2Programa {

	public static void main(String[] args) {
		Aviao2 aviao1 = new Aviao2();   
		
		
		aviao1.modelo = "BIMOTOR";
		aviao1.rodas = 3;
		aviao1.tipo = "PASSAGEIRO 14 LUGARES";
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade=0;
		
		
		System.out.println("STATUS DE VOO");
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.ligar(); 
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.decolando();
		aviao1.aumentarVelocidade(40);
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.diminuirVelocidade(40);
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.pousar();
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
		aviao1.desligar();
		System.out.println("Velocimetro atual: "+aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);

	}

}
