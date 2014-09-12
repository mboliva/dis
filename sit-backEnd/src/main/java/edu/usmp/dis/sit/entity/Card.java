package edu.usmp.dis.sit.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity 
@DynamicUpdate
@Table(name="card")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CARD")
	private Integer id;
	
	@Column(name="TYPE_CARD")
	private String type_card;
	
	@Column(name="NAME_CARD")
	private String name_card;
	
	@Column(name="CODE_CARD")
	private Integer code_card;
	
	@Column(name="RESIDUE")
	private Double residue;
	
	@Column(name="DATE_REVALIDATE")
	private String date_revalidate;//Date
	
	
	
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
