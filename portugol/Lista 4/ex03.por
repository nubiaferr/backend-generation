programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
			N1[linha][coluna] = Util.sorteia(1, 5)
			N2[linha][coluna] = Util.sorteia(5, 10)
			}
		}
		
		escreva("\nMATRIZ 1: \n")

		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva(N1[linha][coluna]+"\t")
			}
			escreva("\n")
		}


		escreva("\nMATRIZ 2: \n")

		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva(N2[linha][coluna]+"\t")
			}
			escreva("\n")
		}


		escreva("\nMATRIZ 3 (soma): \n")

		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna]
				escreva(M1[linha][coluna]+"\t")
			}
			escreva("\n")
		}

		escreva("\nMATRIZ 4 (subtração): \n")

		para(inteiro linha = 0; linha < 4; linha++){
			para(inteiro coluna = 0; coluna < 6; coluna++){
				M2[linha][coluna] = N1[linha][coluna]-N2[linha][coluna]
				escreva(M2[linha][coluna]+"\t")
			}
			escreva("\n")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */