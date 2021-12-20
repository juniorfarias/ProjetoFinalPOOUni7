package models;

public class Turma {
	private String nome;
	private Funcionario professorResponsavel;
	private Curso curso;
	public Turma(String nome, Funcionario professor, Curso curso) {
		super();
		this.nome = nome;
		this.professorResponsavel = professor;
		this.curso = curso;
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
	
}
