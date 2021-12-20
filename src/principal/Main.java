package principal;

import java.util.ArrayList;
import java.util.Scanner;

import models.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios  = new ArrayList<Funcionario>();
		ArrayList<Curso> cursos  = new ArrayList<Curso>();
		ArrayList<Turma> turmas  = new ArrayList<Turma>();
		ArrayList<TemaAula> temas  = new ArrayList<TemaAula>();
		ArrayList<Aluno> alunos  = new ArrayList<Aluno>();
		ArrayList<Aula> aulas  = new ArrayList<Aula>();
		ArrayList<TurmaDoAluno> turmasDoAluno  = new ArrayList<TurmaDoAluno>();
		ArrayList<Presenca> presencas  = new ArrayList<Presenca>();
		
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
							for(Curso curso : cursos) {
								curso.showCurso();
							}
							break;
						}
						case 2: {
							String lNome = input.next();
							cursos.add(new Curso(lNome));
							break;
						}
						default: {
							break;
						}
					}
					break;
				}
				case 2: {
					MainUtils.menuTurma();
					opcao = input.nextInt();
					switch (opcao) {
						case 1: {
							for(Turma turma : turmas) {
								turma.showTurma();
							}
							break;
						}
						case 2: {
							String lNome = input.next();
							String lCurso = input.next();
							int idexCurso = MainUtils.encontraCurso(cursos, lCurso);
							Curso curso = cursos.get(idexCurso);
							String lProfessor = input.next();
							int indexProfessor = MainUtils.encontraProfessor(funcionarios, lProfessor);
							Funcionario professor = funcionarios.get(indexProfessor);
							Turma turma = new Turma(lNome, professor, curso);
							turmas.add(turma);
							ArrayList<TemaAula> temasAtivos  = new ArrayList<TemaAula>();
							for(TemaAula tema : temas) {
								if(tema.getIsAtivo() && tema.getCurso().getNome() == curso.getNome()) {
									temasAtivos.add(tema);
								}
							}
							ArrayList<Aula> aulasDaTurma = turma.gerarAulas(temasAtivos, turma, professor);
							for(Aula aula : aulasDaTurma) {
								aulas.add(aula);
							}
							break;
						}
						default: {
					
						}
					}
					break;
				}
				case 3: {
					MainUtils.menuAluno();
					opcao = input.nextInt();
					switch (opcao) {
						case 1: {
							for(Aluno aluno : alunos) {
								aluno.showAluno();
							}
							break;
						}
						case 2: {
							String lNome = input.next();
							String lCpf = input.next();
							int lMatricula = input.nextInt();
							alunos.add(new Aluno(lNome, lCpf, lMatricula));
							break;
						}
						default: {
							break;
						}
					}
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
					MainUtils.menuTemasDeAula();
					opcao = input.nextInt();
					switch (opcao) {
						case 1: {
							for(TemaAula tema : temas) {
								tema.showTema();
							}
							break;
						}
						case 2: {
							String lTema = input.next();
							boolean isAtivo = input.nextBoolean();
							String lCurso = input.next();
							int idexCurso = MainUtils.encontraCurso(cursos, lCurso);
							Curso curso = cursos.get(idexCurso);
							temas.add(new TemaAula(lTema, isAtivo, curso));
							break;
						}
						default: {
							break;
						}
					}
					break;
				}
				default: {
					status = false;
					opcao = 0;				
				}
			}
		}while(status);
		input.close();
	}

}
