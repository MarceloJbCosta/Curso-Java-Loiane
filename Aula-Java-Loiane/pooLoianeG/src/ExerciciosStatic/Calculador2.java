package ExerciciosStatic;

public class Calculador2 {
	
	
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	public static int multiplicacao(int num1, int num2) {
		return num1 * num2;
	}
	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}
	public static int potencia(int num1, int num2) {
		return (int)Math.pow(num1, num2);	
	}
	
	//5! = 5 * 4 *3 *2 4 = 120
	//0! = 1
	//nao existe fatoria de numero negativo
	public static int fatorial(int num) {
		if(num == 0) {
			return 1;
		}
		int total = 1;
		for(int i = num; i > 1; i--) {
			total *= i;
		}
		
		return total;
	}

}
