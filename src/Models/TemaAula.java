package models;

public class TemaAula {
	private String temaDeAula;
	private boolean isAtivo;
	private Curso curso;
	public TemaAula(String temaDeAula, boolean ativo, Curso curso) {
		super();
		this.temaDeAula = temaDeAula;
		this.isAtivo = ativo;
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
	public boolean getIsAtivo() {
		return isAtivo;
	}
	public void setIsAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public void showTema() {
		System.out.println("| Tema: " + this.getTemaDeAula()+ " | Curso: " + this.curso.getNome() 
		+ " | Status: " + this.getIsAtivo() + " |");
	}
}
