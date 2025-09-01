package calcularnumerosinteiros;
import java.util.Scanner;
public class aumentode25porcento {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("digite seu salario para receber seu aumento de 25%: ");
		float antigoSalario = myScan.nextFloat();
		float porcentagem = 25;
		
		float novoSalario = antigoSalario + (antigoSalario * porcentagem/100);
		
		System.out.println("Seu salario foi reajustado com um aumento de 25%!");
		System.out.println("Seu salario foi reajustado para: " + novoSalario);
		
		myScan.close();
	}
}
