package com.gcaio.desafio.exceptions;

import java.util.InputMismatchException;

public class OpcaoDeEntradaInvalidaException extends InputMismatchException {

	private static final long serialVersionUID = 1L;

	public OpcaoDeEntradaInvalidaException(String msg) {
		super(msg);
	}

}
