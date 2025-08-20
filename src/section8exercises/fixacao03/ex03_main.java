package section8exercises.fixacao03;

import java.util.Scanner;

public class ex03_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double nota1, nota2, nota3;
        Aluno aluno = new Aluno();

        System.out.println("Nome: ");
        name = sc.next();
        System.out.println("Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", aluno.calcMedia());

        if(aluno.calcMedia() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS %n", aluno.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
