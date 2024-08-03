package com.gcaio.exception;

public class ProdutoNaoExisteNoEstoque extends Exception {

	private static final long serialVersionUID = 1L;

	public ProdutoNaoExisteNoEstoque() {
		
	}
	public ProdutoNaoExisteNoEstoque(String msg) {
		super(msg);
	}
}
