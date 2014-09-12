package edu.usmp.dis.sit.dto;


import java.util.Date;


public class UserDto {
	
    private Integer id;
	
	private String f_last_name ;
	
	private String s_last_name;
	
	private String name;
	
	private String mail;
	
	private Date birth_date;
	
	private String Type_doc;
	
	private String numdoc;
	
	private Integer account;
	
	private String clave;

	
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

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
