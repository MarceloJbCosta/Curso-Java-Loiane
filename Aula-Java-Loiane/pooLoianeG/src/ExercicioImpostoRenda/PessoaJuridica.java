package ExercicioImpostoRenda;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

	
	@Override
	public String toString() {
		return "\nPessoaJuridica: " + super.toString() + "\nCNPJ: " + cnpj +"; \nIMPOSTO CALCULADO: " + calcularImposto() +";";
	}
	@Override
	public double calcularImposto() {
		//this pois esta pegando o atributo rendabruta
		return this.getRendaBruta() * 0.1;
		

	}

}
