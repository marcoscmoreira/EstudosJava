package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeriaClasseJava {

	/* Main é um método auto executavel em java */
	public static void main(String[] args) {
		
		// Instancia uma lista de alunos
		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {
			/* new Aluno() é uma instancia (Criação de objeto) */
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno: " + qtd + " ");

			Aluno aluno = new Aluno();
			aluno.setNome(nome);
			/* O integer faz o papel de conversão da string que ele recebe do usuario */
			// aluno.setIdade(Integer.valueOf(idade));

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {

					String disciplinaRemover = JOptionPane
							.showInputDialog("Qual disciplina gostaria de remover? 1, 2, 3, 4");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");

				}

			}

			/* Adiciona os alunos a lista que foram adicionados acima */
			alunos.add(aluno);

		}

		/*
		 * Esse for percorre a lista de alunos para imprimir no console todos os alunos
		 * digitados acima
		 */

		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("Marcos")) {
				alunos.remove(aluno);
				break;
			} else {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Média da nota é: " + aluno.getMediaNota());
				System.out.println("Resultado = "
						+ (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado")); /* Operador ternario de condição IF */
				System.out.println("-------------------------------------------------------------------------");
			}

		}

		// Esse for vai percorrer os alunos que sobraram na lista
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista: ");
			System.out.println(aluno.getNome());
			System.out.println("Suas matérias são: ");

			// Esse For vai percorrer a lista e mostrar no console as matérias do aluno.
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}

		}

	}

}
