package principal;

import java.util.ArrayList;

import models.Curso;
import models.Funcionario;
import models.Professor;

public class MainUtils {
	public static void menuPrincipal() {
		System.out.println("1 - Cursos");
		System.out.println("2 - Turmas");
		System.out.println("3 - Alunos");
		System.out.println("4 - Funcionários");
		System.out.println("5 - Temas de aula");
		System.out.println("0 - Sair");
	}
	
	public static void menuCursos() {
		System.out.println("1 - Listar cursos");
		System.out.println("2 - Cadastrar curso");
		System.out.println("0 - Voltar menu principal");
	}
	
	public static void menuFuncionario() {
		System.out.println("1 - Listar funcionário");
		System.out.println("2 - Cadastrar funcionário");
		System.out.println("0 - Voltar menu principal");
	}
	
	public static void menuTurma() {
		System.out.println("1 - Listar funcionário");
		System.out.println("2 - Cadastrar funcionário");
		System.out.println("0 - Voltar menu principal");
	}
	
	public static void menuAluno() {
		System.out.println("1 - Listar funcionário");
		System.out.println("2 - Cadastrar funcionário");
		System.out.println("0 - Voltar menu principal");
	}
	
	public static void menuTemasDeAula() {
		System.out.println("1 - Listar funcionário");
		System.out.println("2 - Cadastrar funcionário");
		System.out.println("0 - Voltar menu principal");
	}
	
	public static void subMenuFuncionario() {
		System.out.println("1 - Cadastrar Secretário");
		System.out.println("2 - Cadastrar Tesoureiro");
		System.out.println("3 - Cadastrar Professor");
		System.out.println("4 - Cadastrar Analista de Sistemas");
		System.out.println("5 - Cadastrar Motorista");
		System.out.println("0 - Voltar menu principal");
	}
	
	public static int encontraCurso(ArrayList<Curso> cursos, String nome) {
		int index = 0;
		for(Curso curso : cursos) {
			if(curso.getNome() == nome) {
				index = cursos.indexOf(curso);
			}
		}
		return index;
	}
	public static int encontraProfessor(ArrayList<Funcionario> funcionarios, String nome) {
		int index = 0;
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.getNome() == nome) {
				index = funcionarios.indexOf(funcionario);
			}
		}
		return index;
	}
}
