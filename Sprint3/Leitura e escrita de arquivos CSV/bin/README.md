# Projeto FilmeCSV

Este projeto Java permite a manipulação de um arquivo CSV contendo informações sobre filmes. Ele inclui funcionalidades para adicionar filmes, listar todos os filmes e buscar um filme por título.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes:

- `com.gcaio.csv.FilmeCSV`: Contém métodos estáticos para manipulação do arquivo CSV.
- `com.gcaio.entities.Filme`: Representa a entidade `Filme` com atributos nome, ano de lançamento e nota.
- `com.gcaio.csv.Main`: Contém o método `main` com um menu interativo para executar as funcionalidades do projeto.

## Funcionalidades

1. **Adicionar Filme**: Adiciona um novo filme ao arquivo CSV.
2. **Listar Filmes**: Lista todos os filmes presentes no arquivo CSV.
3. **Buscar Filme por Título**: Busca um filme específico pelo título no arquivo CSV.

## Exemplo de Uso

Ao executar o programa, você verá um menu com as seguintes opções:
```
Menu:
1. Adicionar filme
2. Listar todos os filmes
3. Buscar filme por título
4. Sair
Escolha uma opção: 
```

### Adicionar um Filme

Digite `1` e pressione `Enter`. Em seguida, forneça os detalhes do filme quando solicitado:
```
Digite o nome do filme: O Poderoso Chefão
Digite o ano de lançamento: 1972
Digite a nota: 9.2
Filme adicionado com sucesso!
```

### Listar Todos os Filmes

Digite `2` e pressione `Enter` para listar todos os filmes no arquivo CSV:
```
Lista de filmes:
Filme{nome='O Poderoso Chefão', anoLancamento=1972, nota=9.2}
```

### Buscar Filme por Título

Digite `3` e pressione `Enter`. Em seguida, forneça o título do filme quando solicitado:
```
Digite o título do filme: O Poderoso Chefão
Filme encontrado: Filme{nome='O Poderoso Chefão', anoLancamento=1972, nota=9.2}
```

### Sair

Digite `4` e pressione `Enter` para sair do programa:
```
Sair
```
