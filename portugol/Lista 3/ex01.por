programa
{
	
	funcao inicio()
	{
		//20 habitantes
		//media salario
		//maior salario
		//quantos % recebem menos de 100
		real salario, salarioTotal, mediaSalario, mediaFilhos, filhosTotal, maiorSalario, porcentagem
		inteiro filhos, abaixoDeCem  

		salario = 0.0
		salarioTotal = 0.0
		mediaSalario = 0.0
		filhos = 0
		filhosTotal = 0
		mediaFilhos = 0.0
		maiorSalario = 0.0
		abaixoDeCem = 0
		porcentagem = 0

		para (inteiro i = 1; i <= 4; i++){
			escreva("Olá, habitante!\n")
			//a
			escreva("Insira o valor de seu salário: ")
			leia(salario)
			salarioTotal += salario

			mediaSalario = salarioTotal/4

			//b
			escreva("Quantos filhos você tem? ")
			leia(filhos)
			filhosTotal += filhos

			mediaFilhos = filhosTotal/4

			//c
			se (salario > maiorSalario){
				maiorSalario = salario
			}

			//d
			se (salario < 100.00){
				abaixoDeCem= abaixoDeCem + 1
				porcentagem = ((abaixoDeCem*100)/4)
			}

		}

		escreva("A média salarial é: "+mediaSalario+" R$\n")
		escreva("A média de filhos é: "+mediaFilhos+"\n")
		escreva("O maior salário é: "+maiorSalario+" R$\n")
		escreva("A porcentagem de pessoas que recebem menos de R$100 é: "+(porcentagem)+"%\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 910; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */