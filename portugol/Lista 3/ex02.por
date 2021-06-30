programa
{
	
	funcao inicio()
	{
		//soma de todos os impares
		//condiçoes: multiplo de 3 (%3 = 0), 1 < x > 500

		inteiro soma = 0

		para(inteiro i = 0; i < 500; i++){
	
		se (i%3==0 e i%2!=0){
			escreva(i+"\n")
			soma+=i
			}
		}

		escreva(soma)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 161; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */