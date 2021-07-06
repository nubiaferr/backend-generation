package lista4;


public class EX01 {

	public static void main(String[] args) {
		
		int notas [] = new int [5];
		int maior = 0;
		
		for (int i = 0; i < notas.length; i++) {
			notas[i]=(int) Math.round(Math.random()*10);
			System.out.println(notas[i]);
				if (notas[i] > maior) {
					maior = notas[i];
				}
		}
		
		System.out.println("O maior valor é "+maior);
		

	}

}
