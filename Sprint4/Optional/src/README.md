# Gerenciamento de Estoque de Produtos

Este projeto é uma aplicação Java simples para gerenciar um estoque de produtos. Ele permite adicionar, remover, atualizar e listar produtos no estoque, utilizando as classes `Produto` e `OperacoesProduto`. Exceções personalizadas são usadas para tratar casos em que um produto já existe no estoque ou não existe ao tentar remover ou atualizar.

## Estrutura do Projeto

+ **com.gcaio.entities**

- `Produto`: Representa um produto com atributos `nome`, `quantidade` e `codigo`.
	
- `OperacoesProduto`: Fornece métodos para adicionar, remover, atualizar e listar produtos no estoque.

+ **com.gcaio.exception**
- `ProdutoJaExisteNoEstoque`: Exceção lançada ao tentar adicionar um produto que já existe no estoque.
- `ProdutoNaoExisteNoEstoque`: Exceção lançada ao tentar remover ou atualizar um produto que não existe no estoque.

+ **com.gcaio.application**
- `Main`: Classe principal para executar a aplicação e testar as funcionalidades.

## Funcionalidades

### Produto
A classe `Produto` possui os seguintes atributos e métodos:
- `nome`: Nome do produto.
- `quantidade`: Quantidade do produto.
- `codigo`: Código único do produto.
- Métodos `getters` e `setters` para os atributos.
- Sobrescrita dos métodos `equals`, `hashCode` e `toString`.

### OperacoesProduto
A classe `OperacoesProduto` fornece métodos para gerenciar os produtos:
- `adicionarProduto(Produto produto)`: Adiciona um produto ao estoque.
- `removerProduto(String codigo)`: Remove um produto do estoque pelo código.
- `obterPorCodigo(String codigo)`: Obtém um produto pelo código.
- `atualizarProduto(Produto produtoAtualizado)`: Atualiza os detalhes de um produto existente.
- `listarTodos()`: Lista todos os produtos no estoque.

### Exceções
- `ProdutoJaExisteNoEstoque`: Lançada ao tentar adicionar um produto que já existe no estoque.
- `ProdutoNaoExisteNoEstoque`: Lançada ao tentar remover ou atualizar um produto que não existe no estoque.

