   package ExerciciosPoo;

import java.util.Scanner;

import ExerciciosPoo.Alunos03;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Alunos03 aluno = new Alunos03();
		
		System.out.println("Digite nome do Aluno: ");
		aluno.setNome(sc.next());
		
		System.out.println("Digite o nome do Curso: ");
		aluno.setNomeCurso(sc.next());
		
		System.out.println("Digite matricula: ");
		aluno.setMatricula(sc.next());
		
		//aluno.nomeDiscplinas = new String[3];
		
		for(int i = 0; i < aluno.getNomeDiscplinas().length; i++) {
			System.out.println("Digite Disciplina: " + i);
			aluno.setNomeDisciplinaPos(i, sc.next());
		}
		
		//aluno.notasDisciplinas = new double[3][4];
		for(int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Digite a nota: "+ aluno.getNomeDiscplinas()[i]);
			for(int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Entre com as notas " + (j+1));
				aluno.setNomePosIJ(i, j, sc.nextDouble());
			}
		}
		aluno.mostrarInfo();
		
		for(int i = 0; i < aluno.getNomeDiscplinas().length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina: " + aluno.getNomeDiscplinas()[i] + " - foi aprovado");
			}else {
				System.out.println("Disciplina: " + aluno.getNomeDiscplinas()[i] + " - foi Reprovado");
			}
			
		}
		sc.close();
	}

		

}


