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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
public class ChiTietDonHang extends javax.swing.JFrame{
    DefaultTableModel df;
    process_data.ChiTietDonHang pdUS;
  private Business_logic.ChiTietDonHang blUS;
        private Frame.DonHang formDH;
        private  Frame.Form_ThemCTDH form;

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
      public ChiTietDonHang() {
        initComponents();
        blUS = new Business_logic.ChiTietDonHang(this);
        form = new Frame.Form_ThemCTDH(this);
        this.blUS.LoadDH();
         tableCTDH.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tbleSPMouseClicked(evt);
                }
             });
           jTextField12.setEditable(false);
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime futureDate = currentDateTime.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedDateTime = currentDateTime.format(formatter);
        String formattedDateTime1 = futureDate.format(formatter);
        jTextField12.setText(formattedDateTime);  // Hiển thị ra text field
        jTextField12.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
          jTextField12.setEditable(false);
          
        jTextField8.setText(formattedDateTime1);  // Hiển thị ra text field
        jTextField8.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
        
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
        TableColumn column7 = tableCTDH.getColumnModel().getColumn(6);
        TableColumn column8 = tableCTDH.getColumnModel().getColumn(7);


        columnFirstName.setPreferredWidth(10);
        columnLastName.setPreferredWidth(10);
        columnAge.setPreferredWidth(160);
        column4.setPreferredWidth(160);
        column5.setPreferredWidth(180);
        column6.setPreferredWidth(30);
        column7.setPreferredWidth(60);
        column8.setPreferredWidth(160);

    }
    public ChiTietDonHang(String madh)
    {
         initComponents();
        blUS = new Business_logic.ChiTietDonHang(this);
        formDH = new Frame.DonHang();
          pdUS=new process_data.ChiTietDonHang();
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
        TableColumn column7 = tableCTDH.getColumnModel().getColumn(6);
        TableColumn column8 = tableCTDH.getColumnModel().getColumn(7);

        columnFirstName.setPreferredWidth(10);
        columnLastName.setPreferredWidth(10);
        columnAge.setPreferredWidth(160);
        column4.setPreferredWidth(160);
        column5.setPreferredWidth(180);
        column6.setPreferredWidth(30);
        column7.setPreferredWidth(60);
        column8.setPreferredWidth(160);
    }

