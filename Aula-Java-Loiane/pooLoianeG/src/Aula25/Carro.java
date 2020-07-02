package Aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//metodo sem retorno
	
	void exibirAutonomia() {
		System.out.println("Autonomia do carro é: "+ capCombustivel * consumoCombustivel + "km");
	}

}
