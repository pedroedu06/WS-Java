
public class Pessoa {
	protected String Nome;
	protected String CPF;
	protected int Idade;
	
	public Pessoa(String nome, String cpf, int idade) { 
		this.Nome = nome;
		this.Idade = idade;
		this.CPF = cpf;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + Nome);
		System.out.println("Idade: " + Idade);
		System.out.println("Cpf: " + CPF);
	}
	
	public String getNome() {
		return Nome;
	}
	
	public int getIdade() {
		return Idade;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setNome() {
		this.Nome = Nome;
	}
	public void setCPF() {
		this.CPF = CPF;
	}
	public void setIdade() {
		this.Idade = Idade;
	}
} 
