package models;

public class Presenca {
	private Aluno aluno;
	private Aula aula;
	private boolean isPresente;
	private String observacao;
	public Presenca(Aluno aluno, Aula aula, boolean isPresente, String observacao) {
		super();
		this.aluno = aluno;
		this.aula = aula;
		this.isPresente = isPresente;
		this.observacao = observacao;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Aula getAula() {
		return aula;
	}
	public void setAula(Aula aula) {
		this.aula = aula;
	}
	public boolean isPresente() {
		return isPresente;
	}
	public void setPresente(boolean isPresente) {
		this.isPresente = isPresente;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
