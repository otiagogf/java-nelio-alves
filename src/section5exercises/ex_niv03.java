package section5exercises;

import java.util.Locale;
import java.util.Scanner;

/*
    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    ordem crescente ou decrescente.
 */

public class ex_niv03 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();

        if(a % b == 0 || b % a == 0) {
            System.out.print("São múltiplos!");
        } else {
            System.out.print("Não são múltiplos!");
        }
    }
}
