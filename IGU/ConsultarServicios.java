package IGU;

import Controladora.Productos;
import Logica.ProductosDAO;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ConsultarServicios extends javax.swing.JFrame {

    Productos producto = new Productos();
    ProductosDAO logicaProductos = new ProductosDAO();
    DefaultTableModel modelo;

    public ConsultarServicios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtEditarCodigoContable = new javax.swing.JTextField();
        txtEditarNombreProducto = new javax.swing.JTextField();
        txtIDProductos = new javax.swing.JTextField();
        cmbEditarTipoOperacion = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        btnEditarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnGuardarCambiosProducto = new javax.swing.JButton();
        btnRegresarProductos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtIDProductos.setEditable(false);

        cmbEditarTipoOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1229 - Limpieza Urbana", "1230 - Recoleccion Privada", "1528 - Servicios Privados", "2391 - Prueba Genial" }));
        cmbEditarTipoOperacion.setPreferredSize(new java.awt.Dimension(15, 24));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIDProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarCodigoContable, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbEditarTipoOperacion, 0, 391, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEditarNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditarCodigoContable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditarNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEditarTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "CODIGO", "TIPO OPERACION", "DESCRIPCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProductos);
        if (tableProductos.getColumnModel().getColumnCount() > 0) {
            tableProductos.getColumnModel().getColumn(0).setMinWidth(10);
            tableProductos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableProductos.getColumnModel().getColumn(1).setPreferredWidth(20);
            tableProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableProductos.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        btnEditarProducto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEditarProducto.setText("Editar Producto");
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnGuardarCambiosProducto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnGuardarCambiosProducto.setText("Guardar Cambios");
        btnGuardarCambiosProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosProductoActionPerformed(evt);
            }
        });

        btnRegresarProductos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnRegresarProductos.setText("Regresar");
        btnRegresarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarCambiosProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegresarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarCambiosProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegresarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Servicios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked

        int fila = tableProductos.rowAtPoint(evt.getPoint());
        txtIDProductos.setText(tableProductos.getValueAt(fila, 0).toString());
        txtEditarCodigoContable.setText(tableProductos.getValueAt(fila, 1).toString());
        cmbEditarTipoOperacion.setSelectedItem(String.valueOf(tableProductos.getValueAt(fila, 2)));
        txtEditarNombreProducto.setText(tableProductos.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tableProductosMouseClicked

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        if (txtIDProductos.getText().equals("")) {
            mostrarMensaje("Debes marcar un registro en la tabla", "Info", "Selecciona un registro");
        } else {
            habilitarCampos();
        }


    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed

        if (tableProductos.getRowCount() > 0) {
            if (tableProductos.getSelectedRow() != -1) {

                int pregunta = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el registro?");
                if (pregunta == 0) {

                    int id = Integer.parseInt(String.valueOf(tableProductos.getValueAt(tableProductos.getSelectedRow(), 0)));
                    logicaProductos.eliminarProductos(id);
                    limpiarTabla();
                    mostrarProductos();
                    mostrarMensaje("Producto eliminado correctamente", "Info", "Producto Eliminado");

                }

            } else {
                mostrarMensaje("Debes seleccionar un registro", "Info", "Selecciona un registro");
            }

        } else {
            mostrarMensaje("No existen productos registrados", "Info", "Sin registros");
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnGuardarCambiosProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosProductoActionPerformed

        if (!"".equals(txtIDProductos.getText())) {

            producto.setId_Producto(Integer.parseInt(txtIDProductos.getText()));
            producto.setCodigoContable(Integer.parseInt(txtEditarCodigoContable.getText()));
            producto.setNombreOperacion(cmbEditarTipoOperacion.getSelectedItem().toString());
            producto.setTipoProducto(txtEditarNombreProducto.getText());
            logicaProductos.editarProductos(producto);

            limpiarTabla();
            mostrarProductos();
            deshabilitarCampos();
            limpiarCampos();
            mostrarMensaje("Producto editado correctamente", "Info", "Producto Modificado");
        } else {
            mostrarMensaje("Debes seleccionar un producto a editar", "Info", "Seleccione un registro");
        }

    }//GEN-LAST:event_btnGuardarCambiosProductoActionPerformed

    private void btnRegresarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarProductosActionPerformed

        dispose();
    }//GEN-LAST:event_btnRegresarProductosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated


    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mostrarProductos();
        deshabilitarCampos();
    }//GEN-LAST:event_formWindowOpened

    public void mostrarProductos() {

        List<Productos> mostrarPro = logicaProductos.mostrarProductos();
        modelo = (DefaultTableModel) tableProductos.getModel();

        if (mostrarPro != null) {
            for (Productos mostrarProductos : mostrarPro) {
                Object[] tablaPro = {
                    mostrarProductos.getId_Producto(),
                    mostrarProductos.getCodigoContable(),
                    mostrarProductos.getNombreOperacion(),
                    mostrarProductos.getTipoProducto()
                };

                modelo.addRow(tablaPro);

            }
        }

        tableProductos.setModel(modelo);

    }

    private void deshabilitarCampos() {
        txtEditarCodigoContable.setEnabled(false);
        cmbEditarTipoOperacion.setEnabled(false);
        txtEditarNombreProducto.setEnabled(false);
    }

    private void habilitarCampos() {
        txtEditarCodigoContable.setEnabled(true);
        cmbEditarTipoOperacion.setEnabled(true);
        txtEditarNombreProducto.setEnabled(true);
    }

    private void limpiarCampos() {
        txtIDProductos.setText("");
        txtEditarCodigoContable.setText("");
        cmbEditarTipoOperacion.setSelectedIndex(0);
        txtEditarNombreProducto.setText("");
    }

    private void limpiarTabla() {

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;

        }
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
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnGuardarCambiosProducto;
    private javax.swing.JButton btnRegresarProductos;
    private javax.swing.JComboBox<String> cmbEditarTipoOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField txtEditarCodigoContable;
    private javax.swing.JTextField txtEditarNombreProducto;
    private javax.swing.JTextField txtIDProductos;
    // End of variables declaration//GEN-END:variables
}
