package ExercicioImpostoRenda;

public class PessoaFisica extends Contribuinte{
	
	private String cpf;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "\nPessoaFisica: "+ super.toString() +"\nCPF = " + cpf + "; \nIMPOSTO CALCULADO =" + calcularImposto() +";";
	}
	
	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		
		if(renda <= 1400) {
			return 0;
		}
		else if(renda > 1400.01 && renda <= 2100.00) {
			return (renda * 0.1) - 100;
		}
		else if(renda > 2100.01 && renda <=2800.) {
			return (renda * 0.15) - 270;
		}
		else if(renda > 2800.01 && renda <=3600) {
			return (renda * 0.25) - 500;
		}
		// maior > 3600
		else{
			return (renda * 0.30) - 700;	
		}
		

	}

}
