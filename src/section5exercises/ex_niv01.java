package section5exercises;

import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

public class ex_niv01 {
    public static void main(String[] args) {
        int number;
        String negativoOuNao;

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe um número");
        number = sc.nextInt();

        negativoOuNao = (number < 0) ? "Negativo" : "Positivo";

        System.out.printf(negativoOuNao);
    }
}
