package Aula41;

public class TesteAbstracao {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa(); 
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Av Sul, 82");
		aluno.setEndereco("Rua professor augusto lins e silva, 835");
		professor.setEndereco("Estrada da batalha, 637");
		
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	

		
	}

}
