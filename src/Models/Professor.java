package models;

import java.util.Date;

public class Professor extends Funcionario {
	private String escolaridade;

	public Professor(String nome, String dataAdmissao, double salario, String dataNascimento, String escolaridade) {
		super(nome, dataAdmissao, salario, dataNascimento);
		// TODO Auto-generated constructor stub
		this.escolaridade = escolaridade;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	@Override
	public void showFuncionario() {
		System.out.println("| Nome: " + this.getNome() + " | Adimissão: " + this.getDataAdmissao() 
		+ " | Salario: " + this.getSalario() + " | Nascimento: " + this.getDataNascimento()+ " | Escolaridade: " 
				+ this.getEscolaridade());
		
	}
	
	
	
}
