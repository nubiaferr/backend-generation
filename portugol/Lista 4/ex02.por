programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro valorDado [10], maiorValor = 0, repeteMaior = 0
		real mediaTotal, totDado = 0.0

		para(inteiro i = 0; i < 10; i++){
			valorDado[i] = Util.sorteia(1,10)
			totDado+=valorDado[i]

			se (valorDado[i] > maiorValor){
				maiorValor = valorDado[i]
			}

			escreva((i+1)+"o. valor: "+valorDado[i]+"\n")
		}

		para(inteiro i = 0; i < 10; i++){
			se (valorDado[i] == maiorValor){
				repeteMaior++
			}
		}

		mediaTotal = (totDado/10)
		
		escreva("\nA média aritmética dos resultados dos dados é: "+mediaTotal)
		escreva("\nO maior valor gerado foi "+maiorValor+", que ocorreu "+repeteMaior+"x.")

		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */