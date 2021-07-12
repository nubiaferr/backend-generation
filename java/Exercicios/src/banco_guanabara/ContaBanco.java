package banco_guanabara;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	//métodos personalizados
	public void estadoAtual () {
		System.out.println("---------------------------");
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo atual: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		if (t.equals("CC")) {
			this.setStatus(true);
			this.setSaldo(50.00);
			System.out.println("Conta aberta com sucesso.");
		} else if (t.equals("CP")) {
			this.setStatus(true);
			this.setSaldo(150.00);
			System.out.println("Conta aberta com sucesso.");
		} else {
			System.out.println("Tipo de conta inválido");
			this.setStatus(false);
		}
		
	}
	
	public void fecharConta() {
			if (this.getSaldo() > 0) {
				System.out.println("Conta não pode ser fechada, ainda possui saldo.");
			} else if (this.getSaldo() < 0) {
				System.out.println("Conta não pode ser fechada, ainda possui débitos.");
			} else {
				this.setStatus(false);
				System.out.println("Conta fechada com sucesso.");
			}
		}
	
	public void depositar(double v) {
		if (this.getStatus()) {
			//this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado com sucesso.");
			System.out.println("Novo saldo: "+this.getSaldo());
		} else {
			System.out.println("Conta não existe.");
		}
	}
	
	public void sacar(double v) {
		if (this.getStatus()) {//automaticamente true
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado com sucesso.");
				System.out.println("Novo saldo: "+this.getSaldo());
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Conta não existe.");
		}
			
		}
	
	public void pagarMensal() {
		int v;
		if (this.getTipo().equals("CC")) {
			v = 12;
		} else if (this.getTipo().equals("CP")) {
			v = 20;
		} else {
			v = 0;
		}
		
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso.");
			System.out.println("Novo saldo: "+this.getSaldo());
		} else {
			System.out.println("Conta não existe.");
		}
	}

		
	//métodos especiais - automaticos
	
	public ContaBanco() {
		super();
		this.setSaldo(0.0);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
			return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
}
