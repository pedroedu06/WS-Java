import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rec = new Rectangle();

        System.out.println("Insira a base do retangulo: ");
        rec.width = sc.nextDouble();
        System.out.println("Insira a altura do retangulo: ");
        rec.height = sc.nextDouble();

        System.out.println(rec);

        sc.close();
    }
}
