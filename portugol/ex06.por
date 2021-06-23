programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		real a, b, c, r, s, d

		escreva("Digite o valor A: ")
		leia(a)

		escreva("Digite o valor B: ")
		leia(b)

		escreva("Digite o valor C: ")
		leia(c)

		r = Mat.potencia((a+b), 2)
		s = Mat.potencia((b+c), 2)

		d = ((r+s)/2)

		escreva("Resultado: " + d)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */