package ExercicioImpostoRenda;

public abstract class Contribuinte {
	
	/*
	 * precisamos entender a questao, neste caso, contribuinte tem que ser pj ou pf 
	 * entao nao precisamos fazer a instancia dele. colocamos a palavra abstract
	 *  ele é apenas um modelo
	 */
	
	private String nome;
	private double rendaBruta;
		
	public String getNome() {
		return nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	
	@Override
	public String toString() {
		return "\nContribuinte: " + nome + "; \nRENDA BRUTA: " + rendaBruta +";" ;
	}
	public abstract double calcularImposto();
	/*como o metodo e abstract nao passamos nada nao existe o {}
	 * pq as classes pessoa fisica e juridica que vao implementar este metodo
	 * 
	 */
	
	
	
}
