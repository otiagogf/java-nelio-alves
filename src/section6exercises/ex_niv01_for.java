package section6exercises;

import java.util.Locale;
import java.util.Scanner;

/*
    Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
    X, se for o caso.
 */

public class ex_niv01_for {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite X: ");
        x = sc.nextInt();

        for(int i = 1; i <= x; i++) {
            if(i % 2 != 0) {
                System.out.println("É ímpar: " + i);
            }
        }

        sc.close();
    }
}
