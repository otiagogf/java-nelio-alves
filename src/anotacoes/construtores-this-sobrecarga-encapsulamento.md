# Construtores, palavra this, sobrecarga, encapsulamento

## Construtores
* É uma operação especial da classe, que executa no momento da instanciação do objeto
* Usos comuns
  * Iniciar valores dos atributos
  * Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)
* Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
  * Product p = new Product();
* É possível especificar mais de um construtor na mesma classe (sobrecarga)

### Exemplo de construtores
```java
package entities;
    public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
    }
}
```
```java
package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
        
        System.out.println("Product data: " + product);
        System.out.println();
        
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        
        System.out.println("Updated data: " + product);
        System.out.println();
        
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}
```

## Palavra this
* É uma referência para o próprio objeto
*  Usos comuns:
  * Diferenciar atributos de variáveis locais
  * Passar o próprio objeto como argumento na chamada de um método ou construtor

```java
// Product product = new Product("TV", 1500.0, 0);
/* 
    public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}
 */

// Primeira linha se trata de atributo local e os valores com this são as referências diretas ao objeto
```

## Sobrecarga
* É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.
```java
package entities;
    public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product() {
    }
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
    }
}
```
```java
package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);
        
        System.out.println("Product data: " + product);
        System.out.println();
        
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        
        System.out.println("Updated data: " + product);
        System.out.println();
        
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}
```

## Encapsulamento
* É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.
* Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

### Regra geral básica
* Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
* Os atributos devem ser acessados por meio de métodos get e set
  * Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans 

### Padrão para implementação de getters e setters
```java
private String name;
private double price;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
```

```java
package entities;
    public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
    }
}
```
```java
package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);
        
        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200,00);
        System.out.println("Updated price: " + product.getPrice());
        
        System.out.println("Product data: " + product);
        System.out.println();
        
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        
        System.out.println("Updated data: " + product);
        System.out.println();
        
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }
}
```

## Modificadores de acesso
* private: o membro só pode ser acessado na própria classe
* (nada): o membro só pode ser acessado nas classes do mesmo pacote
* protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
* public: o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está)