
package Controladora;

import java.io.Serializable;

public class Cliente implements Serializable {
    
 
    private int id_Cliente;
    private long nit_Cliente;
    private String nombreCliente;
    private String relacionComercial;
    private String tipoCliente;
    private String correoElectronico;
    private long telefono;
    
    

    public Cliente() {
    }

    public Cliente(int id_Cliente,long nit_Cliente, String nombreCliente, 
            String relacionComercial, String tipoCliente, String correoElectronico, 
            long telefono) {
        
        this.id_Cliente = id_Cliente;
        this.nit_Cliente = nit_Cliente;
        this.nombreCliente = nombreCliente;
        this.relacionComercial = relacionComercial;
        this.tipoCliente = tipoCliente;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    
    //----------------------- GETTERS -----------------------
    
    public int getId_Cliente() {
        return id_Cliente;
    }

    public long getNit_Cliente() {
        return nit_Cliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getRelacionComercial() {
        return relacionComercial;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public long getTelefono() {
        return telefono;
    }
    
    //----------------------- SETTERS -----------------------

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }
    

    public void setNit_Cliente(long nit_Cliente) {
        this.nit_Cliente = nit_Cliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setRelacionComercial(String relacionComercial) {
        this.relacionComercial = relacionComercial;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
}