package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductDAO {
	private Connection connection;

	public ProductDAO(Connection connection) {
		this.connection = connection;
	}

	public void createProduct(Product product) throws SQLException {
		String query = "INSERT INTO products (name, description, price) VALUES ( ?, ?, ? )";
		PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, product.getName());
		pstmt.setString(2, product.getDescription());
		pstmt.setDouble(3, product.getPrice());
		pstmt.executeUpdate();
		// Obter o ID gerado
		ResultSet rs = pstmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			product.setId(id); // Atualizar o ID do produto
		}
	}

	public List<Product> getAllProducts() throws SQLException {
		List<Product> products = new ArrayList<>();
		String query = "SELECT * FROM products";
		PreparedStatement pstmt = connection.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt("id"));
			product.setName(rs.getString("name"));
			product.setDescription(rs.getString("description"));
			product.setPrice(rs.getDouble("price"));
			products.add(product);
		}
		return products;
	}

	public Product getProductById(int id) throws SQLException {
		String query = "SELECT * FROM products WHERE id = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt("id"));
			product.setName(rs.getString("name"));
			product.setDescription(rs.getString("description"));
			product.setPrice(rs.getDouble("price"));
			return product;
		}
		return null;
	}

	public void updateProduct(Product product) throws SQLException {
		String query = "UPDATE products SET name = ?, description = ?, price = ? WHERE id = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setString(1, product.getName());
		pstmt.setString(2, product.getDescription());
		pstmt.setDouble(3, product.getPrice());
		pstmt.setInt(4, product.getId());
		pstmt.executeUpdate();
	}

	public void deleteProduct(int id) throws SQLException {
		String query = "DELETE FROM products WHERE id = ?";
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
	}
}
