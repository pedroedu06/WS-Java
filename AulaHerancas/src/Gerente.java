
public class Gerente {

	private int Equipe;
	private double Bonus;
	private Funcionario funcionario;
	
	public Gerente(Funcionario funcionario, int equipe, double bonus) {
		this.funcionario = funcionario;
		this.Equipe = equipe;
		this.Bonus = bonus;
	}
	
	public double calcularSalarioComBonus() {
		return funcionario.getSalario() + Bonus;
	}
	
	public void gerenciarEquipe() {
		System.out.println(funcionario.getNome() + "" + "admitido em" + funcionario.getData() + "esta gerenciando a equipe de tamanho: " + Equipe);
	}
	
	public void mostrarDados() {
		funcionario.mostrarDados();
		System.out.println("Tamanho da equipe: " + Equipe);
		System.out.println("Seu bonus: " + Bonus);
	}
	
}
 