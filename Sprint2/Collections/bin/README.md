## Biblioteca

Este projeto é um sistema simples de gerenciamento de livros em uma biblioteca. Ele permite listar livros, pegar livros emprestados e devolver livros.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

- `Main.java`: Classe principal que contém o menu de interação com o usuário.
- `Livro.java`: Classe que representa um livro na biblioteca.


## Funcionalidades

### 1. Listar Livros

Lista todos os livros cadastrados na biblioteca.

### 2. Pegar Livro Emprestado

Permite ao usuário pegar um livro emprestado. O sistema verifica a disponibilidade do livro antes de confirmar o empréstimo.

### 3. Devolver Livro

Permite ao usuário devolver um livro. O sistema verifica se o livro está registrado antes de aceitar a devolução.

### 4. Sair

Encerra o programa.

## Exemplo de Uso

Ao iniciar o programa, você verá um menu como este:

```
Menu de Biblioteca
1. Listar Livros
2. Pegar Livro Emprestado
3. Devolver Livro
4. Sair
```

Você pode digitar o número da opção desejada e seguir as instruções na tela.

Aqui estão alguns exemplos de uso para cada funcionalidade do sistema:

### 1. Listar Livros

**Exemplo de Entrada:**

```
1
```

**Exemplo de Saída:**

``` 
Livros Cadastrados:
Título: Livro 1, Autor: Autor 1, Ano: 2000, Páginas: 200, Editora: Editora 1, Quantidade: 100
Título: Livro 2, Autor: Autor 2, Ano: 2001, Páginas: 300, Editora: Editora 2, Quantidade: 200
Título: Livro 3, Autor: Autor 3, Ano: 2002, Páginas: 400, Editora: Editora 3, Quantidade: 300
```

### 2. Pegar Livro Emprestado

**Exemplo de Entrada:**

```
2
Pegar Livro Emprestado
Titulo do Livro: Livro 1
```

**Exemplo de Saída:**

```
Livro disponivel para emprestimo!
```

**Exemplo quando o livro não está disponível:**

```
2
Pegar Livro Emprestado
Titulo do Livro: Livro 1
```

**Saída:**

```
Livro indisponivel para emprestimo!
```

### 3. Devolver Livro

**Exemplo de Entrada:**

```
3
Devolver Livro
Titulo do Livro: Livro 1
```

**Exemplo de Saída:**

```
Livro devolvido com sucesso!
```

**Exemplo quando o livro não é encontrado:**

```
3
Devolver Livro
Titulo do Livro: Livro 4
```

**Saída:**

```
Livro não encontrado.
```

### 4. Sair

**Exemplo de Entrada:**

```
4
```

**Exemplo de Saída:**

```
Saindo...
```
