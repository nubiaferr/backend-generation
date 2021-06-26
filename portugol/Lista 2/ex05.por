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

		se (indice < 0.3){
			escreva("TUDO OK")
		} senao se (indice >= 0.3 e indice < 0.4){
			se (grupo == 1){
				escreva("GRUPO 1 - SUSPENDER")
			} senao {
				escreva("TUDO OK")
			}
		} senao se (indice >= 0.4 e indice < 0.5){
			se (grupo == 1 ou grupo == 2){
				escreva("GRUPO 1 E 2 - SUSPENDER")
			} senao {
				escreva("TUDO OK")
			}
		} senao {
			escreva("TODOS DEVEM SUSPENDER")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 254; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */