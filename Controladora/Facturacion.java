
package Controladora;

import Logica.SolicitudFacturacionDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Facturacion implements Serializable {
    

    private int idConsecutivo;
    private Date fechaSolicitud;
    private String usuario;
    private int nitCliente;
    private String nombreCliente;
    private String correoCliente;
    private long telefonoCliente;
    private String tipoCliente;
    private String relacionComercial;
    private String anexos;
    private  String observaciones;
    private double totalUnds;
    private double totalDescuento;
    private double Subtotal;
    private double total_iva;
    private double Total;
    private String codigo_linea ;
    private String producto_linea;
    private String unids_linea;
    private String valorUnidad_linea;
    private String valorSubtotal_linea;
    private String descuento_linea;
    private String iva_linea;
    private String valor_Total_linea;

    public Facturacion() {
    }

    public Facturacion(int idConsecutivo, Date fechaSolicitud, String usuario, int nitCliente, String nombreCliente, String correoCliente, long telefonoCliente, String tipoCliente, String relacionComercial, String anexos, String observaciones, double totalUnds, double totalDescuento, double Subtotal, double total_iva, double Total, String codigo_linea, String producto_linea, String unids_linea, String valorUnidad_linea, String valorSubtotal_linea, String descuento_linea, String iva_linea, String valor_Total_linea) {
        this.idConsecutivo = idConsecutivo;
        this.fechaSolicitud = fechaSolicitud;
        this.usuario = usuario;
        this.nitCliente = nitCliente;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.telefonoCliente = telefonoCliente;
        this.tipoCliente = tipoCliente;
        this.relacionComercial = relacionComercial;
        this.anexos = anexos;
        this.observaciones = observaciones;
        this.totalUnds = totalUnds;
        this.totalDescuento = totalDescuento;
        this.Subtotal = Subtotal;
        this.total_iva = total_iva;
        this.Total = Total;
        this.codigo_linea = codigo_linea;
        this.producto_linea = producto_linea;
        this.unids_linea = unids_linea;
        this.valorUnidad_linea = valorUnidad_linea;
        this.valorSubtotal_linea = valorSubtotal_linea;
        this.descuento_linea = descuento_linea;
        this.iva_linea = iva_linea;
        this.valor_Total_linea = valor_Total_linea;
    }

    public int getIdConsecutivo() {
        return idConsecutivo;
    }

    public void setIdConsecutivo(int idConsecutivo) {
        this.idConsecutivo = idConsecutivo;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(int nitCliente) {
        this.nitCliente = nitCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public long getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(long telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getRelacionComercial() {
        return relacionComercial;
    }

    public void setRelacionComercial(String relacionComercial) {
        this.relacionComercial = relacionComercial;
    }

    public String getAnexos() {
        return anexos;
    }

    public void setAnexos(String anexos) {
        this.anexos = anexos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getTotalUnds() {
        return totalUnds;
    }

    public void setTotalUnds(double totalUnds) {
        this.totalUnds = totalUnds;
    }

    public double getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getTotal_iva() {
        return total_iva;
    }

    public void setTotal_iva(double total_iva) {
        this.total_iva = total_iva;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String getCodigo_linea() {
        return codigo_linea;
    }

    public void setCodigo_linea(String codigo_linea) {
        this.codigo_linea = codigo_linea;
    }

    public String getProducto_linea() {
        return producto_linea;
    }

    public void setProducto_linea(String producto_linea) {
        this.producto_linea = producto_linea;
    }

    public String getUnids_linea() {
        return unids_linea;
    }

    public void setUnids_linea(String unids_linea) {
        this.unids_linea = unids_linea;
    }

    public String getValorUnidad_linea() {
        return valorUnidad_linea;
    }

    public void setValorUnidad_linea(String valorUnidad_linea) {
        this.valorUnidad_linea = valorUnidad_linea;
    }

    public String getValorSubtotal_linea() {
        return valorSubtotal_linea;
    }

    public void setValorSubtotal_linea(String valorSubtotal_linea) {
        this.valorSubtotal_linea = valorSubtotal_linea;
    }

    public String getDescuento_linea() {
        return descuento_linea;
    }

    public void setDescuento_linea(String descuento_linea) {
        this.descuento_linea = descuento_linea;
    }

    public String getIva_linea() {
        return iva_linea;
    }

    public void setIva_linea(String iva_linea) {
        this.iva_linea = iva_linea;
    }

    public String getValor_Total_linea() {
        return valor_Total_linea;
    }

    public void setValor_Total_linea(String valor_Total_linea) {
        this.valor_Total_linea = valor_Total_linea;
    }

  

    
}
