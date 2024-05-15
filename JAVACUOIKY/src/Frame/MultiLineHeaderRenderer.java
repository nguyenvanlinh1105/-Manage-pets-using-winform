/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class MultiLineHeaderRenderer extends DefaultTableCellRenderer {
        public MultiLineHeaderRenderer() {
            setHorizontalAlignment(CENTER);
            setVerticalAlignment(TOP);
        }

       public java.awt.Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        setText("<html><div style='text-align: center;'>" + value.toString().replaceAll("\n", "<br>"));
        setBackground(new Color(255,207,231));
        setForeground(new Color(102,0,102));
        setFont(new Font("Segoe UI", Font.BOLD, 16));
        return this;
    }
    }