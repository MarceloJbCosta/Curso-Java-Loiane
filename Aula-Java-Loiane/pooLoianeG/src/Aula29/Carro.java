package Aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//construtor
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
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
