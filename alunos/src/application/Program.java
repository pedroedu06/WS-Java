import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student st = new Student();

        System.out.print("Insira o nome do estudante: ");
        st.name = sc.nextLine();
        System.out.print("Insira a nota 1: ");
        st.grade1 = sc.nextDouble();
        System.out.print("Insira a nota 2: ");
        st.grade2 = sc.nextDouble();
        System.out.print("Insira a nota 3: ");
        st.grade3 = sc.nextDouble();

        System.out.println("A nota final do estudante: " + st.FinalGrade());

        if (st.FinalGrade() < 60.0) {
            System.out.println("REPROVADO!");
            System.out.printf("Faltou %.2f pontos!%n", st.MissingPoints());
        } else {
            System.out.println("APROVADO!");
        }

        sc.close();
    }
}
