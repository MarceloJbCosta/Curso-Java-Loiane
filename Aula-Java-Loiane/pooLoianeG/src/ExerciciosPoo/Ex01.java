package ExerciciosPoo;

import ExerciciosPoo.Lampada01;

public class Ex01 {

	public static void main(String[] args) {
		
		Lampada01 lampada = new Lampada01(); 

		
		lampada.ligar(); //chamada ao metodo ligar que vai dar ligada = true liagada que é atributo.
		
		lampada.mostrarEstado();
				
		lampada.desligar();//chamada do metodo desligar ligada = false ligada que e atributo
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
		
		
	}

}
