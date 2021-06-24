programa
{
	
	funcao inicio()
	{
		inteiro num, anos, meses, dias
		
		escreva("Diga um número e vamos converter para anos, meses e dias: ")
		leia(num)

		anos = (num/365) 
		meses = (num % 365) / 30
		dias = (num % 365) % 30
		
		escreva("Isso totaliza " + anos + " anos, " + meses + " meses, e " + dias + " dias.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */