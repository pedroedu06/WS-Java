
public class Funcionario extends Pessoa {
	
	private String cargo;
	private String dataAdmissao;
	private double salario; 
	
	public Funcionario(String nome, String cpf, int idade, String cargo, String dataAdmissao, double salario) {
		super(nome, cpf, idade);
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	
	public double calcularSalarioAnual() {
		return salario * 12;
	}
	
	public void receberAumento(double porcentagem) {
		double aumento = salario * (porcentagem/100);
		System.out.println("o funcionario " + Nome + "recebeu aumento de " + porcentagem + "porcento e seu salario foi para: " + aumento);
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public String getData() {
		return dataAdmissao;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setCargo() {
		this.cargo = cargo;
	}
	
	public void setdataAdmissao() {
		this.dataAdmissao = dataAdmissao;
	}
	
	public void setSalario() {
		this.salario = salario;
	}
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Cargo: " + cargo);
		System.out.println("Data de admissao: " + dataAdmissao);
		System.out.println("Salario: " + salario);
	}
}
