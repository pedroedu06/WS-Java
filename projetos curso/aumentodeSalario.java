package calcularnumerosinteiros;


import java.util.Scanner;
public class aumentodeSalario {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("quanto e o seu salario? : ");
		double salario = myScan.nextDouble();
		System.out.println("qual e a porcentagem do aumento? :");
		double porcentagemAumento = myScan.nextDouble();
		
		double salarioFinal = salario + (salario * porcentagemAumento/100);
		
		System.out.println("Seu salario inicial: " + salario);
		System.out.println("Seu salario com o aumento: " + salarioFinal);
		
		myScan.close();
	}

}
