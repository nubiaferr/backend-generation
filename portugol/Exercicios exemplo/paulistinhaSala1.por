programa
{
	
	funcao inicio()
	{
		cadeia time1 = "Corinthians", time2 = "Palmeiras", time3 = "São Paulo", time4 = "Santos"
		cadeia resp1, resp2, resp3, resp4
		inteiro pontos1=0, pontos2=0, pontos3=0, pontos4=0, vencedor=0
	
		escreva("CAMPEONATO SALA 1 \n")
		
		para (inteiro i = 1; i <= 4; i++){
			escreva("RODADA "+i+"\n")
			
			escreva("O Corinthians perdeu(P), ganhou(G) ou empatou(E)? \n")
			leia(resp1)

			se(resp1 == "G" ou resp1 == "g"){
				pontos1 += 3
			} senao se (resp1 == "E" ou resp1 == "e"){
				pontos1 += 1
			} senao se (resp1 == "P" ou resp1 == "p"){
				pontos1 += 0
			} senao {
				escreva("Inválido")
			}

			escreva("O Palmeiras perdeu(P), ganhou(G) ou empatou(E)? \n")
			leia(resp2)

			se(resp2 == "G" ou resp2 == "g"){
				pontos2 += 3
			} senao se (resp2 == "E" ou resp2 == "e"){
				pontos2 += 1
			} senao se (resp2 == "P" ou resp2 == "p"){
				pontos2 += 0
			} senao {
				escreva("Inválido")
			}

			escreva("O São Paulo perdeu(P), ganhou(G) ou empatou(E)? \n")
			leia(resp3)

			se(resp3 == "G" ou resp3 == "g"){
				pontos3 += 3
			} senao se (resp3 == "E" ou resp3 == "e"){
				pontos3 += 1
			} senao se (resp3 == "P" ou resp3 == "p"){
				pontos3 += 0
			} senao {
				escreva("Inválido")
			}

			escreva("O Santos perdeu(P), ganhou(G) ou empatou(E)? \n")
			leia(resp4)

			se(resp4 == "G" ou resp4 == "g"){
				pontos4 += 3
			} senao se (resp4 == "E" ou resp4 == "e"){
				pontos4 += 1
			} senao se (resp4 == "P" ou resp4 == "p"){
				pontos4 += 0
			} senao {
				escreva("Inválido")
			}	
			
			}

		escreva("\nPONTOS FINAIS:")
		escreva("\nO total de pontos do "+time1+" é: "+pontos1)
		escreva("\nO total de pontos do "+time2+" é: "+pontos2)
		escreva("\nO total de pontos do "+time3+" é: "+pontos3)
		escreva("\nO total de pontos do "+time4+" é: "+pontos4)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */