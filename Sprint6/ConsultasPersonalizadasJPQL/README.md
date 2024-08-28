# Consultas Personalizadas
Este projeto fornece uma API RESTful para gerenciar pedidos, clientes e produtos. A API permite criar, ler, atualizar e excluir. A API é construída usando Spring Boot e fornece os seguintes endpoints:

## Endpoints da classe 'Client':

- GET /clients: Retorna uma lista de todos os clientes.

        - Método: findAll       
        - Parâmetros: Nenhum
        - Retorno: ResponseEntity<List<Client>>

- GET /clients/{id}: Retorna um cliente específico pelo ID.

        - Método: findById
        - Parâmetros: id (Long)
        - Retorno: ResponseEntity<Client>

- PUT /clients/{id}: Atualiza um cliente específico pelo ID.

        - Método: update
        - Parâmetros: id (Long), client (Client)
        - Retorno: ResponseEntity<Client>

- POST /clients: Cria um novo cliente.

        - Método: create
        - Parâmetros: client (Client)
        - Retorno: ResponseEntity<Client>

- DELETE /clients/{id}: Deleta um cliente específico pelo ID.

        - Método: delete
        - Parâmetros: id (Long)
        - Retorno: ResponseEntity<Void>

## Endpoints da classe 'Product':

- GET /products: Retorna uma lista de todos os produtos.

        - Método: findAll
        - Parâmetros: Nenhum
        - Retorno: ResponseEntity<List<Product>>
- GET /products/{id}: Retorna um produto específico pelo ID.

        - Método: findById
        - Parâmetros: id (Long)
        - Retorno: ResponseEntity<Product>

- POST /products: Cria um novo produto.

        - Método: create
        - Parâmetros: product (Product)
        - Retorno: ResponseEntity<Product>
- PUT /products/{id}: Atualiza um produto específico pelo ID.

        - Método: update
        - Parâmetros: id (Long), product (Product)
        - Retorno: ResponseEntity<Product>
- DELETE /products/{id}: Deleta um produto específico pelo ID.

        - Método: delete
        - Parâmetros: id (Long)
        - Retorno: ResponseEntity<Void>

## Endpoints da classe 'Order':

- GET /orders: Retorna uma lista de todas as ordens.

        - Método: findAll
        - Parâmetros: Nenhum
        - Retorno: ResponseEntity<List<Order>>

- GET /orders/{id}: Retorna uma ordem específica pelo ID.

        - Método: findById
        - Parâmetros: id (Long)
        - Retorno: ResponseEntity<Order>

- GET /orders/findOrderByClienteNome: Retorna uma lista de ordens pelo nome do cliente.

        - Método: findOrderByClienteNome
        - Parâmetros: clientName (String)
        - Retorno: ResponseEntity<List<Order>>

- POST /orders: Cria uma nova ordem.

        - Método: create
        - Parâmetros: order (Order)
        - Retorno: ResponseEntity<Order>

- PUT /orders/{id}: Atualiza uma ordem específica pelo ID.

        - Método: update
        - Parâmetros: id (Long), order (Order)
        - Retorno: ResponseEntity<Order>

- DELETE /orders/{id}: Deleta uma ordem específica pelo ID.

        - Método: delete
        - Parâmetros: id (Long)
        - Retorno: ResponseEntity<Void>

## A API é construída usando as seguintes tecnologias:

- Java 17
- Spring Boot 
- Spring Data JPA
- PostgreSQL
- Springdoc-openapi
