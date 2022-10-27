package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeriaClasseJava {
	
	/* Main é um método auto executavel em java */
	public static void main(String[] args) {

		
		/*new Aluno() é uma instancia (Criação de objeto)*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
		String idade = JOptionPane.showInputDialog("Qual a idade: ");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento: ");
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); /*O integer faz o papel de conversão da string que ele recebe*/
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral("654654646465");
		aluno1.setNumeroCps("551515");
		aluno1.setNomeMae("Nome da mãe");
		aluno1.setNomePai("Algun pai ai");
		aluno1.setDataMatricula("15/12/5165");
		aluno1.setSerieMatriculado("6");
		aluno1.setNomeEscola("Java Java");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado")); /*Operador ternario de condição IF*/
		
		
	}
	

}
