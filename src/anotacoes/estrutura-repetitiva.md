# Estrutura repetitiva WHILE

## É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
* Utilizada quando não sabemos previamente a quantidade de repetições que será realizada. 

# Estrutura repetitiva FOR
## É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
* Utilizada quando se sabe préviamente a quantidade de repetições ou intervalo de valores.
``` java
// Exemplo de contagem
for (int i=0; i<5; i++) {
    System.out.println("Valor de i: " + i);
}
```
``` java
// Exemplo de contagem regressiva
for (int i=4; i>=0; i--) {
    System.out.println("Valor de i: " + i);
}
```

# Estrutura repetitiva do-while
## A declaração do...while cria um laço que executa uma declaração até que o teste da condição for falsa (false). A condição é avaliada depois que o bloco de código é executado, resultando que uma declaração seja executada pelo menos uma vez.

``` java
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        sc.close();
    }
}
```