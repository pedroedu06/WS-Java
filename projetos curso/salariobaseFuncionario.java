package calcularnumerosinteiros;

import java.util.Scanner;

public class salariobaseFuncionario {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Qual e o salario base do funcionario?");
		double salarioBase = myScan.nextDouble();
		
		double salarioReajuste = salarioBase + (salarioBase * 5/100);
		double salarioFinal = salarioReajuste - (salarioReajuste * 7/100);
		
		System.out.println("O salario base do funcionario e: " + salarioBase);
		System.out.println("O salario final do funcionario com reajustes e impostos sera de: " + salarioFinal);
		
		myScan.close();
	}

}
