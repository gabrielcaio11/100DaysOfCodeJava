package application;

import static org.junit.Assert.*;
import org.junit.Test;

import entities.Estoque;
import entities.Produto;

public class Main {
	@Test
	public void testQuantidadeProdutos() {
		Estoque estoque = new Estoque();

		Produto p1 = new Produto(1, "Camisa", 29.99, "ABC123");
		Produto p2 = new Produto(2, "Calça", 49.99, "DEF456");

		estoque.adicionarProduto(p1);
		estoque.adicionarProduto(p2);

		assertEquals(2, estoque.getProdutos().size());
	}

	@Test
	public void testQuantidadeProdutosDiferente() {
		Estoque estoque = new Estoque();

		Produto p1 = new Produto(1, "Camisa", 29.99, "ABC123");
		Produto p2 = new Produto(2, "Calça", 49.99, "DEF456");

		estoque.adicionarProduto(p1);
		estoque.adicionarProduto(p2);

		assertNotEquals(3, estoque.getProdutos().size());
	}

	@Test
	public void testPrimeiraLetraCodigoA() {
		Produto p1 = new Produto(1, "Camisa", 29.99, "ABC123");

		assertTrue(p1.getCodigo().charAt(0) == 'A');
	}

	@Test
	public void testPrimeiraLetraCodigoNaoA() {
		Produto p1 = new Produto(1, "Camisa", 29.99, "DEF456");

		assertFalse(p1.getCodigo().charAt(0) == 'A');
	}

	@Test
	public void testObjetoNull() {
		Produto p3 = null;

		assertNull(p3);
	}

	@Test
	public void testBuscaPorIdNaoNull() {
		Estoque estoque = new Estoque();

		Produto p1 = new Produto(1, "Camisa", 29.99, "ABC123");
		Produto p2 = new Produto(2, "Calça", 49.99, "DEF456");

		estoque.adicionarProduto(p1);
		estoque.adicionarProduto(p2);

		assertNotNull(estoque.buscarProdutoPorId(2));
	}
	
	@Test
    public void testEstoqueInvalido() {
        Estoque estoque = new Estoque();

        assertThrows(IllegalArgumentException.class, () -> {
            estoque.removerProduto(-1);
        });
    }
	/*
	 * assertEquals(expected, actual): Verifica se dois valores são iguais. Exemplo:
	 * assertEquals(10, calculadora.somar(5, 5)); assertNotEquals(expected,
	 * actual):Verifica se dois valores são diferentes. Exemplo:
	 * assertNotEquals(0,lista.size()); assertTrue(condition): Verifica se uma
	 * condição é verdadeira. Exemplo: assertTrue(resultado > 0);
	 * assertFalse(condition): Verifica se uma condição é falsa. Exemplo:
	 * assertFalse(lista.isEmpty()); assertNotNull(object): Verifica se um objeto
	 * não é nulo. Exemplo:assertNotNull(calculadora); assertNull(object): Verifica
	 * se um objeto é nulo. Exemplo: assertNull(objetoDesconhecido);
	 * assertThrows(exceptionType,executable): Verifica se uma exceção específica é
	 * lançada. Exemplo:assertThrows(IllegalArgumentException.class, () -> {
	 * calculadora.dividir(10,0); });
	 */
}