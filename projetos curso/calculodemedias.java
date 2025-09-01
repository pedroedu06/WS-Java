package calcularnumerosinteiros;

import java.util.Scanner;
public class calculodemedias {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		float[] notas = new float[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite a nota" + (i + 1) + ":");
			notas[i] = myScan.nextFloat();
		}
		
		float soma = 0;
		
		for(int i = 0;i < 3; i++) {
			soma += notas[i];
		}
		
		float media = soma / 3;
		
		System.out.println("A media das notas e: " + media);
		
		myScan.close();
	}
	
}
