package models;

public class Tesoureiro extends Funcionario {

	public Tesoureiro(String nome, String dataAdmissao, double salario, String dataNascimento) {
		super(nome, dataAdmissao, salario, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showFuncionario() {
		System.out.println("| Nome: " + this.getNome() + " | Adimiss�o: " + this.getDataAdmissao() + 
				" | Salario: " + this.getSalario() + " | Nascimento: " + this.getDataNascimento());
	}

}
