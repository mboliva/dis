package edu.usmp.dis.sit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

//nota!!!!!!   3primay keys id_rate_card ;CARD_ID`, `RATE_ID   !!!!!!!!!!!!!!!!!!!



@Entity
@DynamicUpdate
@Table(name="user")
public class Rate_Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_RATE_CARD")
    private Integer id;

	@Column(name="DATE")
    private String date;//Date

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}





}
