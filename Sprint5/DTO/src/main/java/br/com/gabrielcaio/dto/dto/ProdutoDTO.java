package br.com.gabrielcaio.dto.dto;

import org.springframework.beans.BeanUtils;

import br.com.gabrielcaio.dto.entities.Produto;

public class ProdutoDTO {
	private Long id;
	private String name;
	private Double price;

	public ProdutoDTO() {

	}

	public ProdutoDTO(Produto produto) {
		BeanUtils.copyProperties(produto, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
