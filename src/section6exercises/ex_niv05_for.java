package section6exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex_niv05_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n;
        int fatorial = 1;

        System.out.println("Digite N: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}
