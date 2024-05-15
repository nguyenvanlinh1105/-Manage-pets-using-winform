/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_logic;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MY HP
 */
public class ModelDataDoiTac extends AbstractTableModel{
    
    Vector<model.NhaCungCapModel> data=new Vector<>();
    String colNames[] = {"Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ ","Số điện thoại", "Nhân viên liên hệ", "Ngày tạo", "Tạo bởi"};
    Class<?> colClasses[] = {String.class, String.class, String.class, String.class, String.class, String.class, String.class};

    ModelDataDoiTac(Vector<model.NhaCungCapModel> list) {
        data=list;        
    }

    public int getRowCount() {

        return data.size();
    }

    public int getColumnCount() {
        return colNames.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return data.get(rowIndex).getMaNCC();
        }
        if (columnIndex == 1) {
            return data.get(rowIndex).getTenNCC();
        }
        if (columnIndex == 2) {
            return data.get(rowIndex).getDiaChiNCC();
        }
        if (columnIndex == 3) {
            return data.get(rowIndex).getSdt();
        }
        if (columnIndex == 4) {
            return data.get(rowIndex).getNhanVienLienHe();
        }
        if (columnIndex == 5) {
            return data.get(rowIndex).getCreateddate();
        }
        if (columnIndex == 6) {
            return data.get(rowIndex).getCreatedby();
        }
        return null;
    }

    public String getColumnName(int columnIndex) {
        return colNames[columnIndex];
    }

    public Class<?> getColumnClass(int columnIndex) {
        return colClasses[columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
}
