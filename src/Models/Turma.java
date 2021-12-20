package models;

public class Turma {
	private String nome;
	private Professor professorResponsavel;
	private Curso curso;
	public Turma(String nome, Professor professorResponsavel, Curso curso) {
		super();
		this.nome = nome;
		this.professorResponsavel = professorResponsavel;
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
	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}
	public void setProfessorResponsavel(Professor professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}
	
}
