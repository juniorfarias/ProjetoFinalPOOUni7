package models;

import java.util.Date;

public class Motorista extends Funcionario {
	private String categoriaHabilitacao;

	public Motorista(String nome, String dataAdmissao, double salario, String dataNascimento, String categoriaHabilitacao) {
		super(nome, dataAdmissao, salario, dataNascimento);
		// TODO Auto-generated constructor stub
		this.categoriaHabilitacao = categoriaHabilitacao;
	}

	public String getCategoriaHabilitacao() {
		return categoriaHabilitacao;
	}

	public void setCategoriaHabilitacao(String categoriaHabilitacao) {
		this.categoriaHabilitacao = categoriaHabilitacao;
	}

	@Override
	public void showFuncionario() {
		System.out.println("| Nome: " + this.getNome() + " | Adimissão: " + this.getDataAdmissao() 
		+ " | Salario: " + this.getSalario() + " | Nascimento: " + this.getDataNascimento()+ " | Habilitacao: " 
				+ this.getCategoriaHabilitacao());
	}
	
}