private void tbleSPMouseClicked(MouseEvent evt) {
    form = new Frame.Form_ThemCTDH();
    
        if (this.tableCTDH.getSelectedRow() >= 0) {
                    // Lấy chỉ số hàng được chọn
                    int row = tableCTDH.getSelectedRow();
                    if (row >= 0) { // Kiểm tra xem có hàng nào được chọn không
                        // Lấy dữ liệu từ hàng được chọn và đổ vào textField
                      String Ma = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 0).toString();
                       form.getjTextField2().setText(Ma);
                       String madv = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 1).toString();
                       form.getjTextField5().setText(madv);
                       Object dv = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 2);
                       form.getjComboBoxDV().setSelectedItem(dv);
                       Object value = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 3);
                       form.getjComboBoxBS().setSelectedItem(value);
                       Object nv = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 4);
                       form.getjComboBoxNV().setSelectedItem(nv);
                       String sl = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 5).toString();
                       form.getjTextField4().setText(sl);
                       String date = this.tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 7).toString();
                      form.getjTextField8().setText(date);
                        Object byo = tableCTDH.getValueAt(this.tableCTDH.getSelectedRow(), 8);
                         form.getjComboBoxNV1().setSelectedItem(byo);

                      
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCTDH = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jComboBoxDV = new javax.swing.JComboBox<>();
        jComboBoxPTTT = new javax.swing.JComboBox<>();
        jComboBoxTT = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 642));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("HÓA ĐƠN");

        jButton3.setBackground(new java.awt.Color(255, 192, 237));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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

        jTextField1.setBackground(new java.awt.Color(255, 225, 240));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Nhập idDH");

        jTextField2.setBackground(new java.awt.Color(255, 225, 240));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("Nhập idDV");

        jButton7.setBackground(new java.awt.Color(255, 192, 237));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 0, 102));
        jButton7.setText("Cập nhật");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 102));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/information.png"))); // NOI18N
        jLabel14.setText("Mã đơn hàng");

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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/name.png"))); // NOI18N
        jLabel8.setText("Mã khách hàng");

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

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 102));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a-address-25.png"))); // NOI18N
        jLabel15.setText("Địa chỉ");

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

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/phone.png"))); // NOI18N
        jLabel16.setText("Điện thoại");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(102, 0, 102));
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField7MouseEntered(evt);
            }
        });
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/date.png"))); // NOI18N
        jLabel5.setText("Ngày giao hàng");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(102, 0, 102));
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField8MouseEntered(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 102));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2-dollar-25.png"))); // NOI18N
        jLabel12.setText("Phương thức thanh toán");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 102));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/date.png"))); // NOI18N
        jLabel13.setText("Ngày thanh toán");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(102, 0, 102));
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField9MouseEntered(evt);
            }
        });
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 102));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a-question-25.png"))); // NOI18N
        jLabel17.setText("Trạng thái");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 102));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/date.png"))); // NOI18N
        jLabel18.setText("Ngày tạo");

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(102, 0, 102));
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField12MouseEntered(evt);
            }
        });
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 102));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user-25.png"))); // NOI18N
        jLabel19.setText("Tạo bởi");

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

        jButton6.setBackground(new java.awt.Color(255, 192, 237));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setText("Tổng tiền:");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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

        jComboBoxPTTT.setBackground(new java.awt.Color(255, 139, 197));
        jComboBoxPTTT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBoxPTTT.setForeground(new java.awt.Color(102, 0, 102));
        jComboBoxPTTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thanh toán chuyển khoản", "Thanh toán tiền mặt", " " }));
        jComboBoxPTTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxPTTTMouseClicked(evt);
            }
        });
        jComboBoxPTTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPTTTActionPerformed(evt);
            }
        });

        jComboBoxTT.setBackground(new java.awt.Color(255, 139, 197));
        jComboBoxTT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBoxTT.setForeground(new java.awt.Color(102, 0, 102));
        jComboBoxTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã nhận hàng", "Chưa nhận hàng", "Đặt tư vấn", "Đã hủy", " " }));
        jComboBoxTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxTTMouseClicked(evt);
            }
        });
        jComboBoxTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel5))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7)
                            .addComponent(jTextField4)
                            .addComponent(jTextField6)
                            .addComponent(jTextField8)
                            .addComponent(jTextField5))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(171, 171, 171)
                                .addComponent(jComboBoxDV, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(436, 436, 436))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBoxPTTT, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxTT, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(436, 436, 436))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(548, 548, 548)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(340, 340, 340))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(517, 517, 517))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jComboBoxPTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel19)
                            .addComponent(jComboBoxDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
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
        
            form = new Frame.Form_ThemCTDH();
             String Ma = this.getjTextField5().getText();
               form.getjTextField2().setText(Ma);
        form.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        double totalPrice = 0.0;
        int rowCount = tableCTDH.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            Object priceObj = tableCTDH.getValueAt(i, 5);
            Object quantityObj = tableCTDH.getValueAt(i, 6);

            double price = Double.parseDouble(priceObj.toString());
            int quantity = Integer.parseInt(quantityObj.toString());
            totalPrice += price * quantity;
        }

        jTextField3.setText(String.valueOf(totalPrice));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseEntered

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseEntered
        jTextField4.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Đặt màu đường gạch dưới (border) là màu xanh khi click vào textField
                jTextField4.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
            }
        });

        // Thêm FocusListener để xử lý khi mất focus
        jTextField4.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                // Đặt lại màu đường gạch dưới (border) về mặc định khi mất focus
                jTextField4.setBorder(UIManager.getBorder("TextField.border"));
            }
        });          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4MouseEntered

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked

    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseEntered
        // TODO add your handling code here:
        jTextField6.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Đặt màu đường gạch dưới (border) là màu xanh khi click vào textField
                jTextField6.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
            }
        });

        // Thêm FocusListener để xử lý khi mất focus
        jTextField6.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                // Đặt lại màu đường gạch dưới (border) về mặc định khi mất focus
                jTextField6.setBorder(UIManager.getBorder("TextField.border"));
            }
        });
    }//GEN-LAST:event_jTextField6MouseEntered

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseEntered
        jTextField7.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Đặt màu đường gạch dưới (border) là màu xanh khi click vào textField
                jTextField7.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
            }
        });

        // Thêm FocusListener để xử lý khi mất focus
        jTextField7.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                // Đặt lại màu đường gạch dưới (border) về mặc định khi mất focus
                jTextField7.setBorder(UIManager.getBorder("TextField.border"));
            }
        });
    }//GEN-LAST:event_jTextField7MouseEntered

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked

    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseEntered
        jTextField8.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Đặt màu đường gạch dưới (border) là màu xanh khi click vào textField
                jTextField8.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
            }
        });

        // Thêm FocusListener để xử lý khi mất focus
        jTextField8.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                // Đặt lại màu đường gạch dưới (border) về mặc định khi mất focus
                jTextField8.setBorder(UIManager.getBorder("TextField.border"));
            }
        });          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8MouseEntered

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseEntered
        // TODO add your handling code here:
        jTextField12.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Đặt màu đường gạch dưới (border) là màu xanh khi click vào textField
                jTextField12.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
            }
        });

        // Thêm FocusListener để xử lý khi mất focus
        jTextField12.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                // Đặt lại màu đường gạch dưới (border) về mặc định khi mất focus
                jTextField12.setBorder(UIManager.getBorder("TextField.border"));
            }
        });
    }//GEN-LAST:event_jTextField12MouseEntered

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBoxDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxDVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDVMouseClicked

    private void jComboBoxDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDVActionPerformed

    private void jComboBoxPTTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxPTTTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPTTTMouseClicked

    private void jComboBoxPTTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPTTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPTTTActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseEntered
        jTextField9.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                // Đặt màu đường gạch dưới (border) là màu xanh khi click vào textField
                jTextField9.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.PINK));
            }
        });

        // Thêm FocusListener để xử lý khi mất focus
        jTextField9.addFocusListener(new FocusAdapter() {

            public void focusLost(FocusEvent e) {
                // Đặt lại màu đường gạch dưới (border) về mặc định khi mất focus
                jTextField9.setBorder(UIManager.getBorder("TextField.border"));
            }
        });          //
    }//GEN-LAST:event_jTextField9MouseEntered

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jComboBoxTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTTMouseClicked

    private void jComboBoxTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTTActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietDonHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietDonHang().setVisible(true);
            }
        });
    }

    public JTable getTableCTDH() {
        return tableCTDH;
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

    public JComboBox<String> getjComboBoxPTTT() {
        return jComboBoxPTTT;
    }

    public void setjComboBoxPTTT(JComboBox<String> jComboBoxPTTT) {
        this.jComboBoxPTTT = jComboBoxPTTT;
    }

    public JComboBox<String> getjComboBoxTT() {
        return jComboBoxTT;
    }

    public void setjComboBoxTT(JComboBox<String> jComboBoxTT) {
        this.jComboBoxTT = jComboBoxTT;
    }


 

    public JTextField getjTextField3() {
        return jTextField3;
    }

    public void setjTextField3(JTextField jTextField3) {
        this.jTextField3 = jTextField3;
    }

    public JTextField getjTextField4() {
        return jTextField4;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }

    public JTextField getjTextField5() {
        return jTextField5;
    }

    public void setjTextField5(JTextField jTextField5) {
        this.jTextField5 = jTextField5;
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

    public JTextField getjTextField8() {
        return jTextField8;
    }

    public void setjTextField8(JTextField jTextField8) {
        this.jTextField8 = jTextField8;
    }

    public JTextField getjTextField9() {
        return jTextField9;
    }

    public void setjTextField9(JTextField jTextField9) {
        this.jTextField9 = jTextField9;
    }

    public JTextField getjTextField12() {
        return jTextField12;
    }

    public void setjTextField12(JTextField jTextField12) {
        this.jTextField12 = jTextField12;
    }

    public JComboBox<String> getjComboBoxDV() {
        return jComboBoxDV;
    }

    public void setjComboBoxDV(JComboBox<String> jComboBoxDV) {
        this.jComboBoxDV = jComboBoxDV;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBoxDV;
    private javax.swing.JComboBox<String> jComboBoxPTTT;
    private javax.swing.JComboBox<String> jComboBoxTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tableCTDH;
    // End of variables declaration//GEN-END:variables

}
