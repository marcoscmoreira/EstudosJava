package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeriaClasseJava {
	
	/* Main � um m�todo auto executavel em java */
	public static void main(String[] args) {

		
		/*new Aluno() � uma instancia (Cria��o de objeto)*/
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jo�o");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("21/09/1994");
		aluno1.setRegistroGeral("654654646465");
		aluno1.setNumeroCps("551515");
		aluno1.setNomeMae("Nome da m�e");
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
		System.out.println("M�dia da nota �: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado")); /*Operador ternario de condi��o IF*/
		
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jose", 50);
		
	}
	

}
