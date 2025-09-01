package calcularnumerosinteiros;

import java.util.Scanner;

public class calcularnumeros {

	public static void main(String[] args) {
		Scanner scanNumeros = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero da soma: ");
		int numero1 =  scanNumeros.nextInt();
		System.out.println("Digite o segundo numero da soma: ");
		int numero2 = scanNumeros.nextInt();
		System.out.println("Digite o terceiro numero da soma: ");
		int numero3 = scanNumeros.nextInt();
		System.out.println("Digite o quarto numero da soma: ");
		int numero4 = scanNumeros.nextInt();
		
		int resSoma = numero1 + numero2 + numero3 + numero4;
		
		System.out.print(resSoma);
		
		scanNumeros.close();
	}

}
