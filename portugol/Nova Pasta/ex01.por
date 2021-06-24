programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		inteiro p, E, m

		escreva("Quantos kgs de tomate você comprou? ")
		leia(p)

		se (p > 50){
			E = (Mat.valor_absoluto(50 - p))
			m = (E*4)

			escreva("\nVocê ultrapassou "+E+"kgs do limite estabelecido")
			escreva("\nO valor da multa por excesso é: "+m+" R$")
		} senao {
			escreva("Compra aprovada")
		}
}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 75; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */