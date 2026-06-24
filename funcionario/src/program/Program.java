import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee em = new Employee();

        System.out.print("Insira o nome do funcionario: ");
        em.name = sc.nextLine();
        System.out.print("Insira o salario bruto: ");
        em.grossSalary = sc.nextDouble();
        System.out.print("Insira o imposto: ");
        em.tax = sc.nextDouble();

        System.out.println();
        System.out.println(em);

        System.out.println();
        System.out.print("Qual sera o percentual de aumento de salario do funcionario?");
        double percentage = sc.nextDouble();
        em.IcreaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + em);

        sc.close();
    }
}
