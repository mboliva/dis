package edu.usmp.dis.sit.entity;


import java.util.Date;

public class User {

	private Integer IdT_Usuario;
	private String ApePat;
	private String ApeMat;
	private String Nombre;
	private String Email;
	private Date FechaNac;
	private String TipoDoc;
	private String NumDoc;
	private Date FecRegistro;
	private Integer Cuenta;
	private String Clave;
	private String Active;
	private Date Update;
	
	
	
	public Integer getIdT_Usuario() {
		return IdT_Usuario;
	}
	public void setIdT_Usuario(Integer idT_Usuario) {
		IdT_Usuario = idT_Usuario;
	}
	public String getApePat() {
		return ApePat;
	}
	public void setApePat(String apePat) {
		ApePat = apePat;
	}
	public String getApeMat() {
		return ApeMat;
	}
	public void setApeMat(String apeMat) {
		ApeMat = apeMat;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getFechaNac() {
		return FechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		FechaNac = fechaNac;
	}
	public String getTipoDoc() {
		return TipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		TipoDoc = tipoDoc;
	}
	public String getNumDoc() {
		return NumDoc;
	}
	public void setNumDoc(String numDoc) {
		NumDoc = numDoc;
	}
	public Date getFecRegistro() {
		return FecRegistro;
	}
	public void setFecRegistro(Date fecRegistro) {
		FecRegistro = fecRegistro;
	}
	public Integer getCuenta() {
		return Cuenta;
	}
	public void setCuenta(Integer cuenta) {
		Cuenta = cuenta;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public String getActive() {
		return Active;
	}
	public void setActive(String active) {
		Active = active;
	}
	public Date getUpdate() {
		return Update;
	}
	public void setUpdate(Date update) {
		Update = update;
	}
	
	
}

