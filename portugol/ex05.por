programa
{
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
		real n1, n2, n3, media

		escreva("Cálculo de média de notas")

		escreva("\nDigite a nota 1: ")
		leia(n1)

		escreva("\nDigite a nota 2: ")
		leia(n2)

		escreva("\nDigite a nota 3: ")
		leia(n3)

		media = ((n1*2)+(n2*3)+(n3*5))/10

		escreva("\nSua média é de " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 187; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */