package section6exercises;

import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
    incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
    impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */

public class ex_niv01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int senhaDigitada;

        System.out.printf("Digite a senha: ");
        senhaDigitada = sc.nextInt();

        while(senhaDigitada != 2002) {
            System.out.println("Senha inválida!");
            System.out.printf("Digite a senha novamente: ");
            senhaDigitada = sc.nextInt();
        }

        System.out.printf("Acesso permitido");
        sc.close();
    }
}
