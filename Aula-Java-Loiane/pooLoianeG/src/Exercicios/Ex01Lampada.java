package Exercicios;

public class Ex01Lampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();//criação do objeto
		
		lampada.ligar(); //chamada ao metodo ligar que vai dar ligada = true liagada que é atributo.
		
		lampada.mostrarEstado();
				
		lampada.desligar();//chamada do metodo desligar ligada = false ligada que e atributo
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
		

	}

}
