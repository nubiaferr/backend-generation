programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Digite sua idade: ")
		leia(idade)

		se (idade >= 5 e idade <= 7){
			escreva("INFANTIL A")
		} senao se (idade >= 8 e idade <= 11){
			escreva("INFANTIL B")
		} senao se (idade >= 12  e idade <= 13){
			escreva("JUVENIL A")
		} senao se (idade >= 14  e idade <= 17){
			escreva("JUVENIL B")
		} senao se (idade >= 18){
			escreva("ADULTO")
		} senao {
			escreva("BEBÊ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */