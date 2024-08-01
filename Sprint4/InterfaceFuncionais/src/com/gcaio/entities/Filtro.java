package com.gcaio.entities;

@FunctionalInterface
public interface Filtro<T> {
	boolean avaliar(T object);
}
