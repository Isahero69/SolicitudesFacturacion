package IGU;

import Controladora.Usuarios;
import Logica.UsuariosDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public final class CrearUsuario extends javax.swing.JFrame {

    Usuarios nuevoUsuario = new Usuarios();
    UsuariosDao persisUsuario = new UsuariosDao();

    public CrearUsuario() {
        initComponents();
        validar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblvalidarCorreo = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtCedulaUsuario = new javax.swing.JTextField();
        txtCorreoUsuario = new javax.swing.JTextField();
        txtAreaUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCargoUsuario = new javax.swing.JTextField();
        txtContrasenaUsuario = new javax.swing.JTextField();
        btnGuardarUsuario = new javax.swing.JButton();
        btnLimpiarUsuario = new javax.swing.JButton();
        btnConsultarUsuarios = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crea tu Usuario");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Tu Cargo:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Tu nombre:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Tu Cedula:");

        lblvalidarCorreo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblvalidarCorreo.setText("Tu Correo Electronico:");

        txtNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioKeyReleased(evt);
            }
        });

        txtCedulaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaUsuarioKeyTyped(evt);
            }
        });

        txtCorreoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoUsuarioKeyReleased(evt);
            }
        });

        txtAreaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaUsuarioKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Tu Area:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Tu Contraseña:");

        txtCargoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCargoUsuarioKeyReleased(evt);
            }
        });

        txtContrasenaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaUsuarioKeyReleased(evt);
            }
        });

        btnGuardarUsuario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnGuardarUsuario.setText("Guardar");
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });

        btnLimpiarUsuario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnLimpiarUsuario.setText("Limpiar");

        btnConsultarUsuarios.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnConsultarUsuarios.setText("Regresar");
        btnConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarUsuariosActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 0, 0));

        lblCedula.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(204, 0, 0));

        lblCorreo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(204, 0, 0));

        lblCargo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(204, 0, 0));

        lblContrasena.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(204, 0, 0));

        lblArea.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblArea.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnGuardarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblvalidarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblCedula))
                                .addContainerGap(52, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCorreo))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCargo))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtAreaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblArea))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtContrasenaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblContrasena)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblvalidarCorreo)
                    .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargo))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAreaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArea))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtContrasenaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasena))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiarUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnGuardarUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed

        String validar[] = new String[6];
        ArrayList<Object> agregar = new ArrayList<>();
        String txtField[] = {"Nombre",
            "Cedula",
            "Correo Electronico",
            "Cargo",
            "Area",
            "Contraseña"};
        int vacios;
        validar[0] = txtNombreUsuario.getText();
        validar[1] = txtCedulaUsuario.getText();
        validar[2] = txtCorreoUsuario.getText();
        validar[3] = txtCargoUsuario.getText();
        validar[4] = txtAreaUsuario.getText();
        validar[5] = txtContrasenaUsuario.getText();
        for (int i = 0; i < validar.length; i++) {
            if (validar[i].isEmpty()) {

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

            nuevoUsuario.setNombreUsuario(txtNombreUsuario.getText());
            nuevoUsuario.setCorreoUsuario(txtCorreoUsuario.getText());
            nuevoUsuario.setCcUsuario(Integer.parseInt(txtCedulaUsuario.getText()));
            nuevoUsuario.setPasswordUsuario(txtContrasenaUsuario.getText());
            nuevoUsuario.setAreaUsuario(txtAreaUsuario.getText());
            nuevoUsuario.setCargoUsuario(txtCargoUsuario.getText());

            persisUsuario.crearUsuario(nuevoUsuario);

            limpiarUsuario();
            JOptionPane.showMessageDialog(null, "Usuario creado correctamente");

        }


    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed
    
     public void validar() {

        if (txtNombreUsuario.getText().isEmpty()) {
            lblNombre.setText("*");

        } else {

            lblNombre.setText("");
        }

        if (txtCedulaUsuario.getText().isEmpty()) {
            lblCedula.setText("*");

        } else {

            lblCedula.setText("");
        }

        if (txtCorreoUsuario.getText().isEmpty()) {
            lblCorreo.setText("*");

        } else {

            lblCorreo.setText("");
        }
        
        if (txtCargoUsuario.getText().isEmpty()) {
            lblCargo.setText("*");

        } else {

            lblCargo.setText("");
        }
        
        if (txtAreaUsuario.getText().isEmpty()) {
            lblArea.setText("*");

        } else {

            lblArea.setText("");
        }
        
        if (txtContrasenaUsuario.getText().isEmpty()) {
            lblContrasena.setText("*");

        } else {

            lblContrasena.setText("");
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


    private void btnConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarUsuariosActionPerformed

        dispose();
    }//GEN-LAST:event_btnConsultarUsuariosActionPerformed

    private void txtNombreUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioKeyReleased
        validar();
    }//GEN-LAST:event_txtNombreUsuarioKeyReleased

    private void txtCedulaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaUsuarioKeyReleased
        validar();
    }//GEN-LAST:event_txtCedulaUsuarioKeyReleased

    private void txtCorreoUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoUsuarioKeyReleased
        validar();
        String ingreso = txtCorreoUsuario.getText();

        if (!ValidarEmail(ingreso)) {

            lblvalidarCorreo.setText("*Correo Invalido:");
            lblvalidarCorreo.setForeground(Color.red);
            Font customFont = new Font("Arial", Font.BOLD, 14);
            txtCorreoUsuario.setFont(customFont);
            txtCorreoUsuario.setBackground(Color.red);
            txtCorreoUsuario.setForeground(Color.WHITE);
        } else {
            lblvalidarCorreo.setText("Tu Correo Electronico:");
            lblvalidarCorreo.setForeground(null);
            txtCorreoUsuario.setBackground(Color.WHITE);
            txtCorreoUsuario.setForeground(null);
            
        }
    }//GEN-LAST:event_txtCorreoUsuarioKeyReleased

    private void txtCargoUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoUsuarioKeyReleased
       validar();
    }//GEN-LAST:event_txtCargoUsuarioKeyReleased

    private void txtAreaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaUsuarioKeyReleased
       validar();
    }//GEN-LAST:event_txtAreaUsuarioKeyReleased

    private void txtContrasenaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaUsuarioKeyPressed

    private void txtContrasenaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaUsuarioKeyReleased
        validar();
    }//GEN-LAST:event_txtContrasenaUsuarioKeyReleased

    private void txtCedulaUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaUsuarioKeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }

        if (txtCedulaUsuario.getText().length() == 11) {
            evt.consume();
            mostrarMensaje("Maximo 11 digitos", "Info", "Advertencia");
            Toolkit.getDefaultToolkit().beep();
            txtCedulaUsuario.setText("");
        }
    }//GEN-LAST:event_txtCedulaUsuarioKeyTyped
    
    public boolean ValidarEmail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
    
    public void limpiarUsuario() {

        txtNombreUsuario.setText("");
        txtCorreoUsuario.setText("");
        txtCedulaUsuario.setText("");
        txtContrasenaUsuario.setText("");
        txtAreaUsuario.setText("");
        txtCargoUsuario.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarUsuarios;
    private javax.swing.JButton btnGuardarUsuario;
    private javax.swing.JButton btnLimpiarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblvalidarCorreo;
    private javax.swing.JTextField txtAreaUsuario;
    private javax.swing.JTextField txtCargoUsuario;
    private javax.swing.JTextField txtCedulaUsuario;
    private javax.swing.JTextField txtContrasenaUsuario;
    private javax.swing.JTextField txtCorreoUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
