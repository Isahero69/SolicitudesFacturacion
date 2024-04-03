package IGU;

import Controladora.Facturacion;
import Logica.SolicitudFacturacionDao;
import Principal.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ConsultarSolicitudes extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pre;
    ResultSet rs;
    Conexion conexion = new Conexion();
    SolicitudFacturacionDao logicaSolDao = new SolicitudFacturacionDao();
    DefaultTableModel modelo;
    Facturacion idBuscado = new Facturacion();

    public ConsultarSolicitudes() {
        initComponents();
       
    }

    public void mostrarSol() {

        List<Facturacion> leerSol = logicaSolDao.consultarSolicitudes();
        modelo = (DefaultTableModel) tablaConsultaSolicitudes.getModel();

        if (leerSol != null) {
            for (Facturacion recorrer : leerSol) {
                Object[] leer = {
                    recorrer.getIdConsecutivo(),
                    recorrer.getFechaSolicitud(),
                    recorrer.getUsuario(),
                    recorrer.getNitCliente(),
                    recorrer.getNombreCliente(),
                    recorrer.getRelacionComercial(),
                    recorrer.getTotalUnds(),
                    recorrer.getSubtotal(),
                    recorrer.getTotalDescuento(),
                    recorrer.getTotal_iva(),
                    recorrer.getTotal()

                };

                modelo.addRow(leer);
            }

        }

        tablaConsultaSolicitudes.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtbuscarCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultaSolicitudes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar Solicitudes");

        txtbuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarClienteKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Nombre Cliente");

        tablaConsultaSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA", "USUARIO", "NIT CLIENTE", "NOMBRE CLIENTE", "REL. COMERCIAL", "TOTAL UNDS", "SUBTOTAL", "TOTAL DCTO", "TOTAL IVA", "TOTAL GENERAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaConsultaSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaConsultaSolicitudesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaConsultaSolicitudes);
        if (tablaConsultaSolicitudes.getColumnModel().getColumnCount() > 0) {
            tablaConsultaSolicitudes.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaConsultaSolicitudes.getColumnModel().getColumn(9).setMaxWidth(150);
        }

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(txtbuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1264, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1221, 1221, 1221)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mostrarSol();
    }//GEN-LAST:event_formWindowOpened

    private void txtbuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarClienteKeyReleased
        String valorFiltrado = txtbuscarCliente.getText();
        filtrarSolicitudes(valorFiltrado);
    }//GEN-LAST:event_txtbuscarClienteKeyReleased

    private void tablaConsultaSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConsultaSolicitudesMouseClicked

        int fila = tablaConsultaSolicitudes.rowAtPoint(evt.getPoint());
        int id = Integer.parseInt(String.valueOf(tablaConsultaSolicitudes.getValueAt(fila, 0)));
        DetalleSolicitud mostrarDetalle = new DetalleSolicitud(id);
        mostrarDetalle.setVisible(true);
        mostrarDetalle.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_tablaConsultaSolicitudesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    public void filtrarSolicitudes(String nombreCliente) {
        limpiarTabla();

        try {
            String parametroNombre = "" + nombreCliente + "_%";
            String sql = "SELECT * FROM facturacion WHERE nombreCliente LIKE " + '"' + parametroNombre + '"';
            con = conexion.getConnection();
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();

            while (rs.next()) {
                Object[] recorrer = new Object[11];
                recorrer[0] = rs.getInt("idConsecutivo");
                recorrer[1] = rs.getString("fecha");
                recorrer[2] = rs.getString("Usuario");
                recorrer[3] = rs.getInt("nitCliente");
                recorrer[4] = rs.getString("nombreCliente");
                recorrer[5] = rs.getString("relacionComercial");
                recorrer[6] = rs.getDouble("totalUnds");
                recorrer[7] = rs.getDouble("Subtotal");
                recorrer[8] = rs.getDouble("totalDescuento");
                recorrer[9] = rs.getDouble("total_Iva");
                recorrer[10] = rs.getDouble("Total");
                modelo.addRow(recorrer);
            }

            tablaConsultaSolicitudes.setModel(modelo);

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

    private void limpiarTabla() {

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaConsultaSolicitudes;
    private javax.swing.JTextField txtbuscarCliente;
    // End of variables declaration//GEN-END:variables
}
