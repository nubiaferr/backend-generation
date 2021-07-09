package poo_estudos;

public class TestePessoa {

	public static void main(String[] args) {
				Pessoa jessica = new Pessoa("Jessica", 555);
				FuncionarioPessoa pedro = new FuncionarioPessoa("Pedro", 222, "TI");
				Pessoa maria = new FuncionarioPessoa("Maria", 333, "TI - backend");
				CoordenadorPessoa jose = new CoordenadorPessoa("José", 444, "CC");
				
				//da pra instanciar subclasses, mas so le as infos da primeira declaração 
				
				System.out.println(jessica.getMatricula());
				System.out.println(pedro.getDepartamento());
				System.out.println(maria.getMatricula());
				System.out.println(jose.getCursoCoordenado());
				
				
		

	}

}
