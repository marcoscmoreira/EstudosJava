package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeriaClasseJava {

	/* Main � um m�todo auto executavel em java */
	public static void main(String[] args) {

		/* new Aluno() � uma instancia (Cria��o de objeto) */
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
		String idade = JOptionPane.showInputDialog("Qual a idade: ");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento: ");

		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade)); /* O integer faz o papel de convers�o da string que ele recebe */
		aluno.setDataNascimento(dataNascimento);
		/*aluno.setRegistroGeral("654654646465");
		aluno.setNumeroCps("551515");
		aluno.setNomeMae("Nome da m�e");
		aluno.setNomePai("Algun pai ai");
		aluno.setDataMatricula("15/12/5165");
		aluno.setSerieMatriculado("6");
		aluno.setNomeEscola("Java Java");*/
		
		for (int pos = 1; pos <= 4; pos++ ) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno.getDisciplinas().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina gostaria de remover? 1, 2, 3, 4")
			aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}

		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade: " + aluno.getIdade());
		System.out.println("Nascimento: " + aluno.getDataNascimento());
		System.out.println("M�dia da nota �: " + aluno.getMediaNota());
		System.out.println("Resultado = "
				+ (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado")); /* Operador ternario de condi��o IF */

	}

}
