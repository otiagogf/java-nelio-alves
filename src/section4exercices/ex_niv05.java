package section4exercices;
import java.util.Locale;
import java.util.Scanner;
/*
    Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

public class ex_niv05 {
    public static void main(String[] args) {
        int codPeca, codPeca2, quantPeca, quantPeca2;
        double valorPeca, valorPeca2, total;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça: ");
        codPeca = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        quantPeca = sc.nextInt();
        System.out.println("Digite o valor da peça: ");
        valorPeca = sc.nextDouble();

        System.out.println("Digite o código da peça: ");
        codPeca2 = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        quantPeca2 = sc.nextInt();
        System.out.println("Digite o valor da peça: ");
        valorPeca2 = sc.nextDouble();

        total = (valorPeca * (double) quantPeca) + (valorPeca2 * (double) quantPeca2);
        System.out.printf("Valor a pagar: R$ %.2f%n", total);
    }
}
