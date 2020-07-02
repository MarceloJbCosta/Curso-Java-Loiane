package Aula49;

public class FinallyPegadinha {

	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};

		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
			}
			catch(ArithmeticException erro) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0);
				//isso e como desligar o sistema... apos desligar os sistema nada acontece. entao aqui o finaly nao e executado.
			}
			catch(ArrayIndexOutOfBoundsException erro) {
				System.out.println("Posição do array invalida");
				System.exit(0);
			}
			finally {
				System.out.println("Essa linha e impressa sempre  apos o try e catch");
			}

		}

	}
}
