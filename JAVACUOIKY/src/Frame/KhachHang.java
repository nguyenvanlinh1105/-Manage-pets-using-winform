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
public class KhachHang extends javax.swing.JFrame{
    DefaultTableModel df;
    process_data.Users nv;
  private Business_logic.KhachHang blUS;
        private Frame.Form_ThemKH form;

   
    public KhachHang() {
        initComponents();
        blUS = new Business_logic.KhachHang(this);
        form = new Frame.Form_ThemKH(this);
        
        this.blUS.LoadKH();
         tableKH.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tbleSPMouseClicked(evt);
                }
             });
JTableHeader header = tableKH.getTableHeader();
        header.setDefaultRenderer(new CustomTableHeaderRenderer());
     header.setPreferredSize(new java.awt.Dimension(header.getPreferredSize().width, 74));
        tableKH.getTableHeader().setDefaultRenderer(new MultiLineHeaderRenderer());
        TableColumn columnFirstName = tableKH.getColumnModel().getColumn(0);
        TableColumn columnLastName = tableKH.getColumnModel().getColumn(1);
        TableColumn columnAge = tableKH.getColumnModel().getColumn(2);
        TableColumn column4 = tableKH.getColumnModel().getColumn(3);
        TableColumn column5 = tableKH.getColumnModel().getColumn(4);
        TableColumn column6 = tableKH.getColumnModel().getColumn(5);
        TableColumn column7 = tableKH.getColumnModel().getColumn(6);
 TableColumn column8 = tableKH.getColumnModel().getColumn(7);
        TableColumn column9 = tableKH.getColumnModel().getColumn(8);
        TableColumn column10 = tableKH.getColumnModel().getColumn(9);
        TableColumn column11 = tableKH.getColumnModel().getColumn(10);
        TableColumn column12= tableKH.getColumnModel().getColumn(11);
        
        
        columnFirstName.setPreferredWidth(40);
        columnLastName.setPreferredWidth(40);
        columnAge.setPreferredWidth(40);
        column4.setPreferredWidth(90);
        column5.setPreferredWidth(90);
        column6.setPreferredWidth(40);
        column7.setPreferredWidth(30);
         column8.setPreferredWidth(90);
        column9.setPreferredWidth(90);
        column10.setPreferredWidth(30);
        column11.setPreferredWidth(90);
        column12.setPreferredWidth(30);
    }
    
     class CustomTableHeaderRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            c.setBackground(new Color(255,207,231));
            c.setForeground(new Color(102,0,102));
            c.setFont(c.getFont().deriveFont(Font.BOLD, 16));
            return c;
        }
    }
private void tbleSPMouseClicked(MouseEvent evt) {
    form = new Frame.Form_ThemKH();
     jTextField2.setText("");
        if (this.tableKH.getSelectedRow() >= 0) {
                    // Lấy chỉ số hàng được chọn
                    int row = tableKH.getSelectedRow();
                    if (row >= 0) { // Kiểm tra xem có hàng nào được chọn không
                        // Lấy dữ liệu từ hàng được chọn và đổ vào textField
                      String Ma = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 0).toString();
                       form.getjTextField2().setText(Ma);
                       String name = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 1).toString();
                       form.getjTextField10().setText(name);
                       String pas = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 2).toString();
                       form.getjTextField11().setText(pas);
                       String ten = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 3).toString();
                       form.getjTextField1().setText(ten);
                       String loai = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 4).toString();
                       form.getjComboBox2().setSelectedItem(loai);
                       String gtinh = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 5).toString();
                       form.getjTextField8().setText(gtinh);
                       String date = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 6).toString();
                       form.getjTextField3().setText(date);
                       String sdt = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 7).toString();
                       form.getjTextField7().setText(sdt);
                       String email =this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 8).toString();
                       form.getjTextField9().setText(email);
                       String tt = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 9).toString();
                       if (tt == "Đang hoạt động")
                           form.getjComboBox1().setSelectedIndex(1);
                       else 
                           form.getjComboBox1().setSelectedIndex(0);
                       String thongtin = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 10).toString();
                       form.getjComboBox3().setSelectedItem(thongtin);  
                       String createddate = this.tableKH.getValueAt(this.tableKH.getSelectedRow(), 11).toString();
                       form.getjTextField6().setText(createddate);
                       form.setVisible(true);
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
        tableKH = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableKH.setBackground(new Color(255,255,255));
        tableKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableKH.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKH.setGridColor(new java.awt.Color(255, 207, 231));
        tableKH.setRowHeight(30);
        tableKH.setSelectionBackground(Color.PINK);
        tableKH.setSelectionForeground(new java.awt.Color(102, 0, 102));
        tableKH.setShowGrid(true);
        jScrollPane1.setViewportView(tableKH);

        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Tìm kiếm theo idDV");
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
                .addGap(14, 14, 14)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(this,"Bạn có chắc chắn xóa thông tin này không?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(result<1){
            int k=this.blUS.Delete();
            if(k>0)
            JOptionPane.showMessageDialog(this, "Thông tin đã được xóa");
            this.blUS.LoadKH();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.blUS.LoadKH();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        form = new Frame.Form_ThemKH();
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
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new KhachHang().setVisible(true);
            }
        });
    }

    public JTable getTableKH() {
        return tableKH;
    }

    public void setTableHH(JTable tableKH) {
        this.tableKH = tableKH;
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
    private javax.swing.JTable tableKH;
    // End of variables declaration//GEN-END:variables

}
