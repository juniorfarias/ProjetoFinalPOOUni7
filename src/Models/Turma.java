package models;

import java.util.ArrayList;
import java.util.Date;

public class Turma {
	private String nome;
	private Funcionario professorResponsavel;
	private Curso curso;
	public Turma(String nome, Funcionario professor, Curso curso) {
		super();
		this.nome = nome;
		this.professorResponsavel = professor;
		this.curso = curso;
		int qtdTurmas = this.curso.getQuantidadeTurmas();
		this.curso.setQuantidadeTurmas(qtdTurmas++);
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Funcionario getProfessorResponsavel() {
		return professorResponsavel;
	}
	public void setProfessorResponsavel(Funcionario professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}
	public void showTurma() {
		System.out.println("| Nome: " + this.getNome() + " | Professor Responsavel: " + this.professorResponsavel.getNome() 
		+ " | Curso: " + this.curso.getNome() + " |");
	}
	
	public ArrayList<Aula> gerarAulas(ArrayList<TemaAula> temas, Turma turma, Funcionario professor) {
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		int count = 0;
		for(TemaAula tema : temas) {
			aulas.add(new Aula("Aula | " + tema.getTemaDeAula() + " | "+ count, turma, professor));
			count++;
		}
		return aulas;
	}
}
