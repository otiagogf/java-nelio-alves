package section4exercices;
import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

public class ex_niv03 {
    public static void main(String[] args) {
        int a, b, c, d, diff;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        c = sc.nextInt();

        System.out.print("Digite o valor de D: ");
        d = sc.nextInt();

        diff = (a*b)-(c*d);

        System.out.println("Diferença = " + diff);

    }
}
