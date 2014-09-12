package edu.usmp.dis.sit.entity;



import java.util.Date;

public class Tarjeta {
	private Integer IdT_Tarjeta;
	private String TipoTarjeta;
	private String Nombre;
	private Integer Cod_Tarjeta;
	private Double Saldo;
	private String Activo;
	private Date FecActualiza;
	private Date FecRegistro;
	private Date FecRevalidacion;
	public Integer getIdT_Tarjeta() {
		return IdT_Tarjeta;
	}
	public void setIdT_Tarjeta(Integer idT_Tarjeta) {
		IdT_Tarjeta = idT_Tarjeta;
	}
	public String getTipoTarjeta() {
		return TipoTarjeta;
	}
	public void setTipoTarjeta(String tipoTarjeta) {
		TipoTarjeta = tipoTarjeta;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Integer getCod_Tarjeta() {
		return Cod_Tarjeta;
	}
	public void setCod_Tarjeta(Integer cod_Tarjeta) {
		Cod_Tarjeta = cod_Tarjeta;
	}
	public Double getSaldo() {
		return Saldo;
	}
	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}
	public String getActivo() {
		return Activo;
	}
	public void setActivo(String activo) {
		Activo = activo;
	}
	public Date getFecActualiza() {
		return FecActualiza;
	}
	public void setFecActualiza(Date fecActualiza) {
		FecActualiza = fecActualiza;
	}
	public Date getFecRegistro() {
		return FecRegistro;
	}
	public void setFecRegistro(Date fecRegistro) {
		FecRegistro = fecRegistro;
	}
	public Date getFecRevalidacion() {
		return FecRevalidacion;
	}
	public void setFecRevalidacion(Date fecRevalidacion) {
		FecRevalidacion = fecRevalidacion;
	}
	
}
