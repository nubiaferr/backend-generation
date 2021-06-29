programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[5], maiorPontuacao = 0

		para(inteiro i=0; i <5; i++){
			escreva("\nInsira a "+(i+1)+"a. pontuação: ")
			leia(pontuacao[i])

			se (pontuacao[i] > maiorPontuacao){
				maiorPontuacao = pontuacao[i]
			}
		}

		limpa()
		
		para(inteiro i=0; i <5; i++){
			escreva("\n"+(i+1)+"a. pontuação: "+pontuacao[i])
		}

		escreva("\nA maior pontuação foi: "+maiorPontuacao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */