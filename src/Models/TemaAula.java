package models;

public class TemaAula {
	private String temaDeAula;
	private boolean ativo;
	private Curso curso;
	public TemaAula(String temaDeAula, boolean ativo, Curso curso) {
		super();
		this.temaDeAula = temaDeAula;
		this.ativo = ativo;
		this.curso = curso;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String getTemaDeAula() {
		return temaDeAula;
	}
	public void setTemaDeAula(String temaDeAula) {
		this.temaDeAula = temaDeAula;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
