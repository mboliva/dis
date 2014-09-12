package edu.usmp.dis.sit.entity;


public class Tarifa {
private Integer idT_Tarifa;
private Double Monto;
private String FecIni;
private String FecFin;
public Integer getIdT_Tarifa() {
	return idT_Tarifa;
}
public void setIdT_Tarifa(Integer idT_Tarifa) {
	this.idT_Tarifa = idT_Tarifa;
}
public Double getMonto() {
	return Monto;
}
public void setMonto(Double monto) {
	Monto = monto;
}
public String getFecIni() {
	return FecIni;
}
public void setFecIni(String fecIni) {
	FecIni = fecIni;
}
public String getFecFin() {
	return FecFin;
}
public void setFecFin(String fecFin) {
	FecFin = fecFin;
}

}
