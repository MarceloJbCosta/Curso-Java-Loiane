package Aula27;

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
	//metodos com retorno
	double obterAutonomia() {
		
		System.out.println("Metodo obter autonomia foi chamada. ");
		return capCombustivel * consumoCombustivel;
				
	}
	
	//metodos com parametros
	
	/*
	 * Quando passar parametros pro metodo?
	 * quando precisar de informacoes que nao esta disponivel na classe
	 */
	
	double calcularCombustivel(double km) {
		//precisamos informar o km que nao esta na classe
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
	
	
}
