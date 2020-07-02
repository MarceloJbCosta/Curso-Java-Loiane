 package Aula39;

public class Aluno extends Pessoa{

	private String cursos;
	private String[] notas;
	
	public void verificarAcesso() {
		
		this.setNomeVisibilidade("nome");
		
		
	}
	
	
	public Aluno() {
		///vai chamar a super classe Pessoa
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		
	}



	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	public String[] getNotas() {
		return notas;
	}
	public void setNotas(String[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer(){
		super.setCpf("07234529462");
	}

	

}
