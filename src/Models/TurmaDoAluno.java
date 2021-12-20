package models;

public class TurmaDoAluno {
	private Turma turma;
	private Aluno aluno;
	public TurmaDoAluno(Turma turma, Aluno aluno) {
		super();
		this.turma = turma;
		this.aluno = aluno;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
}