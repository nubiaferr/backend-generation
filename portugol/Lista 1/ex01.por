programa
{
	
	funcao inicio()
	{
		inteiro anos, anoHoje, meses, mesHoje, dias, diaHoje, diasPorAno, diasPorMes, diasTotal

		escreva("Vamos calcular há quantos dias você está na Terra!")

		escreva("\nEm que ano estamos? ")
		leia(anoHoje)
		
		escreva("\nE em que ano você nasceu? ")
		leia(anos)

		escreva("\nEm que mês estamos? ")
		leia(mesHoje)

		escreva("\nE em que mês você nasceu? ")
		leia(meses)
		
		escreva("\nQue dia do mês é hoje (em número)? ")
		leia(diaHoje)
		escreva("\nE em que dia você nasceu? ")
		leia(dias)

		//1 ano = 365 dias
		//1 mes = 30 dias

		diasPorAno = ((anoHoje-anos)*365)
		diasPorMes = ((mesHoje-meses)*30)

		diasTotal = (diaHoje-dias) + diasPorAno + diasPorMes

		escreva("\nVocê está aqui há " + diasTotal + " dias! Parabéns!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */