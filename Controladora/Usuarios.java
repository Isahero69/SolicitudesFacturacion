
package Controladora;


public class Usuarios {

    private int idUsuario;
    private String nombreUsuario;
    private int ccUsuario;
    private String cargoUsuario;
    private String areaUsuario;
    private String correoUsuario;
    private String passwordUsuario;

    public Usuarios() {
    }

    public Usuarios(int idUsuario, String nombreUsuario, int ccUsuario, String cargoUsuario, String areaUsuario, String correoUsuario, String passwordUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.ccUsuario = ccUsuario;
        this.cargoUsuario = cargoUsuario;
        this.areaUsuario = areaUsuario;
        this.correoUsuario = correoUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getCcUsuario() {
        return ccUsuario;
    }

    public String getCargoUsuario() {
        return cargoUsuario;
    }

    public String getAreaUsuario() {
        return areaUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setCcUsuario(int ccUsuario) {
        this.ccUsuario = ccUsuario;
    }

    public void setCargoUsuario(String cargoUsuario) {
        this.cargoUsuario = cargoUsuario;
    }

    public void setAreaUsuario(String areaUsuario) {
        this.areaUsuario = areaUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

   
   
    
    
    
    
    
    
}
