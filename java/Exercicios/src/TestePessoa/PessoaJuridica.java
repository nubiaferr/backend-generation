package TestePessoa;

public class PessoaJuridica extends Pessoa1 {
	private long cnpj;
	
	

	public PessoaJuridica() {
		super();
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	

	@Override
	public String getNome() {
		return "Pessoa jurídica: "+super.getNome()+" - CPF: "+this.getCnpj();
	}
	
}
