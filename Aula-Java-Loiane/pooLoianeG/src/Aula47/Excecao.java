package Aula47;

public class Excecao {

	public static void main(String[] args) {
		
		int[] vetor = new int[4];
		
		System.out.println("Antes da axception");
		
		vetor[4] = 5;
		//apos o erro o programa fecha, o conteudo abaixo nao foi impresso
		
		System.out.println("Esse texto nao sera impresso!");
	}

}
