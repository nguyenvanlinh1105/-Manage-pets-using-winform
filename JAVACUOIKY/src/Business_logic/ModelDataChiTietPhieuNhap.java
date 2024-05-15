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
public class ModelDataChiTietPhieuNhap extends AbstractTableModel{
    
    Vector<model.ChiTietPhieuNhapModel> data=new Vector<>();
    String colNames[] = {"Mã phiếu nhập", "Tên dịch vụ","Giá nhập","Số lượng nhập", "Ngày tạo", "Tạo bởi"};
    Class<?> colClasses[] = {String.class, String.class, int.class, int.class, String.class, String.class};

    ModelDataChiTietPhieuNhap(Vector<model.ChiTietPhieuNhapModel> list) {
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
            return data.get(rowIndex).getMaPN();
        } 
        if (columnIndex == 1) {
            return data.get(rowIndex).getIdDichVu();
        }
          if (columnIndex == 2) {
            return data.get(rowIndex).getGiaNhap();
        }
        if (columnIndex == 3) {
            return data.get(rowIndex).getSoLuongNhap();
        }
         if (columnIndex == 4) {
            return data.get(rowIndex).getCreateddate();
        }
          if (columnIndex == 5) {
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
