/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import Panel_Mau.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author MY HP
 */
public class DonHang extends javax.swing.JFrame {

    DefaultTableModel df;
    process_data.Users nv;
    private Business_logic.DonHang blUS;
    private Frame.Form_ThemDH form;
    private Frame.ChiTietDonHang DH;

    public DonHang() {
        initComponents();
        blUS = new Business_logic.DonHang(this);
        form = new Frame.Form_ThemDH(this);
//        DH = new Frame.ChiTietDonHang(this);
        this.blUS.LoadDH();
        tableDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleSPMouseClicked(evt);
            }
        });
        //định dạng bảng
        JTableHeader header = tableDH.getTableHeader();
        header.setDefaultRenderer(new CustomTableHeaderRenderer());
        header.setPreferredSize(new java.awt.Dimension(header.getPreferredSize().width, 70));
        tableDH.getTableHeader().setDefaultRenderer(new MultiLineHeaderRenderer());
        TableColumn columnFirstName = tableDH.getColumnModel().getColumn(0);
        TableColumn columnLastName = tableDH.getColumnModel().getColumn(1);
        TableColumn columnAge = tableDH.getColumnModel().getColumn(2);
        TableColumn column4 = tableDH.getColumnModel().getColumn(3);
        TableColumn column5 = tableDH.getColumnModel().getColumn(4);
        TableColumn column6 = tableDH.getColumnModel().getColumn(5);
        TableColumn column7 = tableDH.getColumnModel().getColumn(6);
        TableColumn column8 = tableDH.getColumnModel().getColumn(7);
        TableColumn column9 = tableDH.getColumnModel().getColumn(8);
        TableColumn column10 = tableDH.getColumnModel().getColumn(9);

        columnFirstName.setPreferredWidth(10);
        columnLastName.setPreferredWidth(10);
        columnAge.setPreferredWidth(20);
        column4.setPreferredWidth(200);
        column5.setPreferredWidth(60);
        column6.setPreferredWidth(120);
        column7.setPreferredWidth(40);
        column8.setPreferredWidth(60);
        column9.setPreferredWidth(40);
        column10.setPreferredWidth(10);
    }

    class CustomTableHeaderRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            c.setBackground(new Color(255, 207, 231));
            c.setForeground(new Color(102, 0, 102));
            c.setFont(c.getFont().deriveFont(Font.BOLD, 16));
            return c;
        }
    }

    private void tbleSPMouseClicked(MouseEvent evt) {
        jTextField2.setText("");
        if (this.tableDH.getSelectedRow() >= 0) {
            int row = tableDH.getSelectedRow();
            if (row >= 0) { // Kiểm tra xem có hàng nào được chọn không
                String Ma = this.tableDH.getValueAt(this.tableDH.getSelectedRow(), 0).toString();
                this.jTextField2.setText(Ma);
                DH = new Frame.ChiTietDonHang(Ma);
                        String Madh = this.tableDH.getValueAt(this.tableDH.getSelectedRow(), 0).toString();
                       DH.getjTextField5().setText(Madh);
                       String name = this.tableDH.getValueAt(this.tableDH.getSelectedRow(), 1).toString();
                       DH.getjTextField4().setText(name);
                        Object paso = tableDH.getValueAt(this.tableDH.getSelectedRow(), 3);
                       String pas;
                            if (paso != null) {
                                  pas = paso.toString();
                                } else {
                                pas = "";
                                }
                       DH.getjTextField6().setText(pas);
                       String ten = this.tableDH.getValueAt(this.tableDH.getSelectedRow(), 2).toString();
                       DH.getjTextField7().setText(ten);
                       Object loaist = this.tableDH.getValueAt(this.tableDH.getSelectedRow(), 5).toString();
                       String loai;
                            if (loaist != null) {
                                  loai = loaist.toString();
                                } else {
                                loai = "";
                                }
                       DH.getjComboBoxPTTT().setSelectedItem(loai);
                       String gtinh = this.tableDH.getValueAt(this.tableDH.getSelectedRow(), 4).toString();
                        DH.getjTextField8().setText(gtinh);
                         Object dateo = tableDH.getValueAt(this.tableDH.getSelectedRow(), 6);
                       String date;
                            if (dateo != null) {
                                  date = dateo.toString();
                                } else {
                                date = "";
                                }
                       DH.getjTextField9().setText(date);
                       String sdt = this.tableDH.getValueAt(this.tableDH.getSelectedRow(), 7).toString();
                       DH.getjComboBoxTT().setSelectedItem(sdt);
                       String email =this.tableDH.getValueAt(this.tableDH.getSelectedRow(), 8).toString();
                       DH.getjTextField12().setText(email);
                        String tao =this.tableDH.getValueAt(this.tableDH.getSelectedRow(), 8).toString();
                       DH.getjComboBoxDV().setSelectedItem(dateo);
                       DH.setVisible(true);

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu2 = new Panel_Mau.Menu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDH = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableDH.setBackground(new Color(255,255,255));
        tableDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableDH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDH.setGridColor(new java.awt.Color(255, 207, 231));
        tableDH.setRowHeight(30);
        tableDH.setSelectionBackground(Color.PINK);
        tableDH.setSelectionForeground(new java.awt.Color(102, 0, 102));
        tableDH.setShowGrid(true);
        jScrollPane1.setViewportView(tableDH);

        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Tìm kiếm theo mã đơn hàng");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 192, 237));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 192, 237));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 102));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 192, 237));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("Thêm mới");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa thông tin này không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result < 1) {
            int k = this.blUS.Delete();
            if (k > 0) {
                JOptionPane.showMessageDialog(this, "Thông tin đã được xóa");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.blUS.LoadDH();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        form = new Frame.Form_ThemDH();
        form.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        this.blUS.Search();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
        jTextField2.setText("");
        jTextField2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField2MouseClicked

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
            java.util.logging.Logger.getLogger(DonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonHang().setVisible(true);
            }
        });
    }

    public JTable getTableDH() {
        return tableDH;
    }

    public void setTableHH(JTable tableDH) {
        this.tableDH = tableDH;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private Panel_Mau.Menu menu2;
    private javax.swing.JTable tableDH;
    // End of variables declaration//GEN-END:variables

}
