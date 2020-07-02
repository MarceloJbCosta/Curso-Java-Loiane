package Aula31;

public class Carro {
	
	/*Modificadores de acesso.
	 * public visivel a todos os pacotes
	 * default visivel apenas penas para aquele pacote
	 * private, visiavel apenas aquela classe	 
	 * Geralmente os metodos sao publicos pois queremos expor para os outros pacotes
	 */
	
	public String marca; 
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	
	public void exibirAutonomia() {
		System.out.println("Autonomia do carro é: "+ this.capCombustivel * this.consumoCombustivel + "km");
	}

	public double obterAutonomia() {
		
		System.out.println("Metodo obter autonomia foi chamada. ");
		return this.capCombustivel * this.consumoCombustivel;
				
	}
	
	//metodo auxiliar visivel apenas na clasee para organizar o codigo
	
	private double divideKMPorConsumoCombustive(double km) {
		//precisamos informar o km que nao esta na classe
		return km / this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		
		return this.divideKMPorConsumoCombustive(km);
	}

}
