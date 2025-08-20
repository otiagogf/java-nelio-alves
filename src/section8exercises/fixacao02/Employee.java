package section8exercises.fixacao02;

import java.util.Scanner;

public class Employee {
    String name;
    double grossSalary;
    double tax;
    Scanner sc = new Scanner(System.in);

    public double NetSalary() {
        return grossSalary - tax;
    }

    public double IncreaseSalary(double percentage) {
        return grossSalary += grossSalary * percentage / 100;
    }
    public String toString() {
        return name + ", $ " + String.format("%.2f", NetSalary());
    }
}
