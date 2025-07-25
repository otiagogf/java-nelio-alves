package section4exercices;
import java.util.Locale;
import java.util.Scanner;
/*
    Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
    casas decimais conforme exemplos.
    Fórmula da área: area = π . raio2
    Considere o valor de π = 3.14159
*/

public class ex_niv02 {
    public static void main(String[] args) {
        double area, raio, pi;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        pi = 3.14159;

        System.out.println("Informe o raio do círculo: ");
        raio = sc.nextDouble();

        area = pi * (raio * raio);

        System.out.printf("O resultado da área do círculo é: %.4f%n", area);

        sc.close();

    }
}
