import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escolha 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = max(a,b,c);

        ShowResult(result);
        sc.close();
    }

    public static int max(int a,int b,int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void ShowResult(int value) {
        System.out.println("Higher = " + value);
    }

}
