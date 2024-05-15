/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import Panel_Mau.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author MY HP
 */
public class ChiTietPhieuNhap extends javax.swing.JFrame{
    DefaultTableModel df;
    process_data.ChiTietPhieuNhap pdUS;
  private Business_logic.ChiTietPhieuNhap blUS;
        private Frame.PhieuNhap formDH;
        private  Frame.Form_ThemCTPN form;

   
    public ChiTietPhieuNhap(Frame.PhieuNhap dh) {
        initComponents();
        blUS = new Business_logic.ChiTietPhieuNhap(this);
        
        formDH = dh;
                form = new Frame.Form_ThemCTPN(this);

               pdUS=new process_data.ChiTietPhieuNhap();
        this.blUS.LoadDH();
         tableCTDH.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tbleSPMouseClicked(evt);
                }
             });
       
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
      public ChiTietPhieuNhap() {
        initComponents();
        blUS = new Business_logic.ChiTietPhieuNhap(this);
        form = new Frame.Form_ThemCTPN(this);
        this.blUS.LoadDH();
         tableCTDH.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tbleSPMouseClicked(evt);
                }
             });
    
    }

   
    
    public ChiTietPhieuNhap(String madh)
    {
         initComponents();
        blUS = new Business_logic.ChiTietPhieuNhap(this);
        formDH = new Frame.PhieuNhap();
          pdUS=new process_data.ChiTietPhieuNhap();
        String maHH = formDH.getjTextField2().getText();
        this.blUS.Search(madh);
         tableCTDH.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tbleSPMouseClicked(evt);
                }
             });
         JTableHeader header = tableCTDH.getTableHeader();
        header.setDefaultRenderer(new CustomTableHeaderRenderer());
        header.setPreferredSize(new java.awt.Dimension(header.getPreferredSize().width, 70));
        tableCTDH.getTableHeader().setDefaultRenderer(new MultiLineHeaderRenderer());
        TableColumn columnFirstName = tableCTDH.getColumnModel().getColumn(0);
        TableColumn columnLastName = tableCTDH.getColumnModel().getColumn(1);
        TableColumn columnAge = tableCTDH.getColumnModel().getColumn(2);
        TableColumn column4 = tableCTDH.getColumnModel().getColumn(3);
        TableColumn column5 = tableCTDH.getColumnModel().getColumn(4);
        TableColumn column6 = tableCTDH.getColumnModel().getColumn(5);


        columnFirstName.setPreferredWidth(10);
        columnLastName.setPreferredWidth(160);
        columnAge.setPreferredWidth(50);
        column4.setPreferredWidth(50);
        column5.setPreferredWidth(150);
        column6.setPreferredWidth(150);
    }
