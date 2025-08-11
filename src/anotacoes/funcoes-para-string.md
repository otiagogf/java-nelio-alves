# Funções para strings em Java.

## Funções de formatação:
* toLowerCase() - Converte todos os caracteres em String letras minúsculas usando as regras da localidade padrão.:
```java
String original = "abcde FGHIJ ABC abd DEFG    ";

String s01 = original.toLowerCase();
// abcde fghij abd abd defg
```
* toUpperCase() - Converte todos os caracteres em String maiúsculas usando as regras da localidade padrão.:
```java
String original = "abcde FGHIJ ABC abd DEFG    ";

String s01 = original.toUpperCase();
// ABCDE FGHIJ ABC ABD DEFG
```
* trim() - Usado para remover espaços em branco no início e no final de uma string. Espaços em branco incluem espaços, tabulações e quebras de linha. O método retorna uma nova string com os espaços removidos, sem alterar a string original. :
```java
String original = "  - abcde FGHIJ ABC abd DEFG    ";

String s01 = original.trim();
//-abcde FGHIJ ABC abc DEFG
```

## Recortar
### O método retorna uma substring da string. Se o argumento final não for especificado, a substring terminará no final da string.
* substring(inicio) - obrigatório:
* substring(fim) - opcional:
```java
public class Main {
    public static void main(String[] args) {
        String myStr = "Hello, World!";
        System.out.println(myStr.substring(7, 12));
    }
}

// World
```

## Substituir
### O método pesquisa uma string por um caractere especificado e retorna uma nova string onde o(s) caractere(s) especificado(s) são substituídos.
* Replace(char, char) - Um char, representando o caractere que será substituído pelo novo caractere: 
* Replace(string, string) - char, representando o caractere para substituir o searchChar por:
```java
public class Main {
    public static void main(String[] args) {
        String myStr = "Hello";
        System.out.println(myStr.replace('l', 'p'));
    }
}
// Heppo
```


## Buscar
### O método retorna a posição da primeira ocorrência do(s) caractere(s) especificado(s) em uma string.
* IndexOf - Pode ser utilizado para tetornar a posição da última ocorrência dos caracteres especificados em uma string.:
##### Parâmetros IndexOf
* str - Um valor String, representando a string a ser pesquisada
* fromIndex - Um valor int, representando a posição do índice para iniciar a pesquisa
* char - Um valor int, representando um único caractere, por exemplo 'A', ou um valor Unicode

```java
public class Main {
    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));
    }
}
// 6
```
```java
public class Main {
    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("e", 5));
    }
}
// 10
```
* LastIndexOf - O método lastIndexOf() retorna a posição da última ocorrência do(s) caractere(s) especificado(s) em uma string.:
##### Parâmetros LastIndexOf
* str - Um valor String, representando a string a ser pesquisada
* fromIndex - Um valor int, representando a posição do índice a partir da qual a pesquisa pode ser iniciada. Se omitido, o valor padrão é o comprimento da string.
* char - Um valor int, representando um único caractere, por exemplo 'A', ou um valor Unicode
```java
public class Main {
    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.lastIndexOf("e", 5));
    }
}
// 1
```
## Str.Split(" ")
### O método split() divide uma string em um array de substrings usando uma expressão regular como separador. Se um limite for especificado, o array retornado não será maior que o limite. O último elemento do array conterá o restante da string, que ainda poderá conter separadores caso o limite tenha sido atingido.
#### Parâmetros
* regex - Obrigatório. Uma expressão regular que define os separadores onde a string é dividida.
* limit - Opcional. O comprimento máximo do array retornado.
```java
public class Main {
  public static void main(String[] args) {
    String myStr = "Split a string by spaces, and also punctuation.";
    String regex = "[,\\.\\s]";
    String[] myArray = myStr.split(regex);
    for (String s : myArray) {
	    System.out.println(s);
    }
  }
}
/*
Split
a
string
by
spaces

and
also
punctuation
*/
```
