package section8exercises.fixacao01;

import java.util.Scanner;

public class Ex01_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width, height;
        Retangulo ret = new Retangulo();

        System.out.printf("Digite Width: ");
        ret.width = sc.nextDouble();
        System.out.printf("Digite Height: ");
        ret.height = sc.nextDouble();


        System.out.println("Area: " + ret.Area() );
        System.out.println("Perimetro: " + ret.Perimeter() );
        System.out.println("Diagonal: " + ret.Diagonal() );
    }
}
