# Condicionais no Java

## Estruturas para que os programas se comportem de um jeito de acordo com os dados informados pelos usuários.

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