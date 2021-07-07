package Objeto1;

public class Pessoa {

		//Objeto (class sem public static void main)
		
		public String nome; //atributo do objeto Pessoa
		public char genero; 
		public int anoNascimento; 
		
		public void mostrarIdade() { 
			//método sem retorno
			System.out.println(2021-anoNascimento);
			
		}
		
		 public int calculaIdade(int anoAtual) { 
			 //método com retorno de INTEIRO
			return anoAtual-anoNascimento;
		}
		 
		 
}
