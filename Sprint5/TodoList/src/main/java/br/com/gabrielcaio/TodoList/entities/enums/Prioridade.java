package br.com.gabrielcaio.TodoList.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * O enum {@code Prioridade} representa os diferentes níveis de prioridade
 * que uma tarefa pode ter em uma lista de afazeres (TodoList).
 * Cada prioridade tem um código e uma descrição associados.
 * 
 * <p>
 * As prioridades disponíveis são:
 * </p>
 * <ul>
 *   <li>{@link #MAXIMA} - Prioridade máxima com código "MA" e descrição "MAXIMA"</li>
 *   <li>{@link #MEDIA} - Prioridade média com código "ME" e descrição "MEDIA"</li>
 *   <li>{@link #MINIMA} - Prioridade mínima com código "MI" e descrição "MINIMA"</li>
 * </ul>
 * 
 * <p>
 * Este enum também fornece métodos para acessar e modificar os valores
 * de código e descrição, bem como para recuperar uma instância de
 * {@code Prioridade} com base em seu código.
 * </p>
 */

public enum Prioridade {
	
	/**
	 * Prioridade máxima.
	 * Código: "MA"
	 * Descrição: "MAXIMA"
	 */
	MAXIMA("MA","MAXIMA"),
	
	/**
	 * Prioridade média.
	 * Código: "ME"
	 * Descrição: "MEDIA"
	 */
	MEDIA("ME","MEDIA"),
	
	/**
	 * Prioridade mínima.
	 * Código: "MI"
	 * Descrição: "MINIMA"
	 */
	MINIMA("MI","MINIMA");
	
	/** Código associado à prioridade. */
	private String codigo;
	
	/** Descrição detalhada da prioridade. */
	private String descricao;

	/**
	 * Construtor privado para inicializar os valores do enum.
	 * 
	 * @param codigo O código da prioridade.
	 * @param descricao A descrição da prioridade.
	 */
	private Prioridade(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	/**
	 * Retorna o código associado à prioridade.
	 * 
	 * @return O código da prioridade.
	 */
	@JsonValue
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Define o código associado à prioridade.
	 * 
	 * @param codigo O código da prioridade.
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Retorna a descrição detalhada da prioridade.
	 * 
	 * @return A descrição da prioridade.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Define a descrição detalhada da prioridade.
	 * 
	 * @param descricao A descrição da prioridade.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * Retorna a instância de {@code Prioridade} associada ao código fornecido.
	 * 
	 * <p>
	 * Este método permite recuperar a prioridade com base no código.
	 * Se o código não corresponder a nenhuma prioridade, retorna {@code null}.
	 * </p>
	 * 
	 * @param codigo O código da prioridade a ser recuperada.
	 * @return A instância de {@code Prioridade} correspondente ao código ou {@code null} se não houver correspondência.
	 */
	@JsonCreator
	public static Prioridade get(String codigo) {
		if(codigo.equals("MA")) {
			return MAXIMA;
		}else if(codigo.equals("ME")) {
			return MEDIA;
		}else if(codigo.equals("MI")) {
			return MINIMA;
		}else {
			return null; 
		}
	}
	
}
