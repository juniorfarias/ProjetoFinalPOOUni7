package models;

import java.util.Date;

public class AnalistaDeSistemas extends Funcionario {
	private String linguagemDeProgramacao;
	private String ideFavorita;
	public AnalistaDeSistemas(String nome, String dataAdmissao, double salario, String dataNascimento, String linguagemDeProgramacao, String ideFavorita) {
		super(nome, dataAdmissao, salario, dataNascimento);
		// TODO Auto-generated constructor stub
		this.linguagemDeProgramacao = linguagemDeProgramacao;
		this.ideFavorita = ideFavorita;
	}
	public String getLinguagemDeProgramacao() {
		return linguagemDeProgramacao;
	}
	public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
		this.linguagemDeProgramacao = linguagemDeProgramacao;
	}
	public String getIdeFavorita() {
		return ideFavorita;
	}
	public void setIdeFavorita(String ideFavorita) {
		this.ideFavorita = ideFavorita;
	}
	@Override
	public void showFuncionario() {
		System.out.println("| Nome: " + this.getNome() + " | Adimissão: " + this.getDataAdmissao() 
		+ " | Salario: " + this.getSalario() + " | Nascimento: " + this.getDataNascimento()
		 + " | Linguagem: " + this.getLinguagemDeProgramacao() + " | IDE: " + this.getIdeFavorita());
	}
	
	
}