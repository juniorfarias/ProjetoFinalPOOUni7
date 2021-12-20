package models;

public class Professor extends Funcionario {
	private String escolaridade;

	public Professor(String nome, String dataAdmissao, double salario, String dataNascimento, String escolaridade) {
		super();
		// TODO Auto-generated constructor stub
		this.setNome(nome);
		this.setDataAdmissao(dataAdmissao);
		this.setSalario(salario);
		this.setDataNascimento(dataNascimento);
		this.escolaridade = escolaridade;
	}

	public Professor() {
		// TODO Auto-generated constructor stub
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
