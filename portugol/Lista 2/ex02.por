programa
{
	
	funcao inicio()
	{
		//c = codigo
		//n = horas trabalhadas
		//1h = 10$
		//n > 50 = e 
		//e*20 = m
		//salario total + excedente

		inteiro n, sal1, E, sal2
		cadeia c

		escreva("Digite seu código: ")
		leia(c)
		escreva("Quantas horas você trabalhou? ")
		leia(n)

		se (n > 50){
			sal1 = 500
			E = (n-50)
			sal2 = E*20

			escreva("\nFuncionárie "+c)
			escreva("\nVocê trabalhou "+n+" horas essa semana. Seu salário total é de "+(sal1+sal2)+"R$")
			escreva("\nExtras: "+E+"h -> "+sal2+"R$ adicionais")	
		} senao {
			escreva("\nFuncionárie "+c)
			escreva("\nVocê trabalhou "+n+" horas essa semana. Seu salário total é de "+(n*10)+"R$")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */