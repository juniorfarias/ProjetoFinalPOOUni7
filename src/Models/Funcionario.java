package models;

import java.util.Date;

public abstract class Funcionario {
	private String nome;
	private String dataAdmissao;
	private double salario;
	private String dataNascimento;
	
	public Funcionario(String nome, String dataAdmissao, double salario, String dataNascimento) {
		super();
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public abstract void showFuncionario();
	
}
