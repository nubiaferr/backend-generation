programa
{
	
	funcao inicio()
	{
		
		inteiro grupo
		real indice

		escreva("Insira seu grupo: ")
		leia(grupo)

		escreva("Insira o índice de poluição: ")
		leia(indice)

		se(indice < 3){
			escreva("Tudo ok")
		} senao se ((indice > 3) e (grupo == 1)){
			escreva("Grupo 1 - SUSPENDER")
		} senao se ((indice > 4 e indice < 5) e (grupo == 1 ou grupo == 2)){
			escreva("Grupo 1 e 2 - SUSPENDER")
		} senao {
			escreva("Suspender")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */