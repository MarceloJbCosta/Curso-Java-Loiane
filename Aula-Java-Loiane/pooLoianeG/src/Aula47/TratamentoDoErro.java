package Aula47;

public class TratamentoDoErro {
	
	public static void main(String[] args) {
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da axception");
			
			vetor[4] = 5; //apresentou o erro e pulou diretamente para o  catch
			
			System.out.println("Esse texto nao sera impresso!");
			
		}catch(ArrayIndexOutOfBoundsException exception) {
			
			System.out.println("Excecao oao acessar  indice do vetor que nao existe");
			
		}
		System.out.println("Sera impreso apos a axception");
		
	}

}
