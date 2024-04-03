package Logica;

import Controladora.Cliente;
import Controladora.Facturacion;
import Controladora.Productos;
import Controladora.Usuarios;
import IGU.ConsultarSolicitudes;

import Principal.Conexion;
import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SolicitudFacturacionDao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pre;
    ResultSet rs;

    public Usuarios buscarCCUsuario(int cc) {

        Usuarios usuario = new Usuarios();
        String sql = "SELECT * FROM funcionarios WHERE ccUsuario = ?";

        try {
            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            pre.setInt(1, cc);
            rs = pre.executeQuery();

            if (rs.next()) {
                usuario.setNombreUsuario(rs.getString("nombreUsuario"));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return usuario;
    }

    public Cliente buscarCliente(int nit) {
        Cliente buscarCliente = new Cliente();

        String sql = "SELECT * FROM cliente WHERE nit_Cliente = ?";

        try {
            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            pre.setInt(1, nit);
            rs = pre.executeQuery();

            if (rs.next()) {
                buscarCliente.setNombreCliente(rs.getString("nombreCliente"));
                buscarCliente.setCorreoElectronico(rs.getString("correoElectronico"));
                buscarCliente.setTelefono(rs.getLong("telefono"));
                buscarCliente.setTipoCliente(rs.getString("tipoCliente"));
                buscarCliente.setRelacionComercial(rs.getString("relacionComercial"));

            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return buscarCliente;
    }

    public Productos Buscarproducto(int cod) {
        Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE codigoContable = ?";

        try {
            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            pre.setInt(1, cod);
            rs = pre.executeQuery();

            if (rs.next()) {
                producto.setTipoProducto(rs.getString("tipoProducto"));

            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return producto;

    }

    public boolean ingresarSolicitud2(Facturacion datosSolicitud2) {

        String sql = "INSERT INTO facturacion_2 (codigo,producto,unids,valorUnidad,"
                + "valorSubtotal,descuento,iva,valor_Total) VALUE (?,?,?,?,?,?,?,?)";

        try {

            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            pre.setString(1, datosSolicitud2.getCodigo_linea());
            pre.setString(2, datosSolicitud2.getProducto_linea());
            pre.setString(3, datosSolicitud2.getUnids_linea());
            pre.setString(4, datosSolicitud2.getValorUnidad_linea());
            pre.setString(5, datosSolicitud2.getValorSubtotal_linea());
            pre.setString(6, datosSolicitud2.getDescuento_linea());
            pre.setString(7, datosSolicitud2.getIva_linea());
            pre.setString(8, datosSolicitud2.getValor_Total_linea());
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

    public boolean ingresarSolicitud(Facturacion datosSolicitud) throws SQLException {

        String sql = "INSERT INTO facturacion (Usuario,"
                + "nitCliente, "
                + "nombreCliente, "
                + "correoCliente,"
                + "telefonoCliente, "
                + "tipoCliente,"
                + "relacionComercial, "
                + "anexos, "
                + "observaciones, "
                + "totalUnds, "
                + "totalDescuento,"
                + "Subtotal, "
                + "total_iva, "
                + "Total,codigo,producto,unids,valorUnidad,"
                + "valorSubtotal,descuento,iva,valor_Total) VALUE (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            
            //pre.setDate(1, (Date) datosSolicitud.getFechaSolicitud());
            pre.setString(1, datosSolicitud.getUsuario());
            pre.setInt(2, datosSolicitud.getNitCliente());
            pre.setString(3, datosSolicitud.getNombreCliente());
            pre.setString(4, datosSolicitud.getCorreoCliente());
            pre.setLong(5, datosSolicitud.getTelefonoCliente());
            pre.setString(6, datosSolicitud.getTipoCliente());
            pre.setString(7, datosSolicitud.getRelacionComercial());
            pre.setString(8, datosSolicitud.getAnexos());
            pre.setString(9, datosSolicitud.getObservaciones());
            pre.setDouble(10, datosSolicitud.getTotalUnds());
            pre.setDouble(11, datosSolicitud.getTotalDescuento());
            pre.setDouble(12, datosSolicitud.getSubtotal());
            pre.setDouble(13, datosSolicitud.getTotal_iva());
            pre.setDouble(14, datosSolicitud.getTotal());
            pre.setString(15, datosSolicitud.getCodigo_linea());
            pre.setString(16, datosSolicitud.getProducto_linea());
            pre.setString(17, datosSolicitud.getUnids_linea());
            pre.setString(18, datosSolicitud.getValorUnidad_linea());
            pre.setString(19, datosSolicitud.getValorSubtotal_linea());
            pre.setString(20, datosSolicitud.getDescuento_linea());
            pre.setString(21, datosSolicitud.getIva_linea());
            pre.setString(22, datosSolicitud.getValor_Total_linea());
            
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

    public List mostrarClientes() {//mostrar en tabla
        List<Cliente> mostrarClientes = new ArrayList();
        String sql = "SELECT * FROM cliente";

        try {
            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_Cliente(rs.getInt("id_Cliente"));
                cliente.setNit_Cliente(rs.getLong("nit_Cliente"));
                cliente.setNombreCliente(rs.getString("nombreCliente"));
                mostrarClientes.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return mostrarClientes;
    }

    public List consultarSolicitudes() {

        List<Facturacion> mostrarSol = new ArrayList<>();
        String sql = "SELECT * FROM facturacion";

        try {

            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();

            while (rs.next()) {
                Facturacion solicitud = new Facturacion();
                solicitud.setIdConsecutivo(rs.getInt("idConsecutivo"));
                solicitud.setFechaSolicitud(rs.getDate("fecha"));
                solicitud.setUsuario(rs.getString("Usuario"));
                solicitud.setNitCliente(rs.getInt("nitCliente"));
                solicitud.setNombreCliente(rs.getString("nombreCliente"));
                solicitud.setRelacionComercial(rs.getString("relacionComercial"));
                solicitud.setTotalUnds(rs.getDouble("totalUnds"));
                solicitud.setSubtotal(rs.getDouble("Subtotal"));
                solicitud.setTotalDescuento(rs.getDouble("totalDescuento"));
                solicitud.setTotal_iva(rs.getDouble("total_Iva"));
                solicitud.setTotal(rs.getDouble("Total"));
                
                mostrarSol.add(solicitud);
            }

        } catch (SQLException e) {

            System.out.println(e.toString());
        }

        return mostrarSol;
    }

    public List mostrarDetalle(int id) {

        List<Facturacion> detalle = new ArrayList();
        String sql = "SELECT * FROM facturacion WHERE idConsecutivo = ?";

        try {
            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            pre.setInt(1, id);
            rs = pre.executeQuery();

            while (rs.next()) {
                Facturacion almacenar = new Facturacion();
                almacenar.setIdConsecutivo(rs.getInt("idConsecutivo"));
                almacenar.setCodigo_linea(rs.getString("codigo"));
                almacenar.setAnexos(rs.getString("Anexos"));
                almacenar.setObservaciones(rs.getString("observaciones"));
                almacenar.setProducto_linea(rs.getString("producto"));
                almacenar.setUnids_linea(rs.getString("unids"));
                almacenar.setValorUnidad_linea(rs.getString("valorUnidad"));
                almacenar.setValorSubtotal_linea(rs.getString("valorSubtotal"));
                almacenar.setDescuento_linea(rs.getString("descuento"));
                almacenar.setIva_linea(rs.getString("iva"));
                almacenar.setValor_Total_linea(rs.getString("valor_Total"));
                detalle.add(almacenar);

            }

        } catch (SQLException e) {

            System.out.println(e.toString());

        }

        return detalle;

    }

}
