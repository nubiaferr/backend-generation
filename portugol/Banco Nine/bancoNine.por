programa
{
	
	funcao inicio()
	{	inteiro escolhaMenu = 0, escolhaCredDeb = 0
		real saldo1=200.00, saldo2=200.00, saldo3=50.00, saldo4=1000.00, saldo5=0.0
		real credito=0.0, debito=0.0
		//Menu
		//funcao menu(){
			escreva("\nBANCO NINE - BLABLABLA")
			escreva("\nSQUAD9\n")
			escreva("\n-----------------------")
			escreva("\nDigite a opção desejada: ")
			escreva("\n-----------------------")
			escreva("\n1 - Conta Poupança")
			escreva("\n2 - Conta Corrente")
			escreva("\n3 - Conta Especial")
			escreva("\n4 - Conta Empresa")
			escreva("\n5 - Conta Estudantil")
			escreva("\n6 - Sair\n")
			leia(escolhaMenu)
			limpa()

		
		se(escolhaMenu == 1){ //Conta poupança
			para(inteiro i = 1; i <= 2; i++){
				escreva("\nCONTA: 01234 - BANCO NINE")
				escreva("\nCONTA POUPANÇA")
				escreva("\n-----------------------")

				escreva("\nSALDO: "+saldo1)

				escreva("\n-----------------------")
				escreva("\n1 - Crédito\n")
				escreva("\n2 - Débito\n")
				leia(escolhaCredDeb)

				se (escolhaCredDeb == 1){
					escreva("\nDigite o valor de crédito: \n")
					leia(credito)
					saldo1+=credito
					escreva("\n-----------------------")
					limpa()
				} senao se (escolhaCredDeb == 2){
					escreva("\nDigite o valor de débito: \n")
					leia(debito)
					saldo1-=debito
					escreva("\n-----------------------")
					limpa()
				} senao {
					escreva("\nOPERAÇÃO INVÁLIDA")
					escreva("\n-----------------------")
				}

				escreva("\nSALDO ATUAL: "+saldo1+"\n")
				
			}
			
			
		} senao se (escolhaMenu == 2){ //Conta corrente
			para(inteiro i = 1; i <= 2; i++){
				escreva("\nCONTA: 01234 - BANCO NINE")
				escreva("\nCONTA POUPANÇA")
				escreva("\n-----------------------")

				escreva("\nSALDO: "+saldo2)

				escreva("\n-----------------------")
				escreva("\n1 - Crédito\n")
				escreva("\n2 - Débito\n")
				leia(escolhaCredDeb)

				se (escolhaCredDeb == 1){
					escreva("\nDigite o valor de crédito: \n")
					leia(credito)
					saldo2+=credito
					escreva("\n-----------------------")
					limpa()
				} senao se (escolhaCredDeb == 2){
					escreva("\nDigite o valor de débito: \n")
					leia(debito)
					saldo2-=debito
					escreva("\n-----------------------")
					limpa()
				} senao {
					escreva("\nOPERAÇÃO INVÁLIDA")
					escreva("\n-----------------------")
				}

				escreva("\nSALDO ATUAL: "+saldo2+"\n")
				
			}
			
		} senao se (escolhaMenu == 3){ //Conta especial
			para(inteiro i = 1; i <= 2; i++){
				escreva("\nCONTA: 01234 - BANCO NINE")
				escreva("\nCONTA POUPANÇA")
				escreva("\n-----------------------")

				escreva("\nSALDO: "+saldo3)

				escreva("\n-----------------------")
				escreva("\n1 - Crédito\n")
				escreva("\n2 - Débito\n")
				leia(escolhaCredDeb)

				se (escolhaCredDeb == 1){
					escreva("\nDigite o valor de crédito: \n")
					leia(credito)
					saldo3+=credito
					escreva("\n-----------------------")
					limpa()
				} senao se (escolhaCredDeb == 2){
					escreva("\nDigite o valor de débito: \n")
					leia(debito)
					saldo3-=debito
					escreva("\n-----------------------")
					limpa()
				} senao {
					escreva("\nOPERAÇÃO INVÁLIDA")
					escreva("\n-----------------------")
				}

				escreva("\nSALDO ATUAL: "+saldo3+"\n")
				
			}
			
		} senao se (escolhaMenu == 4){ //Conta empresa
			para(inteiro i = 1; i <= 2; i++){
				escreva("\nCONTA: 01234 - BANCO NINE")
				escreva("\nCONTA POUPANÇA")
				escreva("\n-----------------------")

				escreva("\nSALDO: "+saldo4)

				escreva("\n-----------------------")
				escreva("\n1 - Crédito\n")
				escreva("\n2 - Débito\n")
				leia(escolhaCredDeb)

				se (escolhaCredDeb == 1){
					escreva("\nDigite o valor de crédito: \n")
					leia(credito)
					saldo4+=credito
					escreva("\n-----------------------")
					limpa()
				} senao se (escolhaCredDeb == 2){
					escreva("\nDigite o valor de débito: \n")
					leia(debito)
					saldo4-=debito
					escreva("\n-----------------------")
					limpa()
				} senao {
					escreva("\nOPERAÇÃO INVÁLIDA")
					escreva("\n-----------------------")
				}

				escreva("\nSALDO ATUAL: "+saldo4+"\n")
				
			}
			
		} senao se (escolhaMenu == 5){ //Conta estudante
			para(inteiro i = 1; i <= 2; i++){
				escreva("\nCONTA: 01234 - BANCO NINE")
				escreva("\nCONTA POUPANÇA")
				escreva("\n-----------------------")

				escreva("\nSALDO: "+saldo5)

				escreva("\n-----------------------")
				escreva("\n1 - Crédito\n")
				escreva("\n2 - Débito\n")
				leia(escolhaCredDeb)

				se (escolhaCredDeb == 1){
					escreva("\nDigite o valor de crédito: \n")
					leia(credito)
					saldo5+=credito
					escreva("\n-----------------------")
					limpa()
				} senao se (escolhaCredDeb == 2){
					escreva("\nDigite o valor de débito: \n")
					leia(debito)
					saldo5-=debito
					escreva("\n-----------------------")
					limpa()
				} senao {
					escreva("\nOPERAÇÃO INVÁLIDA")
					escreva("\n-----------------------")
				}

				escreva("\nSALDO ATUAL: "+saldo5+"\n")
				
			}
			
		} senao se (escolhaMenu == 6){ //Sair
			escreva("\nOPERAÇÃO FINALIZADA")
		} senao {
			escreva("\nOPERAÇÃO INVÁLIDA")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */