package lista4;


public class EX02 {

	public static void main(String[] args) {
				
		int soma=0, maiorX=0, maior=0; 
		int dado[] = new int [10];
		
		for(int i = 0; i < dado.length; i++) {
			dado[i]=(int) Math.round(Math.random()*10);
			System.out.println("Valor lan�ado: "+dado[i]);
			
			soma+=dado[i];
			
			if (dado[i] > maior) {
				maior = dado[i];
			}
		}
		
		
		for(int i = 0; i < dado.length; i++) {
			if (dado[i] == maior) {
				maiorX++;
			}
		}
		
		System.out.println("M�dia aritm�tica dos dados lan�ados: "+(soma/dado.length));
		System.out.println("O maior valor lan�ado foi "+maior+", que ocorreu "+maiorX+" vezes.");
		
		
		
		
		

	}

}