private void tbleSPMouseClicked(MouseEvent evt) {
    form = new Frame.Form_ThemCTPN();
        if (this.tableCTDH.getSelectedRow() >= 0) {
                    // Lấy chỉ số hàng được chọn
                    int row = tableCTDH.getSelectedRow();
                    if (row >= 0) { // Kiểm tra xem có hàng nào được chọn không
                        // Lấy dữ liệu từ hàng được chọn và đổ vào textField
                      String Ma = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 0).toString();
                       form.getjTextField2().setText(Ma);
                       String madv = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 1).toString();
                       form.getjComboBoxDV().setSelectedItem(madv);
                       String dv = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 2).toString();
                       form.getjTextField4().setText(dv);
                       String sl = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 3).toString();
                       form.getjTextField8().setText(sl);
                       String date = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 4).toString();
                      form.getjTextField9().setText(date);
                       String by = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 5).toString();
                      form.getjComboBoxNV().setSelectedItem(by);
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

        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxDV = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jComboBoxNCC = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCTDH = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxDV1 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jComboBoxNCC1 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 102));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/information.png"))); // NOI18N
        jLabel14.setText("Mã phiếu nhập");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 102));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/name.png"))); // NOI18N
        jLabel15.setText("Nhà cung cấp");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 102));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/date.png"))); // NOI18N
        jLabel11.setText("Ngày tạo");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 102));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user-25.png"))); // NOI18N
        jLabel19.setText("Tạo bởi");

        jComboBoxDV.setBackground(new java.awt.Color(255, 139, 197));
        jComboBoxDV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBoxDV.setForeground(new java.awt.Color(102, 0, 102));
        jComboBoxDV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxDVMouseClicked(evt);
            }
        });
        jComboBoxDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDVActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 0, 102));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField4MouseEntered(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jComboBoxNCC.setBackground(new java.awt.Color(255, 139, 197));
        jComboBoxNCC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBoxNCC.setForeground(new java.awt.Color(102, 0, 102));
        jComboBoxNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxNCCMouseClicked(evt);
            }
        });
        jComboBoxNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNCCActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(102, 0, 102));
        jTextField5.setText("--Tự động--");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField5MouseEntered(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("CHI TIẾT PHIẾU NHẬP");

        jButton4.setBackground(new java.awt.Color(255, 192, 237));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 102));
        jButton4.setText("Quay lại");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 192, 237));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 0, 102));
        jButton5.setText("Thêm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(255, 214, 234));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Nhập mã PN");

        jTextField2.setBackground(new java.awt.Color(255, 214, 234));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));

        tableCTDH.setBackground(new Color(255,255,255));
        tableCTDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tableCTDH.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCTDH.setGridColor(new java.awt.Color(255, 207, 231));
        tableCTDH.setRowHeight(30);
        tableCTDH.setSelectionBackground(Color.PINK);
        tableCTDH.setSelectionForeground(new java.awt.Color(102, 0, 102));
        tableCTDH.setShowGrid(true);
        tableCTDH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableCTDHKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableCTDH);

        jButton3.setBackground(new java.awt.Color(255, 192, 237));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jButton6.setBackground(new java.awt.Color(255, 192, 237));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setText("Tổng tiền:");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/information.png"))); // NOI18N
        jLabel16.setText("Mã phiếu nhập");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 102));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/name.png"))); // NOI18N
        jLabel17.setText("Nhà cung cấp");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 102));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/date.png"))); // NOI18N
        jLabel12.setText("Ngày tạo");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 102));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user-25.png"))); // NOI18N
        jLabel20.setText("Tạo bởi");

        jComboBoxDV1.setBackground(new java.awt.Color(255, 139, 197));
        jComboBoxDV1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBoxDV1.setForeground(new java.awt.Color(102, 0, 102));
        jComboBoxDV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxDV1MouseClicked(evt);
            }
        });
        jComboBoxDV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDV1ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(102, 0, 102));
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField6MouseEntered(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jComboBoxNCC1.setBackground(new java.awt.Color(255, 139, 197));
        jComboBoxNCC1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBoxNCC1.setForeground(new java.awt.Color(102, 0, 102));
        jComboBoxNCC1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNCC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxNCC1MouseClicked(evt);
            }
        });
        jComboBoxNCC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNCC1ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(102, 0, 102));
        jTextField7.setText("--Tự động--");
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField7MouseEntered(evt);
            }
        });
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7)
                    .addComponent(jComboBoxNCC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6)
                    .addComponent(jComboBoxDV1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel17))
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxNCC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jComboBoxDV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(this,"Bạn có chắc chắn xóa thông tin này không?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(result<1){
            int k=this.blUS.Delete();
            if(k>0)
            JOptionPane.showMessageDialog(this, "Thông tin đã được xóa");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableCTDHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableCTDHKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableCTDHKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
            form = new Frame.Form_ThemCTPN();
             String Ma = this.getjTextField7().getText();
               form.getjTextField2().setText(Ma);
        form.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        double totalPrice = 0.0;
        int rowCount = tableCTDH.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Object priceObj = tableCTDH.getValueAt(i, 2);
            Object quantityObj = tableCTDH.getValueAt(i, 3);

            double price = Double.parseDouble(priceObj.toString());
            int quantity = Integer.parseInt(quantityObj.toString());
            totalPrice += price * quantity;
        }

        jTextField3.setText(String.valueOf(totalPrice));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBoxDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxDVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDVMouseClicked

    private void jComboBoxDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDVActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked

    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseEntered
        jTextField3.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Đặt màu đường gạch dưới (border) là màu xanh khi click vào textField
                jTextField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
            }
        });

        // Thêm FocusListener để xử lý khi mất focus
        jTextField3.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                // Đặt lại màu đường gạch dưới (border) về mặc định khi mất focus
                jTextField3.setBorder(UIManager.getBorder("TextField.border"));
            }
        });          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4MouseEntered

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        jTextField3.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Đặt màu đường gạch dưới (border) là màu xanh khi click vào textField
                jTextField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
            }
        });

        // Thêm FocusListener để xử lý khi mất focus
        jTextField3.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                // Đặt lại màu đường gạch dưới (border) về mặc định khi mất focus
                jTextField3.setBorder(UIManager.getBorder("TextField.border"));
            }
        });       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBoxNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxNCCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNCCMouseClicked

    private void jComboBoxNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNCCActionPerformed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseEntered

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jComboBoxDV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxDV1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDV1MouseClicked

    private void jComboBoxDV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDV1ActionPerformed

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked

    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseEntered
        jTextField3.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Đặt màu đường gạch dưới (border) là màu xanh khi click vào textField
                jTextField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
            }
        });

        // Thêm FocusListener để xử lý khi mất focus
        jTextField3.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                // Đặt lại màu đường gạch dưới (border) về mặc định khi mất focus
                jTextField3.setBorder(UIManager.getBorder("TextField.border"));
            }
        });          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6MouseEntered

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        jTextField3.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Đặt màu đường gạch dưới (border) là màu xanh khi click vào textField
                jTextField3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
            }
        });

        // Thêm FocusListener để xử lý khi mất focus
        jTextField3.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                // Đặt lại màu đường gạch dưới (border) về mặc định khi mất focus
                jTextField3.setBorder(UIManager.getBorder("TextField.border"));
            }
        });       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jComboBoxNCC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxNCC1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNCC1MouseClicked

    private void jComboBoxNCC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNCC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNCC1ActionPerformed

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7MouseEntered

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ChiTietPhieuNhap().setVisible(true);
            }
        });
    }

    public JTable getTableCTDH() {
        return tableCTDH;
    }

    public JTextField getjTextField6() {
        return jTextField6;
    }

    public void setjTextField6(JTextField jTextField6) {
        this.jTextField6 = jTextField6;
    }

    public JTextField getjTextField7() {
        return jTextField7;
    }

    public void setjTextField7(JTextField jTextField7) {
        this.jTextField7 = jTextField7;
    }

    public void setTableCTDH(JTable tableDH) {
        this.tableCTDH = tableDH;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    public JComboBox<String> getjComboBoxDV1() {
        return jComboBoxDV1;
    }

    public void setjComboBoxDV1(JComboBox<String> jComboBoxDV1) {
        this.jComboBoxDV1 = jComboBoxDV1;
    }

    public JComboBox<String> getjComboBoxNCC1() {
        return jComboBoxNCC1;
    }

    public void setjComboBoxNCC1(JComboBox<String> jComboBoxNCC1) {
        this.jComboBoxNCC1 = jComboBoxNCC1;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBoxDV;
    private javax.swing.JComboBox<String> jComboBoxDV1;
    private javax.swing.JComboBox<String> jComboBoxNCC;
    private javax.swing.JComboBox<String> jComboBoxNCC1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tableCTDH;
    // End of variables declaration//GEN-END:variables

}
