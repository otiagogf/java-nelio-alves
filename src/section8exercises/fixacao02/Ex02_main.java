package section8exercises.fixacao02;

import java.util.Scanner;

public class Ex02_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double grossSalary;
        double tax;
        double percentage;

        Employee empl = new Employee();

        System.out.println("Digite nome: ");
        empl.name = sc.next();
        System.out.println("Digite o salário: ");
        empl.grossSalary = sc.nextDouble();
        System.out.println("Digite a taxa: ");
        empl.tax = sc.nextDouble();

        System.out.println("Employee: " + empl.name + ", " + empl.NetSalary());

        System.out.println("Digite a porcentagem: ");
        percentage = sc.nextDouble();
        empl.IncreaseSalary(percentage);

        System.out.println("Updated data: " + empl);
    }
}
