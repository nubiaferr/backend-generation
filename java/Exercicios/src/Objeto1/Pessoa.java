package Objeto1;

public class Pessoa {

		//Objeto (class sem public static void main)
		
		public String nome; //atributo do objeto Pessoa
		public char genero; 
		public int anoNascimento; 
		
		public void mostrarIdade() { 
			//m�todo sem retorno
			System.out.println(2021-anoNascimento);
			
		}
		
		 public int calculaIdade(int anoAtual) { 
			 //m�todo com retorno de INTEIRO
			return anoAtual-anoNascimento;
		}
		 
		 
}
