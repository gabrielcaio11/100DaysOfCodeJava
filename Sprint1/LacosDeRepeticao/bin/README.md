# Laços de Repetição em Java

Este projeto contém exemplos e explicações sobre os laços de repetição `for`, `while` e `do-while` em Java. Esses laços são fundamentais para a programação e permitem a execução repetitiva de um bloco de código até que uma condição específica seja atendida.

## Estrutura do Projeto

- **for-loop:** Contém exemplos e explicações sobre o laço `for`.
- **while-loop:** Contém exemplos e explicações sobre o laço `while`.
- **do-while-loop:** Contém exemplos e explicações sobre o laço `do-while`.

## Laço `for`

O laço `for` é utilizado quando você sabe, antecipadamente, quantas vezes deseja que um bloco de código seja repetido. Sua sintaxe é:

```java
for (inicialização; condição; incremento) {
    // Código a ser executado
}
```

### Exemplo

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
    }
}
```

Neste exemplo, o valor de `i` é impresso de 0 a 4.

## Laço `while`

O laço `while` é utilizado quando você deseja repetir um bloco de código enquanto uma condição for verdadeira. Sua sintaxe é:

```java
while (condição) {
    // Código a ser executado
}
```

### Exemplo

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Valor de i: " + i);
            i++;
        }
    }
}
```

Neste exemplo, o valor de `i` é impresso de 0 a 4.

## Laço `do-while`

O laço `do-while` é semelhante ao `while`, mas garante que o bloco de código seja executado pelo menos uma vez, pois a condição é verificada após a execução. Sua sintaxe é:

```java
do {
    // Código a ser executado
} while (condição);
```

### Exemplo

```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Valor de i: " + i);
            i++;
        } while (i < 5);
    }
}
```

Neste exemplo, o valor de `i` é impresso de 0 a 4, garantindo pelo menos uma execução do bloco de código.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests com melhorias nos exemplos existentes ou novos exemplos que ajudem a expandir o conhecimento sobre tipos de dados em Java.

## Sobre

Este projeto é parte de um esforço contínuo para compartilhar conhecimento e facilitar o aprendizado de programação em Java. Criado por Gabriel Caio. Você pode me encontrar no LinkedIn.
