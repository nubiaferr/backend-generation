programa
{
	
	funcao inicio()
	{	
		cadeia nomeAluno[4]
		inteiro notaAluno[4]

		para(inteiro i = 0; i < 4; i++){
			escreva("\nDigite o nome do aluno: ")
			leia(nomeAluno[i])

			escreva("\nDigite a nota do aluno: ")
			leia(notaAluno[i])
		}

		limpa()
		
		para(inteiro i = 0; i < 4; i++){
			se (notaAluno[i] >= 5){
				escreva("\nALUNO: "+nomeAluno[i]+" / NOTA: "+notaAluno[i])	
				escreva("\nPARABÉNS, "+nomeAluno[i]+"! VOCÊ FOI APROVADO")
				escreva("\n")
			} senao {
				escreva("\nALUNO: "+nomeAluno[i]+" / NOTA: "+notaAluno[i])
				escreva("\nSINTO MUITO, "+nomeAluno[i]+"! VOCÊ FOI REPROVADO")
				escreva("\n")
			}
		}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */