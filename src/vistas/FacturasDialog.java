/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angel
 */
public class FacturasDialog extends javax.swing.JDialog {

    public FacturasDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        btRetroceder = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btAniadirFactura = new javax.swing.JButton();
        btEliminarFactura = new javax.swing.JButton();
        btEditarFactura = new javax.swing.JButton();
        btBuscarFactura = new javax.swing.JButton();
        btListarLineaFacturas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_Facturas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbCodigoCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        dcFechaFactura = new com.toedter.calendar.JDateChooser();
        btRetroceder1 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        btRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Retroceder.png"))); // NOI18N
        btRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetrocederActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setMargin(new java.awt.Insets(0, 10, 0, 0));

        btAniadirFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/plus.png"))); // NOI18N
        btAniadirFactura.setToolTipText("Añadir linea de  factura");
        btAniadirFactura.setMargin(new java.awt.Insets(2, 25, 2, 25));
        btAniadirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAniadirFacturaActionPerformed(evt);
            }
        });
        jToolBar1.add(btAniadirFactura);

        btEliminarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
        btEliminarFactura.setToolTipText("Eliminar linea de  factura");
        btEliminarFactura.setMargin(new java.awt.Insets(2, 25, 2, 25));
        btEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarFacturaActionPerformed(evt);
            }
        });
        jToolBar1.add(btEliminarFactura);

        btEditarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/editar.png"))); // NOI18N
        btEditarFactura.setFocusable(false);
        btEditarFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEditarFactura.setMaximumSize(new java.awt.Dimension(88, 42));
        btEditarFactura.setMinimumSize(new java.awt.Dimension(88, 42));
        btEditarFactura.setPreferredSize(new java.awt.Dimension(88, 42));
        btEditarFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEditarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarFacturaActionPerformed(evt);
            }
        });
        jToolBar1.add(btEditarFactura);

        btBuscarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        btBuscarFactura.setFocusable(false);
        btBuscarFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBuscarFactura.setMaximumSize(new java.awt.Dimension(88, 42));
        btBuscarFactura.setMinimumSize(new java.awt.Dimension(88, 42));
        btBuscarFactura.setPreferredSize(new java.awt.Dimension(88, 42));
        btBuscarFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarFacturaActionPerformed(evt);
            }
        });
        jToolBar1.add(btBuscarFactura);

        btListarLineaFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/list.png"))); // NOI18N
        btListarLineaFacturas.setFocusable(false);
        btListarLineaFacturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListarLineaFacturas.setMaximumSize(new java.awt.Dimension(88, 42));
        btListarLineaFacturas.setMinimumSize(new java.awt.Dimension(88, 42));
        btListarLineaFacturas.setPreferredSize(new java.awt.Dimension(88, 42));
        btListarLineaFacturas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btListarLineaFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarLineaFacturasActionPerformed(evt);
            }
        });
        jToolBar1.add(btListarLineaFacturas);

        JT_Facturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de factura", "Fecha de factura", "Codigo de Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_Facturas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JT_Facturas);
        if (JT_Facturas.getColumnModel().getColumnCount() > 0) {
            JT_Facturas.getColumnModel().getColumn(0).setResizable(false);
            JT_Facturas.getColumnModel().getColumn(1).setResizable(false);
            JT_Facturas.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel4.setText("Numero de factura");

        jLabel1.setText("Fecha de factura");

        jLabel2.setText("Codigo del cliente");

        btRetroceder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Retroceder.png"))); // NOI18N
        btRetroceder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetroceder1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumFactura)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbCodigoCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dcFechaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(btRetroceder1)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btRetroceder1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dcFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAniadirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAniadirFacturaActionPerformed

    }//GEN-LAST:event_btAniadirFacturaActionPerformed

    private void btEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarFacturaActionPerformed

    }//GEN-LAST:event_btEliminarFacturaActionPerformed

    private void btEditarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarFacturaActionPerformed


    }//GEN-LAST:event_btEditarFacturaActionPerformed

    private void btRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetrocederActionPerformed

    }//GEN-LAST:event_btRetrocederActionPerformed

    private void btRetroceder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetroceder1ActionPerformed

    }//GEN-LAST:event_btRetroceder1ActionPerformed

    private void btBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarFacturaActionPerformed

    }//GEN-LAST:event_btBuscarFacturaActionPerformed

    private void btListarLineaFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarLineaFacturasActionPerformed

    }//GEN-LAST:event_btListarLineaFacturasActionPerformed

    //------------------------Metodos auxiliares--------------------------------
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FacturasDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturasDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturasDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturasDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FacturasDialog dialog = new FacturasDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JT_Facturas;
    private javax.swing.JButton btAniadirFactura;
    private javax.swing.JButton btBuscarFactura;
    private javax.swing.JButton btEditarFactura;
    private javax.swing.JButton btEliminarFactura;
    private javax.swing.JButton btListarLineaFacturas;
    private javax.swing.JButton btRetroceder;
    private javax.swing.JButton btRetroceder1;
    private javax.swing.JComboBox<String> cbCodigoCliente;
    private com.toedter.calendar.JDateChooser dcFechaFactura;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtNumFactura;
    // End of variables declaration//GEN-END:variables

}
