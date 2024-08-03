package com.gcaio.exception;

public class ProdutoJaExisteNoEstoque extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ProdutoJaExisteNoEstoque() {
		
	}
	public ProdutoJaExisteNoEstoque(String msg) {
		super(msg);
	}
	

}
