programa
{

	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
	inteiro x1, x2, y1, y2
	real d

	escreva("Digite X1: ")
	leia(x1)

	escreva("Digite X2: ")
	leia(x2)

	escreva("Digite Y1: ")
	leia(y1)

	escreva("Digite Y2: ")
	leia(y2)

	d = mat.raiz(((mat.potencia((x2-x1), 2))+(mat.potencia((x2-x1), 2))), 2)

	escreva("O valor de d é " + mat.arredondar(d, 1))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */