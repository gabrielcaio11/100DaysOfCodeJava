# Classes Abstratas 

# Sistema de Funcionários

Este projeto é um exemplo de um sistema simples de gerenciamento de funcionários, utilizando herança e classes abstratas em Java. O sistema permite adicionar Gerentes e Vendedores, e calcular o bônus para cada tipo de funcionário.

## Funcionalidades

- Adicionar Gerente
- Adicionar Vendedor
- Calcular Bônus de Funcionários

## Estrutura do Projeto

O projeto contém as seguintes classes:

- `Funcionario`: Classe abstrata que representa um funcionário. Contém atributos comuns a todos os funcionários e define o método abstrato `calcularBonus()`.
- `Gerente`: Classe concreta que herda de `Funcionario`. Adiciona o atributo `bonusAnual` e implementa o método `calcularBonus()`.
- `Vendedor`: Classe concreta que herda de `Funcionario`. Adiciona o atributo `comissao` e implementa o método `calcularBonus()`.
- `Main`: Classe principal que contém o menu para interação com o usuário.


## Uso

1. Ao iniciar o programa, você verá um menu com as seguintes opções:

```
Menu:
1. Adicionar Gerente
2. Adicionar Vendedor
3. Calcular Bônus de Funcionários
4. Sair
```

2. Escolha uma opção digitando o número correspondente e pressione Enter.

3. Siga as instruções para adicionar Gerentes ou Vendedores. Forneça as informações solicitadas (nome, CPF, salário, bônus anual ou comissão).

4. Escolha a opção 3 para calcular e exibir o bônus de todos os funcionários cadastrados.

5. Escolha a opção 4 para sair do programa.

## Exemplo de Uso

### Adicionando um Gerente

```
Nome: Ana
CPF: 12345678900
Salário: 8000.00
Bônus Anual: 5000.00
Gerente adicionado com sucesso!
```

### Adicionando um Vendedor

```
Nome: João
CPF: 98765432100
Salário: 3000.00
Comissão: 1500.00
Vendedor adicionado com sucesso!
```

### Calculando Bônus

```
Nome: Ana
CPF: 12345678900
Salário: 8000.00
Bônus: 17000.0

Nome: João
CPF: 98765432100
Salário: 3000.00
Bônus: 4500.0
```

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests com melhorias nos exemplos existentes ou novos exemplos que ajudem a expandir o conhecimento sobre tipos de dados em Java.

## Sobre
Este projeto é parte de um esforço contínuo para compartilhar conhecimento e facilitar o aprendizado de programação em Java. Criado por Gabriel Caio. Você pode me encontrar no LinkedIn.