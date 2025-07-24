## Vetores

### Vetor ou Array, é uma estrutura de dados que utilizamos para armazenar uma coleção do mesmo tipo. Cada elemento é acessado por meio de um índice, começando em zero. Arrays em Java são objetos e possuem tamanho fixo após a criação.
#### Características
* Coleção de elementos: Um array contém múltiplos elementos do mesmo tipo de dados. 
* Tamanho fixo: O tamanho de um array é definido na criação e não pode ser alterado posteriormente. 
* Acesso por índice: Cada elemento é acessado por meio de um índice inteiro, começando em zero. 
* Alocação dinâmica: Arrays são alocados dinamicamente na memória. 
* Tipos de dados: Podem armazenar tipos primitivos (como int, double, char) ou objetos de classes. 

#### Declaração e inicialização
```java
int[] numeros = new int[5]; // Array de inteiros com 5 posições
String[] nomes = {"Maria", "João", "Pedro"}; // Array de strings com 3 elementos
```
#### Acesso aos elementos
* Para acessar um elemento específico, utilize o índice de colchetes:
```java
int primeiroNumero = numeros[0]; // Acessa o primeiro elemento (índice 0)
String segundoNome = nomes[1]; // Acessa o segundo elemento (índice 1)
```
#### Operações comuns
* Atribuição: Atribuir um valor a um elemento do array:
  ```java
  //numeros[2] = 10; // Atribui o valor 10 à terceira posição do array
    ```
* Iteração: Percorrer todos os elementos do array usando loops (for, while, for-each): 
  ```java
  /*for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
  ```
* Tamanho: Obter o número de elementos:
  ```java
    //numeros[2] = 10; // Atribui o valor 10 à terceira posição do array
    ```
* Cópia: Criar uma cópia do array: 
  ```java
   String[] nomesCopia = Arrays.copyOf(nomes, nomes.length); //Copia o array nomes para nomesCopia
  ```
* Clonagem: Criar uma cópia do array usando o método clone(): 
  ```java
   String[] nomesClone = nomes.clone(); // Cria uma cópia do array nomes
  ```
  
