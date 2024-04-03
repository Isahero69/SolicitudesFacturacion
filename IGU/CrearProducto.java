package IGU;

import Controladora.Productos;
import Logica.ProductosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public final class CrearProducto extends javax.swing.JFrame {

    Productos ingresarProductos = new Productos();
    Productos validarCodigo = new Productos();
    ProductosDAO logicaProductos = new ProductosDAO();

    public CrearProducto() {
        
        initComponents();
        validar();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcionServicio = new javax.swing.JTextField();
        txtCondigoContable = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cmbTipoOperacion = new javax.swing.JComboBox<>();
        lblCODIGO = new javax.swing.JLabel();
        lblPRODUCTO = new javax.swing.JLabel();
        lblTIPO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Servicio");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Codigo Contable:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Producto:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de Operacion:");

        txtDescripcionServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionServicioKeyReleased(evt);
            }
        });

        txtCondigoContable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCondigoContableKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCondigoContableKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cmbTipoOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1229 - Limpieza Urbana", "1230 - Recoleccion Privada", "1528 - Servicios Privados", "2391 - Prueba Genial" }));
        cmbTipoOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoOperacionActionPerformed(evt);
            }
        });

        lblCODIGO.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCODIGO.setForeground(new java.awt.Color(255, 0, 0));

        lblPRODUCTO.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblPRODUCTO.setForeground(new java.awt.Color(255, 0, 0));

        lblTIPO.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTIPO.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTIPO))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCondigoContable, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCODIGO))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDescripcionServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPRODUCTO)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCondigoContable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCODIGO))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTIPO))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcionServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPRODUCTO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String validar[] = new String[3];
        ArrayList<Object> agregar = new ArrayList<>();
        String txtField[] = {"Codigo Contable",
            "Tipo Operacion",
            "Producto"};
        int vacios;
        validar[0] = txtCondigoContable.getText();
        validar[1] = (String) cmbTipoOperacion.getSelectedItem();
        validar[2] = txtDescripcionServicio.getText();
        for (int i = 0; i < validar.length; i++) {
            if (validar[i].isEmpty() || validar[i].equals("-")) {

                vacios = i;

                for (int k = 0; k < txtField.length; k++) {
                    if (vacios == k) {
                        agregar.add(txtField[k]);
                    }
                }

            }

        }
        if (agregar.size() == 1) {
            mostrarMensaje("El campo " + agregar + " es obligatorio", "Info", "Campo Obligatorio");

        } else if (agregar.size() > 1) {
            mostrarMensaje("Los campos " + agregar + " son obligatorios", "Info", "Campos Obligatorios");

        } else {

            String codigo = txtCondigoContable.getText();
            validarCodigo = logicaProductos.validarCodigo(codigo);

            if (validarCodigo.getCodigoContable() == Integer.parseInt(codigo)) {
                mostrarMensaje("El codigo " + codigo + " ya existe en base de datos", "Info", "Codigo ya Existe");
            } else {
                ingresarProductos.setCodigoContable(Integer.parseInt(txtCondigoContable.getText()));
                ingresarProductos.setNombreOperacion((String) cmbTipoOperacion.getSelectedItem());
                ingresarProductos.setTipoProducto(txtDescripcionServicio.getText());

                try {
                    logicaProductos.registrarProductos(ingresarProductos);
                } catch (SQLException ex) {
                    Logger.getLogger(CrearProducto.class.getName()).log(Level.SEVERE, null, ex);
                }

                txtCondigoContable.setText("");
                cmbTipoOperacion.setSelectedIndex(0);
                txtDescripcionServicio.setText("");

                mostrarMensaje("Producto Creado Correctamente", "Info", "Producto Creado");

            }

        }

    }//GEN-LAST:event_jButton2ActionPerformed

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


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtCondigoContable.setText("");
        cmbTipoOperacion.setSelectedIndex(0);
        txtDescripcionServicio.setText("");
        validar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCondigoContableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCondigoContableKeyReleased
        validar();
    }//GEN-LAST:event_txtCondigoContableKeyReleased

    private void cmbTipoOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoOperacionActionPerformed
        validar();
    }//GEN-LAST:event_cmbTipoOperacionActionPerformed

    private void txtDescripcionServicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionServicioKeyReleased
        validar();
    }//GEN-LAST:event_txtDescripcionServicioKeyReleased

    private void txtCondigoContableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCondigoContableKeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCondigoContableKeyTyped

    public void validar() {

        if (txtCondigoContable.getText().isEmpty()) {
            lblCODIGO.setText("*");

        } else {

            lblCODIGO.setText("");
        }

        if (txtDescripcionServicio.getText().isEmpty()) {
            lblPRODUCTO.setText("*");

        } else {

            lblPRODUCTO.setText("");
        }

        if (cmbTipoOperacion.getSelectedItem().equals("-")) {
            lblTIPO.setText("*");

        } else {

            lblTIPO.setText("");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTipoOperacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCODIGO;
    private javax.swing.JLabel lblPRODUCTO;
    private javax.swing.JLabel lblTIPO;
    private javax.swing.JTextField txtCondigoContable;
    private javax.swing.JTextField txtDescripcionServicio;
    // End of variables declaration//GEN-END:variables
}
