package principal;

import java.util.ArrayList;
import java.util.Scanner;

import models.AnalistaDeSistemas;
import models.Funcionario;
import models.Motorista;
import models.Professor;
import models.Secretario;
import models.Tesoureiro;

public class Main {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios  = new ArrayList<Funcionario>();
		boolean status = true;
		Scanner input = new Scanner(System.in);
		
		do {
			MainUtils.menuPrincipal();
			int opcao = input.nextInt();
			switch (opcao) {
				case 1: {
					MainUtils.menuCursos();
					opcao = input.nextInt();
					switch (opcao) {
						case 1: {
					
						}
						case 2: {
					
						}
						default: {
					
						}
					}
					break;
				}
				case 2: {
					MainUtils.menuTurma();
					break;
				}
				case 3: {
					MainUtils.menuAluno();
					break;
				}
				case 4: {
					MainUtils.menuFuncionario();
					opcao = input.nextInt();
					switch (opcao) {
						case 1: {
							for(Funcionario funcionario : funcionarios) {
								funcionario.showFuncionario();
							}
							break;
						}
						case 2: {
							MainUtils.subMenuFuncionario();
							opcao = input.nextInt();
							Funcionario funcionario;
							switch (opcao) {
								case 1: {//Secretário
									String lNome = input.next();
									String lDataAdmissao = input.next();
									double lSalario = input.nextDouble();
									String lDataNascimento = input.next();
									
									funcionario = new Secretario(lNome, lDataAdmissao, lSalario, lDataNascimento);
									funcionarios.add(funcionario);
									break;
								}
								case 2: {//Tesoureiro
									String lNome = input.next();
									String lDataAdmissao = input.next();
									double lSalario = input.nextDouble();
									String lDataNascimento = input.next();
									
									funcionario = new Tesoureiro(lNome, lDataAdmissao, lSalario, lDataNascimento);
									funcionarios.add(funcionario);
									break;
								}
								case 3: {//Professor
									String lNome = input.next();
									String lDataAdmissao = input.next();
									double lSalario = input.nextDouble();
									String lDataNascimento = input.next();
									String lEscolaridade = input.next();
									
									funcionario = new Professor(lNome, lDataAdmissao, lSalario, lDataNascimento, lEscolaridade);
									funcionarios.add(funcionario);
									break;
								}
								case 4: {//Analista de sistemas
									String lNome = input.next();
									String lDataAdmissao = input.next();
									double lSalario = input.nextDouble();
									String lDataNascimento = input.next();
									String lLinguagemDeProgramacao = input.next();
									String lIdeFavorita = input.next();
									
									funcionario = new AnalistaDeSistemas(lNome, lDataAdmissao, lSalario, lDataNascimento, lLinguagemDeProgramacao, lIdeFavorita);
									funcionarios.add(funcionario);
									break;
								}
								case 5: {//Motorista
									String lNome = input.next();
									String lDataAdmissao = input.next();
									double lSalario = input.nextDouble();
									String lDataNascimento = input.next();
									String lCategoriaHabilitacao = input.next();
									
									funcionario = new Motorista(lNome, lDataAdmissao, lSalario, lDataNascimento, lCategoriaHabilitacao);
									funcionarios.add(funcionario);
									status = true;
									break;
								}
								default: {
									status = false;
									opcao = 0;
								}
							}
							break;
						}
						default: {
							status = false;
							opcao = 0;
						}
					}
					break;
				}
				case 5: {
					MainUtils.menuTurma();
					break;
				}
				default: {
					status = false;
					opcao = 0;				
				}
			}
		}while(status);

	}

}
