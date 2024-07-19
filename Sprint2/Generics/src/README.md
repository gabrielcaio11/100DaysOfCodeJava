
# Gerenciador Genérico de Listas

Este projeto demonstra o uso de Generics em Java para criar um gerenciador de listas que pode trabalhar com diferentes tipos de dados. Ele inclui funcionalidades comuns como adicionar, remover e listar itens. O projeto utiliza uma classe genérica `ListaGerenciador` para fornecer essas funcionalidades de maneira reutilizável e flexível.

## Estrutura do Projeto

- **application.Main**: Classe principal que demonstra o uso do gerenciador de listas com diferentes tipos de dados.
- **entities.ListaGerenciador**: Classe genérica que gerencia uma lista de itens.
- **entities.Produto**: Classe que representa um produto com nome e código.


## Funcionalidades

### 1. Gerenciador de Livros

Gerencia uma lista de livros representados por `String`.

```java
ListaGerenciador<String> gerenciadorLivros = new ListaGerenciador<>();
gerenciadorLivros.adicionarItem("O Senhor dos Anéis");
gerenciadorLivros.adicionarItem("O Hobbit");
gerenciadorLivros.adicionarItem("Harry Potter");
```

### 2. Gerenciador de Números

Gerencia uma lista de números representados por `Integer`.

```java
ListaGerenciador<Integer> gerenciadorNumeros = new ListaGerenciador<>();
gerenciadorNumeros.adicionarItem(10);
gerenciadorNumeros.adicionarItem(20);
gerenciadorNumeros.adicionarItem(30);
```

### 3. Gerenciador de Produtos

Gerencia uma lista de produtos representados pela classe `Produto`.

```java
ListaGerenciador<Produto> gerenciadorProdutos = new ListaGerenciador<>();
gerenciadorProdutos.adicionarItem(new Produto("Notebook", 101));
gerenciadorProdutos.adicionarItem(new Produto("Celular", 102));
gerenciadorProdutos.adicionarItem(new Produto("Tablet", 103));
```

