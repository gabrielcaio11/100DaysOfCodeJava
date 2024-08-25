package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.ClientDAO;
import dao.PedidoDAO;
import dao.ProductDAO;
import db.DB;
import entities.Client;
import entities.Pedido;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Connection conn = DB.getConnection();

		// Criar DAOs
		ClientDAO clientDAO = new ClientDAO(conn);
		ProductDAO productDAO = new ProductDAO(conn);
		PedidoDAO pedidoDAO = new PedidoDAO(conn);

		Client client = createClient(clientDAO, new Client("Gabriel","gabriel@gmail.com"));

		Product product = creatProduct(productDAO, new Product("Notebook","O produto é bom demais",20000.00));

		creatPedido(pedidoDAO, client, product);

		
		System.out.println("Todos os clientes: \n");
		lerTodosClientes(clientDAO);
		
		System.out.println("\nTodos os produtos: \n");
		lerTodosProdutos(productDAO);
		
		System.out.println("\nTodos os pedidos: \n");
		lerTodosPedidos(pedidoDAO);

		// Fechar a conexão
		DB.closeConnerction();

	}

	private static void lerTodosProdutos(ProductDAO productDAO) {
		try {
			List<Product> products = productDAO.getAllProducts();
			System.out.println("Pedidos:");
			for (Product p : products) {
				System.out.println(p.getName() + " - " + p.getPrice());
			}
		} catch (SQLException e) {
			System.out.println("Erro ao ler produtos: " + e.getMessage());
		}

	}

	private static void lerTodosPedidos(PedidoDAO pedidoDAO) {
		try {
			List<Pedido> pedidos = pedidoDAO.getAllPedidos();
			System.out.println("Pedidos:");
			for (Pedido p : pedidos) {
				System.out.println(p.getClientId() + " - " + p.getProductId() + " - " + p.getQuantidade() + " - "
						+ p.getValorTotal());
			}
		} catch (SQLException e) {
			System.out.println("Erro ao ler pedidos: " + e.getMessage());
		}

	}

	private static void lerTodosClientes(ClientDAO clientDAO) {
		try {
			List<Client> clients = clientDAO.getAllClients();
			System.out.println("Clientes:");
			for (Client c : clients) {
				System.out.println(c.getName() + " - " + c.getEmail());
			}
		} catch (SQLException e) {
			System.out.println("Erro ao ler clientes: " + e.getMessage());
		}
	}

	private static Product creatProduct(ProductDAO productDAO,Product product) {
		try {
			productDAO.createProduct(product);
			System.out.println("Produto criado com sucesso!");
			return product;
		} catch (SQLException e) {
			System.out.println("Erro ao criar produto: " + e.getMessage());
		}
		return null;
	}

	private static Pedido creatPedido(PedidoDAO pedidoDAO, Client client, Product product) {
		Pedido pedido = new Pedido();
		pedido.setClientId(client.getId());
		pedido.setProductId(product.getId());
		pedido.setQuantidade(2);
		pedido.setValorTotal(100.00);
		try {
			pedidoDAO.createPedido(pedido);
			System.out.println("Pedido criado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao criar pedido: " + e.getMessage());
		}
		return pedido;
	}

	private static Client createClient(ClientDAO clientDAO, Client client) {

		try {
			clientDAO.createClient(client);
			System.out.println("Cliente criado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao criar cliente: " + e.getMessage());
		}
		return client;

	}

}