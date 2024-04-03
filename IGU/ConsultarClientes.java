package IGU;

import Controladora.Cliente;
import Logica.ClientesDAO;
import Principal.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarClientes extends javax.swing.JFrame {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pre;
    ResultSet rs;
    Cliente cliente = new Cliente();
    ClientesDAO clientedao = new ClientesDAO();

    DefaultTableModel modelo;

    public ConsultarClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnRegresarConsulta = new javax.swing.JButton();
        FiltrarClientes = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtEditarNit = new javax.swing.JTextField();
        txtEditarNombreCliente = new javax.swing.JTextField();
        txtEditarCorreo = new javax.swing.JTextField();
        txtidEdicion = new javax.swing.JTextField();
        txtEditarContacto = new javax.swing.JTextField();
        cmbEditarTipoCliente = new javax.swing.JComboBox<>();
        cmbEditarRelacionComercial = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Clientes");

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "NIT", "NOMBRE CLIENTE", "CORREO", "CONTACTO", "TIPO CLIENTE", "RELACION COMERCIAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCliente);
        if (tableCliente.getColumnModel().getColumnCount() > 0) {
            tableCliente.getColumnModel().getColumn(0).setMinWidth(5);
            tableCliente.getColumnModel().getColumn(0).setPreferredWidth(5);
            tableCliente.getColumnModel().getColumn(1).setPreferredWidth(15);
        }

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Buscar Nombre Cliente");

        btnEditarCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEditarCliente.setText("Editar Cliente");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnGuardarCambios.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnRegresarConsulta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnRegresarConsulta.setText("Regresar");
        btnRegresarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarConsultaActionPerformed(evt);
            }
        });

        FiltrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltrarClientesActionPerformed(evt);
            }
        });
        FiltrarClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltrarClientesKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegresarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FiltrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        txtidEdicion.setEditable(false);

        cmbEditarTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Juridico", "Natural" }));

        cmbEditarRelacionComercial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Contrato", "Orden de Compra", "Orden de Servicio", "Sin relacion contractual" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtEditarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEditarTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEditarRelacionComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(447, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtidEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEditarNit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEditarNombreCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEditarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditarNit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEditarTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEditarRelacionComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ListarCliente();
        desactivartxtEdicion();

    }//GEN-LAST:event_formWindowOpened

    private void btnRegresarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarConsultaActionPerformed

        dispose();
    }//GEN-LAST:event_btnRegresarConsultaActionPerformed

    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClienteMouseClicked

        int fila = tableCliente.rowAtPoint(evt.getPoint());
        txtidEdicion.setText(tableCliente.getValueAt(fila, 0).toString());
        txtEditarNit.setText(tableCliente.getValueAt(fila, 1).toString());
        txtEditarNombreCliente.setText(tableCliente.getValueAt(fila, 2).toString());
        txtEditarCorreo.setText(tableCliente.getValueAt(fila, 3).toString());
        txtEditarContacto.setText(tableCliente.getValueAt(fila, 4).toString());
        cmbEditarTipoCliente.setSelectedItem(tableCliente.getValueAt(fila, 5).toString());
        cmbEditarRelacionComercial.setSelectedItem(tableCliente.getValueAt(fila, 6).toString());

    }//GEN-LAST:event_tableClienteMouseClicked

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        if ("".equals(txtidEdicion.getText())) {
            mostrarMensaje("Debe seleccionar un cliente", "Info", "Informacion");
        } else {
            activarEdicionCliente();
        }

    }//GEN-LAST:event_btnEditarClienteActionPerformed


    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed

        if (tableCliente.getRowCount() > 0) {//validamos que en la tabla tenga informacion

            if (tableCliente.getSelectedRow() != - 1) {//validamos que exista una fila seleccionada

                //hacemos una pregunta confirmando
                int pregunta = JOptionPane.showConfirmDialog(null, "¿Esta Seguro de Eliminar el Cliente?");
                if (pregunta == 0) {

                    int id = Integer.parseInt(String.valueOf(tableCliente.getValueAt(tableCliente.getSelectedRow(), 0)));
                    clientedao.EliminarCliente(id);
                    limpiarTabla();
                    ListarCliente();
                    limpiarEdicion();
                    mostrarMensaje("Cliente Eliminado", "Info", "Confirmacion");

                }
            } else {
                mostrarMensaje("Debe Seleccionar un Cliente", "Info", "Informacion");
            }

        } else {
            mostrarMensaje("No existen registros a Eliminar", "Error", "Sin Registros");
        }


    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed

        if ("".equals(txtidEdicion.getText())) {
            mostrarMensaje("Debe seleccionar un cliente", "Info", "Informacion");
        } else {

            cliente.setId_Cliente(Integer.parseInt(txtidEdicion.getText()));
            cliente.setCorreoElectronico(txtEditarCorreo.getText());
            cliente.setNit_Cliente(Integer.parseInt(txtEditarNit.getText()));
            cliente.setNombreCliente(txtEditarNombreCliente.getText());
            cliente.setRelacionComercial(cmbEditarRelacionComercial.getSelectedItem().toString());
            cliente.setTelefono(Long.parseLong(txtEditarContacto.getText()));
            cliente.setTipoCliente(cmbEditarTipoCliente.getSelectedItem().toString());

            if (!"".equals(txtidEdicion.getText())) {
                clientedao.modificarCliente(cliente);
                limpiarTabla();
                ListarCliente();
                desactivartxtEdicion();
                limpiarEdicion();
                mostrarMensaje("Cliente modificado correctamente", "Info", "Edicion Clientes");
            }
        }


    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void FiltrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltrarClientesActionPerformed

    }//GEN-LAST:event_FiltrarClientesActionPerformed

    private void FiltrarClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltrarClientesKeyReleased

        //int parametroBuscado = (cmbFiltrar.getSelectedIndex());
        String valorBuscado = FiltrarClientes.getText();
        filtrarClientes(valorBuscado);

    }//GEN-LAST:event_FiltrarClientesKeyReleased

    public void filtrarClientes(String valorBuscado) {
        limpiarTabla();
        try {
            String filtro = "" + valorBuscado + "_%";
            String sql = "SELECT * FROM cliente WHERE nombreCliente LIKE " + '"' + filtro + '"';
            System.out.println(sql);
            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();

            Object[] fila = new Object[7];

            while (rs.next()) {
                fila[0] = rs.getInt("id_Cliente");
                fila[1] = rs.getLong("nit_Cliente");
                fila[2] = rs.getString("nombreCliente");
                fila[3] = rs.getString("correoElectronico");
                fila[4] = rs.getLong("telefono");
                fila[5] = rs.getString("tipoCliente");
                fila[6] = rs.getString("relacionComercial");
                modelo.addRow(fila);

            }
            tableCliente.setModel(modelo);

        } catch (SQLException e) {

            System.out.println(e.toString());
        } finally {

            try {
                rs.close();
                pre.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public void ListarCliente() {
        List<Cliente> mostrarCliente = clientedao.listarClientes();
        modelo = (DefaultTableModel) tableCliente.getModel();

        if (mostrarCliente != null) {
            for (Cliente mostrar : mostrarCliente) {
                Object[] clientesTabla = {
                    mostrar.getId_Cliente(),
                    mostrar.getNit_Cliente(),
                    mostrar.getNombreCliente(),
                    mostrar.getCorreoElectronico(),
                    mostrar.getTelefono(),
                    mostrar.getTipoCliente(),
                    mostrar.getRelacionComercial()
                };

                modelo.addRow(clientesTabla);
            }
        }
 
        tableCliente.setModel(modelo);

    }

    private void limpiarTabla() {

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;

        }
    }

    public void limpiarEdicion() {
        txtidEdicion.setText("");
        txtEditarCorreo.setText("");
        txtEditarNit.setText("");
        txtEditarNombreCliente.setText("");
        cmbEditarRelacionComercial.setSelectedIndex(0);
        txtEditarContacto.setText("");
        cmbEditarTipoCliente.setSelectedIndex(0);
    }

    public void activarEdicionCliente() {

        txtEditarCorreo.setEnabled(true);
        txtEditarNit.setEnabled(true);
        txtEditarNombreCliente.setEnabled(true);
        cmbEditarRelacionComercial.setEnabled(true);
        txtEditarContacto.setEnabled(true);
        cmbEditarTipoCliente.setEnabled(true);

    }

    public void desactivartxtEdicion() {
        txtEditarCorreo.setEnabled(false);
        txtEditarNit.setEnabled(false);
        txtEditarNombreCliente.setEnabled(false);
        cmbEditarRelacionComercial.setEnabled(false);
        txtEditarContacto.setEnabled(false);
        cmbEditarTipoCliente.setEnabled(false);
    }

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane optionPane = new JOptionPane(mensaje);

        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {

            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FiltrarClientes;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnRegresarConsulta;
    private javax.swing.JComboBox<String> cmbEditarRelacionComercial;
    private javax.swing.JComboBox<String> cmbEditarTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTextField txtEditarContacto;
    private javax.swing.JTextField txtEditarCorreo;
    private javax.swing.JTextField txtEditarNit;
    private javax.swing.JTextField txtEditarNombreCliente;
    private javax.swing.JTextField txtidEdicion;
    // End of variables declaration//GEN-END:variables
}
