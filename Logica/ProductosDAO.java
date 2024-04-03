package Logica;

import Controladora.Productos;
import Principal.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductosDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarProductos(Productos pro) throws SQLException {
        String sql = "INSERT INTO productos(nombreOperacion,codigoContable,tipoProducto) VALUES (?,?,?)";

        try {

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombreOperacion());
            ps.setInt(2, pro.getCodigoContable());
            ps.setString(3, pro.getTipoProducto());
            ps.execute();
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

    public List mostrarProductos() {

        List<Productos> listarProductos = new ArrayList();

        String sql = "SELECT * FROM productos";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Productos mostrar = new Productos();
                mostrar.setId_Producto(rs.getInt("id_Producto"));
                mostrar.setCodigoContable(rs.getInt("codigoContable"));
                mostrar.setNombreOperacion(rs.getString("nombreOperacion"));
                mostrar.setTipoProducto(rs.getString("tipoProducto"));

                listarProductos.add(mostrar);

            }

        } catch (SQLException e) {
            System.out.println(e.toString());

        }

        return listarProductos;

    }

    public boolean eliminarProductos(int id_Producto) {

        String sql = "DELETE FROM productos WHERE id_Producto = ?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_Producto);
            ps.execute();
            return true;

        } catch (SQLException e) {

            System.out.println(e.toString());
            return false;
        } finally {

            try {
                ps.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

    }

    public boolean editarProductos(Productos Productos) {

        String sql = "UPDATE productos SET codigoContable = ?, "
                + "nombreOperacion = ?, tipoProducto = ? WHERE id_Producto = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(4, Productos.getId_Producto());
            ps.setInt(1, Productos.getCodigoContable());
            ps.setString(2, Productos.getNombreOperacion());
            ps.setString(3, Productos.getTipoProducto());
            ps.execute();
            return true;

        } catch (SQLException e) {

            System.out.println(e.toString());
            return false;
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

    }

    public Productos validarCodigo(String codigo) {

        Productos codigoPro = new Productos();
        String sql = "SELECT * FROM productos WHERE codigoContable = ?";

        con = cn.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            if(rs.next()){
                codigoPro.setCodigoContable(rs.getInt("codigoContable"));
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return  codigoPro;
    }

}
