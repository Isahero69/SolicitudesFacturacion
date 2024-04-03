package IGU;

import Controladora.Usuarios;
import Logica.LoginDAO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    LoginDAO login = new LoginDAO();
    Usuarios usuarios = new Usuarios();

    public Login() {
        initComponents();
    }

    public void validar() {

        String validar[] = new String[2];
        ArrayList<Object> agregar = new ArrayList<>();
        String txtField[] = {"Identificacion Usuario",
            "Contraseña"};
        int vacios;
        validar[0] = txtCcUsuario.getText();
        validar[1] = txtPassLogin.getText();
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

            String ccUsuario = txtCcUsuario.getText();
            String password = txtPassLogin.getText();

            usuarios = login.log(ccUsuario, password);
            if (usuarios.getCcUsuario() != Integer.parseInt(ccUsuario)) {
                int i = JOptionPane.showConfirmDialog(null, "La CC " + ccUsuario + " no existe en base de datos, ¿Deseas crear usuario nuevo?");

                if (i == 0) {
                    CrearUsuario llamar = new CrearUsuario();
                    llamar.setVisible(true);
                    llamar.setLocationRelativeTo(null);

                } else {

                    mostrarMensaje("Acceso no permitido", "Error", "Sin Acceso");
                }

            } else if (!usuarios.getPasswordUsuario().equals(password)) {

                mostrarMensaje("Contraseña Invalida, Vuelva a intentar", "Error", "Contraseña Incorrecta");

            }else{
                MenuPrincipal llamar = new MenuPrincipal();
                llamar.setVisible(true);
                llamar.setLocationRelativeTo(null);
                dispose();
            
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCcUsuario = new javax.swing.JTextField();
        txtPassLogin = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnIngresar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Identificacion Usuario:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");

        txtCcUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCcUsuarioActionPerformed(evt);
            }
        });
        txtCcUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCcUsuarioKeyPressed(evt);
            }
        });

        txtPassLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassLoginKeyPressed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnIngresar1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnIngresar1.setText("Crear Usuario");
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLoginLayout = new javax.swing.GroupLayout(jpLogin);
        jpLogin.setLayout(jpLoginLayout);
        jpLoginLayout.setHorizontalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCcUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpLoginLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpLoginLayout.setVerticalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCcUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        validar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtCcUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCcUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
  
            txtPassLogin.requestFocus();

        }
    }//GEN-LAST:event_txtCcUsuarioKeyPressed

    private void txtPassLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validar();

        }
    }//GEN-LAST:event_txtPassLoginKeyPressed

    private void txtCcUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCcUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCcUsuarioActionPerformed

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        CrearUsuario llamar = new CrearUsuario();
        llamar.setVisible(true);
        llamar.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnIngresar1ActionPerformed

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
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JTextField txtCcUsuario;
    private javax.swing.JTextField txtPassLogin;
    // End of variables declaration//GEN-END:variables
}
