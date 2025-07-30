# Condicionais no Java

## Estruturas para que os programas se comportem de um jeito de acordo com os dados informados pelos usuários.
### Estrutura condicional: 
#### É uma estrutura de controle que permite definir que um certo bloco de comandos somente será executado dependendo de uma condição

#### Condicional simples, exemplo:
```java

public class Aprovado {
    public static void main(String[] args) {
        if(aprovado) {
            System.out.println("Você passou");
        }
        System.out.println("Resultado!");
    }
}
```

#### Condicional composta, exemplo:
```java

public class Aprovado {
    public static void main(String[] args) {
        if(aprovado) {
            System.out.println("Você passou");
        } else {
            System.out.println("Está em recuperação");
        }
    }
}
```

### É possível criarmos uma estrutura de if, if-else e o exemplo conforme abaixo:

```java
public class Aprovado {
    public static void main(String[] args) {
        if(aprovado) {
            System.out.println("Você passou");
        } else if(recuperacao) {
                System.out.println("Está em recuperação");
        } else {
            System.out.println("Reprovado");
        }
        
        System.out.println("Resultado!");
    }    
}
```

## Operadores de atribuição cumulativa
### Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.

#### Exemplos:
* a += b;
* a -= b;
* a *= b;
* a /= b;
* a %= b;
* a = a + b;
* a = a - b;
* a = a * b;
* a = a / b;
* a = a % b;

```java
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100) {
        conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        sc.close();
    }
}
```

## Estrutura switch-case
### Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.

#### Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o dia da semana correspondente, conforme exemplos.
```java
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;
        switch(x)

        {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: "+dia);
        sc.close();
    }
}
```

## Estrutura condicional ternária
### Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.

* Sintaxe:
  ( condição ) ? valor_se_verdadeiro : valor_se_falso
* ( 2 > 4 ) ? 50 : 80

```java
double preco = 34.5;
double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
```