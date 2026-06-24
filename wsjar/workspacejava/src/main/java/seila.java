import java.util.Scanner;

public class seila {

    public static void main(String[] args) {
        String nome;
        float r;

        Scanner x = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        nome = x.nextLine();
        System.out.println("Insira sua renda: ");
        r = x.nextFloat();

        if (r > 5000.0) {
            System.out.println(nome + " voce nao tem acesso a bolsa de estudos");
        } else {
            System.out.println(nome + " voce tem acesso a bolsa de estudos! parabens");
        }
        x.close();
    }
}
