package IGU;

import Controladora.Cliente;
import IGU.CrearSolicitud;
import Logica.SolicitudFacturacionDao;
import Principal.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BuscadorNit extends javax.swing.JFrame {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement pre;
    ResultSet rs;
    Cliente cliente = new Cliente();
    SolicitudFacturacionDao clientedao = new SolicitudFacturacionDao();
    DefaultTableModel modelo;
    private final CrearSolicitud crear;
    

    public BuscadorNit(CrearSolicitud crear) {
        this.crear = crear;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscarNit = new javax.swing.JTable();
        txtFiltroCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Cliente");

        tablaBuscarNit.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tablaBuscarNit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NIT", "NOMBRE CLIENTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBuscarNit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBuscarNitMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBuscarNit);
        if (tablaBuscarNit.getColumnModel().getColumnCount() > 0) {
            tablaBuscarNit.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaBuscarNit.getColumnModel().getColumn(1).setMinWidth(100);
            tablaBuscarNit.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtFiltroCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroClienteKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Buscar Nombre Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ListarCliente();
    }//GEN-LAST:event_formWindowOpened

    private void txtFiltroClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroClienteKeyReleased

        String valor = txtFiltroCliente.getText();
        filtrarClientes(valor);

    }//GEN-LAST:event_txtFiltroClienteKeyReleased

    private void tablaBuscarNitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBuscarNitMouseClicked
 
        int fila = tablaBuscarNit.rowAtPoint(evt.getPoint());
        String datoSeleccionado = tablaBuscarNit.getValueAt(fila, 1).toString();
        crear.setDato(datoSeleccionado);
        dispose();
    }//GEN-LAST:event_tablaBuscarNitMouseClicked

    private void limpiarTabla() {

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;

        }
    }

    public void filtrarClientes(String valorBuscado) {
        limpiarTabla();

        try {
            String filtro = "" + valorBuscado + "_%";
            String sql = "SELECT * FROM cliente WHERE nombreCliente LIKE " + '"' + filtro + '"';
            //System.out.println(sql);
            con = cn.getConnection();
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[3];
                fila[0] = rs.getInt("id_Cliente");
                fila[1] = rs.getLong("nit_Cliente");
                fila[2] = rs.getString("nombreCliente");

                modelo.addRow(fila);

            }
            tablaBuscarNit.setModel(modelo);

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
        List<Cliente> mostrarCliente = clientedao.mostrarClientes();
        modelo = (DefaultTableModel) tablaBuscarNit.getModel();

        if (mostrarCliente != null) {
            for (Cliente mostrar : mostrarCliente) {
                Object[] clientesTabla = {
                    mostrar.getId_Cliente(),
                    mostrar.getNit_Cliente(),
                    mostrar.getNombreCliente(),};

                modelo.addRow(clientesTabla);
            }
        }

        tablaBuscarNit.setModel(modelo);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaBuscarNit;
    private javax.swing.JTextField txtFiltroCliente;
    // End of variables declaration//GEN-END:variables
}
