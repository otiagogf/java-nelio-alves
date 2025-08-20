package section8exercises.fixacao03;

public class Aluno {
    String name;
    double nota1, nota2, nota3;

    public double calcMedia() {
        return nota1 + nota2 + nota3;
    }

    public double missingPoints() {
        if(calcMedia() < 60) {
            return 60.0 - calcMedia();
        } else {
            return 0.0;
        }
    }
}
