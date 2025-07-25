package section4exercices;
import java.util.Scanner;
/*
    Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    mensagem explicativa, conforme exemplos.
*/

public class ex_niv01 {
    public static void main(String[] args) {
        double entry1, entry2, result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira entrada: ");
        entry1 = sc.nextDouble();

        System.out.println("Digite a primeira entrada: ");
        entry2 = sc.nextDouble();

        result = entry1 + entry2;
        System.out.println("Seu resultado foi: " + result);

        sc.close();
    }
}

