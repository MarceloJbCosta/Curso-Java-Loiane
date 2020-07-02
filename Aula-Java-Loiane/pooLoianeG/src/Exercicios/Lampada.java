package Exercicios;

public class Lampada {
	
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	double preco;
	String[] tipos;
	boolean tipoAbajour;
	boolean ligada;
	

	void ligar() {
		ligada = true;
	}
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
		System.out.println("Lampada está ligada");
		}else {
			System.out.println("lampada esta desligada");
		}
		
	}
	void mudarEstado() {
		if(ligada) {
			desligar();
		}else {
			ligar();
		}
	}
	
	
}
