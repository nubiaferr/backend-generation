programa
{
	
	funcao inicio()
	{
		//3 tentativas para senha correta
		
		cadeia senha = "1234"
		inteiro tentativa = 0	
		
		
		escreva("Digite a senha: ")
		leia(senha)

		se (senha == "1234"){
			escreva("BEM VINDO")
		} senao {
			//voce tem 3 tentativas para acertar
			enquanto (senha != "1234"){//enquanto a senha for errada
				
				escreva("\nSenha errada. Digite a senha novamente: ")
				leia(senha)
				tentativa++

				se(tentativa == 1){
					escreva("\nVocê tem mais 2 tentativas")
				} senao se (tentativa == 2){
					escreva("\nVocê tem mais 1 tentativa")
				} senao {
					se (tentativa >= 3){
					escreva("\nTentativas esgotadas")
					pare
				}
				}
				
				
			}
		}
			

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */