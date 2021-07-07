package introducao;

import java.util.Scanner;

public class EcommerceArray {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);	
		int quant = 0, resposta;
		char op;
		
		String [] produtos = new String [10];
		produtos [0] = "caixa de lápis 12 cores";
		produtos [1] = "borracha";
		produtos [2] = "tesoura";
		produtos [3] = "caderno surfista";
		produtos [4] = "caderno moranguinho";
		produtos [5] = "caneta";
		produtos [6] = "caneta em gel 6 cores";
		produtos [7] = "Post-it duas cores";
		produtos [8] = "fichário";
		produtos [9] = "grampeador pequeno";
		//produtos [10] = "marca texto";

		double [] preco = new double [produtos.length];
		preco[0] = 150.00;
		preco[1] = 150.00;
		preco[2] = 150.00;
		preco[3] = 150.00;
		preco[4] = 150.00;
		preco[5] = 150.00;
		preco[6] = 150.00;
		preco[7] = 150.00;
		preco[8] = 150.00;
		preco[9] = 150.00;
		
		
		String [] codigo = new String [produtos.length];
		String aux;
		int [] estoque = new int [produtos.length];
		int [] carrinho = new int [produtos.length];	
		
		
	
			
		do {			
			System.out.println("CÓDIGO\tPRODUTO\tESTOQUE\tPREÇO\tQTDE");
			for (int x=0; x < 3; x++) {
				codigo[x]=("EJ-O"+(x+1));
				estoque[x]=10;
				System.out.println("\t"+codigo[x]+"\t"+estoque[x]+"\t"+preco[x]);
				//if x>9 muda
			}	
			
			for(int x=0; x<3; x++) {
				if(carrinho[x]!=0) {
					System.out.println("\t"+codigo[x]+"\t"+estoque[x]+"\t"+preco[x]);
				}
			}
			
			System.out.println("Digite o código desejado: ");
			aux = leia.next().toUpperCase();
			for (int x = 0; x < 3; x++) {
				if (codigo[x].equals(aux)) {
					System.out.println("PRODUTO SELECIONADO: ");
					System.out.println("CÓDIGO\tPRODUTO\tESTOQUE\tPREÇO");
					System.out.println("\t"+codigo[x]+"\t"+estoque[x]+"\t"+preco[x]);
					
					if (estoque[x] <= 0) {
						System.out.println("PRODUTO INDISPONÍVEL");
					} else {
						System.out.println("Digite a quantidade desejada: ");
						quant = leia.nextInt();
						estoque[x]=estoque[x]-quant;
						
						if (quant > estoque[x]) {
							System.out.println("Quantidade indisponível");
						} else {
							carrinho[x] = quant;
						}
						
					}
				}
			}
			
			System.out.println("Deseja fazer mais uma compra? S/N");
			op = leia.next().toUpperCase().charAt(0);
		} while (op == 'S');
		
		System.out.println("VOLTE SEMPRE");
		
		
			
			
			
		
		/* 
		 for (int i = 0; i < produtos.length; i++) {
			 System.out.println("LOJA G3");
			 System.out.println("Código "+i+1+": ");
			 codigo[i] = leia.next();	
			// System.out.println("Produto "+i+1+": ");
			// produtos[i] = leia.nextLine();	 
			 System.out.println("Preço "+i+1+": ");
			 preco[i] = leia.nextInt();	
			 System.out.println("Quantidade disponível "+i+1+": ");
			 estoque[i] = leia.nextInt();		 
		 }
		 		 
		 //qual produto
		 //quantidade (atualiza posição com quantidade)
		 //se quantidade zerada, da um pop na posição 
		 //se quantidade zerada, não tem
		 //preco*quantidade
		 //conta final tal
		 
		
		 
			 /*
			 System.out.println("Quantidade disponível: "+estoque[i]);
			 if (estoque[i] > 0) {
				 System.out.println("Digite a quantidade desejada: ");
				 quant = leia.nextInt();
				 estoque[i]=estoque[i]-quant;
			 } else {
				 System.out.println("Produto indisponível");
			 }
			 
			 System.out.println("VALOR FINAL: "+(quant*preco[i])+"R$ com 9% de imposto");
			 
			 do {
				 System.out.println("Deseja fazer mais uma compra? S/N");
				 op = leia.next();
			 } while (op!="n" && op!="N" && (estoque[i]>0));
			
			 */		
			 
		 //}
		 
		 
		 	//exibe todos os produtos
			 //pede codigo e quantidade
			 //somatorio de quantidade*preco e armazena no carrinho
		 
		 //carrinho na posição [i] exibe todos os outros vetores
		 //estoque[i] = estoque[i]-quantidade escolhida
 
	}

}
