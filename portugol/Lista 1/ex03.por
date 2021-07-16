programa
{
	
	funcao inicio()
	{
		
		inteiro num, horas, minutos, segundos
		
		escreva("Diga um número e vamos converter para horas, minutos e segundos: ")
		leia(num)

		horas = (num/60) 
		minutos = (num % 60)
		segundos = (num % 60) % 60

		// 1 hora = 60 min
		// 1 min = 60 seg
		
		escreva("Isso totaliza " + horas + " horas, " + minutos + " minutos, e " + segundos + " segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */