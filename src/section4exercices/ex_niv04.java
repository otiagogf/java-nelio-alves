package section4exercices;
import java.util.Locale;
import java.util.Scanner;
/*
    Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    decimais.
*/
public class ex_niv04 {
    public static void main(String[] args) {
        double numeroDig, horasTrabalhadas, valorHora, salario;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numeroDig = sc.nextDouble();
        System.out.print("Digite suas horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();
        System.out.print("Digite quanto você ganha por hora: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("Number = " + numeroDig);
        System.out.println("Salário = U$" + salario);
    }
}
