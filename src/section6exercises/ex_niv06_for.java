package section6exercises;

import java.util.Locale;
import java.util.Scanner;

/*
    Ler um número inteiro N e calcular todos os seus divisores.
 */

public class ex_niv06_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x;

        System.out.println("Digite X: ");
        x = sc.nextInt();

        for(int i = 1; i <= x; i++) {
            if(x % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
