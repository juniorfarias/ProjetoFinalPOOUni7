package models;

public class Curso {
	private String nome;
	private int quantidadeTurmas;
	public Curso(String nome) {
		super();
		this.nome = nome;
		this.quantidadeTurmas = 0;
	}
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeTurmas() {
		return quantidadeTurmas;
	}
	public void setQuantidadeTurmas(int quantidadeTurmas) {
		this.quantidadeTurmas = quantidadeTurmas;
	}
	public void showCurso() {
		System.out.println("| Nome: " + this.getNome() + " | Qtd Turmas: " + this.getQuantidadeTurmas() + " |");
	}
}
