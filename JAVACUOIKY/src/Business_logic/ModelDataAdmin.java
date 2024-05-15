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
public class ModelDataAdmin extends AbstractTableModel{
    
    Vector<model.UsersModel> data=new Vector<>();
    String colNames[] = {"Mã AD","UserName","Password", "Tên Admin", "Loại Admin","Giới tính", "Ngày sinh","Số điện thoại","email","Tình trạng","Thông tin"};
    Class<?> colClasses[] = {String.class,String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class,String.class};

    ModelDataAdmin(Vector<model.UsersModel> list) {
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
            return data.get(rowIndex).getIdUser();
        }
         if (columnIndex == 1) {
            return data.get(rowIndex).getUserName();
        }
          if (columnIndex == 2) {
            return data.get(rowIndex).getPassword();
        }
        if (columnIndex == 3) {
            return data.get(rowIndex).getTenuser();
        }
        if (columnIndex == 4) {
            return data.get(rowIndex).getLoaiuser();
        }
        if (columnIndex == 5) {
            return data.get(rowIndex).getGioiTinh();
        }
        if (columnIndex == 6) {
            return data.get(rowIndex).getNgaySinh();
        }
        if (columnIndex == 7) {
            return data.get(rowIndex).getSoDT();
        }
        if (columnIndex == 8) {
            return data.get(rowIndex).getEmail();
        }
        if (columnIndex == 9) {
            String tt = "";
            if (data.get(rowIndex).getStatus() == 0)
                tt = "Hủy hoạt động";
            else
                tt = "Đang hoạt động";
                    
            return tt;
        }
        if (columnIndex == 10) {
            return data.get(rowIndex).getThongTinUser();
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
