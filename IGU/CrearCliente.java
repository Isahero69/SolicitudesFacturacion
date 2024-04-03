package IGU;

import Controladora.Cliente;
import Logica.ClientesDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public final class CrearCliente extends javax.swing.JFrame {

    Cliente crearCliente = new Cliente();
    Cliente validarNit = new Cliente();
    ClientesDAO clienteDao = new ClientesDAO();

    public CrearCliente() throws SQLException, ClassNotFoundException {
        initComponents();
        validar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNitCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbTipoCliente = new javax.swing.JComboBox<>();
        cmbRelacionComercial = new javax.swing.JComboBox<>();
        lblNIT = new javax.swing.JLabel();
        lblCORREO = new javax.swing.JLabel();
        lblNOMBRE = new javax.swing.JLabel();
        lblCONTACTO = new javax.swing.JLabel();
        lblTIPO = new javax.swing.JLabel();
        lblRELACION = new javax.swing.JLabel();
        lblVALIDARCORREO = new javax.swing.JLabel();
        btnGuardarCliente = new javax.swing.JButton();
        btnlimpiarCliente = new javax.swing.JButton();
        btnRegresarClientes = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Cliente");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNitCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNitCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNitClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitClienteKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Nombre Cliente:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Nit Cliente:");

        txtNombreCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Correo Electronico:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Contacto:");

        txtCorreoElectronico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCorreoElectronico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoElectronicoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoElectronicoKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de Cliente:");

        txtContacto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Relacion Comercial:");

        cmbTipoCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Juridico", "Natural" }));
        cmbTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoClienteActionPerformed(evt);
            }
        });
        cmbTipoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbTipoClienteKeyReleased(evt);
            }
        });

        cmbRelacionComercial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbRelacionComercial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Contrato", "Orden de Compra", "Orden de Servicio", "Sin relacion contractual" }));
        cmbRelacionComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRelacionComercialActionPerformed(evt);
            }
        });
        cmbRelacionComercial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbRelacionComercialKeyReleased(evt);
            }
        });

        lblNIT.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNIT.setForeground(new java.awt.Color(255, 0, 0));

        lblCORREO.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCORREO.setForeground(new java.awt.Color(255, 0, 0));

        lblNOMBRE.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblNOMBRE.setForeground(new java.awt.Color(255, 0, 0));

        lblCONTACTO.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCONTACTO.setForeground(new java.awt.Color(255, 0, 0));

        lblTIPO.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTIPO.setForeground(new java.awt.Color(255, 0, 0));

        lblRELACION.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblRELACION.setForeground(new java.awt.Color(255, 0, 0));

        lblVALIDARCORREO.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblVALIDARCORREO.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVALIDARCORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbTipoCliente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNitCliente)
                            .addComponent(cmbRelacionComercial, 0, 249, Short.MAX_VALUE)))
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNIT)
                    .addComponent(lblCORREO)
                    .addComponent(lblNOMBRE)
                    .addComponent(lblCONTACTO)
                    .addComponent(lblTIPO)
                    .addComponent(lblRELACION))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNIT))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(lblNOMBRE, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lblCORREO))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCONTACTO)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblVALIDARCORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblTIPO))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbRelacionComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRELACION))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnGuardarCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnGuardarCliente.setText("Guardar Cliente");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnlimpiarCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnlimpiarCliente.setText("Limpiar");
        btnlimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarClienteActionPerformed(evt);
            }
        });

        btnRegresarClientes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnRegresarClientes.setText("Regresar");
        btnRegresarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarClientesActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*Obligatorio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnlimpiarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(btnRegresarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void validar() {

        if (txtNitCliente.getText().isEmpty()) {
            lblNIT.setText("*");

        } else {

            lblNIT.setText("");
        }

        if (txtNombreCliente.getText().isEmpty()) {
            lblNOMBRE.setText("*");

        } else {

            lblNOMBRE.setText("");
        }

        if (txtCorreoElectronico.getText().isEmpty()) {
            lblCORREO.setText("*");

        } else {

            lblCORREO.setText("");
        }

        if (txtContacto.getText().isEmpty()) {
            lblCONTACTO.setText("*");

        } else {

            lblCONTACTO.setText("");
        }

        if (cmbTipoCliente.getSelectedItem().equals("-")) {
            lblTIPO.setText("*");

        } else {

            lblTIPO.setText("");
        }

        if (cmbRelacionComercial.getSelectedItem().equals("-")) {
            lblRELACION.setText("*");

        } else {

            lblRELACION.setText("");
        }

    }


    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed

        String validar[] = new String[6];
        ArrayList<Object> agregar = new ArrayList<>();
        String txtField[] = {"Nit Cliente",
            "Nombre Cliente",
            "Correo Electronico",
            "Contacto",
            "Tipo Cliente",
            "Relacion Comercial"};
        int vacios;
        validar[0] = txtNitCliente.getText();
        validar[1] = txtNombreCliente.getText();
        validar[2] = txtCorreoElectronico.getText();
        validar[3] = txtContacto.getText();
        validar[4] = (String) cmbTipoCliente.getSelectedItem();
        validar[5] = (String) cmbRelacionComercial.getSelectedItem();
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

        } else if (lblVALIDARCORREO.getText().equals("*Correo Invalido")) {

            mostrarMensaje("El formato de correo no es valido", "Info", "Correo Invalido");

        } else {

            String nitCliente = txtNitCliente.getText();

            validarNit = clienteDao.ConsultarNitCliente(nitCliente);
            if (validarNit.getNit_Cliente() == Long.parseLong(nitCliente)) {
                mostrarMensaje("El nit " + nitCliente + " ya existe en base de datos", "Info", "Nit ya Existe");

            } else {

                crearCliente.setNit_Cliente(Long.parseLong(txtNitCliente.getText()));
                crearCliente.setNombreCliente(txtNombreCliente.getText());
                crearCliente.setCorreoElectronico(txtCorreoElectronico.getText());
                crearCliente.setRelacionComercial(cmbRelacionComercial.getSelectedItem().toString());
                crearCliente.setTelefono(Long.parseLong(txtContacto.getText()));
                crearCliente.setTipoCliente(cmbTipoCliente.getSelectedItem().toString());

                clienteDao.registrarCliente(crearCliente);

                txtNitCliente.setText("");
                txtNombreCliente.setText("");
                txtCorreoElectronico.setText("");
                txtContacto.setText("");
                cmbTipoCliente.setSelectedIndex(0);
                cmbRelacionComercial.setSelectedIndex(0);

                JOptionPane optionPane = new JOptionPane("Cliente Creado Correctamente");
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog("Creacion Cliente");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
            }

        }


    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnRegresarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarClientesActionPerformed

        dispose();
    }//GEN-LAST:event_btnRegresarClientesActionPerformed

    private void txtNitClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitClienteKeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }

        if (txtNitCliente.getText().length() == 11) {
            evt.consume();
            mostrarMensaje("Maximo 11 digitos", "Info", "Advertencia");
            Toolkit.getDefaultToolkit().beep();
            txtNitCliente.setText("");
        }
    }//GEN-LAST:event_txtNitClienteKeyTyped

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }

        if (txtContacto.getText().length() == 11) {
            evt.consume();
            mostrarMensaje("Maximo 11 digitos", "Info", "Advertencia");
            Toolkit.getDefaultToolkit().beep();
            txtContacto.setText("");
        }
    }//GEN-LAST:event_txtContactoKeyTyped

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped

    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtNitClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitClienteKeyReleased
        validar();
    }//GEN-LAST:event_txtNitClienteKeyReleased

    private void txtNombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyReleased
        validar();
    }//GEN-LAST:event_txtNombreClienteKeyReleased

    private void txtCorreoElectronicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoKeyReleased
        validar();
        String ingreso = txtCorreoElectronico.getText();

        if (!ValidarEmail(ingreso)) {

            lblVALIDARCORREO.setText("*Correo Invalido");
            Font customFont = new Font("Arial", Font.BOLD, 14);
            txtCorreoElectronico.setFont(customFont);
            txtCorreoElectronico.setBackground(Color.red);
            txtCorreoElectronico.setForeground(Color.WHITE);
        } else {
            lblVALIDARCORREO.setText("");
            txtCorreoElectronico.setBackground(Color.WHITE);
            txtCorreoElectronico.setForeground(null);
        }

    }//GEN-LAST:event_txtCorreoElectronicoKeyReleased

    private void txtContactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyReleased
        validar();
    }//GEN-LAST:event_txtContactoKeyReleased

    public boolean ValidarEmail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }

    private void cmbTipoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTipoClienteKeyReleased

    }//GEN-LAST:event_cmbTipoClienteKeyReleased

    private void cmbRelacionComercialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRelacionComercialKeyReleased

    }//GEN-LAST:event_cmbRelacionComercialKeyReleased

    private void cmbRelacionComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRelacionComercialActionPerformed
        validar();
    }//GEN-LAST:event_cmbRelacionComercialActionPerformed

    private void cmbTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoClienteActionPerformed
        validar();
    }//GEN-LAST:event_cmbTipoClienteActionPerformed

    private void btnlimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarClienteActionPerformed
        txtNitCliente.setText("");
        txtNombreCliente.setText("");
        txtCorreoElectronico.setText("");
        txtContacto.setText("");
        cmbTipoCliente.setSelectedItem("-");
        cmbRelacionComercial.setSelectedItem("-");
    }//GEN-LAST:event_btnlimpiarClienteActionPerformed

    private void txtNitClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNombreCliente.requestFocus();

        }
    }//GEN-LAST:event_txtNitClienteKeyPressed

    private void txtNombreClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCorreoElectronico.requestFocus();

        }
    }//GEN-LAST:event_txtNombreClienteKeyPressed

    private void txtCorreoElectronicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtContacto.requestFocus();

        }
    }//GEN-LAST:event_txtCorreoElectronicoKeyPressed

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
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnRegresarClientes;
    private javax.swing.JButton btnlimpiarCliente;
    private javax.swing.JComboBox<String> cmbRelacionComercial;
    private javax.swing.JComboBox<String> cmbTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCONTACTO;
    private javax.swing.JLabel lblCORREO;
    private javax.swing.JLabel lblNIT;
    private javax.swing.JLabel lblNOMBRE;
    private javax.swing.JLabel lblRELACION;
    private javax.swing.JLabel lblTIPO;
    private javax.swing.JLabel lblVALIDARCORREO;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNitCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables

}
