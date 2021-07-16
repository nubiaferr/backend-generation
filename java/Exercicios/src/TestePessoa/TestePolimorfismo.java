package TestePessoa;

public class TestePolimorfismo {

	public static void main(String[] args) {
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Julina");
		fisica.setCpf(765984326L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("João");
		juridica.setCnpj(4834875L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa1 pessoa:pessoas) {
			System.out.println(pessoa.getNome());
		} //percorre o array usando o metodo em comum

	}

}
