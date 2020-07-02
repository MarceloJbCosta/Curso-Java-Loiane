package Aula49;

public class Finally {

	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};

		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
			}
			catch(ArithmeticException erro) {
				System.out.println("Erro ao dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException erro) {
				System.out.println("Posição do array invalida");
			}
			finally {
				System.out.println("Essa linha e impressa sempre  apos o try e catch");
			}
		}

	}

}
