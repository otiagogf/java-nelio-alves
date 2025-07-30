package section5exercises;

import java.util.Locale;
import java.util.Scanner;

/*
    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
    seguir, calcule e mostre o valor da conta a pagar.
 */

public class ex_niv05 {
    public static void main(String[] args) {
        int codigo, quantidade;
        double preco, total;
        String nome;

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o código: ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        quantidade = sc.nextInt();

        preco = 0;

        switch (codigo) {
            case 1:
                nome = "Cachorro Quente";
                preco = 4.00;
                break;
            case 2:
                nome = "X-Salada";
                preco = 4.50;
                break;
            case 3:
                nome = "X-Bacon";
                preco = 5.00;
                break;
            case 4:
                nome = "Torrada Simples";
                preco = 2.00;
                break;
            case 5:
                nome = "Refrigerante";
                preco = 1.50;
                break;
            default:
                System.out.print("Código inválido");
        }

        total = ((double) quantidade) * preco;
        System.out.printf("Total: R$ %.2f%n", total);

    }
}
