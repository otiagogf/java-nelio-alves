# Funções

## Representam um processamento que possui um significado
### math.sqrt(double)
### System.out.println(string)

## Principais vantagens: modularização, delegação e reaproveitamento

## Dados de entrada e saída
### Funções podem receber dados de entrada (parâmetros ou argumentos)
### Funções podem ou não retornar uma saída

## Em orientação a objetos, funções em classes recebem o nome de "métodos".

```java
package course;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a > b && a > c) {
            System.out.println("Higher = " + a);
        } else if (b > c) {
            System.out.println("Higher = " + b);
        } else {
            System.out.println("Higher = " + c);
        }
        sc.close();
    }
}
```