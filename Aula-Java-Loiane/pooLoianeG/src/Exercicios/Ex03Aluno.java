package Exercicios;

import java.util.Scanner;

public class Ex03Aluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Digite nome do Aluno: ");
		aluno.nome = sc.next();
		
		System.out.println("Digite o nome do Curso: ");
		aluno.nomeCurso = sc.next();
		
		System.out.println("Digite matricula: ");
		aluno.matricula = sc.next();
		
		aluno.nomeDiscplinas = new String[3];
		
		for(int i = 0; i < aluno.nomeDiscplinas.length; i++) {
			System.out.println("Digite Disciplina: " + i);
			aluno.nomeDiscplinas[i] = sc.next();
		}
		
		aluno.notasDisciplinas = new double[3][4];
		for(int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Digite a nota: "+ aluno.nomeDiscplinas[i]);
			for(int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com as notas " + (j+1));
				aluno.notasDisciplinas[i][j] = sc.nextDouble();
			}
		}
		aluno.mostrarInfo();
		
		for(int i = 0; i < aluno.notasDisciplinas.length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina: " + aluno.nomeDiscplinas[i] + " - foi aprovado");
			}else {
				System.out.println("Disciplina: " + aluno.nomeDiscplinas[i] + " - foi Reprovado");
			}
			
		}
		sc.close();
	}

}
