package Aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCursos("Ciencia da computação");
		double[] notas = {10, 5, 9, 7};
		//aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		//metodo equals
		
		String s1 ="asdasdasdasd";
		String s2 ="asdasdasdasd";
		
		/*String e um objeto quando usanos  == estamos comparando as referencias e nao os valores.
		 * para comparar valores usar o metodo equals
		 * para comparacao de objetos
		 */
		
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCursos("Ciencia da computação");
		double[] notas2 = {10, 5, 9, 3};
		aluno2.setNotas(notas2); 
		
		System.out.println(aluno.equals(aluno2));
		//continua dando falso pq ele ferifica os atributos.
		//usar o erenati do eclipe
	}

}
