package introducao;

public class CalculoTemperatura {

	public static void main(String[] args) {
		
		String nome;
		double F, C, K; 
		
		nome = "Ed";
		F = 75;
		
		//C = Math.round(((F-32)/1.8)*100)/100.0;
		C = (F-32)/1.8;
		//K = Math.round((C + 273.15)*100)/100.0;
		K = C + 273.15;
				
		//System.out.println("Ol�, "+ nome +"! A temperatura de hoje �: "+C+"�C e "+K+" K.");
		
		System.out.printf("Ol� %s! A temperatura de hoje �: %.2f �C e %.2f K. \n", nome,C,K);
		//int %d, double %f, string %s, char %c
		
	}

}
