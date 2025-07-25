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