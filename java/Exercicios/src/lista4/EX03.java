package lista4;

public class EX03 {

	public static void main(String[] args) {

		int N1[][] = new int [4][6];
		int N2[][] = new int [4][6];
		int M1[][] = new int [4][6];
		int M2[][] = new int [4][6];
		
		for(int c = 0; c < 4; c++) {
			for(int l = 0; l < 6; l++) {
				N1[c][l]=(int) Math.round(Math.random()*10);
				N2[c][l]=(int) Math.round(Math.random()*10);
			}
		}
		
		System.out.println("MATRIZ 1:");
		for(int c = 0; c < 4; c++) {
			for(int l = 0; l < 6; l++) {
				System.out.print(N1[c][l] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("MATRIZ 2:");
		for(int c = 0; c < 4; c++) {
			for(int l = 0; l < 6; l++) {
				System.out.print(N2[c][l] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("MATRIZ 3 (soma):");
		for(int c = 0; c < 4; c++) {
			for(int l = 0; l < 6; l++) {
				M1[c][l]=N1[c][l]+N2[c][l];
				System.out.print(M1[c][l] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("MATRIZ 4 (subtração):");
		for(int c = 0; c < 4; c++) {
			for(int l = 0; l < 6; l++) {
				M2[c][l]=N1[c][l]-N2[c][l];
				System.out.print(M2[c][l] + "\t");
			}
			System.out.println();
		}
		

	}

}
