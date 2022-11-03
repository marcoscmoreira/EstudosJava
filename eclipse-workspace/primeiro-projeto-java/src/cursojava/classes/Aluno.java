package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	/* Atributos do aluno */
	private String nome;
	private Integer idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCps;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	/* Construtor */
	public Aluno() { /* Cria dados na memória */

	}

	/* Construtor que recebe um nome como padrão */
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	/* Um outro tipo de construtor que recebe dados como padrão */
	public Aluno(String nomePadrao, Integer idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	/* Métodos Getter e Setters */
	/* SET é para adicionar ou receber dados para atributos */
	/* GET é para resgatar ou obter o valor do atributo */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCps() {
		return numeroCps;
	}

	public void setNumeroCps(String numeroCps) {
		this.numeroCps = numeroCps;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCps=" + numeroCps + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	/* Método que retorna a média do aluno */
	public double getMediaNota() {

		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}

		return somaNotas / disciplinas.size();
	}

	/*
	 * Métodos que retorna true ou false para validar a média do aluno
	 */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota(); /* O this usa o método que está dentro da classe */
		if (media >= 70) {
			return true;
		} else {
			return false;
		}

	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();

		if (media >= 50) {
			if (media >= 70) {
				return "Aluno está aprovado";
			} else {
				return "Aluno em recuperação";
			}
		} else {
			return "Aluno está reprovado";
		}
	}

}
