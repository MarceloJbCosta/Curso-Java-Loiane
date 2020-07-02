package ExerciciosPoo;

public class Alunos03 {
	
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDiscplinas;
	private double[][] notasDisciplinas;
	
	public Alunos03() {
		nomeDiscplinas = new String[3];
		notasDisciplinas = new double[3] [4];
	}

	public Alunos03(String nome, String matricula, String nomeCurso) {
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDiscplinas = new String[3];
		this.notasDisciplinas = new double[3] [4];
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return this.nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getNomeDiscplinas() {
		return this.nomeDiscplinas;
	}

	public void setNomeDiscplinas(String[] nomeDiscplinas) {
		this.nomeDiscplinas = nomeDiscplinas;
	}

	public double[][] getNotasDisciplinas() {
		return this.notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	
	public void mostrarInfo() {
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
	
	public boolean verificarAprovado(int indice) {
		if(obterMedia(indice) >= 7) {
			return true;
		}
		return false;
		
	}
	
	private double obterMedia(int indice) {
		double soma = 0;
		
		for(int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}
		double media = soma / 4;

		return media;
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.nomeDiscplinas[pos] = nomeDisciplina;
	}
	
	public void setNomePosIJ(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ] = nota;
		
	}
	
	

	
}
