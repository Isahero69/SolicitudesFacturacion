package Logica;

import Controladora.Usuarios;
import Principal.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuariosDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pre;

    public boolean crearUsuario(Usuarios usuario) {

        String sql = "INSERT INTO funcionarios (cargoUsuario,correoUsuario,ccUsuario,"
                + "nombreUsuario,areaUsuario,passwordUsuario) VALUE (?,?,?,?,?,?)";

        try {
            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            pre.setString(1, usuario.getCargoUsuario());
            pre.setString(2, usuario.getCorreoUsuario());
            pre.setInt(3, usuario.getCcUsuario());
            pre.setString(4, usuario.getNombreUsuario());
            pre.setString(5, usuario.getAreaUsuario());
            pre.setString(6, usuario.getPasswordUsuario());
            pre.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

    }

}
