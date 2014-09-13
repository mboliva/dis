package edu.usmp.dis.sit.dto;

import java.io.Serializable;

import com.systemlab.base.annotation.DtoField;
import com.systemlab.base.dto.BaseDto;


/**
* CardDto
*
* @author  Renzo
* @version 1.0.1
* @since   2014-09-12 
*/

public class CardDto extends BaseDto implements Serializable {

	private static final long serialVersionUID = 3486060474728855596L;
	
	@DtoField
	private Integer id;
	
	@DtoField
	private String type_card;
	
	@DtoField
	private String name_card;
	
	@DtoField
	private Integer code_card;
	
	@DtoField
	private Double residue;
	
	@DtoField
	private String date_revalidate;

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

	public String getDate_revalidate() {
		return date_revalidate;
	}

	public void setDate_revalidate(String date_revalidate) {
		this.date_revalidate = date_revalidate;
	}
	
}
