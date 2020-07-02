package Aula26;

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
	
	//nome de metodo comeca com metodo
	double obterAutonomia() {
		
		System.out.println("Metodo obter autonomia foi chamada. ");
		return capCombustivel * consumoCombustivel;
				
	}

}
