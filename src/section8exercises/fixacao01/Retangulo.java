package section8exercises.fixacao01;

import java.util.Scanner;

public class Retangulo {
    Scanner sc = new Scanner(System.in);
    double width, height;

    public double Area() {
        return width * height;
    }

    public double Perimeter() {
        return 2 * (width + height);
    }

    public double Diagonal() {
        return Math.sqrt(width * width + height * height);
    }

}
