package Exercicios;

public class Aluno {
	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDiscplinas;
	double[][] notasDisciplinas;//array de array; pegando ddiciplina e nota.
	
	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		
		System.out.println("Matricula: "+ matricula);
		
		System.out.println("Nome do Curso: "+ nomeCurso);
		
		for(int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina: "+ nomeDiscplinas[i]);
			for(int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");				
			}
			System.out.println();
		}
	}
	
	boolean verificarAprovado(int indice) {
		if(obterMedia(indice) >= 7) {
			return true;
		}
		return false;
		
	}
	
	double obterMedia(int indice) {
		double soma = 0;
		
		for(int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}
		double media = soma / 4;

		return media;
	}
	
}
