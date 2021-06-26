programa
{
	
	funcao inicio()
	{ 
		inteiro x, valor = 1, divisores = 0

		faca{
		escreva("Digite um valor maior que 2 e menor que 1000: ")
		leia(x)
		} enquanto (x < 2 e x > 1000)

		enquanto(valor < x){
			se( x % valor == 0){
				divisores+=valor
			}
			valor++ //incremento
		}

		se (divisores == x){
			escreva(x+" é perfeito \n")
		} senao {
			escreva(x+" não é perfeito \n")
		}

		
		
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */