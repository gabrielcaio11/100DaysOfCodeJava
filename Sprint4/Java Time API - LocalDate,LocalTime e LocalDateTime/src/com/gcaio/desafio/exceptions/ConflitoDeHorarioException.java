package com.gcaio.desafio.exceptions;

public class ConflitoDeHorarioException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ConflitoDeHorarioException(String msg) {
		super(msg);
	}
}
