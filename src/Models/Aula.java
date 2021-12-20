package models;

import java.util.Date;

public class Aula {
	private Turma turma;
	private Date dataAula;
	private Professor professor;
	public Aula(Turma turma, Date dataAula, Professor professor) {
		super();
		this.turma = turma;
		this.dataAula = dataAula;
		this.professor = professor;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Date getDataAula() {
		return dataAula;
	}
	public void setDataAula(Date dataAula) {
		this.dataAula = dataAula;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
