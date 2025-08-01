package section6exercises;

import java.util.Scanner;

public class ex_niv07_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int primeiro, segundo, terceiro;

            primeiro = i;
            segundo = i*i;
            terceiro = i*i*i;

            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
    }
}
