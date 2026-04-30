package pooHeranca;

public class Estudante extends Pessoa {

    // atributos
	private String matricula;
	private String curso;

	// método construtor 
	public Estudante(String nomeSocial, int idade, String email, String matricula, String curso) {
        super(nomeSocial, idade, email);
        // pessoa(nome, idade, email)
        
		this.matricula = matricula;
		this.curso = curso;
	}

	// métodos de acesso ( get - pega ou mostra / set - atualiza ou processa
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;

} 
	}
