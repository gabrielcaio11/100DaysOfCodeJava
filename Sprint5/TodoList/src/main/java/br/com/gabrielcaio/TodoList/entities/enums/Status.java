package br.com.gabrielcaio.TodoList.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * O enum {@code Status} representa os diferentes estados de uma tarefa
 * em uma lista de afazeres (TodoList). Cada status tem um código e uma descrição associados.
 * 
 * <p>
 * Os status disponíveis são:
 * </p>
 * <ul>
 *   <li>{@link #CONCLUIDO} - Status de tarefa concluída, com código "C" e descrição "CONCLUIDO"</li>
 *   <li>{@link #PENDENTE} - Status de tarefa pendente, com código "P" e descrição "PENDENTE"</li>
 * </ul>
 * 
 * <p>
 * Este enum também fornece métodos para acessar e modificar os valores de código e descrição,
 * bem como para recuperar uma instância de {@code Status} com base em seu código.
 * </p>
 */

public enum Status {

    /**
     * Status de tarefa concluída.
     * Código: "C"
     * Descrição: "CONCLUIDO"
     */
    CONCLUIDO("C", "CONCLUIDO"),

    /**
     * Status de tarefa pendente.
     * Código: "P"
     * Descrição: "PENDENTE"
     */
    PENSENTE("P", "PENDENTE");

    /** Código associado ao status. */
    private String codigo;

    /** Descrição detalhada do status. */
    private String descricao;

    /**
     * Construtor privado para inicializar os valores do enum.
     * 
     * @param codigo O código do status.
     * @param descricao A descrição do status.
     */
    private Status(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    /**
     * Retorna o código associado ao status.
     * 
     * @return O código do status.
     */
    @JsonValue
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o código associado ao status.
     * 
     * @param codigo O código do status.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Retorna a descrição detalhada do status.
     * 
     * @return A descrição do status.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição detalhada do status.
     * 
     * @param descricao A descrição do status.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a instância de {@code Status} associada ao código fornecido.
     * 
     * <p>
     * Este método permite recuperar o status com base no código.
     * Se o código não corresponder a nenhum status, retorna {@code null}.
     * </p>
     * 
     * @param codigo O código do status a ser recuperado.
     * @return A instância de {@code Status} correspondente ao código ou {@code null} se não houver correspondência.
     */
    public static Status get(String codigo) {
        if(codigo.equals("C")) {
            return CONCLUIDO;
        } else if(codigo.equals("P")) {
            return PENSENTE;
        } else {
            return null; 
        }
    }
}
