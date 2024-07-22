# Leitura e Escrita de Arquivos

Este projeto é uma aplicação Java que permite o cadastro de estudantes, com foco na leitura e escrita de arquivos. Agora é possível armazenar as informações em memória utilizando um arquivo .txt. Além disso, o projeto conta com tratamento de exceções para garantir a integridade dos dados de entrada. A aplicação oferece um menu simples onde os usuários podem cadastrar novos estudantes fornecendo nome, CPF e matrícula. Todas as entradas são validadas para evitar dados incorretos.

## Estrutura do Projeto

O projeto adicionou um novo conjunto de métodos para adicionar e mostrar todos os alunos matriculados. 
- O método `alunosMatriculados()` lê um arquivo de texto que contém informações dos estudantes e retorna uma lista de objetos `Estudante`, representando os alunos matriculados. Ele inicializa uma lista vazia, define o caminho do arquivo e utiliza um `BufferedReader` para ler cada linha, dividir os dados por vírgulas, criar objetos `Estudante` e adicioná-los à lista, com tratamento de exceções para possíveis `IOExceptions`. 
- O método `cadastrarEstudante(Estudante estudante)` adiciona um novo estudante ao arquivo de texto existente. Ele prepara os dados do estudante em um array de strings, define o caminho do arquivo e utiliza um `BufferedWriter` para escrever os dados no formato `nome,cpf,matricula`, acrescentando uma nova linha ao final, com tratamento de exceções para `IOExceptions`. Esses métodos permitem gerenciar uma lista de estudantes, facilitando a leitura e escrita de dados de forma organizada e eficiente.

O pacote `exceptions` abriga duas classes de exceção personalizadas: 

- `NomeVazioException.java` e `CpfInvalidoException.java`. Estas exceções são projetadas para serem lançadas durante a validação dos dados fornecidos pelo usuário no momento do cadastro de estudantes. A `NomeVazioException` é disparada quando o nome fornecido está vazio ou contém apenas espaços em branco, enquanto a `CpfInvalidoException` é lançada se o CPF informado não corresponder ao formato esperado. Ao encapsular esses erros em exceções personalizadas, o pacote `exceptions` melhora a legibilidade e manutenção do código, permitindo um tratamento de erros mais preciso e específico, de acordo com as necessidades da aplicação.