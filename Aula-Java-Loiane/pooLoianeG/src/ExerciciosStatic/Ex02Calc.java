package ExerciciosStatic;

public class Ex02Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		imprimirTela(Calculadora.somar(1, 2));
		
		imprimirTela(Calculadora.subtrair(4, 2));
		
		imprimirTela(Calculadora.multiplicacao(2, 3));
		
		imprimirTela(Calculadora.dividir(10, 2));
		
		imprimirTela(Calculadora.potencia(2, 3));

	}
	
	static void imprimirTela(int num) {
		System.out.println(num);
	}

}
