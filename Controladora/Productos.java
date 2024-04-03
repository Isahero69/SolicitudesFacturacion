
package Controladora;

import java.io.Serializable;

public class Productos implements Serializable {
    
   
    private int id_Producto;
    private String nombreOperacion;
    private int codigoContable;
    private String tipoProducto;

    public Productos() {
    }

    public Productos(int id_Producto,String nombreOperacion, int codigoContable, String tipoProducto) {
        this.id_Producto = id_Producto;
        this.nombreOperacion = nombreOperacion;
        this.codigoContable = codigoContable;
        this.tipoProducto = tipoProducto;
    }
    
    //----------------------- GETTERS -----------------------

    public int getId_Producto() {
        return id_Producto;
    }

    
    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public int getCodigoContable() {
        return codigoContable;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }
    
    
    //----------------------- SETTERS -----------------------

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }
    
    public void setNombreOperacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }

    public void setCodigoContable(int codigoContable) {
        this.codigoContable = codigoContable;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
            
    
}
