package Aula30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, 
			double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {}
	
	

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Construtor com 3 parametros");
	}

	public Carro(String marca, String modelo) {
	this(marca, modelo, 10);
	System.out.println("conrutor com 2 paramentros");
	}

	void exibirAutonomia() {
		System.out.println("Autonomia do carro é: "+ capCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {
		
		System.out.println("Metodo obter autonomia foi chamada. ");
		return capCombustivel * consumoCombustivel;
				
	}
	
	double calcularCombustivel(double km) {
		//precisamos informar o km que nao esta na classe
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}

}
