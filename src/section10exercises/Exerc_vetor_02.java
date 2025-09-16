package section10exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_vetor_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma, media;

        System.out.print("Quantos números quer digitar? ");
        int numeros = sc.nextInt();

        double[] vetor = new double[numeros];

        for(int i = 0; i < numeros; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;
        for(int i = 0; i < numeros; i++) {
            soma = soma + vetor[i];
        }

        System.out.print("VALORES = ");

        for(int i = 0; i < numeros; i++) {
            System.out.printf("%.1f" , vetor[i]);
        }

        media = soma / numeros;

        System.out.printf("\nSoma = %.2f\n", soma);
        System.out.printf("Média = %.2f\n", media);

        sc.close();
    }
}
