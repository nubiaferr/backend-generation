package lista4;

public class EX04 {

	public static void main(String[] args) {
		int soma = 0;
		int M1 [][] = new int [3][3];
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				M1[l][c] = (int) Math.round(Math.random()*10);
				
				if (l==c) {
					soma+=M1[l][c];
				}
			}
			
		}
		
		
		System.out.println("MATRIZ COMPLETA");
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.print(M1[c][l] + "\t");
			}
			System.out.println();
			}
		
		System.out.println("SOMA DA DIAGONAL PRINCIPAL: "+soma);
			
		}
		
		

	}


