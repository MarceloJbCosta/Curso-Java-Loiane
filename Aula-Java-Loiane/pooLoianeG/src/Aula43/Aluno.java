package Aula43;

import java.util.Arrays;

public class Aluno{

	private String cursos;
	private double[] notas;
	
	
	public Aluno() {
		///vai chamar a super classe Pessoa
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone) {
		//this(nome, endereco, telefone);
		this.cursos = cursos;
		
	}



	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer(){
		//this.setCpf("07234529462");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereco do aluno: ";
		//s += this.getEndereco();
		
		return s;
		
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
	
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	/*
	public String toString() {
		String s = cursos + "\n";
		for(double nota : notas) {
			s += nota + " ";
		}
		return s;
	}
	*/

	@Override
	public String toString() {
		return "Aluno [cursos =" + cursos + ", notas =" + Arrays.toString(notas) + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if(cursos.equalsIgnoreCase(other.getCursos())) {
			return true; 
		}
		
		return true;
	}
	

	

}
