package ExercicioZoologico;

public class Animal {
	
	private String nome;
	private int comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	
	@Override
	public String toString() {
		return "Animal:" + nome + ", "
				+ "\ncomprimento: " + comprimento + 
				"cm, \nPatas: " + numeroPatas + 
				", \ncor: " + cor +
				", \nambiente: " + ambiente + 
				", \nvelocidade: " + velocidade + "m/s";
	}
	
	public Animal() {
		this.numeroPatas = 4;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
}
