# Interfaces

# Sistema de Pagamentos

Este projeto é um sistema de pagamentos que permite a um cliente cadastrar-se, fazer login e realizar pagamentos utilizando diferentes métodos. Ele utiliza classes abstratas e interfaces para implementar os métodos de pagamento.

## Funcionalidades

1. **Cadastro de Cliente**: Permite cadastrar novos clientes com nome, CPF, senha e saldo inicial.
2. **Login de Cliente**: Permite que clientes existentes façam login usando seu CPF e senha.
3. **Métodos de Pagamento**:
    - **Cartão de Crédito**
    - **Boleto Bancário**

## Estrutura do Projeto

O projeto está dividido em vários pacotes e classes:

- **application**:
  - `Main`: Contém o menu principal para cadastro, login e seleção de método de pagamento.

- **entities**:
  - `Cliente`: Representa o cliente com nome, CPF, senha e saldo.
  - `Pagamento` (interface): Define os métodos para autorizar e processar um pagamento.
  - `CartaoCredito`: Implementa o pagamento por cartão de crédito.
  - `Boleto`: Implementa o pagamento por boleto bancário.


### Exemplo de Execução

Ao executar o programa, você verá o menu principal:

```
Menu Principal:
1. Cadastrar Cliente
2. Login
3. Sair
```

### Cadastro de Cliente

Selecione a opção "1" para cadastrar um novo cliente e siga as instruções:

```
Nome: João Silva
CPF: 12345678900
Senha: senha123
Saldo Inicial: 1000.00
Cliente cadastrado com sucesso!
```

### Login de Cliente

Selecione a opção "2" para fazer login com um cliente existente:

```
CPF: 12345678900
Senha: senha123
Login realizado com sucesso!
Bem-vindo, João Silva!
```

### Métodos de Pagamento

Após o login, você pode escolher um método de pagamento:

```
Escolha o método de pagamento:
1. Cartão de Crédito
2. Boleto Bancário
```

Para pagamento com cartão de crédito, insira os detalhes do cartão e o valor a ser pago:

```
Número do Cartão: 1111-2222-3333-4444
Nome do Titular: João Silva
Valor: 100.00
```

Para pagamento por boleto bancário, insira o código de barras e o valor a ser pago:

```
Código de Barras: 1234567890123456789012345678901234567890
Valor: 200.00
```

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests com melhorias nos exemplos existentes ou novos exemplos que ajudem a expandir o conhecimento sobre tipos de dados em Java.

## Sobre
Este projeto é parte de um esforço contínuo para compartilhar conhecimento e facilitar o aprendizado de programação em Java. Criado por Gabriel Caio. Você pode me encontrar no LinkedIn.
