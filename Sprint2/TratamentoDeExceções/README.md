# Tratamentos de Execeções

# Projeto de Cadastro de Estudantes com Tratamento de Exceção

Este projeto é uma aplicação Java que permite o cadastro de estudantes, com foco no tratamento de exceções para garantir que sistema gerencie os dados sem quaisquer problemas posteriores. A aplicação oferece um menu simples onde os usuários podem cadastrar novos estudantes fornecendo nome, CPF e matrícula. Todas as entradas são validadas para evitar dados incorretos.

## Estrutura do Projeto

O projeto está organizado em dois pacotes: `application`, que contém a classe `Main` responsável pelo menu de login e pelo fluxo principal da aplicação, e `entities`, que contém a classe `Estudante`, representando os estudantes com atributos `nome`, `cpf` e `matricula`. A classe `Main` lida com a entrada do usuário, valida os dados fornecidos e trata exceções, enquanto a classe `Estudante` armazena os dados dos estudantes.

## Uso do Projeto

Quando você executar o programa, ele exibirá um menu de login no terminal, onde você pode escolher entre cadastrar um estudante ou sair. Aqui está um exemplo de como será a interação no terminal:

```plaintext
Menu de Login:
1. Cadastro Estudante
2. Sair
Escolha uma opção: 1
Nome: Gabriel Caio
CPF: 12345678901
Matrícula: 20230001
Cadastro realizado com sucesso!
Nome: Gabriel Caio
CPF: 12345678901
Matrícula: 20230001

Menu de Login:
1. Cadastro Estudante
2. Sair
Escolha uma opção: 2
Saindo...
```

Se o usuário inserir um valor inválido, o programa tratará a exceção e exibirá uma mensagem de erro. Aqui estão alguns exemplos de entradas inválidas e as mensagens de erro correspondentes:

### Exemplo 1: Entrada inválida para a opção do menu
```plaintext
Menu de Login:
1. Cadastro Estudante
2. Sair
Escolha uma opção: a
Entrada inválida. Por favor, digite um número.
```

### Exemplo 2: Nome vazio
```plaintext
Menu de Login:
1. Cadastro Estudante
2. Sair
Escolha uma opção: 1
Nome: 
Erro: Nome não pode ser vazio.
```

### Exemplo 3: CPF com formato inválido
```plaintext
Menu de Login:
1. Cadastro Estudante
2. Sair
Escolha uma opção: 1
Nome: Gabriel Caio
CPF: 123456
Erro: CPF deve ter 11 dígitos.
```

### Exemplo 4: Matrícula vazia
```plaintext
Menu de Login:
1. Cadastro Estudante
2. Sair
Escolha uma opção: 1
Nome: Gabriel Caio
CPF: 12345678901
Matrícula: 
Erro: Matrícula não pode ser vazia.
```


## Feedbacks

Estou aceitando feedbacks sobre o projeto. Se você tiver sugestões, melhorias ou encontrar algum problema, por favor, envie seus comentários. Sua opinião é muito importante para o aprimoramento desta aplicação!

