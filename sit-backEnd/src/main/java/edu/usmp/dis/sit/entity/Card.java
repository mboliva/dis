package edu.usmp.dis.sit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.systemlab.base.entity.BaseEntity;

/**
* TrackerDto
*
* @author  Card
* @version 1.0.1
* @since   2014-09-12 
*/

@Entity 
@DynamicUpdate
@Table(name="card")
public class Card extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 6023814048025852266L;

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
