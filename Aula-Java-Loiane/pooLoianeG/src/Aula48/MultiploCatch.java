package Aula48;

public class MultiploCatch {

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
			/*Se eu nao souber qual o erro esta dando usar a classe Throwable clase mae das exception
			 * nao é um boa pratica, mais inicialmente da pra usar
			 */
			catch(ArrayIndexOutOfBoundsException erro) {
				System.out.println("Posição do array invalida");
			}
		}

	}

}
