programa
{
	
	funcao inicio()
	{
		//arredondar média

		inteiro num = 0, soma = 0
		real total = 0.0

		escreva("Insira um número: ")
		leia(num)
		
		enquanto (num >= 0){		
				soma=soma+num
				total++
				escreva("Insira um número: ")
				leia(num)
		}
				
		escreva("Total de números válidos: "+total+"\n")
		escreva("Soma dos números válidos: "+soma+"\n")
		escreva("Média de números válidos: "+(soma/total)+"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 204; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */