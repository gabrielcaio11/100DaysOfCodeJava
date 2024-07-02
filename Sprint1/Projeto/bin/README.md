# Projeto Fila de Clientes em Java

Este projeto faz parte de um desafio dos primeiros 10 de 100 dias codando em Java. O objetivo é aplicar e consolidar os conhecimentos adquiridos durante o desafio, utilizando os seguintes tópicos:
- Introdução ao Java e configuração do ambiente
- Estrutura de um programa Java
- Tipos de dados e variáveis
- Operadores e expressões
- Estruturas de controle (if, switch)
- Laços de repetição (for, while, do-while)
- Arrays e manipulação de arrays
- Métodos e sobrecarga de métodos
- Classes e objetos
- Encapsulamento e modificadores de acesso

Este projeto é uma implementação simples de uma fila de clientes em Java, que permite adicionar, remover e exibir clientes em uma fila. A fila é gerenciada através de um array e oferece um menu interativo para o usuário interagir com o sistema.

## Funcionalidades

- Adicionar um cliente à fila
- Remover um cliente da fila
- Exibir todos os clientes na fila

## Estrutura do Projeto

- `Cliente`: Classe que representa um cliente com nome, CPF e CEP.
- `Fila`: Classe que gerencia a fila de clientes, com métodos para adicionar, remover e exibir clientes.
- `Main`: Método principal que oferece um menu interativo para o usuário.

## Pré-requisitos

- Java JDK 8 ou superior
- Um ambiente de desenvolvimento Java (Eclipse, IntelliJ IDEA, VS Code com extensão Java, etc.)

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd nome-do-repositorio
   ```
3. Compile o projeto:
   ```bash
   javac Main.java
   ```
4. Execute o projeto:
   ```bash
   java Main
   ```

## Uso

Após executar o projeto, você verá um menu interativo no terminal:

```
Menu:
1. Adicionar Cliente
2. Remover Cliente
3. Exibir Todos os Clientes
4. Sair
Escolha uma opção:
```

### Adicionar Cliente

Selecione a opção `1` e insira os detalhes do cliente (nome, CPF e CEP) conforme solicitado.

### Remover Cliente

Selecione a opção `2` para remover o cliente no início da fila.

### Exibir Todos os Clientes

Selecione a opção `3` para exibir todos os clientes atualmente na fila.

### Sair

Selecione a opção `4` para sair do programa.

## Exemplo de Uso

1. Adicione um cliente:

```
Digite o nome do cliente: João Silva
Digite o CPF do cliente: 123.456.789-00
Digite o CEP do cliente: 12345-678
Cliente adicionado à fila.
```

2. Exiba todos os clientes:

```
Clientes na fila:
1. João Silva - CPF: 123.456.789-00 - CEP: 12345-678
```

3. Remova um cliente:

```
Cliente removido da fila: João Silva
```

4. Saia do programa:

```
Saindo...
```
## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests com melhorias nos exemplos existentes ou novos exemplos que ajudem a expandir o conhecimento sobre tipos de dados em Java.

## Sobre

Este projeto é parte de um esforço contínuo para compartilhar conhecimento e facilitar o aprendizado de programação em Java. Criado por Gabriel Caio. Você pode me encontrar no LinkedIn.


## Licença

Este projeto está licenciado sob a licença MIT. 

