import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class curso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area triangulo X: %.4f%n", areaX);
        System.out.printf("Area triangulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O triangulo de maior area e o X");
        } else {
            System.out.println("O triangulo de maior area e o Y");
        }

        sc.close();
    }

}
