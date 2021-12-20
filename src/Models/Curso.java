package models;

public class Curso {
	private String nome;
	private int quantidadeTurmas;
	public Curso(String nome, int quantidadeTurmas) {
		super();
		this.nome = nome;
		this.quantidadeTurmas = quantidadeTurmas;
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
	
}
