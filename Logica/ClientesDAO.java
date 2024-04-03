package Logica;

import Controladora.Cliente;
import Principal.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pre;
    ResultSet rs;

    public boolean registrarCliente(Cliente cliente) {

        String sql = "INSERT INTO cliente (correoElectronico,nit_Cliente,nombreCliente,"
                + "relacionComercial,telefono,tipoCliente) VALUE (?,?,?,?,?,?)";

        try {
            con = cn.getConnection();//conectamos con la base de  datos 
            pre = con.prepareStatement(sql);//y conectamos con lo que queremos hacer en la base 
            pre.setLong(2, cliente.getNit_Cliente());
            pre.setString(3, cliente.getNombreCliente());
            pre.setString(4, cliente.getRelacionComercial());
            pre.setString(6, cliente.getTipoCliente());
            pre.setString(1, cliente.getCorreoElectronico());
            pre.setLong(5, cliente.getTelefono());
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

    public List listarClientes() {//mostrar en tabla
        List<Cliente> mostrarClientes = new ArrayList();
        String sql = "SELECT * FROM cliente";

        try {
            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setNit_Cliente(rs.getLong("nit_Cliente"));
                cliente.setNombreCliente(rs.getString("nombreCliente"));
                cliente.setCorreoElectronico(rs.getString("correoElectronico"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setTipoCliente(rs.getString("tipoCliente"));
                cliente.setRelacionComercial(rs.getString("relacionComercial"));
                cliente.setId_Cliente(rs.getInt("id_Cliente"));

                mostrarClientes.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return mostrarClientes;
    }

    public Cliente ConsultarNitCliente(String nitCliente) {
        Cliente nit = new Cliente();
        String sql = "SELECT * FROM Cliente WHERE nit_Cliente = ?";

        try {
            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            pre.setString(1, nitCliente);
            rs = pre.executeQuery();
            if (rs.next()) {
                nit.setNit_Cliente(rs.getLong("nit_Cliente"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return nit;
    }

    public boolean EliminarCliente(int id_Cliente) {

        String sql = "DELETE FROM cliente WHERE id_Cliente = ?";

        try {
            pre = con.prepareStatement(sql);
            pre.setInt(1, id_Cliente);
            pre.execute();
            return true;

        } catch (SQLException e) {

            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }

    }

    public boolean modificarCliente(Cliente clienteM) {

        String sql = "UPDATE cliente SET correoElectronico = ?, nit_Cliente= ?, nombreCliente= ?, "
                + "relacionComercial = ?, telefono = ?, tipoCliente = ? WHERE id_Cliente = ?";

        try {
            pre = con.prepareStatement(sql);
            pre.setString(1, clienteM.getCorreoElectronico());
            pre.setLong(2, clienteM.getNit_Cliente());
            pre.setString(3, clienteM.getNombreCliente());
            pre.setString(4, clienteM.getRelacionComercial());
            pre.setLong(5, clienteM.getTelefono());
            pre.setString(6, clienteM.getTipoCliente());
            pre.setInt(7, clienteM.getId_Cliente());
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
