package edu.usmp.dis.sit.dto;

import java.sql.Date;



public class CardDto {
	
    private Integer id;
	
	private String type_card;
	
	private String name_card;
	
	private Integer code_card;
	
	private Double residue;
	
	private Date date_revalidate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType_card() {
		return type_card;
	}

	public void setType_card(String type_card) {
		this.type_card = type_card;
	}

	public String getName_card() {
		return name_card;
	}

	public void setName_card(String name_card) {
		this.name_card = name_card;
	}

	public Integer getCode_card() {
		return code_card;
	}

	public void setCode_card(Integer code_card) {
		this.code_card = code_card;
	}

	public Double getResidue() {
		return residue;
	}

	public void setResidue(Double residue) {
		this.residue = residue;
	}

	public Date getDate_revalidate() {
		return date_revalidate;
	}

	public void setDate_revalidate(Date date_revalidate) {
		this.date_revalidate = date_revalidate;
	}
	
	
}
