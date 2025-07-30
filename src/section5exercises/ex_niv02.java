package section5exercises;
import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

public class ex_niv02 {
    public static void main(String[] args) {
        int number;
        String parOuImpar;

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe um número: ");
        number = sc.nextInt();

        parOuImpar = (number % 2 == 0) ?  "Par": "Ímpar";
        System.out.printf(parOuImpar);
    }
}
