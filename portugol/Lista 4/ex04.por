programa
{
	
	funcao inicio()
	{
		inteiro M1[3][3], soma = 0

		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva("Digite um valor: ")
				leia(M1[linha][coluna])

				se (linha == coluna){
					soma+=M1[linha][coluna]
				}
			}
		}

		limpa()

		escreva("\nMATRIZ COMPLETA: \n")

		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva(M1[linha][coluna]+"\t")
			}
			escreva("\n")
		}

		escreva("\nSOMA DA DIAGONAL PRINCIPAL: "+soma)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */