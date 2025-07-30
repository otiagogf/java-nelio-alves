package section6exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex_niv02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x, y;

        System.out.printf("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.printf("Digite o valor de Y: ");
        y = sc.nextInt();

        while(x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto Quadrante");
            }
        }
        sc.close();
    }
}
