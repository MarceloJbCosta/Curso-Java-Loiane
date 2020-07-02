package Aula50;

public class ExceptionGenerica {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};

		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
			}
			catch(Exception erro) {
				System.out.println(erro.getMessage());//mostra o motivo do erro
				erro.printStackTrace();//mostra onde o erro ocorreu e qual o erro
			}
		}


	}

}
