# Membros estáticos

## membros = atributos e métodos

## Também são chamados membros de classe
* Em oposição a membros e instância

## São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.

## Aplicações comuns:
* Classes utilitárias
  * Math.sqrt(double)
* Declaração de constantes
  * variáveis com final na inicialização

## Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada.

## Problema exemplo
### Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar também o valor de PI com duas casas decimais.

## Checklist
* Versão 1: métodos na própria classe do programa
  * dentro de um método estático você não pode chamar membros de instância da mesma classe.
    * ```java
      package application;
      import java.util.Locale;
      import java.util.Scanner;
      public class Program {
          public static final double PI = 3.14159;
          public static void main(String[] args) {
              Locale.setDefault(Locale.US);
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter radius: ");
              double radius = sc.nextDouble();
              double c = circumference(radius);
              double v = volume(radius);
              System.out.printf("Circumference: %.2f%n", c);
              System.out.printf("Volume: %.2f%n", v);
              System.out.printf("PI value: %.2f%n", PI);
              sc.close();
          }
          public static double circumference(double radius) {
            return 2.0 * PI * radius;
          }
          public static double volume(double radius) {
            return 4.0 * PI * radius * radius * radius / 3.0;
          }
      }
      ```
* Versão 2: classe Calculator com membros de instância
  * ```java
      package util;
      public class Calculator {
          public final double PI = 3.14159;
          public double circumference(double radius) {
            return 2.0 * PI * radius;
          }
          public double volume(double radius) {
            return 4.0 * PI * radius * radius * radius / 3.0;
          }
      }
    ```
    * ```java
        public class Program {
            public static void main(String[] args){
              Calculator calc = new Calculator();
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                double c = calc.circumference(radius);
                double v = calc.volume(radius);
                System.out.printf("Circumference: %.2f%n", c);
                System.out.printf("Volume: %.2f%n", v);
                System.out.printf("PI value: %.2f%n", calc.PI);
            }
      }
      ```

      
### No problema dos triângulos dos exercícios anteriores, cada triângulo possui sua área.
### Area() é uma operação concernente ao objeto, cada triângulo tem seu valor de área (area x ou área y)

### Já no caso da calculadora, os valores dos cálculos não mudam para calculadoras diferentes, ou seja, são cálculos estáticos. O valor de Pi também é estático.

* Versão 3: classe Calculator com método estático
* ```java
  package util;
  public class Calculator {
      public static final double PI = 3.14159;
      public static double circumference(double radius) {
          return 2.0 * PI * radius;
      }
      public static double volume(double radius) {
          return 4.0 * PI * radius * radius * radius / 3.0;
      }
  }
  ```
* ```java
    public class Program {
          public static void main(String[] args){
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                double c = Calculator.circumference(radius);
                double v = Calculator.volume(radius);
                System.out.printf("Circumference: %.2f%n", c);
                System.out.printf("Volume: %.2f%n", v);
                System.out.printf("PI value: %.2f%n", Calculator.PI);
          }
  }
  ```

