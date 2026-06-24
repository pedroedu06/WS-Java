
public class main {

	public static void main(String[] args) {
		//nova pessoa
		
		System.out.println("|----Criando pessoas----|");
		Pessoa p1 = new Pessoa("Pedro Eduardo", "123.133.133.00", 21);
		Pessoa p2 = new Pessoa("Andre", "122.143.203.11", 40);
		p1.mostrarDados();
		p2.mostrarDados();

		System.out.println("|---Criando novos funcionarios---|");
		Funcionario f1 = new Funcionario("Leticia", "255.255.255.00", 30, "Analista", "15/02/2021", 3000.00);
		Funcionario f2 = new Funcionario("Raphael", "482.234.444.00", 26, "Gerente de Deposito", "02/09/2024", 5000.00);
		f1.mostrarDados();
		f2.mostrarDados();
		
		System.out.println("|---Criando novos gerentes---|");
		Gerente g1 = new Gerente(f2, 13, 10);
		g1.mostrarDados();
		
		
	}

}
