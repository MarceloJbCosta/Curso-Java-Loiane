package Aula24;

public class Ex01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajour = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajour";
		lampada.tipos[1] = "Lampeões";

	}

}
