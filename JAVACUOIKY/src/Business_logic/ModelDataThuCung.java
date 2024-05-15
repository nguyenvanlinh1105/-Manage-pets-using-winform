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
public class ModelDataThuCung extends AbstractTableModel{
    
    Vector<model.ThucungModel> data=new Vector<>();
    String colNames[] = {"Mã Thú cưng","Tên thú cưng","Tên chủ nhân","Giới tính", "Loại thú cưng", "Tuổi","Ngày tạo","Tạo bởi"};
    Class<?> colClasses[] = {String.class,String.class,String.class, String.class, String.class, int.class, String.class, String.class};

    ModelDataThuCung(Vector<model.ThucungModel> list) {
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
            return data.get(rowIndex).getIdThuCung();
        }
         if (columnIndex == 1) {
            return data.get(rowIndex).getTenThuCung();
        }
          if (columnIndex == 2) {
            return data.get(rowIndex).getTenKH();
        }
          if (columnIndex == 3) {
            return data.get(rowIndex).getGioiTinh();
        }
        if (columnIndex == 4) {
            return data.get(rowIndex).getLoaiThuCung();
        }
        if (columnIndex == 5) {
            return data.get(rowIndex).getTuoi();
        }
        if (columnIndex == 6) {
            return data.get(rowIndex).getCreatedate();
        }
        if (columnIndex == 7) {
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
