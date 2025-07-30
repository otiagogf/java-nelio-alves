package section5exercises;

import java.util.Locale;
import java.util.Scanner;

/*
    Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
    seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
    nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */

public class ex_niv06 {
    public static void main(String[] args) {
        double number;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.printf("Digite um valor: ");
        number = sc.nextDouble();

        if(number < 0.0 || number > 100.0) {
            System.out.printf("Fora do intervalo!");
        } else if(number <= 25.0) {
            System.out.printf("Intervalo [0, 25]!");
        } else if(number <= 50.0) {
            System.out.printf("Intervalo [25, 50]!");
        } else if(number <= 75.0) {
            System.out.printf("Intervalo [50, 75]!");
        } else {
            System.out.printf("Intervalo [75, 100]!");
        }
    }
}
