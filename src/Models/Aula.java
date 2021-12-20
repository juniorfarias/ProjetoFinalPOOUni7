package models;

public class Aula {
	private String nome;
	private Turma turma;
	private Funcionario professor;
	public Aula(String nome, Turma turma, Funcionario professor) {
		super();
		this.nome = nome;
		this.turma = turma;
		this.professor = professor;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Funcionario getProfessor() {
		return professor;
	}
	public void setProfessor(Funcionario professor) {
		this.professor = professor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
