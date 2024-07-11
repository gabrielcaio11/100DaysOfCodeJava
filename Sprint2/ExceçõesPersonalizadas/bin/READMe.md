# Tratamento de Exceção Personalizadas

Este projeto é uma aplicação Java que permite o cadastro de estudantes, com foco no tratamento de exceções para garantir a integridade dos dados de entrada. A aplicação oferece um menu simples onde os usuários podem cadastrar novos estudantes fornecendo nome, CPF e matrícula. Todas as entradas são validadas para evitar dados incorretos.

## Estrutura do Projeto

O projeto adicionou um novo conjunto de classes que estão no pacote `exceptions`.

O pacote exceptions abriga duas classes de exceção personalizadas: NomeVazioException.java e CpfInvalidoException.java. Estas exceções são projetadas para serem lançadas durante a validação dos dados fornecidos pelo usuário no momento do cadastro de estudantes. A NomeVazioException é disparada quando o nome fornecido está vazio ou contém apenas espaços em branco, enquanto a CpfInvalidoException é lançada se o CPF informado não corresponder ao formato esperado. Ao encapsular esses erros em exceções personalizadas, o pacote exceptions melhora a legibilidade e manutenção do código, permitindo um tratamento de erros mais preciso e específico, de acordo com as necessidades da aplicação.

## Feedbacks

Se você tiver sugestões, melhorias ou encontrar algum problema, por favor, envie seus comentários. Sua opinião é muito importante para o aprimoramento da minha jornado como desenvolvedor!
