programa
{
	
	funcao inicio()
	{
		//b*a/2

		inteiro base, altura, area

		escreva("Insira o valor de base: ")
		leia(base)

		escreva("Insira o valor de altura: ")
		leia(altura)

		se (base > 0 e altura > 0){
			area = ((base*altura)/2)
			escreva("TRIANGULO VÁLIDO. ÁREA: "+area)
		} senao {
			escreva("TRIANGULO INVÁLIDO")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */