package Aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro("fiat", "Ducato", 8, 80, 0.5);
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		System.out.println(van.capCombustivel);
		System.out.println(van.consumoCombustivel);
		
		//van.marca = "Fiat";
		//van.modelo = "Ducato";
		//van.numPassageiros = 10;
		//van.capCombustivel = 100;
		//van.consumoCombustivel = 0.2;
		
	}

}
