
package Logica;

import Controladora.Usuarios;
import Principal.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public Usuarios log(String correoUsuario, String passwordUsuario){
        
        Usuarios l = new Usuarios();
        String sql = "SELECT * FROM funcionarios WHERE ccUsuario = ? OR passwordUsuario = ?";
        
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correoUsuario);
            ps.setString(2, passwordUsuario);
            rs = ps.executeQuery();
            if(rs.next()){
                l.setCcUsuario(rs.getInt("ccUsuario"));
                l.setPasswordUsuario(rs.getString("passwordUsuario"));
                
            }
            
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        
        return l;
    }
    
    
    
    
    
}
