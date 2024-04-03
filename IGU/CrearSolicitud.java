package IGU;

import Controladora.Cliente;
import Controladora.Facturacion;
import Controladora.Productos;
import Controladora.Usuarios;
import HTML.HTMLContent;
import Logica.EnviarCorreo;
import Logica.SolicitudFacturacionDao;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.mail.MessagingException;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public final class CrearSolicitud extends javax.swing.JFrame {

    SolicitudFacturacionDao solicitudDao = new SolicitudFacturacionDao();
    Usuarios usuarios = new Usuarios();
    Cliente cliente = new Cliente();
    Productos producto = new Productos();
    Facturacion solicitud = new Facturacion();
    Facturacion solicitudArray = new Facturacion();
    private String dato;
    private List<File> archivoSeleccionado;
    private final EnviarCorreo enviar;
    private final HTMLContent html;

    public CrearSolicitud() {
        initComponents();
        enviar = new EnviarCorreo();
        html = new HTMLContent();
        btnEnviarSolicitud.setEnabled(false);
        txtBuscarNit.setEnabled(false);
        cmbDescuento1.setEnabled(false);
        cmbDescuento2.setEnabled(false);
        cmbDescuento3.setEnabled(false);
        cmbDescuento4.setEnabled(false);
        cmbDescuento5.setEnabled(false);
        cmbDescuento6.setEnabled(false);
        cmbDescuento7.setEnabled(false);
        cmbDescuento8.setEnabled(false);
        cmbDescuento9.setEnabled(false);
        cmbDescuento10.setEnabled(false);
        cmbIVA1.setEnabled(false);
        cmbIVA2.setEnabled(false);
        cmbIVA3.setEnabled(false);
        cmbIVA4.setEnabled(false);
        cmbIVA5.setEnabled(false);
        cmbIVA6.setEnabled(false);
        cmbIVA7.setEnabled(false);
        cmbIVA8.setEnabled(false);
        cmbIVA9.setEnabled(false);
        cmbIVA10.setEnabled(false);
        txtAnexos.setEnabled(false);
        txtObservaciones.setEnabled(false);
        btnAnexarSoporte.setEnabled(false);
        txtCodigo1.setEnabled(false);
        txtCodigo2.setEnabled(false);
        txtCodigo3.setEnabled(false);
        txtCodigo4.setEnabled(false);
        txtCodigo5.setEnabled(false);
        txtCodigo6.setEnabled(false);
        txtCodigo7.setEnabled(false);
        txtCodigo8.setEnabled(false);
        txtCodigo9.setEnabled(false);
        txtCodigo10.setEnabled(false);
        txtUnidades1.setEnabled(false);
        txtUnidades2.setEnabled(false);
        txtUnidades3.setEnabled(false);
        txtUnidades4.setEnabled(false);
        txtUnidades5.setEnabled(false);
        txtUnidades6.setEnabled(false);
        txtUnidades7.setEnabled(false);
        txtUnidades8.setEnabled(false);
        txtUnidades9.setEnabled(false);
        txtUnidades10.setEnabled(false);
        txtValorUnidad1.setEnabled(false);
        txtValorUnidad2.setEnabled(false);
        txtValorUnidad3.setEnabled(false);
        txtValorUnidad4.setEnabled(false);
        txtValorUnidad5.setEnabled(false);
        txtValorUnidad6.setEnabled(false);
        txtValorUnidad7.setEnabled(false);
        txtValorUnidad8.setEnabled(false);
        txtValorUnidad9.setEnabled(false);
        txtValorUnidad10.setEnabled(false);
        btnVerNit.setEnabled(false);
        btnBuscarCodigo.setEnabled(false);
        btnLimpiar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtBuscarCC = new javax.swing.JTextField();
        txtBuscarUsuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarNit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarCorreoCliente = new javax.swing.JTextField();
        txtBuscarNombreCliente = new javax.swing.JTextField();
        txtBuscarTelefonoCliente = new javax.swing.JTextField();
        cmbBuscarTipoCliente = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cmbBuscarRelacionComercial = new javax.swing.JComboBox<>();
        btnVerNit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtObservaciones = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtValorUnidad1 = new javax.swing.JTextField();
        txtServicio1 = new javax.swing.JTextField();
        txtCodigo1 = new javax.swing.JTextField();
        txtTotal1 = new javax.swing.JTextField();
        cmbIVA1 = new javax.swing.JComboBox<>();
        txtTotalMasIVA1 = new javax.swing.JTextField();
        cmbDescuento1 = new javax.swing.JComboBox<>();
        txtTotalMasDescuento1 = new javax.swing.JTextField();
        txtValorIVA1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtUnidades1 = new javax.swing.JTextField();
        txtCodigo5 = new javax.swing.JTextField();
        txtCodigo2 = new javax.swing.JTextField();
        txtCodigo3 = new javax.swing.JTextField();
        txtCodigo4 = new javax.swing.JTextField();
        txtCodigo6 = new javax.swing.JTextField();
        txtCodigo7 = new javax.swing.JTextField();
        txtCodigo10 = new javax.swing.JTextField();
        txtCodigo8 = new javax.swing.JTextField();
        txtCodigo9 = new javax.swing.JTextField();
        txtServicio2 = new javax.swing.JTextField();
        txtServicio3 = new javax.swing.JTextField();
        txtServicio4 = new javax.swing.JTextField();
        txtServicio5 = new javax.swing.JTextField();
        txtServicio6 = new javax.swing.JTextField();
        txtServicio7 = new javax.swing.JTextField();
        txtServicio8 = new javax.swing.JTextField();
        txtServicio9 = new javax.swing.JTextField();
        txtServicio10 = new javax.swing.JTextField();
        txtUnidades2 = new javax.swing.JTextField();
        txtUnidades3 = new javax.swing.JTextField();
        txtUnidades4 = new javax.swing.JTextField();
        txtUnidades5 = new javax.swing.JTextField();
        txtUnidades6 = new javax.swing.JTextField();
        txtUnidades7 = new javax.swing.JTextField();
        txtUnidades8 = new javax.swing.JTextField();
        txtUnidades9 = new javax.swing.JTextField();
        txtUnidades10 = new javax.swing.JTextField();
        txtValorUnidad2 = new javax.swing.JTextField();
        txtValorUnidad3 = new javax.swing.JTextField();
        txtValorUnidad4 = new javax.swing.JTextField();
        txtValorUnidad5 = new javax.swing.JTextField();
        txtValorUnidad6 = new javax.swing.JTextField();
        txtValorUnidad7 = new javax.swing.JTextField();
        txtValorUnidad8 = new javax.swing.JTextField();
        txtValorUnidad10 = new javax.swing.JTextField();
        txtValorUnidad9 = new javax.swing.JTextField();
        txtTotal2 = new javax.swing.JTextField();
        txtTotal3 = new javax.swing.JTextField();
        txtTotal4 = new javax.swing.JTextField();
        txtTotal5 = new javax.swing.JTextField();
        txtTotal6 = new javax.swing.JTextField();
        txtTotal7 = new javax.swing.JTextField();
        txtTotal8 = new javax.swing.JTextField();
        txtTotal9 = new javax.swing.JTextField();
        txtTotal10 = new javax.swing.JTextField();
        cmbDescuento5 = new javax.swing.JComboBox<>();
        cmbDescuento3 = new javax.swing.JComboBox<>();
        cmbDescuento4 = new javax.swing.JComboBox<>();
        cmbDescuento10 = new javax.swing.JComboBox<>();
        cmbDescuento2 = new javax.swing.JComboBox<>();
        cmbDescuento6 = new javax.swing.JComboBox<>();
        cmbDescuento7 = new javax.swing.JComboBox<>();
        cmbDescuento8 = new javax.swing.JComboBox<>();
        cmbDescuento9 = new javax.swing.JComboBox<>();
        txtTotalMasDescuento2 = new javax.swing.JTextField();
        txtTotalMasDescuento3 = new javax.swing.JTextField();
        txtTotalMasDescuento4 = new javax.swing.JTextField();
        txtTotalMasDescuento5 = new javax.swing.JTextField();
        txtTotalMasDescuento6 = new javax.swing.JTextField();
        txtTotalMasDescuento7 = new javax.swing.JTextField();
        txtTotalMasDescuento8 = new javax.swing.JTextField();
        txtTotalMasDescuento9 = new javax.swing.JTextField();
        txtTotalMasDescuento10 = new javax.swing.JTextField();
        cmbIVA2 = new javax.swing.JComboBox<>();
        cmbIVA3 = new javax.swing.JComboBox<>();
        cmbIVA4 = new javax.swing.JComboBox<>();
        cmbIVA5 = new javax.swing.JComboBox<>();
        cmbIVA6 = new javax.swing.JComboBox<>();
        cmbIVA7 = new javax.swing.JComboBox<>();
        cmbIVA8 = new javax.swing.JComboBox<>();
        cmbIVA9 = new javax.swing.JComboBox<>();
        cmbIVA10 = new javax.swing.JComboBox<>();
        txtValorIVA2 = new javax.swing.JTextField();
        txtValorIVA3 = new javax.swing.JTextField();
        txtValorIVA4 = new javax.swing.JTextField();
        txtValorIVA5 = new javax.swing.JTextField();
        txtValorIVA6 = new javax.swing.JTextField();
        txtValorIVA7 = new javax.swing.JTextField();
        txtValorIVA8 = new javax.swing.JTextField();
        txtValorIVA9 = new javax.swing.JTextField();
        txtValorIVA10 = new javax.swing.JTextField();
        txtTotalMasIVA2 = new javax.swing.JTextField();
        txtTotalMasIVA3 = new javax.swing.JTextField();
        txtTotalMasIVA4 = new javax.swing.JTextField();
        txtTotalMasIVA5 = new javax.swing.JTextField();
        txtTotalMasIVA6 = new javax.swing.JTextField();
        txtTotalMasIVA7 = new javax.swing.JTextField();
        txtTotalMasIVA8 = new javax.swing.JTextField();
        txtTotalMasIVA9 = new javax.swing.JTextField();
        txtTotalMasIVA10 = new javax.swing.JTextField();
        btnEnviarSolicitud = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnBuscarCodigo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        txtTotalUnds = new javax.swing.JLabel();
        txtTotalDescuento = new javax.swing.JLabel();
        txtTotalIVA = new javax.swing.JLabel();
        txtTotalMasIva = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtAnexos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAnexarSoporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Solicitud Facturacion");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("CC Usuario");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Usuario");

        txtFecha.setEditable(false);

        txtBuscarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCCActionPerformed(evt);
            }
        });
        txtBuscarCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarCCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarCCKeyTyped(evt);
            }
        });

        txtBuscarUsuario.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarCC, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Correo Cliente");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Telefono Cliente");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setText("Tipo Cliente");

        txtBuscarNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNitActionPerformed(evt);
            }
        });
        txtBuscarNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarNitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarNitKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Nombre Cliente");

        txtBuscarCorreoCliente.setEditable(false);
        txtBuscarCorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCorreoClienteActionPerformed(evt);
            }
        });

        txtBuscarNombreCliente.setEditable(false);

        txtBuscarTelefonoCliente.setEditable(false);

        cmbBuscarTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Juridico", "Natural" }));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setText("Relacion Comercial");

        cmbBuscarRelacionComercial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Contrato", "Orden de Compra", "Orden de Servicio", "Sin relacion contractual" }));

        btnVerNit.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnVerNit.setText("Nit Cliente");
        btnVerNit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerNitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBuscarNit)
                    .addComponent(btnVerNit, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBuscarNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBuscarTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cmbBuscarRelacionComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerNit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbBuscarRelacionComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBuscarTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacionesActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Observaciones");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txtObservaciones)
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Servicio");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Unidades");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Subtotal");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Con Descuento");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Dscto");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Valor IVA");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("TOTAL");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("IVA");

        txtValorUnidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnidad1ActionPerformed(evt);
            }
        });
        txtValorUnidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidad1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorUnidad1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnidad1KeyTyped(evt);
            }
        });

        txtServicio1.setEditable(false);
        txtServicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServicio1ActionPerformed(evt);
            }
        });

        txtCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo1ActionPerformed(evt);
            }
        });
        txtCodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigo1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo1KeyTyped(evt);
            }
        });

        txtTotal1.setEditable(false);
        txtTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal1ActionPerformed(evt);
            }
        });

        cmbIVA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cmbIVA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVA1ActionPerformed(evt);
            }
        });

        txtTotalMasIVA1.setEditable(false);
        txtTotalMasIVA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalMasIVA1ActionPerformed(evt);
            }
        });

        cmbDescuento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "5%", "10%", "15%", "20%" }));
        cmbDescuento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbDescuento1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbDescuento1MousePressed(evt);
            }
        });
        cmbDescuento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescuento1ActionPerformed(evt);
            }
        });
        cmbDescuento1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbDescuento1KeyPressed(evt);
            }
        });

        txtTotalMasDescuento1.setEditable(false);
        txtTotalMasDescuento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalMasDescuento1ActionPerformed(evt);
            }
        });

        txtValorIVA1.setEditable(false);
        txtValorIVA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorIVA1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Valor Unidad");

        txtUnidades1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidades1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidades1KeyTyped(evt);
            }
        });

        txtCodigo5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigo5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo5KeyTyped(evt);
            }
        });

        txtCodigo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigo2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo2KeyTyped(evt);
            }
        });

        txtCodigo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo3ActionPerformed(evt);
            }
        });
        txtCodigo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigo3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo3KeyTyped(evt);
            }
        });

        txtCodigo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigo4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo4KeyTyped(evt);
            }
        });

        txtCodigo6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigo6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo6KeyTyped(evt);
            }
        });

        txtCodigo7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigo7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo7KeyTyped(evt);
            }
        });

        txtCodigo10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigo10KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo10KeyTyped(evt);
            }
        });

        txtCodigo8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigo8KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo8KeyTyped(evt);
            }
        });

        txtCodigo9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigo9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo9KeyTyped(evt);
            }
        });

        txtServicio2.setEditable(false);

        txtServicio3.setEditable(false);

        txtServicio4.setEditable(false);

        txtServicio5.setEditable(false);

        txtServicio6.setEditable(false);

        txtServicio7.setEditable(false);

        txtServicio8.setEditable(false);

        txtServicio9.setEditable(false);

        txtServicio10.setEditable(false);

        txtUnidades2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidades2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidades2KeyTyped(evt);
            }
        });

        txtUnidades3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidades3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidades3KeyTyped(evt);
            }
        });

        txtUnidades4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidades4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidades4KeyTyped(evt);
            }
        });

        txtUnidades5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidades5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidades5KeyTyped(evt);
            }
        });

        txtUnidades6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidades6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidades6KeyTyped(evt);
            }
        });

        txtUnidades7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidades7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidades7KeyTyped(evt);
            }
        });

        txtUnidades8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidades8KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidades8KeyTyped(evt);
            }
        });

        txtUnidades9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidades9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidades9KeyTyped(evt);
            }
        });

        txtUnidades10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidades10KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidades10KeyTyped(evt);
            }
        });

        txtValorUnidad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidad2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnidad2KeyTyped(evt);
            }
        });

        txtValorUnidad3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidad3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnidad3KeyTyped(evt);
            }
        });

        txtValorUnidad4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidad4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnidad4KeyTyped(evt);
            }
        });

        txtValorUnidad5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidad5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnidad5KeyTyped(evt);
            }
        });

        txtValorUnidad6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidad6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnidad6KeyTyped(evt);
            }
        });

        txtValorUnidad7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidad7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnidad7KeyTyped(evt);
            }
        });

        txtValorUnidad8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidad8KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnidad8KeyTyped(evt);
            }
        });

        txtValorUnidad10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnidad10ActionPerformed(evt);
            }
        });
        txtValorUnidad10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidad10KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnidad10KeyTyped(evt);
            }
        });

        txtValorUnidad9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidad9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorUnidad9KeyTyped(evt);
            }
        });

        txtTotal2.setEditable(false);

        txtTotal3.setEditable(false);

        txtTotal4.setEditable(false);

        txtTotal5.setEditable(false);

        txtTotal6.setEditable(false);

        txtTotal7.setEditable(false);

        txtTotal8.setEditable(false);

        txtTotal9.setEditable(false);

        txtTotal10.setEditable(false);

        cmbDescuento5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "5%", "10%", "15%", "20%" }));
        cmbDescuento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescuento5ActionPerformed(evt);
            }
        });

        cmbDescuento3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "5%", "10%", "15%", "20%" }));
        cmbDescuento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescuento3ActionPerformed(evt);
            }
        });

        cmbDescuento4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "5%", "10%", "15%", "20%" }));
        cmbDescuento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescuento4ActionPerformed(evt);
            }
        });

        cmbDescuento10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "5%", "10%", "15%", "20%" }));
        cmbDescuento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescuento10ActionPerformed(evt);
            }
        });

        cmbDescuento2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "5%", "10%", "15%", "20%" }));
        cmbDescuento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescuento2ActionPerformed(evt);
            }
        });

        cmbDescuento6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "5%", "10%", "15%", "20%" }));
        cmbDescuento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescuento6ActionPerformed(evt);
            }
        });

        cmbDescuento7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "5%", "10%", "15%", "20%" }));
        cmbDescuento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescuento7ActionPerformed(evt);
            }
        });

        cmbDescuento8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "5%", "10%", "15%", "20%" }));
        cmbDescuento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescuento8ActionPerformed(evt);
            }
        });

        cmbDescuento9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "5%", "10%", "15%", "20%" }));
        cmbDescuento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescuento9ActionPerformed(evt);
            }
        });

        txtTotalMasDescuento2.setEditable(false);

        txtTotalMasDescuento3.setEditable(false);

        txtTotalMasDescuento4.setEditable(false);

        txtTotalMasDescuento5.setEditable(false);

        txtTotalMasDescuento6.setEditable(false);

        txtTotalMasDescuento7.setEditable(false);

        txtTotalMasDescuento8.setEditable(false);

        txtTotalMasDescuento9.setEditable(false);

        txtTotalMasDescuento10.setEditable(false);

        cmbIVA2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cmbIVA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVA2ActionPerformed(evt);
            }
        });

        cmbIVA3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cmbIVA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVA3ActionPerformed(evt);
            }
        });

        cmbIVA4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cmbIVA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVA4ActionPerformed(evt);
            }
        });

        cmbIVA5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cmbIVA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVA5ActionPerformed(evt);
            }
        });

        cmbIVA6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cmbIVA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVA6ActionPerformed(evt);
            }
        });

        cmbIVA7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cmbIVA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVA7ActionPerformed(evt);
            }
        });

        cmbIVA8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cmbIVA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVA8ActionPerformed(evt);
            }
        });

        cmbIVA9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cmbIVA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVA9ActionPerformed(evt);
            }
        });

        cmbIVA10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cmbIVA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIVA10ActionPerformed(evt);
            }
        });

        txtValorIVA2.setEditable(false);

        txtValorIVA3.setEditable(false);

        txtValorIVA4.setEditable(false);

        txtValorIVA5.setEditable(false);

        txtValorIVA6.setEditable(false);

        txtValorIVA7.setEditable(false);
        txtValorIVA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorIVA7ActionPerformed(evt);
            }
        });

        txtValorIVA8.setEditable(false);

        txtValorIVA9.setEditable(false);

        txtValorIVA10.setEditable(false);

        txtTotalMasIVA2.setEditable(false);

        txtTotalMasIVA3.setEditable(false);
        txtTotalMasIVA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalMasIVA3ActionPerformed(evt);
            }
        });

        txtTotalMasIVA4.setEditable(false);
        txtTotalMasIVA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalMasIVA4ActionPerformed(evt);
            }
        });

        txtTotalMasIVA5.setEditable(false);

        txtTotalMasIVA6.setEditable(false);

        txtTotalMasIVA7.setEditable(false);

        txtTotalMasIVA8.setEditable(false);

        txtTotalMasIVA9.setEditable(false);

        txtTotalMasIVA10.setEditable(false);

        btnEnviarSolicitud.setText("Enviar Solicitud");
        btnEnviarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarSolicitudActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnBuscarCodigo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscarCodigo.setText("Codigo");
        btnBuscarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(txtCodigo1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtServicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodigo9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(txtCodigo8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtServicio9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtServicio8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtServicio7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtServicio5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtServicio4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtServicio6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtServicio3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(txtServicio10)
                                    .addComponent(txtServicio2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUnidades2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUnidades8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorUnidad3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDescuento10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDescuento9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDescuento8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDescuento7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDescuento6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDescuento5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDescuento4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDescuento3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDescuento2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDescuento1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalMasDescuento1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasDescuento2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasDescuento3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasDescuento4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasDescuento5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasDescuento6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasDescuento7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasDescuento8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasDescuento9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasDescuento10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbIVA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorIVA2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbIVA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorIVA1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbIVA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorIVA3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbIVA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorIVA4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbIVA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorIVA5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbIVA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorIVA6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbIVA7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorIVA7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbIVA8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorIVA8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbIVA9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorIVA9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmbIVA10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorIVA10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btnEnviarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(jLabel22)
                        .addComponent(jLabel23)
                        .addComponent(jLabel24)
                        .addComponent(jLabel26)
                        .addComponent(jLabel25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorUnidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtServicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalMasIVA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidades1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDescuento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalMasDescuento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbIVA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorIVA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDescuento5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasDescuento5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbIVA5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorIVA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasIVA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDescuento6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasDescuento6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbIVA6)
                                    .addComponent(txtValorIVA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasIVA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDescuento7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasDescuento7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbIVA7)
                                    .addComponent(txtValorIVA7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasIVA7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDescuento8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasDescuento8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbIVA8)
                                    .addComponent(txtValorIVA8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasIVA8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDescuento9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasDescuento9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbIVA9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorIVA9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasIVA9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnidades10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnidad10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDescuento10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasDescuento10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbIVA10)
                                    .addComponent(txtValorIVA10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasIVA10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtValorUnidad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtValorUnidad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDescuento4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasDescuento4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbIVA4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorIVA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalMasIVA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbDescuento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotalMasDescuento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbIVA2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtValorIVA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotalMasIVA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalMasDescuento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDescuento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbIVA3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorIVA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMasIVA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviarSolicitud)
                    .addComponent(btnLimpiar)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setText("Total Unds");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Total IVA");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel15.setText("Subtotal");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel16.setText("TOTAL");

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel27.setText("Descuento");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalUnds, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtTotalDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtTotalIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalMasIva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalUnds, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTotalMasIva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAnexos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAnexos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setText("Anexos");

        btnAnexarSoporte.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnAnexarSoporte.setText("Anexar Soportes");
        btnAnexarSoporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnexarSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexarSoporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnexos, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnexarSoporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnexos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAnexarSoporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setDato(String dato) {
        this.dato = dato;
        txtBuscarNit.setText(dato);
        int nit = Integer.parseInt(txtBuscarNit.getText());
        cliente = solicitudDao.buscarCliente(nit);
        if (cliente.getNombreCliente() != null) {

            txtBuscarNombreCliente.setText("" + cliente.getNombreCliente());
            txtBuscarCorreoCliente.setText("" + cliente.getCorreoElectronico());
            txtBuscarTelefonoCliente.setText("" + cliente.getTelefono());
            cmbBuscarTipoCliente.setSelectedItem(cliente.getTipoCliente());
            cmbBuscarRelacionComercial.setSelectedItem(cliente.getRelacionComercial());
            btnBuscarCodigo.setEnabled(true);
            txtAnexos.setEnabled(true);
            btnAnexarSoporte.setEnabled(true);
            txtObservaciones.setEnabled(true);
            txtCodigo1.setEnabled(true);
            txtUnidades1.setEnabled(true);
            btnLimpiar.setEnabled(true);
            txtAnexos.requestFocus();

        }
    }

    public void setDatoCodigo(String dato) {
        this.dato = dato;

        String validar[] = new String[10];

        int vacios = 0;
        int espacioSiguiente;

        validar[0] = txtCodigo1.getText();
        validar[1] = txtCodigo2.getText();
        validar[2] = txtCodigo3.getText();
        validar[3] = txtCodigo4.getText();
        validar[4] = txtCodigo5.getText();
        validar[5] = txtCodigo6.getText();
        validar[6] = txtCodigo7.getText();
        validar[7] = txtCodigo8.getText();
        validar[8] = txtCodigo9.getText();
        validar[9] = txtCodigo10.getText();

        for (String recorrer : validar) {
            if (recorrer.isEmpty()) {
                vacios += 1;
            }
        }

        espacioSiguiente = 10 - vacios + 1;

        int codigo;
        switch (espacioSiguiente) {
            case 1:
                txtCodigo1.setText(dato);
                codigo = Integer.parseInt(txtCodigo1.getText());
                producto = solicitudDao.Buscarproducto(codigo);
                txtServicio1.setText(producto.getTipoProducto());
                txtUnidades1.requestFocus();
                break;
            case 2:
                txtCodigo2.setText(dato);
                codigo = Integer.parseInt(txtCodigo2.getText());
                producto = solicitudDao.Buscarproducto(codigo);
                txtServicio2.setText(producto.getTipoProducto());
                txtUnidades2.setEnabled(true);
                txtUnidades2.requestFocus();
                btnEnviarSolicitud.setEnabled(false);
                break;
            case 3:
                txtCodigo3.setText(dato);
                codigo = Integer.parseInt(txtCodigo3.getText());
                producto = solicitudDao.Buscarproducto(codigo);
                txtServicio3.setText(producto.getTipoProducto());
                txtUnidades3.setEnabled(true);
                txtUnidades3.requestFocus();
                btnEnviarSolicitud.setEnabled(false);
                break;
            case 4:
                txtCodigo4.setText(dato);
                codigo = Integer.parseInt(txtCodigo4.getText());
                producto = solicitudDao.Buscarproducto(codigo);
                txtServicio4.setText(producto.getTipoProducto());
                txtUnidades4.setEnabled(true);
                txtUnidades4.requestFocus();
                btnEnviarSolicitud.setEnabled(false);
                break;
            case 5:
                txtCodigo5.setText(dato);
                codigo = Integer.parseInt(txtCodigo5.getText());
                producto = solicitudDao.Buscarproducto(codigo);
                txtServicio5.setText(producto.getTipoProducto());
                txtUnidades5.setEnabled(true);
                txtUnidades5.requestFocus();
                btnEnviarSolicitud.setEnabled(false);
                break;
            case 6:
                txtCodigo6.setText(dato);
                codigo = Integer.parseInt(txtCodigo6.getText());
                producto = solicitudDao.Buscarproducto(codigo);
                txtServicio6.setText(producto.getTipoProducto());
                txtUnidades6.setEnabled(true);
                txtUnidades6.requestFocus();
                btnEnviarSolicitud.setEnabled(false);
                break;
            case 7:
                txtCodigo7.setText(dato);
                codigo = Integer.parseInt(txtCodigo7.getText());
                producto = solicitudDao.Buscarproducto(codigo);
                txtServicio7.setText(producto.getTipoProducto());
                txtUnidades7.setEnabled(true);
                txtUnidades7.requestFocus();
                btnEnviarSolicitud.setEnabled(false);

                break;
            case 8:
                txtCodigo8.setText(dato);
                codigo = Integer.parseInt(txtCodigo8.getText());
                producto = solicitudDao.Buscarproducto(codigo);
                txtServicio8.setText(producto.getTipoProducto());
                txtUnidades8.setEnabled(true);
                txtUnidades8.requestFocus();
                btnEnviarSolicitud.setEnabled(false);
                break;
            case 9:
                txtCodigo9.setText(dato);
                codigo = Integer.parseInt(txtCodigo9.getText());
                producto = solicitudDao.Buscarproducto(codigo);
                txtServicio9.setText(producto.getTipoProducto());
                txtUnidades9.setEnabled(true);
                txtUnidades9.requestFocus();
                btnEnviarSolicitud.setEnabled(false);
                break;
            case 10:
                txtCodigo10.setText(dato);
                codigo = Integer.parseInt(txtCodigo10.getText());
                producto = solicitudDao.Buscarproducto(codigo);
                txtServicio10.setText(producto.getTipoProducto());
                txtUnidades10.setEnabled(true);
                txtUnidades10.requestFocus();
                btnBuscarCodigo.setEnabled(false);
                btnEnviarSolicitud.setEnabled(false);
                break;

        }

    }

    private void txtValorIVA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorIVA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorIVA1ActionPerformed

    private void txtTotalMasIVA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalMasIVA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalMasIVA1ActionPerformed

    private void txtValorUnidad10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnidad10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnidad10ActionPerformed

    private void txtTotalMasIVA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalMasIVA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalMasIVA4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtBuscarCCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCCKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtBuscarCC.getText())) {
                int cc = Integer.parseInt(txtBuscarCC.getText());
                usuarios = solicitudDao.buscarCCUsuario(cc);
                if (usuarios.getNombreUsuario() != null) {
                    txtBuscarUsuario.setText(usuarios.getNombreUsuario());
                    btnVerNit.setEnabled(true);
                    txtBuscarNit.setEnabled(true);
                    txtBuscarNit.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario [ " + txtBuscarCC.getText() + " ] NO Existe en Base de Datos");
                    txtBuscarCC.setText("");
                    txtBuscarCC.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debes ingresar una identificacion de Usuario");
                txtBuscarCC.requestFocus();
            }

        }


    }//GEN-LAST:event_txtBuscarCCKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        txtFecha.setText(mostrarFecha());

    }//GEN-LAST:event_formWindowOpened

    private void txtBuscarNitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNitKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtBuscarNit.getText())) {
                int nit = Integer.parseInt(txtBuscarNit.getText());
                cliente = solicitudDao.buscarCliente(nit);
                if (cliente.getNombreCliente() != null) {
                    btnBuscarCodigo.setEnabled(true);
                    txtBuscarNombreCliente.setText("" + cliente.getNombreCliente());
                    txtBuscarCorreoCliente.setText("" + cliente.getCorreoElectronico());
                    txtBuscarTelefonoCliente.setText("" + cliente.getTelefono());
                    cmbBuscarTipoCliente.setSelectedItem("" + cliente.getTipoCliente());
                    cmbBuscarRelacionComercial.setSelectedItem("" + cliente.getRelacionComercial());
                    txtAnexos.setEnabled(true);
                    btnAnexarSoporte.setEnabled(true);
                    txtObservaciones.setEnabled(true);
                    txtCodigo1.setEnabled(true);
                    txtUnidades1.setEnabled(true);
                    btnLimpiar.setEnabled(true);
                    txtAnexos.requestFocus();

                } else {
                    JOptionPane.showMessageDialog(null, "Nit " + txtBuscarNit.getText() + " no existe en Base de Datos");
                    txtBuscarNit.setText("");
                    txtBuscarNit.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un NIT");
                txtBuscarNit.setText("");
                txtBuscarNit.requestFocus();
            }

        }
    }//GEN-LAST:event_txtBuscarNitKeyPressed


    private void txtBuscarNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNitActionPerformed

    }//GEN-LAST:event_txtBuscarNitActionPerformed

    private void txtBuscarCorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCorreoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCorreoClienteActionPerformed

    private void txtObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesActionPerformed

    private void txtServicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicio1ActionPerformed

    private void cmbIVA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVA2ActionPerformed
        totalIVA2();
        totalMasIva2();
        IvaTotal();
        totalGeneral();
    }//GEN-LAST:event_cmbIVA2ActionPerformed

    private void txtValorIVA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorIVA7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorIVA7ActionPerformed

    private void txtTotalMasIVA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalMasIVA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalMasIVA3ActionPerformed

    private void txtCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo1ActionPerformed

    private void txtCodigo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo1KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo1.getText())) {
                int codigo = Integer.parseInt(txtCodigo1.getText());
                producto = solicitudDao.Buscarproducto(codigo);

                if (producto.getTipoProducto() != null) {

                    txtServicio1.setText(producto.getTipoProducto());
                    txtUnidades1.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "El codigo ingresado no Existe");
                    txtCodigo1.setText("");
                    txtCodigo1.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo contable");
                txtCodigo1.setText("");
                txtCodigo1.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigo1KeyPressed


    private void txtTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal1ActionPerformed

    }//GEN-LAST:event_txtTotal1ActionPerformed


    private void txtUnidades1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUnidades1.getText().equals("")) {

                mostrarMensaje("Debes ingresar un numero", "Info", "Campo vacio");

            } else {
                if ("".equals(txtValorUnidad1.getText())) {
                    txtValorUnidad1.setEnabled(true);
                    txtValorUnidad1.requestFocus();
                    totalUnidades();
                } else {
                    totalUnidades();
                    totalVenta(txtUnidades1.getText(), txtValorUnidad1.getText(), 1);
                    subTotal();
                    if (!cmbDescuento1.getSelectedItem().equals("-")) {
                        conDescuento();
                    }
                    IvaTotal();
                    totalGeneral();
                }

            }

        }
    }//GEN-LAST:event_txtUnidades1KeyPressed


    private void txtValorUnidad1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (txtUnidades1.getText().equals("")) {//valida que no este en blanco las unidades

                mostrarMensaje("Primero ingresa las cantidades", "Info", "Ingresa Cantidades");

            } else if (txtValorUnidad1.getText().equals("")) {

                try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                    if (txtValorUnidad1.getText().equals("")) {

                        mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                    }
                } catch (NumberFormatException e) {

                    System.out.println(e.toString());
                }

            } else {
                double valorIngresado = Double.parseDouble(txtValorUnidad1.getText());

                if (valorIngresado == 0) {//valida que el valor ingresado no sea 0

                    mostrarMensaje("Valor unidad '0' no es valido", "Info", "Valor ingresado invalido");

                } else {

                    if (valorIngresado < 0) {//valida que el numero no sea negativo

                        mostrarMensaje("No esta permitido el ingreso de numeros negativos", "Info", "Valor ingresado invalido");

                    } else {

                        totalVenta(txtUnidades1.getText(), txtValorUnidad1.getText(), 1);
                        subTotal();
                        IvaTotal();
                        btnEnviarSolicitud.setEnabled(true);

                        if (cmbDescuento1.getSelectedItem().equals("-")) {//validamos que el descuento tenga un valor en porcentaje
                            txtTotalDescuento.setText("0");
                        } else {
                            conDescuento();
                        }
                        totalGeneral();
                        cmbDescuento1.setEnabled(true);
                        cmbIVA1.setEnabled(true);
                        txtCodigo2.setEnabled(true);
                        txtCodigo2.requestFocus();
                    }

                }

            }

        }
    }//GEN-LAST:event_txtValorUnidad1KeyPressed

    private void cmbDescuento1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbDescuento1MouseClicked

    }//GEN-LAST:event_cmbDescuento1MouseClicked

    private void cmbDescuento1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbDescuento1MousePressed

    }//GEN-LAST:event_cmbDescuento1MousePressed

    private void cmbDescuento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescuento1ActionPerformed

        if (!txtUnidades1.getText().equals("") || !txtValorUnidad1.getText().equals("")) {
            descuento();
            conDescuento();
            totalIVA();
            totalMasIva();
            totalGeneral();

        }


    }//GEN-LAST:event_cmbDescuento1ActionPerformed

    private void cmbIVA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVA1ActionPerformed

        try {
            if (!txtUnidades1.getText().equals("") || !txtValorUnidad1.getText().equals("")) {
                totalIVA();
                totalMasIva();
                IvaTotal();
                totalGeneral();
            }
        } catch (NumberFormatException numero) {
            System.out.println(numero.toString());
        }


    }//GEN-LAST:event_cmbIVA1ActionPerformed

    private void txtCodigo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo2.getText())) {
                int codigo = Integer.parseInt(txtCodigo2.getText());
                producto = solicitudDao.Buscarproducto(codigo);

                if (producto.getTipoProducto() != null) {

                    txtServicio2.setText(producto.getTipoProducto());
                    txtUnidades2.setEnabled(true);
                    txtUnidades2.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "El codigo ingresado no Existe");
                    txtCodigo2.setText("");
                    txtCodigo2.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo contable");
                txtCodigo2.setText("");
                txtCodigo2.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigo2KeyPressed

    private void txtUnidades2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtValorUnidad2.getText())) {
                txtValorUnidad2.setEnabled(true);
                txtValorUnidad2.requestFocus();
                totalUnidades();
            } else {
                totalUnidades();
                totalVenta(txtUnidades2.getText(), txtValorUnidad2.getText(), 2);
                subTotal();
                if (!cmbDescuento2.getSelectedItem().equals("-")) {
                    conDescuento();
                }
                IvaTotal();
                totalGeneral();
            }
        }
    }//GEN-LAST:event_txtUnidades2KeyPressed

    private void txtValorUnidad2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUnidades2.getText().equals("")) {//valida que no este en blanco las unidades

                mostrarMensaje("Primero ingresa las cantidades", "Info", "Ingresa Cantidades");

            } else if (txtValorUnidad2.getText().equals("")) {

                try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                    if (txtValorUnidad2.getText().equals("")) {

                        mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                    }
                } catch (NumberFormatException e) {

                    System.out.println(e.toString());
                }

            } else {
                double valorIngresado = Double.parseDouble(txtValorUnidad2.getText());

                if (valorIngresado == 0) {//valida que el valor ingresado no sea 0

                    mostrarMensaje("Valor unidad '0' no es valido", "Info", "Valor ingresado invalido");

                } else {

                    if (valorIngresado < 0) {//valida que el numero no sea negativo

                        mostrarMensaje("No esta permitido el ingreso de numeros negativos", "Info", "Valor ingresado invalido");

                    } else {

                        totalVenta(txtUnidades2.getText(), txtValorUnidad2.getText(), 2);
                        subTotal();
                        IvaTotal();
                        btnEnviarSolicitud.setEnabled(true);

                        if (!cmbDescuento2.getSelectedItem().equals("-")) {//validamos que el descuento tenga un valor en porcentaje
                            conDescuento();
                        }
                        totalGeneral();
                        cmbDescuento2.setEnabled(true);
                        cmbIVA2.setEnabled(true);
                        txtCodigo3.setEnabled(true);
                        txtCodigo3.requestFocus();
                    }

                }

            }
        }
    }//GEN-LAST:event_txtValorUnidad2KeyPressed

    private void txtUnidades3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtValorUnidad3.getText())) {
                txtValorUnidad3.setEnabled(true);
                txtValorUnidad3.requestFocus();
                totalUnidades();
            } else {
                totalUnidades();
                totalVenta(txtUnidades3.getText(), txtValorUnidad3.getText(), 3);
                subTotal();
                if (!cmbDescuento3.getSelectedItem().equals("-")) {
                    conDescuento();
                }
                IvaTotal();
                totalGeneral();
            }
        }
    }//GEN-LAST:event_txtUnidades3KeyPressed

    private void txtValorUnidad3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUnidades3.getText().equals("")) {//valida que no este en blanco las unidades

                mostrarMensaje("Primero ingresa las cantidades", "Info", "Ingresa Cantidades");

            } else if (txtValorUnidad3.getText().equals("")) {

                try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                    if (txtValorUnidad3.getText().equals("")) {

                        mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                    }
                } catch (NumberFormatException e) {

                    System.out.println(e.toString());
                }

            } else {
                double valorIngresado = Double.parseDouble(txtValorUnidad3.getText());

                if (valorIngresado == 0) {//valida que el valor ingresado no sea 0

                    mostrarMensaje("Valor unidad '0' no es valido", "Info", "Valor ingresado invalido");

                } else {

                    if (valorIngresado < 0) {//valida que el numero no sea negativo

                        mostrarMensaje("No esta permitido el ingreso de numeros negativos", "Info", "Valor ingresado invalido");

                    } else {

                        totalVenta(txtUnidades3.getText(), txtValorUnidad3.getText(), 3);
                        subTotal();
                        IvaTotal();
                        btnEnviarSolicitud.setEnabled(true);
                        if (!cmbDescuento3.getSelectedItem().equals("-")) {//validamos que el descuento tenga un valor en porcentaje
                            conDescuento();
                        }
                        totalGeneral();
                        cmbDescuento3.setEnabled(true);
                        cmbIVA3.setEnabled(true);
                        txtCodigo4.setEnabled(true);
                        txtCodigo4.requestFocus();
                    }

                }

            }
        }
    }//GEN-LAST:event_txtValorUnidad3KeyPressed

    private void txtUnidades4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtValorUnidad4.getText())) {
                txtValorUnidad4.setEnabled(true);
                txtValorUnidad4.requestFocus();
                totalUnidades();
            } else {
                totalUnidades();
                totalVenta(txtUnidades4.getText(), txtValorUnidad4.getText(), 4);
                subTotal();
                if (!cmbDescuento4.getSelectedItem().equals("-")) {
                    conDescuento();
                }
                IvaTotal();
                totalGeneral();
            }
        }
    }//GEN-LAST:event_txtUnidades4KeyPressed

    private void txtValorUnidad4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUnidades4.getText().equals("")) {//valida que no este en blanco las unidades

                mostrarMensaje("Primero ingresa las cantidades", "Info", "Ingresa Cantidades");

            } else if (txtValorUnidad4.getText().equals("")) {

                try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                    if (txtValorUnidad4.getText().equals("")) {

                        mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                    }
                } catch (NumberFormatException e) {

                    System.out.println(e.toString());
                }

            } else {
                double valorIngresado = Double.parseDouble(txtValorUnidad4.getText());

                if (valorIngresado == 0) {//valida que el valor ingresado no sea 0

                    mostrarMensaje("Valor unidad '0' no es valido", "Info", "Valor ingresado invalido");

                } else {

                    if (valorIngresado < 0) {//valida que el numero no sea negativo

                        mostrarMensaje("No esta permitido el ingreso de numeros negativos", "Info", "Valor ingresado invalido");

                    } else {

                        totalVenta(txtUnidades4.getText(), txtValorUnidad4.getText(), 4);
                        subTotal();
                        IvaTotal();
                        btnEnviarSolicitud.setEnabled(true);
                        if (!cmbDescuento4.getSelectedItem().equals("-")) {//validamos que el descuento tenga un valor en porcentaje
                            conDescuento();
                        }
                        totalGeneral();
                        cmbDescuento4.setEnabled(true);
                        cmbIVA4.setEnabled(true);
                        txtCodigo5.setEnabled(true);
                        txtCodigo5.requestFocus();
                    }

                }

            }
        }
    }//GEN-LAST:event_txtValorUnidad4KeyPressed

    private void txtUnidades5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtValorUnidad5.getText())) {
                txtValorUnidad5.setEnabled(true);
                txtValorUnidad5.requestFocus();
                totalUnidades();
            } else {
                totalUnidades();
                totalVenta(txtUnidades5.getText(), txtValorUnidad5.getText(), 5);
                subTotal();
                if (!cmbDescuento5.getSelectedItem().equals("-")) {
                    conDescuento();
                }
                IvaTotal();
                totalGeneral();
            }
        }
    }//GEN-LAST:event_txtUnidades5KeyPressed

    private void txtValorUnidad5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUnidades5.getText().equals("")) {//valida que no este en blanco las unidades

                mostrarMensaje("Primero ingresa las cantidades", "Info", "Ingresa Cantidades");

            } else if (txtValorUnidad5.getText().equals("")) {

                try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                    if (txtValorUnidad5.getText().equals("")) {

                        mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                    }
                } catch (NumberFormatException e) {

                    System.out.println(e.toString());
                }

            } else {
                double valorIngresado = Double.parseDouble(txtValorUnidad5.getText());

                if (valorIngresado == 0) {//valida que el valor ingresado no sea 0

                    mostrarMensaje("Valor unidad '0' no es valido", "Info", "Valor ingresado invalido");

                } else {

                    if (valorIngresado < 0) {//valida que el numero no sea negativo

                        mostrarMensaje("No esta permitido el ingreso de numeros negativos", "Info", "Valor ingresado invalido");

                    } else {

                        try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                            if (txtValorUnidad5.getText().equals("")) {

                                mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                            } else {//se ejecuta el codigo con sus metodos

                                totalVenta(txtUnidades5.getText(), txtValorUnidad5.getText(), 5);
                                subTotal();
                                IvaTotal();
                                btnEnviarSolicitud.setEnabled(true);
                                if (!cmbDescuento5.getSelectedItem().equals("-")) {//validamos que el descuento tenga un valor en porcentaje
                                    conDescuento();
                                }
                                totalGeneral();
                                cmbDescuento5.setEnabled(true);
                                cmbIVA5.setEnabled(true);
                                txtCodigo6.setEnabled(true);
                                txtCodigo6.requestFocus();
                            }

                        } catch (NumberFormatException e) {

                            System.out.println(e.toString());
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_txtValorUnidad5KeyPressed

    private void txtUnidades6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtValorUnidad6.getText())) {
                txtValorUnidad6.setEnabled(true);
                txtValorUnidad6.requestFocus();
                totalUnidades();
            } else {
                totalUnidades();
                totalVenta(txtUnidades6.getText(), txtValorUnidad6.getText(), 6);
                subTotal();
                if (!cmbDescuento6.getSelectedItem().equals("-")) {
                    conDescuento();
                }
                IvaTotal();
                totalGeneral();
            }
        }
    }//GEN-LAST:event_txtUnidades6KeyPressed

    private void txtValorUnidad6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUnidades6.getText().equals("")) {//valida que no este en blanco las unidades

                mostrarMensaje("Primero ingresa las cantidades", "Info", "Ingresa Cantidades");

            } else if (txtValorUnidad6.getText().equals("")) {

                try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                    if (txtValorUnidad6.getText().equals("")) {

                        mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                    }
                } catch (NumberFormatException e) {

                    System.out.println(e.toString());
                }

            } else {
                double valorIngresado = Double.parseDouble(txtValorUnidad6.getText());

                if (valorIngresado == 0) {//valida que el valor ingresado no sea 0

                    mostrarMensaje("Valor unidad '0' no es valido", "Info", "Valor ingresado invalido");

                } else {

                    if (valorIngresado < 0) {//valida que el numero no sea negativo

                        mostrarMensaje("No esta permitido el ingreso de numeros negativos", "Info", "Valor ingresado invalido");

                    } else {

                        try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                            if (txtValorUnidad6.getText().equals("")) {

                                mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                            } else {//se ejecuta el codigo con sus metodos

                                totalVenta(txtUnidades6.getText(), txtValorUnidad6.getText(), 6);
                                subTotal();
                                IvaTotal();
                                btnEnviarSolicitud.setEnabled(true);
                                if (!cmbDescuento6.getSelectedItem().equals("-")) {//validamos que el descuento tenga un valor en porcentaje
                                    conDescuento();
                                }
                                totalGeneral();
                                cmbDescuento6.setEnabled(true);
                                cmbIVA6.setEnabled(true);
                                txtCodigo7.setEnabled(true);
                                txtCodigo7.requestFocus();
                            }

                        } catch (NumberFormatException e) {

                            System.out.println(e.toString());
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_txtValorUnidad6KeyPressed

    private void txtUnidades7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtValorUnidad7.getText())) {
                txtValorUnidad7.setEnabled(true);
                txtValorUnidad7.requestFocus();
                totalUnidades();
            } else {
                totalUnidades();
                totalVenta(txtUnidades7.getText(), txtValorUnidad7.getText(), 7);
                subTotal();
                if (!cmbDescuento7.getSelectedItem().equals("-")) {
                    conDescuento();
                }
                IvaTotal();
                totalGeneral();
            }
        }
    }//GEN-LAST:event_txtUnidades7KeyPressed

    private void txtValorUnidad7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUnidades7.getText().equals("")) {//valida que no este en blanco las unidades

                mostrarMensaje("Primero ingresa las cantidades", "Info", "Ingresa Cantidades");

            } else if (txtValorUnidad7.getText().equals("")) {

                try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                    if (txtValorUnidad7.getText().equals("")) {

                        mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                    }
                } catch (NumberFormatException e) {

                    System.out.println(e.toString());
                }

            } else {
                double valorIngresado = Double.parseDouble(txtValorUnidad7.getText());

                if (valorIngresado == 0) {//valida que el valor ingresado no sea 0

                    mostrarMensaje("Valor unidad '0' no es valido", "Info", "Valor ingresado invalido");

                } else {

                    if (valorIngresado < 0) {//valida que el numero no sea negativo

                        mostrarMensaje("No esta permitido el ingreso de numeros negativos", "Info", "Valor ingresado invalido");

                    } else {

                        try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                            if (txtValorUnidad7.getText().equals("")) {

                                mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                            } else {//se ejecuta el codigo con sus metodos

                                totalVenta(txtUnidades7.getText(), txtValorUnidad7.getText(), 7);
                                subTotal();
                                IvaTotal();
                                btnEnviarSolicitud.setEnabled(true);
                                if (!cmbDescuento7.getSelectedItem().equals("-")) {//validamos que el descuento tenga un valor en porcentaje
                                    conDescuento();
                                }
                                totalGeneral();
                                cmbDescuento7.setEnabled(true);
                                cmbIVA7.setEnabled(true);
                                txtCodigo8.setEnabled(true);
                                txtCodigo8.requestFocus();
                            }

                        } catch (NumberFormatException e) {

                            System.out.println(e.toString());
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_txtValorUnidad7KeyPressed

    private void txtUnidades8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades8KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtValorUnidad8.getText())) {
                txtValorUnidad8.setEnabled(true);
                txtValorUnidad8.requestFocus();
                totalUnidades();
            } else {
                totalUnidades();
                totalVenta(txtUnidades8.getText(), txtValorUnidad8.getText(), 8);
                subTotal();
                if (!cmbDescuento8.getSelectedItem().equals("-")) {
                    conDescuento();
                }
                IvaTotal();
                totalGeneral();
            }
        }
    }//GEN-LAST:event_txtUnidades8KeyPressed

    private void txtValorUnidad8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad8KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUnidades8.getText().equals("")) {//valida que no este en blanco las unidades

                mostrarMensaje("Primero ingresa las cantidades", "Info", "Ingresa Cantidades");

            } else if (txtValorUnidad8.getText().equals("")) {

                try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                    if (txtValorUnidad8.getText().equals("")) {

                        mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                    }
                } catch (NumberFormatException e) {

                    System.out.println(e.toString());
                }

            } else {
                double valorIngresado = Double.parseDouble(txtValorUnidad8.getText());

                if (valorIngresado == 0) {//valida que el valor ingresado no sea 0

                    mostrarMensaje("Valor unidad '0' no es valido", "Info", "Valor ingresado invalido");

                } else {

                    if (valorIngresado < 0) {//valida que el numero no sea negativo

                        mostrarMensaje("No esta permitido el ingreso de numeros negativos", "Info", "Valor ingresado invalido");

                    } else {

                        try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                            if (txtValorUnidad8.getText().equals("")) {

                                mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                            } else {//se ejecuta el codigo con sus metodos

                                totalVenta(txtUnidades8.getText(), txtValorUnidad8.getText(), 8);
                                subTotal();
                                IvaTotal();
                                btnEnviarSolicitud.setEnabled(true);
                                if (!cmbDescuento8.getSelectedItem().equals("-")) {//validamos que el descuento tenga un valor en porcentaje
                                    conDescuento();
                                }
                                totalGeneral();
                                cmbDescuento8.setEnabled(true);
                                cmbIVA8.setEnabled(true);
                                txtCodigo9.setEnabled(true);
                                txtCodigo9.requestFocus();
                            }

                        } catch (NumberFormatException e) {

                            System.out.println(e.toString());
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_txtValorUnidad8KeyPressed

    private void txtUnidades9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades9KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtValorUnidad9.getText())) {
                txtValorUnidad9.setEnabled(true);
                txtValorUnidad9.requestFocus();
                totalUnidades();
            } else {
                totalUnidades();
                totalVenta(txtUnidades9.getText(), txtValorUnidad9.getText(), 9);
                subTotal();
                if (!cmbDescuento9.getSelectedItem().equals("-")) {
                    conDescuento();
                }
                IvaTotal();
                totalGeneral();
            }
        }
    }//GEN-LAST:event_txtUnidades9KeyPressed

    private void txtValorUnidad9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad9KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUnidades9.getText().equals("")) {//valida que no este en blanco las unidades

                mostrarMensaje("Primero ingresa las cantidades", "Info", "Ingresa Cantidades");

            } else if (txtValorUnidad9.getText().equals("")) {

                try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                    if (txtValorUnidad9.getText().equals("")) {

                        mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                    }
                } catch (NumberFormatException e) {

                    System.out.println(e.toString());
                }

            } else {
                double valorIngresado = Double.parseDouble(txtValorUnidad9.getText());

                if (valorIngresado == 0) {//valida que el valor ingresado no sea 0

                    mostrarMensaje("Valor unidad '0' no es valido", "Info", "Valor ingresado invalido");

                } else {

                    if (valorIngresado < 0) {//valida que el numero no sea negativo

                        mostrarMensaje("No esta permitido el ingreso de numeros negativos", "Info", "Valor ingresado invalido");

                    } else {

                        try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                            if (txtValorUnidad9.getText().equals("")) {

                                mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                            } else {//se ejecuta el codigo con sus metodos

                                totalVenta(txtUnidades9.getText(), txtValorUnidad9.getText(), 9);
                                subTotal();
                                IvaTotal();
                                btnEnviarSolicitud.setEnabled(true);
                                if (!cmbDescuento9.getSelectedItem().equals("-")) {//validamos que el descuento tenga un valor en porcentaje
                                    conDescuento();
                                }
                                totalGeneral();
                                cmbDescuento9.setEnabled(true);
                                cmbIVA9.setEnabled(true);
                                txtCodigo10.setEnabled(true);
                                txtCodigo10.requestFocus();
                            }

                        } catch (NumberFormatException e) {

                            System.out.println(e.toString());
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_txtValorUnidad9KeyPressed

    private void txtUnidades10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades10KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtValorUnidad10.getText())) {
                txtValorUnidad10.setEnabled(true);
                txtValorUnidad10.requestFocus();
                totalUnidades();
            } else {
                totalUnidades();
                totalVenta(txtUnidades10.getText(), txtValorUnidad10.getText(), 10);
                subTotal();
                if (!cmbDescuento10.getSelectedItem().equals("-")) {
                    conDescuento();
                }
                IvaTotal();
                totalGeneral();
            }
        }
    }//GEN-LAST:event_txtUnidades10KeyPressed

    private void txtValorUnidad10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad10KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtUnidades10.getText().equals("")) {//valida que no este en blanco las unidades

                mostrarMensaje("Primero ingresa las cantidades", "Info", "Ingresa Cantidades");

            } else if (txtValorUnidad10.getText().equals("")) {

                try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                    if (txtValorUnidad10.getText().equals("")) {

                        mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                    }
                } catch (NumberFormatException e) {

                    System.out.println(e.toString());
                }

            } else {
                double valorIngresado = Double.parseDouble(txtValorUnidad10.getText());

                if (valorIngresado == 0) {//valida que el valor ingresado no sea 0

                    mostrarMensaje("Valor unidad '0' no es valido", "Info", "Valor ingresado invalido");

                } else {

                    if (valorIngresado < 0) {//valida que el numero no sea negativo

                        mostrarMensaje("No esta permitido el ingreso de numeros negativos", "Info", "Valor ingresado invalido");

                    } else {

                        try {//capturamos la excepcion para devolver el mensaje que la casilla esta en blanco
                            if (txtValorUnidad10.getText().equals("")) {

                                mostrarMensaje("La casilla esta en Blanco", "Info", "Valor ingresado invalido");

                            } else {//se ejecuta el codigo con sus metodos

                                totalVenta(txtUnidades10.getText(), txtValorUnidad10.getText(), 10);
                                subTotal();
                                IvaTotal();
                                btnEnviarSolicitud.setEnabled(true);
                                if (!cmbDescuento10.getSelectedItem().equals("-")) {//validamos que el descuento tenga un valor en porcentaje
                                    conDescuento();
                                }
                                totalGeneral();
                                cmbDescuento10.setEnabled(true);
                                cmbIVA10.setEnabled(true);
                            }

                        } catch (NumberFormatException e) {

                            System.out.println(e.toString());
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_txtValorUnidad10KeyPressed

    private void txtCodigo3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo3.getText())) {
                int codigo = Integer.parseInt(txtCodigo3.getText());
                producto = solicitudDao.Buscarproducto(codigo);

                if (producto.getTipoProducto() != null) {

                    txtServicio3.setText(producto.getTipoProducto());
                    txtUnidades3.setEnabled(true);
                    txtUnidades3.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "El codigo ingresado no Existe");
                    txtCodigo3.setText("");
                    txtCodigo3.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo contable");
                txtCodigo3.setText("");
                txtCodigo3.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigo3KeyPressed

    private void txtCodigo4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo4.getText())) {
                int codigo = Integer.parseInt(txtCodigo4.getText());
                producto = solicitudDao.Buscarproducto(codigo);

                if (producto.getTipoProducto() != null) {

                    txtServicio4.setText(producto.getTipoProducto());
                    txtUnidades4.setEnabled(true);
                    txtUnidades4.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "El codigo ingresado no Existe");
                    txtCodigo4.setText("");
                    txtCodigo4.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo contable");
                txtCodigo4.setText("");
                txtCodigo4.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigo4KeyPressed

    private void txtCodigo5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo5.getText())) {
                int codigo = Integer.parseInt(txtCodigo5.getText());
                producto = solicitudDao.Buscarproducto(codigo);

                if (producto.getTipoProducto() != null) {

                    txtServicio5.setText(producto.getTipoProducto());
                    txtUnidades5.setEnabled(true);
                    txtUnidades5.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "El codigo ingresado no Existe");
                    txtCodigo5.setText("");
                    txtCodigo5.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo contable");
                txtCodigo5.setText("");
                txtCodigo5.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigo5KeyPressed

    private void txtCodigo6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo6.getText())) {
                int codigo = Integer.parseInt(txtCodigo6.getText());
                producto = solicitudDao.Buscarproducto(codigo);

                if (producto.getTipoProducto() != null) {

                    txtServicio6.setText(producto.getTipoProducto());
                    txtUnidades6.setEnabled(true);
                    txtUnidades6.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "El codigo ingresado no Existe");
                    txtCodigo6.setText("");
                    txtCodigo6.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo contable");
                txtCodigo6.setText("");
                txtCodigo6.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigo6KeyPressed

    private void txtCodigo7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo7.getText())) {
                int codigo = Integer.parseInt(txtCodigo7.getText());
                producto = solicitudDao.Buscarproducto(codigo);

                if (producto.getTipoProducto() != null) {

                    txtServicio7.setText(producto.getTipoProducto());
                    txtUnidades7.setEnabled(true);
                    txtUnidades7.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "El codigo ingresado no Existe");
                    txtCodigo7.setText("");
                    txtCodigo7.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo contable");
                txtCodigo7.setText("");
                txtCodigo7.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigo7KeyPressed

    private void txtCodigo8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo8KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo8.getText())) {
                int codigo = Integer.parseInt(txtCodigo8.getText());
                producto = solicitudDao.Buscarproducto(codigo);

                if (producto.getTipoProducto() != null) {

                    txtServicio8.setText(producto.getTipoProducto());
                    txtUnidades8.setEnabled(true);
                    txtUnidades8.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "El codigo ingresado no Existe");
                    txtCodigo8.setText("");
                    txtCodigo8.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo contable");
                txtCodigo8.setText("");
                txtCodigo8.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigo8KeyPressed

    private void txtCodigo9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo9KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo9.getText())) {
                int codigo = Integer.parseInt(txtCodigo9.getText());
                producto = solicitudDao.Buscarproducto(codigo);

                if (producto.getTipoProducto() != null) {

                    txtServicio9.setText(producto.getTipoProducto());
                    txtUnidades9.setEnabled(true);
                    txtUnidades9.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "El codigo ingresado no Existe");
                    txtCodigo9.setText("");
                    txtCodigo9.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo contable");
                txtCodigo9.setText("");
                txtCodigo9.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigo9KeyPressed

    private void txtCodigo10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo10KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigo10.getText())) {
                int codigo = Integer.parseInt(txtCodigo10.getText());
                producto = solicitudDao.Buscarproducto(codigo);

                if (producto.getTipoProducto() != null) {

                    txtServicio10.setText(producto.getTipoProducto());
                    txtUnidades10.setEnabled(true);
                    txtUnidades10.requestFocus();

                } else {

                    JOptionPane.showMessageDialog(null, "El codigo ingresado no Existe");
                    txtCodigo10.setText("");
                    txtCodigo10.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un codigo contable");
                txtCodigo10.setText("");
                txtCodigo10.requestFocus();
            }

        }
    }//GEN-LAST:event_txtCodigo10KeyPressed

    private void cmbDescuento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescuento3ActionPerformed

        descuento3();
        conDescuento();
        totalIVA3();
        totalMasIva3();
        totalGeneral();

    }//GEN-LAST:event_cmbDescuento3ActionPerformed

    private void cmbIVA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVA3ActionPerformed

        totalIVA3();
        totalMasIva3();
        conDescuento();
        IvaTotal();
        totalGeneral();

    }//GEN-LAST:event_cmbIVA3ActionPerformed

    private void cmbDescuento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescuento4ActionPerformed
        descuento4();
        conDescuento();
        conDescuento();
        totalIVA4();
        totalMasIva4();
        totalGeneral();
    }//GEN-LAST:event_cmbDescuento4ActionPerformed

    private void cmbIVA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVA4ActionPerformed
        totalIVA4();
        totalMasIva4();
        conDescuento();
        IvaTotal();
        totalGeneral();
    }//GEN-LAST:event_cmbIVA4ActionPerformed

    private void cmbDescuento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescuento5ActionPerformed
        descuento5();
        conDescuento();
        totalIVA5();
        totalMasIva5();
        totalGeneral();
    }//GEN-LAST:event_cmbDescuento5ActionPerformed

    private void cmbIVA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVA5ActionPerformed
        totalIVA5();
        totalMasIva5();
        IvaTotal();
        totalGeneral();
    }//GEN-LAST:event_cmbIVA5ActionPerformed

    private void cmbDescuento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescuento6ActionPerformed
        descuento6();
        conDescuento();
        totalIVA6();
        totalMasIva6();
        totalGeneral();
    }//GEN-LAST:event_cmbDescuento6ActionPerformed

    private void cmbIVA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVA6ActionPerformed
        totalIVA6();
        totalMasIva6();
        IvaTotal();
        totalGeneral();
    }//GEN-LAST:event_cmbIVA6ActionPerformed

    private void cmbDescuento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescuento7ActionPerformed
        descuento7();
        conDescuento();
        totalIVA7();
        totalMasIva7();
        totalGeneral();
    }//GEN-LAST:event_cmbDescuento7ActionPerformed

    private void cmbIVA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVA7ActionPerformed
        totalIVA7();
        totalMasIva7();
        IvaTotal();
        totalGeneral();
    }//GEN-LAST:event_cmbIVA7ActionPerformed

    private void cmbDescuento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescuento8ActionPerformed
        descuento8();
        conDescuento();
        totalIVA8();
        totalMasIva8();
        totalGeneral();
    }//GEN-LAST:event_cmbDescuento8ActionPerformed

    private void cmbIVA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVA8ActionPerformed
        totalIVA8();
        totalMasIva8();
        IvaTotal();
        totalGeneral();
    }//GEN-LAST:event_cmbIVA8ActionPerformed

    private void cmbDescuento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescuento9ActionPerformed
        descuento9();
        conDescuento();
        totalIVA9();
        totalMasIva9();
        totalGeneral();
    }//GEN-LAST:event_cmbDescuento9ActionPerformed

    private void cmbIVA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVA9ActionPerformed
        totalIVA9();

        totalMasIva9();
        IvaTotal();
        totalGeneral();
    }//GEN-LAST:event_cmbIVA9ActionPerformed

    private void cmbDescuento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescuento10ActionPerformed
        descuento10();
        conDescuento();
        totalIVA10();
        totalMasIva10();
        totalGeneral();
    }//GEN-LAST:event_cmbDescuento10ActionPerformed

    private void cmbIVA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIVA10ActionPerformed
        totalIVA10();
        totalMasIva10();
        IvaTotal();
        totalGeneral();
    }//GEN-LAST:event_cmbIVA10ActionPerformed

    private void cmbDescuento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescuento2ActionPerformed
        descuento2();
        conDescuento();
        totalIVA2();
        totalMasIva2();
        totalGeneral();
    }//GEN-LAST:event_cmbDescuento2ActionPerformed

    private void cmbDescuento1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbDescuento1KeyPressed

    }//GEN-LAST:event_cmbDescuento1KeyPressed

    private void txtValorUnidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnidad1ActionPerformed

    }//GEN-LAST:event_txtValorUnidad1ActionPerformed

    private void txtBuscarCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCCKeyTyped

        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();
            /*mostrarMensaje("En este campo no se permiten letras","Info","Solo numeros");
            Toolkit.getDefaultToolkit().beep();*/

        }

        if (txtBuscarCC.getText().length() == 11) {
            evt.consume();
            mostrarMensaje("Solo se permite el ingreso de maximo 11 digitos", "Info", "Maximo 11 digitos");
            Toolkit.getDefaultToolkit().beep();
            txtBuscarCC.setText("");
        }


    }//GEN-LAST:event_txtBuscarCCKeyTyped

    private void txtBuscarNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNitKeyTyped

        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();
            /*mostrarMensaje("En este campo no se permiten letras","Info","Solo numeros");
            Toolkit.getDefaultToolkit().beep();*/

        }

        if (txtBuscarNit.getText().length() >= 11) {

            evt.consume();
            mostrarMensaje("Solo se permite el ingreso de maximo 11 digitos", "Info", "Maximo 11 digitos");
            Toolkit.getDefaultToolkit().beep();
            txtBuscarNit.setText("");
        }

    }//GEN-LAST:event_txtBuscarNitKeyTyped

    private void txtCodigo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo1KeyTyped

        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCodigo1KeyTyped

    private void txtCodigo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo2KeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCodigo2KeyTyped

    private void txtCodigo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo3ActionPerformed

    private void txtCodigo3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo3KeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCodigo3KeyTyped

    private void txtCodigo4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo4KeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCodigo4KeyTyped

    private void txtCodigo5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo5KeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCodigo5KeyTyped

    private void txtCodigo6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo6KeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCodigo6KeyTyped

    private void txtCodigo7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo7KeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCodigo7KeyTyped

    private void txtCodigo8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo8KeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCodigo8KeyTyped

    private void txtCodigo9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo9KeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCodigo9KeyTyped

    private void txtCodigo10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo10KeyTyped
        char caracter = evt.getKeyChar();

        if (caracter < '0' || caracter > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_txtCodigo10KeyTyped

    private void txtUnidades1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades1KeyTyped

        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnidades1KeyTyped

    private void txtUnidades2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades2KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnidades2KeyTyped

    private void txtUnidades3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades3KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnidades3KeyTyped

    private void txtUnidades4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades4KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnidades4KeyTyped

    private void txtUnidades5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades5KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnidades5KeyTyped

    private void txtUnidades6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades6KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnidades6KeyTyped

    private void txtUnidades7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades7KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnidades7KeyTyped

    private void txtUnidades8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades8KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnidades8KeyTyped

    private void txtUnidades9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades9KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnidades9KeyTyped

    private void txtUnidades10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidades10KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtUnidades10KeyTyped

    private void txtValorUnidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad1KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtValorUnidad1KeyTyped

    private void txtValorUnidad2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad2KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtValorUnidad2KeyTyped

    private void txtValorUnidad3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad3KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtValorUnidad3KeyTyped

    private void txtValorUnidad4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad4KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtValorUnidad4KeyTyped

    private void txtValorUnidad5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad5KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtValorUnidad5KeyTyped

    private void txtValorUnidad6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad6KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtValorUnidad6KeyTyped

    private void txtValorUnidad7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad7KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtValorUnidad7KeyTyped

    private void txtValorUnidad8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad8KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtValorUnidad8KeyTyped

    private void txtValorUnidad9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad9KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtValorUnidad9KeyTyped

    private void txtValorUnidad10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad10KeyTyped
        char car = evt.getKeyChar();

        if ((car < '0' || car > '9') && (car != '.')) {

            evt.consume();

        }
    }//GEN-LAST:event_txtValorUnidad10KeyTyped

    public void obtenerProductos() {

        //Array ingreso de Codigos
        ArrayList<String> listadoCodigo = new ArrayList();
        if (!txtCodigo1.getText().equals("")) {
            listadoCodigo.add(txtCodigo1.getText());
        }
        if (!txtCodigo2.getText().equals("")) {
            listadoCodigo.add(txtCodigo2.getText());
        }
        if (!txtCodigo3.getText().equals("")) {
            listadoCodigo.add(txtCodigo3.getText());
        }
        if (!txtCodigo4.getText().equals("")) {
            listadoCodigo.add(txtCodigo4.getText());
        }
        if (!txtCodigo5.getText().equals("")) {
            listadoCodigo.add(txtCodigo5.getText());
        }
        if (!txtCodigo6.getText().equals("")) {
            listadoCodigo.add(txtCodigo6.getText());
        }
        if (!txtCodigo7.getText().equals("")) {
            listadoCodigo.add(txtCodigo7.getText());
        }
        if (!txtCodigo8.getText().equals("")) {
            listadoCodigo.add(txtCodigo8.getText());
        }
        if (!txtCodigo9.getText().equals("")) {
            listadoCodigo.add(txtCodigo9.getText());
        }
        if (!txtCodigo10.getText().equals("")) {
            listadoCodigo.add(txtCodigo10.getText());
        }

        StringBuilder cadenaCodigo = new StringBuilder();

        for (String datos : listadoCodigo) {

            cadenaCodigo.append(datos).append(",");
        }

        String datosCadenaCodigo = cadenaCodigo.substring(0, cadenaCodigo.length() - 1);

        solicitud.setCodigo_linea(datosCadenaCodigo);

        //Array ingreso de Productos
        ArrayList<String> listadoProductos = new ArrayList();
        if (!txtServicio1.getText().equals("")) {
            listadoProductos.add(txtServicio1.getText());
        }
        if (!txtServicio2.getText().equals("")) {
            listadoProductos.add(txtServicio2.getText());
        }
        if (!txtServicio3.getText().equals("")) {
            listadoProductos.add(txtServicio3.getText());
        }
        if (!txtServicio4.getText().equals("")) {
            listadoProductos.add(txtServicio4.getText());
        }
        if (!txtServicio5.getText().equals("")) {
            listadoProductos.add(txtServicio5.getText());
        }
        if (!txtServicio6.getText().equals("")) {
            listadoProductos.add(txtServicio6.getText());
        }
        if (!txtServicio7.getText().equals("")) {
            listadoProductos.add(txtServicio7.getText());
        }
        if (!txtServicio8.getText().equals("")) {
            listadoProductos.add(txtServicio8.getText());
        }
        if (!txtServicio9.getText().equals("")) {
            listadoProductos.add(txtServicio9.getText());
        }
        if (!txtServicio10.getText().equals("")) {
            listadoProductos.add(txtServicio10.getText());
        }

        StringBuilder cadenaProductos = new StringBuilder();

        for (String datos : listadoProductos) {

            cadenaProductos.append(datos).append(",");
        }

        String datosCadenaPro = cadenaProductos.substring(0, cadenaProductos.length() - 1);

        solicitud.setProducto_linea(datosCadenaPro);

        //Array ingreso de Unidades
        ArrayList<String> listadoUnids = new ArrayList();
        if (!txtUnidades1.getText().equals("")) {
            listadoUnids.add(txtUnidades1.getText());
        }
        if (!txtUnidades2.getText().equals("")) {
            listadoUnids.add(txtUnidades2.getText());
        }
        if (!txtUnidades3.getText().equals("")) {
            listadoUnids.add(txtUnidades3.getText());
        }
        if (!txtUnidades4.getText().equals("")) {
            listadoUnids.add(txtUnidades4.getText());
        }
        if (!txtUnidades5.getText().equals("")) {
            listadoUnids.add(txtUnidades5.getText());
        }
        if (!txtUnidades6.getText().equals("")) {
            listadoUnids.add(txtUnidades6.getText());
        }
        if (!txtUnidades7.getText().equals("")) {
            listadoUnids.add(txtUnidades7.getText());
        }
        if (!txtUnidades8.getText().equals("")) {
            listadoUnids.add(txtUnidades8.getText());
        }
        if (!txtUnidades9.getText().equals("")) {
            listadoUnids.add(txtUnidades9.getText());
        }
        if (!txtUnidades10.getText().equals("")) {
            listadoUnids.add(txtUnidades10.getText());
        }

        StringBuilder cadenaUnds = new StringBuilder();

        for (String datos : listadoUnids) {

            cadenaUnds.append(datos).append(",");
        }

        String datosCadenaUnds = cadenaUnds.substring(0, cadenaUnds.length() - 1);

        solicitud.setUnids_linea(datosCadenaUnds);

        //Array ingreso de Valor Unidades
        ArrayList<String> listadoValorUnds = new ArrayList();
        if (!txtValorUnidad1.getText().equals("")) {
            listadoValorUnds.add(txtValorUnidad1.getText());
        }
        if (!txtValorUnidad2.getText().equals("")) {
            listadoValorUnds.add(txtValorUnidad2.getText());
        }
        if (!txtValorUnidad3.getText().equals("")) {
            listadoValorUnds.add(txtValorUnidad3.getText());
        }
        if (!txtValorUnidad4.getText().equals("")) {
            listadoValorUnds.add(txtValorUnidad4.getText());
        }
        if (!txtValorUnidad5.getText().equals("")) {
            listadoValorUnds.add(txtValorUnidad5.getText());
        }
        if (!txtValorUnidad6.getText().equals("")) {
            listadoValorUnds.add(txtValorUnidad6.getText());
        }
        if (!txtValorUnidad7.getText().equals("")) {
            listadoValorUnds.add(txtValorUnidad7.getText());
        }
        if (!txtValorUnidad8.getText().equals("")) {
            listadoValorUnds.add(txtValorUnidad8.getText());
        }
        if (!txtValorUnidad9.getText().equals("")) {
            listadoValorUnds.add(txtValorUnidad9.getText());
        }
        if (!txtValorUnidad10.getText().equals("")) {
            listadoValorUnds.add(txtValorUnidad10.getText());
        }

        StringBuilder cadenaValorUnds = new StringBuilder();

        for (String datos : listadoValorUnds) {

            cadenaValorUnds.append(datos).append(",");
        }

        String datosCadenaVal = cadenaValorUnds.substring(0, cadenaValorUnds.length() - 1);
        solicitud.setValorUnidad_linea(datosCadenaVal);

        //Array ingreso de Subtotales
        ArrayList<String> listadoSubtotal = new ArrayList();
        if (!txtTotal1.getText().equals("")) {
            listadoSubtotal.add(txtTotal1.getText());
        }
        if (!txtTotal2.getText().equals("")) {
            listadoSubtotal.add(txtTotal2.getText());
        }
        if (!txtTotal3.getText().equals("")) {
            listadoSubtotal.add(txtTotal3.getText());
        }
        if (!txtTotal4.getText().equals("")) {
            listadoSubtotal.add(txtTotal4.getText());
        }
        if (!txtTotal5.getText().equals("")) {
            listadoSubtotal.add(txtTotal5.getText());
        }
        if (!txtTotal6.getText().equals("")) {
            listadoSubtotal.add(txtTotal6.getText());
        }
        if (!txtTotal7.getText().equals("")) {
            listadoSubtotal.add(txtTotal7.getText());
        }
        if (!txtTotal8.getText().equals("")) {
            listadoSubtotal.add(txtTotal8.getText());
        }
        if (!txtTotal9.getText().equals("")) {
            listadoSubtotal.add(txtTotal9.getText());
        }
        if (!txtTotal10.getText().equals("")) {
            listadoSubtotal.add(txtTotal10.getText());
        }

        StringBuilder cadenaSubtotales = new StringBuilder();

        for (String datos : listadoSubtotal) {

            cadenaSubtotales.append(datos).append(",");
        }

        String datosCadenaSubto = cadenaSubtotales.substring(0, cadenaSubtotales.length() - 1);
        solicitud.setValorSubtotal_linea(datosCadenaSubto);

        //Array ingreso de listadoDescuento
        ArrayList<String> listadoDescuento = new ArrayList();
        if (!txtTotalMasDescuento1.getText().equals("")) {
            listadoDescuento.add(txtTotalMasDescuento1.getText());
        }
        if (!txtTotalMasDescuento2.getText().equals("")) {
            listadoDescuento.add(txtTotalMasDescuento2.getText());
        }
        if (!txtTotalMasDescuento3.getText().equals("")) {
            listadoDescuento.add(txtTotalMasDescuento3.getText());
        }
        if (!txtTotalMasDescuento4.getText().equals("")) {
            listadoDescuento.add(txtTotalMasDescuento4.getText());
        }
        if (!txtTotalMasDescuento5.getText().equals("")) {
            listadoDescuento.add(txtTotalMasDescuento5.getText());
        }
        if (!txtTotalMasDescuento6.getText().equals("")) {
            listadoDescuento.add(txtTotalMasDescuento6.getText());
        }
        if (!txtTotalMasDescuento7.getText().equals("")) {
            listadoDescuento.add(txtTotalMasDescuento7.getText());
        }
        if (!txtTotalMasDescuento8.getText().equals("")) {
            listadoDescuento.add(txtTotalMasDescuento8.getText());
        }
        if (!txtTotalMasDescuento9.getText().equals("")) {
            listadoDescuento.add(txtTotalMasDescuento9.getText());
        }
        if (!txtTotalMasDescuento10.getText().equals("")) {
            listadoDescuento.add(txtTotalMasDescuento10.getText());
        }

        StringBuilder cadenaDescuento = new StringBuilder();

        for (String datos : listadoDescuento) {

            cadenaDescuento.append(datos).append(",");

        }

        String datosCadenaDescu = cadenaDescuento.substring(0, cadenaDescuento.length() - 1);
        solicitud.setDescuento_linea(datosCadenaDescu);

        //Array ingreso de listadoIVA
        ArrayList<String> listadoIva = new ArrayList();
        if (!txtValorIVA1.getText().equals("")) {
            listadoIva.add(txtValorIVA1.getText());
        }
        if (!txtValorIVA2.getText().equals("")) {
            listadoIva.add(txtValorIVA2.getText());
        }
        if (!txtValorIVA3.getText().equals("")) {
            listadoIva.add(txtValorIVA3.getText());
        }
        if (!txtValorIVA4.getText().equals("")) {
            listadoIva.add(txtValorIVA4.getText());
        }
        if (!txtValorIVA5.getText().equals("")) {
            listadoIva.add(txtValorIVA5.getText());
        }
        if (!txtValorIVA6.getText().equals("")) {
            listadoIva.add(txtValorIVA6.getText());
        }
        if (!txtValorIVA7.getText().equals("")) {
            listadoIva.add(txtValorIVA7.getText());
        }
        if (!txtValorIVA8.getText().equals("")) {
            listadoIva.add(txtValorIVA8.getText());
        }
        if (!txtValorIVA9.getText().equals("")) {
            listadoIva.add(txtValorIVA9.getText());
        }
        if (!txtValorIVA10.getText().equals("")) {
            listadoIva.add(txtValorIVA10.getText());
        }

        StringBuilder cadenaIVA = new StringBuilder();

        for (String datos : listadoIva) {

            cadenaIVA.append(datos).append(",");
        }

        String datosCadenaIva = cadenaIVA.substring(0, cadenaIVA.length() - 1);
        solicitud.setIva_linea(datosCadenaIva);

        //Array ingreso de Totales
        ArrayList<String> listadoTotal = new ArrayList();
        if (!txtTotalMasIVA1.getText().equals("")) {
            listadoTotal.add(txtTotalMasIVA1.getText());
        }
        if (!txtTotalMasIVA2.getText().equals("")) {
            listadoTotal.add(txtTotalMasIVA2.getText());
        }
        if (!txtTotalMasIVA3.getText().equals("")) {
            listadoTotal.add(txtTotalMasIVA3.getText());
        }
        if (!txtTotalMasIVA4.getText().equals("")) {
            listadoTotal.add(txtTotalMasIVA4.getText());
        }
        if (!txtTotalMasIVA5.getText().equals("")) {
            listadoTotal.add(txtTotalMasIVA5.getText());
        }
        if (!txtTotalMasIVA6.getText().equals("")) {
            listadoTotal.add(txtTotalMasIVA6.getText());
        }
        if (!txtTotalMasIVA7.getText().equals("")) {
            listadoTotal.add(txtTotalMasIVA7.getText());
        }
        if (!txtTotalMasIVA8.getText().equals("")) {
            listadoTotal.add(txtTotalMasIVA8.getText());
        }
        if (!txtTotalMasIVA9.getText().equals("")) {
            listadoTotal.add(txtTotalMasIVA9.getText());
        }
        if (!txtTotalMasIVA10.getText().equals("")) {
            listadoTotal.add(txtTotalMasIVA10.getText());
        }

        StringBuilder datosTotales = new StringBuilder();

        for (String datos : listadoTotal) {

            datosTotales.append(datos).append(",");
        }

        String datosCadenaTotal = datosTotales.substring(0, datosTotales.length() - 1);

        solicitud.setValor_Total_linea(datosCadenaTotal);
    }


    private void btnEnviarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarSolicitudActionPerformed

        String validar[] = new String[7];
        ArrayList<Object> agregar = new ArrayList<>();
        String txtField[] = {"CC Usuario",
            "Nit Cliente",
            "Anexos",
            "Observaciones",
            "Codigo",
            "Unidades",
            "Valor Unidad"};
        int vacios;
        validar[0] = txtBuscarCC.getText();
        validar[1] = txtBuscarNit.getText();
        validar[2] = txtAnexos.getText();
        validar[3] = txtObservaciones.getText();
        validar[4] = txtCodigo1.getText();
        validar[5] = txtUnidades1.getText();
        validar[6] = txtValorUnidad1.getText();
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
            mostrarMensaje("El campo " + agregar + " esta vacio", "Info", "Falta 1 campo");

        } else if (agregar.size() > 1) {
            mostrarMensaje("Los campos " + agregar + " estan vacios", "Info", "Faltan varios campos");

        } else {

            try {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date mFecha = formato.parse(txtFecha.getText());
                Date mFechasql = new Date(mFecha.getTime());
                solicitud.setFechaSolicitud(mFechasql);
            } catch (ParseException ex) {
                System.out.println(ex.toString());
            }
            solicitud.setUsuario(txtBuscarUsuario.getText());
            solicitud.setNitCliente(Integer.parseInt(txtBuscarNit.getText()));
            solicitud.setNombreCliente(txtBuscarNombreCliente.getText());
            solicitud.setCorreoCliente(txtBuscarCorreoCliente.getText());
            solicitud.setTelefonoCliente(Long.parseLong(txtBuscarTelefonoCliente.getText()));
            solicitud.setTipoCliente(String.valueOf(cmbBuscarTipoCliente.getSelectedItem()));
            solicitud.setRelacionComercial(String.valueOf(cmbBuscarRelacionComercial.getSelectedItem()));
            solicitud.setAnexos(txtAnexos.getText());
            solicitud.setObservaciones(txtObservaciones.getText());
            solicitud.setTotalUnds(Double.parseDouble(txtTotalUnds.getText()));
            solicitud.setTotalDescuento(Double.parseDouble(txtTotalDescuento.getText().replaceAll("[^\\d-]", "")));
            solicitud.setSubtotal(Double.parseDouble(txtSubtotal.getText().replaceAll("[^\\d-]", "")));
            solicitud.setTotal_iva(Double.parseDouble(txtTotalIVA.getText().replaceAll("[^\\d-]", "")));
            solicitud.setTotal(Double.parseDouble(txtTotalMasIva.getText().replaceAll("[^\\d-]", "")));
            obtenerProductos();
            if (archivoSeleccionado == null) {

                int i = JOptionPane.showConfirmDialog(null, "No anexaste soportes, ¿Deseas continuar?");

                switch (i) {
                    case 0: {
                        try {
                        solicitudDao.ingresarSolicitud(solicitud);
                        try {
                            enviar.SendMailSinAdjuntos(html.estiloHTML(solicitud));
                        } catch (MessagingException ex) {
                            System.out.println(ex.toString());
                        }
                        } catch (SQLException ex) {
                            System.out.println(ex.toString());
                        }
                    }

                    mostrarMensaje("Solicitud Enviada Correctamente", "Info", "Solicitud Enviada");

                    break;

                    case 1:
                        int k = JOptionPane.showConfirmDialog(null, "¿Deseas Anexar los soportes?");
                        if (k == 0) {

                            JFileChooser seleccionarArchivo = new JFileChooser();
                            seleccionarArchivo.setMultiSelectionEnabled(true);
                            seleccionarArchivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                            int resultado = seleccionarArchivo.showOpenDialog(this);

                            if (resultado == JFileChooser.APPROVE_OPTION) {
                                File[] archivosSeleccionados = seleccionarArchivo.getSelectedFiles();
                                List<File> listaAdjuntos = new ArrayList<>();
                                for (File seleccion : archivosSeleccionados) {
                                    listaAdjuntos.add(seleccion);
                                    archivoSeleccionado = listaAdjuntos;
                                }

                                try {
                                    try {
                                        solicitudDao.ingresarSolicitud(solicitud);
                                    } catch (SQLException ex) {
                                        System.out.println(ex.toString());
                                    }
                                    enviar.SendMail(archivoSeleccionado, html.estiloHTML(solicitud));
                                } catch (MessagingException ex) {
                                    System.out.println(ex.toString());
                                }
                                mostrarMensaje("Solicitud Enviada Correctamente", "Info", "Solicitud Enviada");
                            }

                        } else {
                            mostrarMensaje("Solicitud Cancelada", "Info", "Solicitud Cancelada");
                        }
                        break;
                    default:
                        mostrarMensaje("Solicitud Cancelada", "Info", "Solicitud Cancelada");
                        break;
                }

            } else {

                try {
                    solicitudDao.ingresarSolicitud(solicitud);
                    enviar.SendMail(archivoSeleccionado, html.estiloHTML(solicitud));
                    mostrarMensaje("Solicitud Enviada Correctamente", "Info", "Solicitud Enviada");
                } catch (MessagingException ex) {
                    System.out.println(ex.toString());
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }

            txtBuscarNit.setText("");
            txtBuscarNombreCliente.setText("");
            txtBuscarCorreoCliente.setText("");
            txtBuscarTelefonoCliente.setText("");
            cmbBuscarTipoCliente.setSelectedItem("-");
            cmbBuscarRelacionComercial.setSelectedItem("-");

            if (!cmbDescuento1.getSelectedItem().equals("-")) {
                cmbDescuento1.setSelectedItem("-");
            }

            if (!cmbDescuento2.getSelectedItem().equals("-")) {
                cmbDescuento2.setSelectedItem("-");
            }
            if (!cmbDescuento3.getSelectedItem().equals("-")) {
                cmbDescuento3.setSelectedItem("-");
            }
            if (!cmbDescuento4.getSelectedItem().equals("-")) {
                cmbDescuento4.setSelectedItem("-");
            }
            if (!cmbDescuento5.getSelectedItem().equals("-")) {
                cmbDescuento5.setSelectedItem("-");
            }
            if (!cmbDescuento6.getSelectedItem().equals("-")) {
                cmbDescuento6.setSelectedItem("-");
            }
            if (!cmbDescuento7.getSelectedItem().equals("-")) {
                cmbDescuento7.setSelectedItem("-");
            }
            if (!cmbDescuento8.getSelectedItem().equals("-")) {
                cmbDescuento8.setSelectedItem("-");
            }
            if (!cmbDescuento9.getSelectedItem().equals("-")) {
                cmbDescuento9.setSelectedItem("-");
            }
            if (!cmbDescuento10.getSelectedItem().equals("-")) {
                cmbDescuento10.setSelectedItem("-");
            }

            if (!cmbIVA1.getSelectedItem().equals("NO")) {
                cmbIVA1.setSelectedIndex(0);
            }

            if (!cmbIVA2.getSelectedItem().equals("NO")) {
                cmbIVA2.setSelectedIndex(0);
            }
            if (!cmbIVA3.getSelectedItem().equals("NO")) {
                cmbIVA3.setSelectedIndex(0);
            }
            if (!cmbIVA4.getSelectedItem().equals("NO")) {
                cmbIVA4.setSelectedIndex(0);
            }
            if (!cmbIVA5.getSelectedItem().equals("NO")) {
                cmbIVA5.setSelectedIndex(0);
            }
            if (!cmbIVA6.getSelectedItem().equals("NO")) {
                cmbIVA6.setSelectedIndex(0);
            }
            if (!cmbIVA7.getSelectedItem().equals("NO")) {
                cmbIVA7.setSelectedIndex(0);
            }
            if (!cmbIVA8.getSelectedItem().equals("NO")) {
                cmbIVA8.setSelectedIndex(0);
            }
            if (!cmbIVA9.getSelectedItem().equals("NO")) {
                cmbIVA9.setSelectedIndex(0);
            }
            if (!cmbIVA10.getSelectedItem().equals("NO")) {
                cmbIVA10.setSelectedIndex(0);
            }

            txtServicio1.setText("");
            txtServicio2.setText("");
            txtServicio3.setText("");
            txtServicio4.setText("");
            txtServicio5.setText("");
            txtServicio6.setText("");
            txtServicio7.setText("");
            txtServicio8.setText("");
            txtServicio9.setText("");
            txtServicio10.setText("");

            txtTotal1.setText("");
            txtTotal2.setText("");
            txtTotal3.setText("");
            txtTotal4.setText("");
            txtTotal5.setText("");
            txtTotal6.setText("");
            txtTotal7.setText("");
            txtTotal8.setText("");
            txtTotal9.setText("");
            txtTotal10.setText("");

            txtTotalMasDescuento1.setText("");
            txtTotalMasDescuento2.setText("");
            txtTotalMasDescuento3.setText("");
            txtTotalMasDescuento4.setText("");
            txtTotalMasDescuento5.setText("");
            txtTotalMasDescuento6.setText("");
            txtTotalMasDescuento7.setText("");
            txtTotalMasDescuento8.setText("");
            txtTotalMasDescuento9.setText("");
            txtTotalMasDescuento10.setText("");

            txtValorIVA1.setText("");
            txtValorIVA2.setText("");
            txtValorIVA3.setText("");
            txtValorIVA4.setText("");
            txtValorIVA5.setText("");
            txtValorIVA6.setText("");
            txtValorIVA7.setText("");
            txtValorIVA8.setText("");
            txtValorIVA9.setText("");
            txtValorIVA10.setText("");

            txtTotalMasIVA1.setText("");
            txtTotalMasIVA2.setText("");
            txtTotalMasIVA3.setText("");
            txtTotalMasIVA4.setText("");
            txtTotalMasIVA5.setText("");
            txtTotalMasIVA6.setText("");
            txtTotalMasIVA7.setText("");
            txtTotalMasIVA8.setText("");
            txtTotalMasIVA9.setText("");
            txtTotalMasIVA10.setText("");

            txtAnexos.setText("");
            txtObservaciones.setText("");

            txtCodigo1.setText("");
            txtCodigo2.setText("");
            txtCodigo3.setText("");
            txtCodigo4.setText("");
            txtCodigo5.setText("");
            txtCodigo6.setText("");
            txtCodigo7.setText("");
            txtCodigo8.setText("");
            txtCodigo9.setText("");
            txtCodigo10.setText("");

            txtUnidades1.setText("");
            txtUnidades2.setText("");
            txtUnidades3.setText("");
            txtUnidades4.setText("");
            txtUnidades5.setText("");
            txtUnidades6.setText("");
            txtUnidades7.setText("");
            txtUnidades8.setText("");
            txtUnidades9.setText("");
            txtUnidades10.setText("");

            txtValorUnidad1.setText("");
            txtValorUnidad2.setText("");
            txtValorUnidad3.setText("");
            txtValorUnidad4.setText("");
            txtValorUnidad5.setText("");
            txtValorUnidad6.setText("");
            txtValorUnidad7.setText("");
            txtValorUnidad8.setText("");
            txtValorUnidad9.setText("");
            txtValorUnidad10.setText("");

            txtTotalUnds.setText("");
            txtTotalDescuento.setText("");
            txtSubtotal.setText("");
            txtTotalIVA.setText("");
            txtTotalMasIva.setText("");

            btnAnexarSoporte.setEnabled(false);
            btnBuscarCodigo.setEnabled(false);

            btnEnviarSolicitud.setEnabled(false);
            cmbDescuento1.setEnabled(false);
            cmbDescuento2.setEnabled(false);
            cmbDescuento3.setEnabled(false);
            cmbDescuento4.setEnabled(false);
            cmbDescuento5.setEnabled(false);
            cmbDescuento6.setEnabled(false);
            cmbDescuento7.setEnabled(false);
            cmbDescuento8.setEnabled(false);
            cmbDescuento9.setEnabled(false);
            cmbDescuento10.setEnabled(false);
            cmbIVA1.setEnabled(false);
            cmbIVA2.setEnabled(false);
            cmbIVA3.setEnabled(false);
            cmbIVA4.setEnabled(false);
            cmbIVA5.setEnabled(false);
            cmbIVA6.setEnabled(false);
            cmbIVA7.setEnabled(false);
            cmbIVA8.setEnabled(false);
            cmbIVA9.setEnabled(false);
            cmbIVA10.setEnabled(false);
            txtAnexos.setEnabled(false);
            txtObservaciones.setEnabled(false);
            btnAnexarSoporte.setEnabled(false);
            txtCodigo1.setEnabled(false);
            txtCodigo2.setEnabled(false);
            txtCodigo3.setEnabled(false);
            txtCodigo4.setEnabled(false);
            txtCodigo5.setEnabled(false);
            txtCodigo6.setEnabled(false);
            txtCodigo7.setEnabled(false);
            txtCodigo8.setEnabled(false);
            txtCodigo9.setEnabled(false);
            txtCodigo10.setEnabled(false);
            txtUnidades1.setEnabled(false);
            txtUnidades2.setEnabled(false);
            txtUnidades3.setEnabled(false);
            txtUnidades4.setEnabled(false);
            txtUnidades5.setEnabled(false);
            txtUnidades6.setEnabled(false);
            txtUnidades7.setEnabled(false);
            txtUnidades8.setEnabled(false);
            txtUnidades9.setEnabled(false);
            txtUnidades10.setEnabled(false);
            txtValorUnidad1.setEnabled(false);
            txtValorUnidad2.setEnabled(false);
            txtValorUnidad3.setEnabled(false);
            txtValorUnidad4.setEnabled(false);
            txtValorUnidad5.setEnabled(false);
            txtValorUnidad6.setEnabled(false);
            txtValorUnidad7.setEnabled(false);
            txtValorUnidad8.setEnabled(false);
            txtValorUnidad9.setEnabled(false);
            txtValorUnidad10.setEnabled(false);
            btnLimpiar.setEnabled(false);
            txtBuscarNit.requestFocus();
    }//GEN-LAST:event_btnEnviarSolicitudActionPerformed
    }


    private void btnVerNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerNitActionPerformed

        BuscadorNit mostrar = new BuscadorNit(CrearSolicitud.this);
        mostrar.setVisible(true);
        mostrar.setLocationRelativeTo(null);


    }//GEN-LAST:event_btnVerNitActionPerformed

    private void btnBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodigoActionPerformed
        BuscadorProducto mostrar = new BuscadorProducto(CrearSolicitud.this);
        mostrar.setVisible(true);
        mostrar.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBuscarCodigoActionPerformed


    private void btnAnexarSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexarSoporteActionPerformed

        JFileChooser seleccionarArchivo = new JFileChooser();
        seleccionarArchivo.setMultiSelectionEnabled(true);
        seleccionarArchivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = seleccionarArchivo.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File[] archivosSeleccionados = seleccionarArchivo.getSelectedFiles();
            List<File> listaAdjuntos = new ArrayList<>();
            for (File seleccion : archivosSeleccionados) {
                listaAdjuntos.add(seleccion);
                archivoSeleccionado = listaAdjuntos;
            }

        }


    }//GEN-LAST:event_btnAnexarSoporteActionPerformed

    private void txtTotalMasDescuento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalMasDescuento1ActionPerformed

    }//GEN-LAST:event_txtTotalMasDescuento1ActionPerformed

    private void txtBuscarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCCActionPerformed

    }//GEN-LAST:event_txtBuscarCCActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtBuscarNit.setText("");
        txtBuscarNombreCliente.setText("");
        txtBuscarCorreoCliente.setText("");
        txtBuscarTelefonoCliente.setText("");
        cmbBuscarTipoCliente.setSelectedItem("-");
        cmbBuscarRelacionComercial.setSelectedItem("-");

        if (!cmbDescuento1.getSelectedItem().equals("-")) {
            cmbDescuento1.setSelectedItem("-");
        }

        if (!cmbDescuento2.getSelectedItem().equals("-")) {
            cmbDescuento2.setSelectedItem("-");
        }
        if (!cmbDescuento3.getSelectedItem().equals("-")) {
            cmbDescuento3.setSelectedItem("-");
        }
        if (!cmbDescuento4.getSelectedItem().equals("-")) {
            cmbDescuento4.setSelectedItem("-");
        }
        if (!cmbDescuento5.getSelectedItem().equals("-")) {
            cmbDescuento5.setSelectedItem("-");
        }
        if (!cmbDescuento6.getSelectedItem().equals("-")) {
            cmbDescuento6.setSelectedItem("-");
        }
        if (!cmbDescuento7.getSelectedItem().equals("-")) {
            cmbDescuento7.setSelectedItem("-");
        }
        if (!cmbDescuento8.getSelectedItem().equals("-")) {
            cmbDescuento8.setSelectedItem("-");
        }
        if (!cmbDescuento9.getSelectedItem().equals("-")) {
            cmbDescuento9.setSelectedItem("-");
        }
        if (!cmbDescuento10.getSelectedItem().equals("-")) {
            cmbDescuento10.setSelectedItem("-");
        }

        if (!cmbIVA1.getSelectedItem().equals("NO")) {
            cmbIVA1.setSelectedIndex(0);
        }

        if (!cmbIVA2.getSelectedItem().equals("NO")) {
            cmbIVA2.setSelectedIndex(0);
        }
        if (!cmbIVA3.getSelectedItem().equals("NO")) {
            cmbIVA3.setSelectedIndex(0);
        }
        if (!cmbIVA4.getSelectedItem().equals("NO")) {
            cmbIVA4.setSelectedIndex(0);
        }
        if (!cmbIVA5.getSelectedItem().equals("NO")) {
            cmbIVA5.setSelectedIndex(0);
        }
        if (!cmbIVA6.getSelectedItem().equals("NO")) {
            cmbIVA6.setSelectedIndex(0);
        }
        if (!cmbIVA7.getSelectedItem().equals("NO")) {
            cmbIVA7.setSelectedIndex(0);
        }
        if (!cmbIVA8.getSelectedItem().equals("NO")) {
            cmbIVA8.setSelectedIndex(0);
        }
        if (!cmbIVA9.getSelectedItem().equals("NO")) {
            cmbIVA9.setSelectedIndex(0);
        }
        if (!cmbIVA10.getSelectedItem().equals("NO")) {
            cmbIVA10.setSelectedIndex(0);
        }

        txtServicio1.setText("");
        txtServicio2.setText("");
        txtServicio3.setText("");
        txtServicio4.setText("");
        txtServicio5.setText("");
        txtServicio6.setText("");
        txtServicio7.setText("");
        txtServicio8.setText("");
        txtServicio9.setText("");
        txtServicio10.setText("");

        txtTotal1.setText("");
        txtTotal2.setText("");
        txtTotal3.setText("");
        txtTotal4.setText("");
        txtTotal5.setText("");
        txtTotal6.setText("");
        txtTotal7.setText("");
        txtTotal8.setText("");
        txtTotal9.setText("");
        txtTotal10.setText("");

        txtTotalMasDescuento1.setText("");
        txtTotalMasDescuento2.setText("");
        txtTotalMasDescuento3.setText("");
        txtTotalMasDescuento4.setText("");
        txtTotalMasDescuento5.setText("");
        txtTotalMasDescuento6.setText("");
        txtTotalMasDescuento7.setText("");
        txtTotalMasDescuento8.setText("");
        txtTotalMasDescuento9.setText("");
        txtTotalMasDescuento10.setText("");

        txtValorIVA1.setText("");
        txtValorIVA2.setText("");
        txtValorIVA3.setText("");
        txtValorIVA4.setText("");
        txtValorIVA5.setText("");
        txtValorIVA6.setText("");
        txtValorIVA7.setText("");
        txtValorIVA8.setText("");
        txtValorIVA9.setText("");
        txtValorIVA10.setText("");

        txtTotalMasIVA1.setText("");
        txtTotalMasIVA2.setText("");
        txtTotalMasIVA3.setText("");
        txtTotalMasIVA4.setText("");
        txtTotalMasIVA5.setText("");
        txtTotalMasIVA6.setText("");
        txtTotalMasIVA7.setText("");
        txtTotalMasIVA8.setText("");
        txtTotalMasIVA9.setText("");
        txtTotalMasIVA10.setText("");

        txtAnexos.setText("");
        txtObservaciones.setText("");

        txtCodigo1.setText("");
        txtCodigo2.setText("");
        txtCodigo3.setText("");
        txtCodigo4.setText("");
        txtCodigo5.setText("");
        txtCodigo6.setText("");
        txtCodigo7.setText("");
        txtCodigo8.setText("");
        txtCodigo9.setText("");
        txtCodigo10.setText("");

        txtUnidades1.setText("");
        txtUnidades2.setText("");
        txtUnidades3.setText("");
        txtUnidades4.setText("");
        txtUnidades5.setText("");
        txtUnidades6.setText("");
        txtUnidades7.setText("");
        txtUnidades8.setText("");
        txtUnidades9.setText("");
        txtUnidades10.setText("");

        txtValorUnidad1.setText("");
        txtValorUnidad2.setText("");
        txtValorUnidad3.setText("");
        txtValorUnidad4.setText("");
        txtValorUnidad5.setText("");
        txtValorUnidad6.setText("");
        txtValorUnidad7.setText("");
        txtValorUnidad8.setText("");
        txtValorUnidad9.setText("");
        txtValorUnidad10.setText("");

        txtTotalUnds.setText("");
        txtTotalDescuento.setText("");
        txtSubtotal.setText("");
        txtTotalIVA.setText("");
        txtTotalMasIva.setText("");

        btnAnexarSoporte.setEnabled(false);
        btnBuscarCodigo.setEnabled(false);

        btnEnviarSolicitud.setEnabled(false);
        cmbDescuento1.setEnabled(false);
        cmbDescuento2.setEnabled(false);
        cmbDescuento3.setEnabled(false);
        cmbDescuento4.setEnabled(false);
        cmbDescuento5.setEnabled(false);
        cmbDescuento6.setEnabled(false);
        cmbDescuento7.setEnabled(false);
        cmbDescuento8.setEnabled(false);
        cmbDescuento9.setEnabled(false);
        cmbDescuento10.setEnabled(false);
        cmbIVA1.setEnabled(false);
        cmbIVA2.setEnabled(false);
        cmbIVA3.setEnabled(false);
        cmbIVA4.setEnabled(false);
        cmbIVA5.setEnabled(false);
        cmbIVA6.setEnabled(false);
        cmbIVA7.setEnabled(false);
        cmbIVA8.setEnabled(false);
        cmbIVA9.setEnabled(false);
        cmbIVA10.setEnabled(false);
        txtAnexos.setEnabled(false);
        txtObservaciones.setEnabled(false);
        btnAnexarSoporte.setEnabled(false);
        txtCodigo1.setEnabled(false);
        txtCodigo2.setEnabled(false);
        txtCodigo3.setEnabled(false);
        txtCodigo4.setEnabled(false);
        txtCodigo5.setEnabled(false);
        txtCodigo6.setEnabled(false);
        txtCodigo7.setEnabled(false);
        txtCodigo8.setEnabled(false);
        txtCodigo9.setEnabled(false);
        txtCodigo10.setEnabled(false);
        txtUnidades1.setEnabled(false);
        txtUnidades2.setEnabled(false);
        txtUnidades3.setEnabled(false);
        txtUnidades4.setEnabled(false);
        txtUnidades5.setEnabled(false);
        txtUnidades6.setEnabled(false);
        txtUnidades7.setEnabled(false);
        txtUnidades8.setEnabled(false);
        txtUnidades9.setEnabled(false);
        txtUnidades10.setEnabled(false);
        txtValorUnidad1.setEnabled(false);
        txtValorUnidad2.setEnabled(false);
        txtValorUnidad3.setEnabled(false);
        txtValorUnidad4.setEnabled(false);
        txtValorUnidad5.setEnabled(false);
        txtValorUnidad6.setEnabled(false);
        txtValorUnidad7.setEnabled(false);
        txtValorUnidad8.setEnabled(false);
        txtValorUnidad9.setEnabled(false);
        txtValorUnidad10.setEnabled(false);
        btnLimpiar.setEnabled(false);
        txtBuscarNit.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtValorUnidad1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidad1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnidad1KeyReleased

    public void totalVenta(String cantidades, String valorUnidades, int i) {

        double unidades = Double.parseDouble(cantidades);
        double valorUnidad = Double.parseDouble(valorUnidades);
        String total;

        if (!"".equals(unidades) && !"".equals(valorUnidad) && i == 1) {
            total = Double.toString(unidades * valorUnidad);
            txtTotal1.setText(total);
            descuento();
            totalIVA();
            totalMasIva();
        }
        if (!"".equals(unidades) && !"".equals(valorUnidad) && i == 2) {
            total = Double.toString(unidades * valorUnidad);
            txtTotal2.setText(total);
            descuento2();
            totalIVA2();
            totalMasIva2();
        }

        if (!"".equals(unidades) && !"".equals(valorUnidad) && i == 3) {
            total = Double.toString(unidades * valorUnidad);
            txtTotal3.setText(total);
            descuento3();
            totalIVA3();
            totalMasIva3();
        }
        if (!"".equals(unidades) && !"".equals(valorUnidad) && i == 4) {
            total = Double.toString(unidades * valorUnidad);
            txtTotal4.setText(total);
            descuento4();
            totalIVA4();
            totalMasIva4();
        }
        if (!"".equals(unidades) && !"".equals(valorUnidad) && i == 5) {

            total = Double.toString(unidades * valorUnidad);
            txtTotal5.setText(total);
            descuento5();
            totalIVA5();
            totalMasIva5();
        }
        if (!"".equals(unidades) && !"".equals(valorUnidad) && i == 6) {

            total = Double.toString(unidades * valorUnidad);
            txtTotal6.setText(total);
            descuento6();
            totalIVA6();
            totalMasIva6();
        }
        if (!"".equals(unidades) && !"".equals(valorUnidad) && i == 7) {
            total = Double.toString(unidades * valorUnidad);
            txtTotal7.setText(total);
            descuento7();
            totalIVA7();
            totalMasIva7();
        }
        if (!"".equals(unidades) && !"".equals(valorUnidad) && i == 8) {
            total = Double.toString(unidades * valorUnidad);
            txtTotal8.setText(total);
            descuento8();
            totalIVA8();
            totalMasIva8();
        }
        if (!"".equals(unidades) && !"".equals(valorUnidad) && i == 9) {
            total = Double.toString(unidades * valorUnidad);
            txtTotal9.setText(total);
            descuento9();
            totalIVA9();
            totalMasIva9();
        }
        if (!"".equals(unidades) && !"".equals(valorUnidad) && i == 10) {
            total = Double.toString(unidades * valorUnidad);
            txtTotal10.setText(total);
            descuento10();
            totalIVA10();
            totalMasIva10();
        }

    }

    double conDescuento[] = new double[10];

    public void conDescuento() {
        double total;
        double suma = 0;
        double valorDescuento;

        for (int i = 0; i < conDescuento.length; i++) {

            total = conDescuento[i];
            suma += total;
        }

        valorDescuento = subtotales - suma;
        txtTotalDescuento.setText(Double.toString(valorDescuento));

    }

    public void descuento() {
        double dcto;
        double totalDescuento;
        String totalMasDescuento;
        double valor;

        if (cmbDescuento1.getSelectedIndex() == 0) {//Si el descuento es 0, se traslada el Subtotal
            txtTotalMasDescuento1.setText(txtTotal1.getText());
            conDescuento[0] = Double.parseDouble(txtTotalMasDescuento1.getText());

        }
        if (cmbDescuento1.getSelectedIndex() == 1) {
            valor = Double.parseDouble(txtTotal1.getText());
            dcto = 0.05;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento1.setText(totalMasDescuento);
            conDescuento[0] = Double.parseDouble(txtTotalMasDescuento1.getText());
        }
        if (cmbDescuento1.getSelectedIndex() == 2) {
            valor = Double.parseDouble(txtTotal1.getText());
            dcto = 0.1;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento1.setText(totalMasDescuento);
            conDescuento[0] = Double.parseDouble(txtTotalMasDescuento1.getText());
        }
        if (cmbDescuento1.getSelectedIndex() == 3) {
            valor = Double.parseDouble(txtTotal1.getText());
            dcto = 0.15;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento1.setText(totalMasDescuento);
            conDescuento[0] = Double.parseDouble(txtTotalMasDescuento1.getText());
        }
        if (cmbDescuento1.getSelectedIndex() == 4) {
            valor = Double.parseDouble(txtTotal1.getText());
            dcto = 0.2;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento1.setText(totalMasDescuento);
            conDescuento[0] = Double.parseDouble(txtTotalMasDescuento1.getText());
        }

    }

    public void descuento2() {
        double dcto;
        double totalDescuento;
        String totalMasDescuento;
        double valor;

        if (cmbDescuento2.getSelectedIndex() == 0) {
            txtTotalMasDescuento2.setText(txtTotal2.getText());
            conDescuento[1] = Double.parseDouble(txtTotalMasDescuento2.getText());
        }
        if (cmbDescuento2.getSelectedIndex() == 1) {
            valor = Double.parseDouble(txtTotal2.getText());
            dcto = 0.05;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento2.setText(totalMasDescuento);
            conDescuento[1] = Double.parseDouble(txtTotalMasDescuento2.getText());
        }
        if (cmbDescuento2.getSelectedIndex() == 2) {
            valor = Double.parseDouble(txtTotal2.getText());
            dcto = 0.1;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento2.setText(totalMasDescuento);
            conDescuento[1] = Double.parseDouble(txtTotalMasDescuento2.getText());
        }
        if (cmbDescuento2.getSelectedIndex() == 3) {
            valor = Double.parseDouble(txtTotal2.getText());
            dcto = 0.15;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento2.setText(totalMasDescuento);
            conDescuento[1] = Double.parseDouble(txtTotalMasDescuento2.getText());
        }
        if (cmbDescuento2.getSelectedIndex() == 4) {
            valor = Double.parseDouble(txtTotal2.getText());
            dcto = 0.2;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento2.setText(totalMasDescuento);
            conDescuento[1] = Double.parseDouble(txtTotalMasDescuento2.getText());
        }

    }

    public void descuento3() {
        double dcto;
        double totalDescuento;
        String totalMasDescuento;
        double valor;

        if (cmbDescuento3.getSelectedIndex() == 0) {
            txtTotalMasDescuento3.setText(txtTotal3.getText());
            conDescuento[2] = Double.parseDouble(txtTotalMasDescuento3.getText());
        }
        if (cmbDescuento3.getSelectedIndex() == 1) {
            valor = Double.parseDouble(txtTotal3.getText());
            dcto = 0.05;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento3.setText(totalMasDescuento);
            conDescuento[2] = Double.parseDouble(txtTotalMasDescuento3.getText());
        }
        if (cmbDescuento3.getSelectedIndex() == 2) {
            valor = Double.parseDouble(txtTotal3.getText());
            dcto = 0.1;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento3.setText(totalMasDescuento);
            conDescuento[2] = Double.parseDouble(txtTotalMasDescuento3.getText());
        }
        if (cmbDescuento3.getSelectedIndex() == 3) {
            valor = Double.parseDouble(txtTotal3.getText());
            dcto = 0.15;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento3.setText(totalMasDescuento);
            conDescuento[2] = Double.parseDouble(txtTotalMasDescuento3.getText());
        }
        if (cmbDescuento3.getSelectedIndex() == 4) {
            valor = Double.parseDouble(txtTotal3.getText());
            dcto = 0.2;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento3.setText(totalMasDescuento);
            conDescuento[2] = Double.parseDouble(txtTotalMasDescuento3.getText());
        }

    }

    public void descuento4() {
        double dcto;
        double totalDescuento;
        String totalMasDescuento;
        double valor;

        if (cmbDescuento4.getSelectedIndex() == 0) {
            txtTotalMasDescuento4.setText(txtTotal4.getText());
            conDescuento[3] = Double.parseDouble(txtTotalMasDescuento4.getText());
        }
        if (cmbDescuento4.getSelectedIndex() == 1) {
            valor = Double.parseDouble(txtTotal4.getText());
            dcto = 0.05;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento4.setText(totalMasDescuento);
            conDescuento[3] = Double.parseDouble(txtTotalMasDescuento4.getText());
        }
        if (cmbDescuento4.getSelectedIndex() == 2) {
            valor = Double.parseDouble(txtTotal4.getText());
            dcto = 0.1;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento4.setText(totalMasDescuento);
            conDescuento[3] = Double.parseDouble(txtTotalMasDescuento4.getText());
        }
        if (cmbDescuento4.getSelectedIndex() == 3) {
            valor = Double.parseDouble(txtTotal4.getText());
            dcto = 0.15;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento4.setText(totalMasDescuento);
            conDescuento[3] = Double.parseDouble(txtTotalMasDescuento4.getText());
        }
        if (cmbDescuento4.getSelectedIndex() == 4) {
            valor = Double.parseDouble(txtTotal4.getText());
            dcto = 0.2;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento4.setText(totalMasDescuento);
            conDescuento[3] = Double.parseDouble(txtTotalMasDescuento4.getText());
        }

    }

    public void descuento5() {
        double dcto;
        double totalDescuento;
        String totalMasDescuento;
        double valor;

        if (cmbDescuento5.getSelectedIndex() == 0) {
            txtTotalMasDescuento5.setText(txtTotal5.getText());
            conDescuento[4] = Double.parseDouble(txtTotalMasDescuento5.getText());
        }
        if (cmbDescuento5.getSelectedIndex() == 1) {
            valor = Double.parseDouble(txtTotal5.getText());
            dcto = 0.05;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento5.setText(totalMasDescuento);
            conDescuento[4] = Double.parseDouble(txtTotalMasDescuento5.getText());
        }
        if (cmbDescuento5.getSelectedIndex() == 2) {
            valor = Double.parseDouble(txtTotal5.getText());
            dcto = 0.1;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento5.setText(totalMasDescuento);
            conDescuento[4] = Double.parseDouble(txtTotalMasDescuento5.getText());
        }
        if (cmbDescuento5.getSelectedIndex() == 3) {
            valor = Double.parseDouble(txtTotal5.getText());
            dcto = 0.15;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento5.setText(totalMasDescuento);
            conDescuento[4] = Double.parseDouble(txtTotalMasDescuento5.getText());
        }
        if (cmbDescuento5.getSelectedIndex() == 4) {
            valor = Double.parseDouble(txtTotal5.getText());
            dcto = 0.2;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento5.setText(totalMasDescuento);
            conDescuento[4] = Double.parseDouble(txtTotalMasDescuento5.getText());
        }

    }

    public void descuento6() {
        double dcto;
        double totalDescuento;
        String totalMasDescuento;
        double valor;

        if (cmbDescuento6.getSelectedIndex() == 0) {
            txtTotalMasDescuento6.setText(txtTotal6.getText());
            conDescuento[5] = Double.parseDouble(txtTotalMasDescuento6.getText());
        }
        if (cmbDescuento6.getSelectedIndex() == 1) {
            valor = Double.parseDouble(txtTotal6.getText());
            dcto = 0.05;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento6.setText(totalMasDescuento);
            conDescuento[5] = Double.parseDouble(txtTotalMasDescuento6.getText());
        }
        if (cmbDescuento6.getSelectedIndex() == 2) {
            valor = Double.parseDouble(txtTotal6.getText());
            dcto = 0.1;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento6.setText(totalMasDescuento);
            conDescuento[5] = Double.parseDouble(txtTotalMasDescuento6.getText());
        }
        if (cmbDescuento6.getSelectedIndex() == 3) {
            valor = Double.parseDouble(txtTotal6.getText());
            dcto = 0.15;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento6.setText(totalMasDescuento);
            conDescuento[5] = Double.parseDouble(txtTotalMasDescuento6.getText());
        }
        if (cmbDescuento6.getSelectedIndex() == 4) {
            valor = Double.parseDouble(txtTotal6.getText());
            dcto = 0.2;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento6.setText(totalMasDescuento);
            conDescuento[5] = Double.parseDouble(txtTotalMasDescuento6.getText());
        }

    }

    public void descuento7() {
        double dcto;
        double totalDescuento;
        String totalMasDescuento;
        double valor;

        if (cmbDescuento7.getSelectedIndex() == 0) {
            txtTotalMasDescuento7.setText(txtTotal7.getText());
            conDescuento[6] = Double.parseDouble(txtTotalMasDescuento7.getText());
        }
        if (cmbDescuento7.getSelectedIndex() == 1) {
            valor = Double.parseDouble(txtTotal7.getText());
            dcto = 0.05;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento7.setText(totalMasDescuento);
            conDescuento[6] = Double.parseDouble(txtTotalMasDescuento7.getText());
        }
        if (cmbDescuento7.getSelectedIndex() == 2) {
            valor = Double.parseDouble(txtTotal7.getText());
            dcto = 0.1;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento7.setText(totalMasDescuento);
            conDescuento[6] = Double.parseDouble(txtTotalMasDescuento7.getText());
        }
        if (cmbDescuento7.getSelectedIndex() == 3) {
            valor = Double.parseDouble(txtTotal7.getText());
            dcto = 0.15;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento7.setText(totalMasDescuento);
            conDescuento[6] = Double.parseDouble(txtTotalMasDescuento7.getText());
        }
        if (cmbDescuento7.getSelectedIndex() == 4) {
            valor = Double.parseDouble(txtTotal7.getText());
            dcto = 0.2;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento7.setText(totalMasDescuento);
            conDescuento[6] = Double.parseDouble(txtTotalMasDescuento7.getText());
        }

    }

    public void descuento8() {
        double dcto;
        double totalDescuento;
        String totalMasDescuento;
        double valor;

        if (cmbDescuento8.getSelectedIndex() == 0) {
            txtTotalMasDescuento8.setText(txtTotal8.getText());
            conDescuento[7] = Double.parseDouble(txtTotalMasDescuento8.getText());
        }
        if (cmbDescuento8.getSelectedIndex() == 1) {
            valor = Double.parseDouble(txtTotal8.getText());
            dcto = 0.05;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento8.setText(totalMasDescuento);
            conDescuento[7] = Double.parseDouble(txtTotalMasDescuento8.getText());
        }
        if (cmbDescuento8.getSelectedIndex() == 2) {
            valor = Double.parseDouble(txtTotal8.getText());
            dcto = 0.1;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento8.setText(totalMasDescuento);
            conDescuento[7] = Double.parseDouble(txtTotalMasDescuento8.getText());
        }
        if (cmbDescuento8.getSelectedIndex() == 3) {
            valor = Double.parseDouble(txtTotal8.getText());
            dcto = 0.15;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento8.setText(totalMasDescuento);
            conDescuento[7] = Double.parseDouble(txtTotalMasDescuento8.getText());
        }
        if (cmbDescuento8.getSelectedIndex() == 4) {
            valor = Double.parseDouble(txtTotal8.getText());
            dcto = 0.2;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento8.setText(totalMasDescuento);
            conDescuento[7] = Double.parseDouble(txtTotalMasDescuento8.getText());
        }

    }

    public void descuento9() {
        double dcto;
        double totalDescuento;
        String totalMasDescuento;
        double valor;

        if (cmbDescuento9.getSelectedIndex() == 0) {
            txtTotalMasDescuento9.setText(txtTotal9.getText());
            conDescuento[8] = Double.parseDouble(txtTotalMasDescuento9.getText());
        }
        if (cmbDescuento9.getSelectedIndex() == 1) {
            valor = Double.parseDouble(txtTotal9.getText());
            dcto = 0.05;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento9.setText(totalMasDescuento);
            conDescuento[8] = Double.parseDouble(txtTotalMasDescuento9.getText());
        }
        if (cmbDescuento9.getSelectedIndex() == 2) {
            valor = Double.parseDouble(txtTotal9.getText());
            dcto = 0.1;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento9.setText(totalMasDescuento);
            conDescuento[8] = Double.parseDouble(txtTotalMasDescuento9.getText());
        }
        if (cmbDescuento9.getSelectedIndex() == 3) {
            valor = Double.parseDouble(txtTotal9.getText());
            dcto = 0.15;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento9.setText(totalMasDescuento);
            conDescuento[8] = Double.parseDouble(txtTotalMasDescuento9.getText());
        }
        if (cmbDescuento9.getSelectedIndex() == 4) {
            valor = Double.parseDouble(txtTotal9.getText());
            dcto = 0.2;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento9.setText(totalMasDescuento);
            conDescuento[8] = Double.parseDouble(txtTotalMasDescuento9.getText());
        }

    }

    public void descuento10() {
        double dcto;
        double totalDescuento;
        String totalMasDescuento;
        double valor;

        if (cmbDescuento10.getSelectedIndex() == 0) {
            txtTotalMasDescuento10.setText(txtTotal10.getText());
            conDescuento[9] = Double.parseDouble(txtTotalMasDescuento10.getText());
        }
        if (cmbDescuento10.getSelectedIndex() == 1) {
            valor = Double.parseDouble(txtTotal10.getText());
            dcto = 0.05;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento10.setText(totalMasDescuento);
            conDescuento[9] = Double.parseDouble(txtTotalMasDescuento10.getText());
        }
        if (cmbDescuento10.getSelectedIndex() == 2) {
            valor = Double.parseDouble(txtTotal10.getText());
            dcto = 0.1;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento10.setText(totalMasDescuento);
            conDescuento[9] = Double.parseDouble(txtTotalMasDescuento10.getText());
        }
        if (cmbDescuento10.getSelectedIndex() == 3) {
            valor = Double.parseDouble(txtTotal10.getText());
            dcto = 0.15;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento10.setText(totalMasDescuento);
            conDescuento[9] = Double.parseDouble(txtTotalMasDescuento10.getText());
        }
        if (cmbDescuento10.getSelectedIndex() == 4) {
            valor = Double.parseDouble(txtTotal10.getText());
            dcto = 0.2;
            totalDescuento = valor * dcto;
            totalMasDescuento = Double.toString(valor - totalDescuento);
            txtTotalMasDescuento10.setText(totalMasDescuento);
            conDescuento[9] = Double.parseDouble(txtTotalMasDescuento10.getText());
        }

    }

    public void totalIVA() {
        double iva;
        String totalIva;
        double totalConDescuento;

        if (cmbIVA1.getSelectedIndex() == 0) {
            txtValorIVA1.setText("0");

        }
        if (cmbIVA1.getSelectedIndex() == 1) {
            iva = 0.19;
            totalConDescuento = Double.parseDouble(txtTotalMasDescuento1.getText());
            totalIva = Double.toString(totalConDescuento * iva);
            txtValorIVA1.setText(totalIva);

        }

    }

    public void totalIVA2() {
        double iva;
        String totalIva;
        double totalConDescuento;

        if (cmbIVA2.getSelectedIndex() == 0) {
            txtValorIVA2.setText("0");

        }
        if (cmbIVA2.getSelectedIndex() == 1) {
            iva = 0.19;
            totalConDescuento = Double.parseDouble(txtTotalMasDescuento2.getText());
            totalIva = Double.toString(totalConDescuento * iva);
            txtValorIVA2.setText(totalIva);

        }

    }

    public void totalIVA3() {
        double iva;
        String totalIva;
        double totalConDescuento;

        if (cmbIVA3.getSelectedIndex() == 0) {
            txtValorIVA3.setText("0");

        }
        if (cmbIVA3.getSelectedIndex() == 1) {
            iva = 0.19;
            totalConDescuento = Double.parseDouble(txtTotalMasDescuento3.getText());
            totalIva = Double.toString(totalConDescuento * iva);
            txtValorIVA3.setText(totalIva);

        }

    }

    public void totalIVA4() {
        double iva;
        String totalIva;
        double totalConDescuento;

        if (cmbIVA4.getSelectedIndex() == 0) {
            txtValorIVA4.setText("0");

        }
        if (cmbIVA4.getSelectedIndex() == 1) {
            iva = 0.19;
            totalConDescuento = Double.parseDouble(txtTotalMasDescuento4.getText());
            totalIva = Double.toString(totalConDescuento * iva);
            txtValorIVA4.setText(totalIva);

        }

    }

    public void totalIVA5() {
        double iva;
        String totalIva;
        double totalConDescuento;

        if (cmbIVA5.getSelectedIndex() == 0) {
            txtValorIVA5.setText("0");

        }
        if (cmbIVA5.getSelectedIndex() == 1) {
            iva = 0.19;
            totalConDescuento = Double.parseDouble(txtTotalMasDescuento5.getText());
            totalIva = Double.toString(totalConDescuento * iva);
            txtValorIVA5.setText(totalIva);

        }

    }

    public void totalIVA6() {
        double iva;
        String totalIva;
        double totalConDescuento;

        if (cmbIVA6.getSelectedIndex() == 0) {
            txtValorIVA6.setText("0");

        }
        if (cmbIVA6.getSelectedIndex() == 1) {
            iva = 0.19;
            totalConDescuento = Double.parseDouble(txtTotalMasDescuento6.getText());
            totalIva = Double.toString(totalConDescuento * iva);
            txtValorIVA6.setText(totalIva);

        }

    }

    public void totalIVA7() {
        double iva;
        String totalIva;
        double totalConDescuento;

        if (cmbIVA7.getSelectedIndex() == 0) {
            txtValorIVA7.setText("0");

        }
        if (cmbIVA7.getSelectedIndex() == 1) {
            iva = 0.19;
            totalConDescuento = Double.parseDouble(txtTotalMasDescuento7.getText());
            totalIva = Double.toString(totalConDescuento * iva);
            txtValorIVA7.setText(totalIva);

        }

    }

    public void totalIVA8() {
        double iva;
        String totalIva;
        double totalConDescuento;

        if (cmbIVA8.getSelectedIndex() == 0) {
            txtValorIVA8.setText("0");

        }
        if (cmbIVA8.getSelectedIndex() == 1) {
            iva = 0.19;
            totalConDescuento = Double.parseDouble(txtTotalMasDescuento8.getText());
            totalIva = Double.toString(totalConDescuento * iva);
            txtValorIVA8.setText(totalIva);

        }

    }

    public void totalIVA9() {
        double iva;
        String totalIva;
        double totalConDescuento;

        if (cmbIVA9.getSelectedIndex() == 0) {
            txtValorIVA9.setText("0");

        }
        if (cmbIVA9.getSelectedIndex() == 1) {
            iva = 0.19;
            totalConDescuento = Double.parseDouble(txtTotalMasDescuento9.getText());
            totalIva = Double.toString(totalConDescuento * iva);
            txtValorIVA9.setText(totalIva);

        }

    }

    public void totalIVA10() {
        double iva;
        String totalIva;
        double totalConDescuento;

        if (cmbIVA10.getSelectedIndex() == 0) {
            txtValorIVA10.setText("0");

        }
        if (cmbIVA10.getSelectedIndex() == 1) {
            iva = 0.19;
            totalConDescuento = Double.parseDouble(txtTotalMasDescuento10.getText());
            totalIva = Double.toString(totalConDescuento * iva);
            txtValorIVA10.setText(totalIva);

        }

    }

    public void totalMasIva() {
        String total;
        double totalConDescuento;
        double totalIVA;

        totalConDescuento = Double.parseDouble(txtTotalMasDescuento1.getText());
        totalIVA = Double.parseDouble(txtValorIVA1.getText());

        total = Double.toString(totalConDescuento + totalIVA);

        txtTotalMasIVA1.setText(total);

    }

    public void totalMasIva2() {
        String total;
        double totalConDescuento;
        double totalIVA;

        totalConDescuento = Double.parseDouble(txtTotalMasDescuento2.getText());
        totalIVA = Double.parseDouble(txtValorIVA2.getText());

        total = Double.toString(totalConDescuento + totalIVA);

        txtTotalMasIVA2.setText(total);

    }

    public void totalMasIva3() {
        String total;
        double totalConDescuento;
        double totalIVA;

        totalConDescuento = Double.parseDouble(txtTotalMasDescuento3.getText());
        totalIVA = Double.parseDouble(txtValorIVA3.getText());

        total = Double.toString(totalConDescuento + totalIVA);

        txtTotalMasIVA3.setText(total);

    }

    public void totalMasIva4() {
        String total;
        double totalConDescuento;
        double totalIVA;

        totalConDescuento = Double.parseDouble(txtTotalMasDescuento4.getText());
        totalIVA = Double.parseDouble(txtValorIVA4.getText());

        total = Double.toString(totalConDescuento + totalIVA);

        txtTotalMasIVA4.setText(total);

    }

    public void totalMasIva5() {
        String total;
        double totalConDescuento;
        double totalIVA;

        totalConDescuento = Double.parseDouble(txtTotalMasDescuento5.getText());
        totalIVA = Double.parseDouble(txtValorIVA5.getText());

        total = Double.toString(totalConDescuento + totalIVA);

        txtTotalMasIVA5.setText(total);

    }

    public void totalMasIva6() {
        String total;
        double totalConDescuento;
        double totalIVA;

        totalConDescuento = Double.parseDouble(txtTotalMasDescuento6.getText());
        totalIVA = Double.parseDouble(txtValorIVA6.getText());

        total = Double.toString(totalConDescuento + totalIVA);

        txtTotalMasIVA6.setText(total);

    }

    public void totalMasIva7() {
        String total;
        double totalConDescuento;
        double totalIVA;

        totalConDescuento = Double.parseDouble(txtTotalMasDescuento7.getText());
        totalIVA = Double.parseDouble(txtValorIVA7.getText());

        total = Double.toString(totalConDescuento + totalIVA);

        txtTotalMasIVA7.setText(total);

    }

    public void totalMasIva8() {
        String total;
        double totalConDescuento;
        double totalIVA;

        totalConDescuento = Double.parseDouble(txtTotalMasDescuento8.getText());
        totalIVA = Double.parseDouble(txtValorIVA8.getText());

        total = Double.toString(totalConDescuento + totalIVA);

        txtTotalMasIVA8.setText(total);

    }

    public void totalMasIva9() {
        String total;
        double totalConDescuento;
        double totalIVA;

        totalConDescuento = Double.parseDouble(txtTotalMasDescuento9.getText());
        totalIVA = Double.parseDouble(txtValorIVA9.getText());

        total = Double.toString(totalConDescuento + totalIVA);
        txtTotalMasIVA9.setText(total);

    }

    public void totalMasIva10() {
        String total;
        double totalConDescuento;
        double totalIVA;

        totalConDescuento = Double.parseDouble(txtTotalMasDescuento10.getText());
        totalIVA = Double.parseDouble(txtValorIVA10.getText());

        total = Double.toString(totalConDescuento + totalIVA);
        txtTotalMasIVA10.setText(total);

    }

    public String mostrarFecha() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        return formatoFecha.format(fecha);

    }

    public void totalUnidades() {

        double totalUnds[] = new double[10];
        double total;
        double suma = 0;

        try {
            if (!txtUnidades1.getText().equals("")) {

                totalUnds[0] = Double.parseDouble(txtUnidades1.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtUnidades2.getText().equals("")) {

                totalUnds[1] = Double.parseDouble(txtUnidades2.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtUnidades3.getText().equals("")) {

                totalUnds[2] = Double.parseDouble(txtUnidades3.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtUnidades4.getText().equals("")) {

                totalUnds[3] = Double.parseDouble(txtUnidades4.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtUnidades5.getText().equals("")) {

                totalUnds[4] = Double.parseDouble(txtUnidades5.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtUnidades6.getText().equals("")) {

                totalUnds[5] = Double.parseDouble(txtUnidades6.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtUnidades7.getText().equals("")) {

                totalUnds[6] = Double.parseDouble(txtUnidades7.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtUnidades8.getText().equals("")) {

                totalUnds[7] = Double.parseDouble(txtUnidades8.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtUnidades9.getText().equals("")) {

                totalUnds[8] = Double.parseDouble(txtUnidades9.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtUnidades10.getText().equals("")) {

                totalUnds[9] = Double.parseDouble(txtUnidades10.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        for (int i = 0; i < totalUnds.length; i++) {

            if (totalUnds[i] != 0) {
                total = totalUnds[i];
                suma += total;
            }

        }

        txtTotalUnds.setText(Double.toString(suma));

    }

    double subtotales;//se ingresa el valor del subtotal 

    public void subTotal() {

        double valorSubtotales[] = new double[10];
        double total;
        double suma = 0;

        try {
            if (!txtTotal1.getText().equals("")) {

                valorSubtotales[0] = Double.parseDouble(txtTotal1.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotal2.getText().equals("")) {

                valorSubtotales[1] = Double.parseDouble(txtTotal2.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotal3.getText().equals("")) {

                valorSubtotales[2] = Double.parseDouble(txtTotal3.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotal4.getText().equals("")) {

                valorSubtotales[3] = Double.parseDouble(txtTotal4.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotal5.getText().equals("")) {

                valorSubtotales[4] = Double.parseDouble(txtTotal5.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotal6.getText().equals("")) {

                valorSubtotales[5] = Double.parseDouble(txtTotal6.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotal7.getText().equals("")) {

                valorSubtotales[6] = Double.parseDouble(txtTotal7.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotal8.getText().equals("")) {

                valorSubtotales[7] = Double.parseDouble(txtTotal8.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotal9.getText().equals("")) {

                valorSubtotales[8] = Double.parseDouble(txtTotal9.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotal10.getText().equals("")) {

                valorSubtotales[9] = Double.parseDouble(txtTotal10.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        for (int i = 0; i < valorSubtotales.length; i++) {

            if (valorSubtotales[i] != 0) {
                total = valorSubtotales[i];
                suma += total;
            }

        }

        txtSubtotal.setText(Double.toString(suma));
        subtotales = suma;
    }

    public void IvaTotal() {

        double valorSubtotales[] = new double[10];
        double total;
        double suma = 0;

        try {
            if (!txtValorIVA1.getText().equals("")) {

                valorSubtotales[0] = Double.parseDouble(txtValorIVA1.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtValorIVA2.getText().equals("")) {

                valorSubtotales[1] = Double.parseDouble(txtValorIVA2.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtValorIVA3.getText().equals("")) {

                valorSubtotales[2] = Double.parseDouble(txtValorIVA3.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtValorIVA4.getText().equals("")) {

                valorSubtotales[3] = Double.parseDouble(txtValorIVA4.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtValorIVA5.getText().equals("")) {

                valorSubtotales[4] = Double.parseDouble(txtValorIVA5.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtValorIVA6.getText().equals("")) {

                valorSubtotales[5] = Double.parseDouble(txtValorIVA6.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtValorIVA7.getText().equals("")) {

                valorSubtotales[6] = Double.parseDouble(txtValorIVA7.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtValorIVA8.getText().equals("")) {

                valorSubtotales[7] = Double.parseDouble(txtValorIVA8.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtValorIVA9.getText().equals("")) {

                valorSubtotales[8] = Double.parseDouble(txtValorIVA9.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtValorIVA10.getText().equals("")) {

                valorSubtotales[9] = Double.parseDouble(txtValorIVA10.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        for (int i = 0; i < valorSubtotales.length; i++) {

            if (valorSubtotales[i] != 0) {
                total = valorSubtotales[i];
                suma += total;
            }

        }

        txtTotalIVA.setText(Double.toString(suma));

    }

    public void totalGeneral() {

        double valorSubtotales[] = new double[10];
        double total;
        double suma = 0;

        try {
            if (!txtTotalMasIVA1.getText().equals("")) {

                valorSubtotales[0] = Double.parseDouble(txtTotalMasIVA1.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotalMasIVA2.getText().equals("")) {

                valorSubtotales[1] = Double.parseDouble(txtTotalMasIVA2.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotalMasIVA3.getText().equals("")) {

                valorSubtotales[2] = Double.parseDouble(txtTotalMasIVA3.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotalMasIVA4.getText().equals("")) {

                valorSubtotales[3] = Double.parseDouble(txtTotalMasIVA4.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotalMasIVA5.getText().equals("")) {

                valorSubtotales[4] = Double.parseDouble(txtTotalMasIVA5.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotalMasIVA6.getText().equals("")) {

                valorSubtotales[5] = Double.parseDouble(txtTotalMasIVA6.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotalMasIVA7.getText().equals("")) {

                valorSubtotales[6] = Double.parseDouble(txtTotalMasIVA7.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotalMasIVA8.getText().equals("")) {

                valorSubtotales[7] = Double.parseDouble(txtTotalMasIVA8.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotalMasIVA9.getText().equals("")) {

                valorSubtotales[8] = Double.parseDouble(txtTotalMasIVA9.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            if (!txtTotalMasIVA10.getText().equals("")) {

                valorSubtotales[9] = Double.parseDouble(txtTotalMasIVA10.getText());

            }
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        for (int i = 0; i < valorSubtotales.length; i++) {

            if (valorSubtotales[i] != 0) {
                total = valorSubtotales[i];
                suma += total;
            }

        }

        txtTotalMasIva.setText(Double.toString(suma));

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
    private javax.swing.JButton btnAnexarSoporte;
    private javax.swing.JButton btnBuscarCodigo;
    private javax.swing.JButton btnEnviarSolicitud;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVerNit;
    private javax.swing.JComboBox<String> cmbBuscarRelacionComercial;
    private javax.swing.JComboBox<String> cmbBuscarTipoCliente;
    private javax.swing.JComboBox<String> cmbDescuento1;
    private javax.swing.JComboBox<String> cmbDescuento10;
    private javax.swing.JComboBox<String> cmbDescuento2;
    private javax.swing.JComboBox<String> cmbDescuento3;
    private javax.swing.JComboBox<String> cmbDescuento4;
    private javax.swing.JComboBox<String> cmbDescuento5;
    private javax.swing.JComboBox<String> cmbDescuento6;
    private javax.swing.JComboBox<String> cmbDescuento7;
    private javax.swing.JComboBox<String> cmbDescuento8;
    private javax.swing.JComboBox<String> cmbDescuento9;
    private javax.swing.JComboBox<String> cmbIVA1;
    private javax.swing.JComboBox<String> cmbIVA10;
    private javax.swing.JComboBox<String> cmbIVA2;
    private javax.swing.JComboBox<String> cmbIVA3;
    private javax.swing.JComboBox<String> cmbIVA4;
    private javax.swing.JComboBox<String> cmbIVA5;
    private javax.swing.JComboBox<String> cmbIVA6;
    private javax.swing.JComboBox<String> cmbIVA7;
    private javax.swing.JComboBox<String> cmbIVA8;
    private javax.swing.JComboBox<String> cmbIVA9;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtAnexos;
    private javax.swing.JTextField txtBuscarCC;
    private javax.swing.JTextField txtBuscarCorreoCliente;
    private javax.swing.JTextField txtBuscarNit;
    private javax.swing.JTextField txtBuscarNombreCliente;
    private javax.swing.JTextField txtBuscarTelefonoCliente;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo10;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtCodigo3;
    private javax.swing.JTextField txtCodigo4;
    private javax.swing.JTextField txtCodigo5;
    private javax.swing.JTextField txtCodigo6;
    private javax.swing.JTextField txtCodigo7;
    private javax.swing.JTextField txtCodigo8;
    private javax.swing.JTextField txtCodigo9;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtServicio1;
    private javax.swing.JTextField txtServicio10;
    private javax.swing.JTextField txtServicio2;
    private javax.swing.JTextField txtServicio3;
    private javax.swing.JTextField txtServicio4;
    private javax.swing.JTextField txtServicio5;
    private javax.swing.JTextField txtServicio6;
    private javax.swing.JTextField txtServicio7;
    private javax.swing.JTextField txtServicio8;
    private javax.swing.JTextField txtServicio9;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JTextField txtTotal1;
    private javax.swing.JTextField txtTotal10;
    private javax.swing.JTextField txtTotal2;
    private javax.swing.JTextField txtTotal3;
    private javax.swing.JTextField txtTotal4;
    private javax.swing.JTextField txtTotal5;
    private javax.swing.JTextField txtTotal6;
    private javax.swing.JTextField txtTotal7;
    private javax.swing.JTextField txtTotal8;
    private javax.swing.JTextField txtTotal9;
    private javax.swing.JLabel txtTotalDescuento;
    private javax.swing.JLabel txtTotalIVA;
    private javax.swing.JTextField txtTotalMasDescuento1;
    private javax.swing.JTextField txtTotalMasDescuento10;
    private javax.swing.JTextField txtTotalMasDescuento2;
    private javax.swing.JTextField txtTotalMasDescuento3;
    private javax.swing.JTextField txtTotalMasDescuento4;
    private javax.swing.JTextField txtTotalMasDescuento5;
    private javax.swing.JTextField txtTotalMasDescuento6;
    private javax.swing.JTextField txtTotalMasDescuento7;
    private javax.swing.JTextField txtTotalMasDescuento8;
    private javax.swing.JTextField txtTotalMasDescuento9;
    private javax.swing.JTextField txtTotalMasIVA1;
    private javax.swing.JTextField txtTotalMasIVA10;
    private javax.swing.JTextField txtTotalMasIVA2;
    private javax.swing.JTextField txtTotalMasIVA3;
    private javax.swing.JTextField txtTotalMasIVA4;
    private javax.swing.JTextField txtTotalMasIVA5;
    private javax.swing.JTextField txtTotalMasIVA6;
    private javax.swing.JTextField txtTotalMasIVA7;
    private javax.swing.JTextField txtTotalMasIVA8;
    private javax.swing.JTextField txtTotalMasIVA9;
    private javax.swing.JLabel txtTotalMasIva;
    private javax.swing.JLabel txtTotalUnds;
    private javax.swing.JTextField txtUnidades1;
    private javax.swing.JTextField txtUnidades10;
    private javax.swing.JTextField txtUnidades2;
    private javax.swing.JTextField txtUnidades3;
    private javax.swing.JTextField txtUnidades4;
    private javax.swing.JTextField txtUnidades5;
    private javax.swing.JTextField txtUnidades6;
    private javax.swing.JTextField txtUnidades7;
    private javax.swing.JTextField txtUnidades8;
    private javax.swing.JTextField txtUnidades9;
    private javax.swing.JTextField txtValorIVA1;
    private javax.swing.JTextField txtValorIVA10;
    private javax.swing.JTextField txtValorIVA2;
    private javax.swing.JTextField txtValorIVA3;
    private javax.swing.JTextField txtValorIVA4;
    private javax.swing.JTextField txtValorIVA5;
    private javax.swing.JTextField txtValorIVA6;
    private javax.swing.JTextField txtValorIVA7;
    private javax.swing.JTextField txtValorIVA8;
    private javax.swing.JTextField txtValorIVA9;
    private javax.swing.JTextField txtValorUnidad1;
    private javax.swing.JTextField txtValorUnidad10;
    private javax.swing.JTextField txtValorUnidad2;
    private javax.swing.JTextField txtValorUnidad3;
    private javax.swing.JTextField txtValorUnidad4;
    private javax.swing.JTextField txtValorUnidad5;
    private javax.swing.JTextField txtValorUnidad6;
    private javax.swing.JTextField txtValorUnidad7;
    private javax.swing.JTextField txtValorUnidad8;
    private javax.swing.JTextField txtValorUnidad9;
    // End of variables declaration//GEN-END:variables
}
