package cursojava.classes;

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
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	/* Construtor */
	public Aluno() { /* Cria dados na mem�ria */

	}

	/* Construtor que recebe um nome como padr�o */
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	/* Um outro tipo de construtor que recebe dados como padr�o */
	public Aluno(String nomePadrao, Integer idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	/* M�todos Getter e Setters */
	/* SET � para adicionar ou receber dados para atributos */
	/* GET � para resgatar ou obter o valor do atributo */

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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	/*M�todo que retorna a m�dia do aluno*/
	public double getMediaNota () {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	public boolean getAlunoAprovado() {
		 double media = this.getMediaNota(); /*O this usa o m�todo que est� dentro da classe*/
		 if (media >= 70) {
			 return true;
		 } else {
			 return false;
		 }
		 
	}

}
