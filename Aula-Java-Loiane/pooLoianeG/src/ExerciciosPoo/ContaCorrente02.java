package ExerciciosPoo;

public class ContaCorrente02 {
	
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	private double saldo;
	
	public ContaCorrente02() {
	}
	public ContaCorrente02(String numero, String agencia, 
			boolean especial, double limiteEspecial,
			double valorEspecialUsado, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.valorEspecialUsado = valorEspecialUsado;
		this.saldo = saldo;
	}


	public String getNumero() {
		return this.numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return this.agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public boolean isEspecial() {
		return this.especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public double getLimiteEspecial() {
		return this.limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	public double getValorEspecialUsado() {
		return this.valorEspecialUsado;
	}
	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	 public boolean realizarSaque(double quantiaASacar) {
		
		//tem saldo na conta
		if(saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;				
		}else {//nao tem saldo na conta
			if(especial) {
				//verificar se o lime especial tem saldo
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar; 
					return true;
				}else {
					return false;
				}				
			}else {
				return false;//nao especial e nao tem saldo
			}
		}
		
	}
	
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo Atual R$ " + saldo);
	}
	
	 public boolean verificarUsoChequeEspecial() {
		return saldo < 0;
		
	}
	
	
	
	
	
	
	

}
