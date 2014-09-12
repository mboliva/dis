package edu.usmp.dis.sit.entity;



import java.util.Date;

public class Tarifa_Tarjeta {
private Integer idTarifa_Tarjeta;
private char Tipo;
private Date Fecha;
private Double Monto;
public Integer getIdTarifa_Tarjeta() {
	return idTarifa_Tarjeta;
}
public void setIdTarifa_Tarjeta(Integer idTarifa_Tarjeta) {
	this.idTarifa_Tarjeta = idTarifa_Tarjeta;
}
public char getTipo() {
	return Tipo;
}
public void setTipo(char tipo) {
	Tipo = tipo;
}
public Date getFecha() {
	return Fecha;
}
public void setFecha(Date fecha) {
	Fecha = fecha;
}
public Double getMonto() {
	return Monto;
}
public void setMonto(Double monto) {
	Monto = monto;
}


}
