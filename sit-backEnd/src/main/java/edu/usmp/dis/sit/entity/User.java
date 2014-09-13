package edu.usmp.dis.sit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.systemlab.base.entity.BaseEntity;

/**
* User
*
* @author  Renzo
* @version 1.0.1
* @since   2014-09-12 
*/

@Entity
@DynamicUpdate
@Table(name="user")
public class User extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 8889971441402537412L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_USER")
	private Integer id;
	
	@Column(name="F_LAST_NAME")
	private String f_last_name ;
	
	@Column(name="S_LAST_NAME")
	private String s_last_name;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="MAIL")
	private String mail;
	
	@Column(name="BIRTH_DATE")
	private Date birth_date;
	
	@Column(name="TYPE_DOC")
	private String Type_doc;
	
	@Column(name="NUMDOC")
	private String numdoc;
	
	@Column(name="ACCOUNT")
	private String account;
	
	@Column(name="CLAVE")
	private String clave;
	
	@ManyToOne
	@JoinColumn(name = "ID_CARD")
	private Card card;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getF_last_name() {
		return f_last_name;
	}

	public void setF_last_name(String f_last_name) {
		this.f_last_name = f_last_name;
	}

	public String getS_last_name() {
		return s_last_name;
	}

	public void setS_last_name(String s_last_name) {
		this.s_last_name = s_last_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getType_doc() {
		return Type_doc;
	}

	public void setType_doc(String type_doc) {
		Type_doc = type_doc;
	}

	public String getNumdoc() {
		return numdoc;
	}

	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	

}

