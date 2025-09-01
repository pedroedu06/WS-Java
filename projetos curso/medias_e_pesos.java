package calcularnumerosinteiros;


import java.util.Scanner;
public class medias_e_pesos {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);	
		float[] notas = new float[3];
		float[] pesos = new float[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite a nota" + (i + 1) + ":");
			notas[i] = myScan.nextFloat();
			System.out.println("Digite o peso da nota" + (i + 1) + ":");
			pesos[i] = myScan.nextFloat();
		}
		
		float somaPesos = 0;
		float somaPonderada = 0;
		
		for(int i = 0; i < 3; i++) {
			somaPonderada += notas[i] * pesos[i];
			somaPesos += pesos[i];
		}
		
		float resultadoPonderada = somaPonderada / somaPesos;
		
		System.out.print("Resultado da soma das ponderadas: " + somaPonderada);
		System.out.print("resultado da media ponderada: " + resultadoPonderada);
		
		myScan.close();
	} 
}
