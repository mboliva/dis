package edu.usmp.dis.sit.entity;



import java.util.Date;

public class Recarga {
private Integer idT_HistRecarga;
private Double Monto;
private String Activo;
private Date FecRegistro;
private Date FecActualiza;
public Integer getIdT_HistRecarga() {
	return idT_HistRecarga;
}
public void setIdT_HistRecarga(Integer idT_HistRecarga) {
	this.idT_HistRecarga = idT_HistRecarga;
}
public Double getMonto() {
	return Monto;
}
public void setMonto(Double monto) {
	Monto = monto;
}
public String getActivo() {
	return Activo;
}
public void setActivo(String activo) {
	Activo = activo;
}
public Date getFecRegistro() {
	return FecRegistro;
}
public void setFecRegistro(Date fecRegistro) {
	FecRegistro = fecRegistro;
}
public Date getFecActualiza() {
	return FecActualiza;
}
public void setFecActualiza(Date fecActualiza) {
	FecActualiza = fecActualiza;
}

}
