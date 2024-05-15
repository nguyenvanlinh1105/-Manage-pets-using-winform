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
public class ModelDataDonHang extends AbstractTableModel{
    
    Vector<model.DonHangModel> data=new Vector<>();
    String colNames[] = {"Mã đơn hàng", "Id khách hàng","SDT giao hàng","Địa chỉ giao hàng","Ngày giao hàng", "Phương thức thanh toán","Ngày thanh toán","Trạng thái", "Ngày tạo", "Tạo bởi"};
    Class<?> colClasses[] = {String.class,String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};

    ModelDataDonHang(Vector<model.DonHangModel> list) {
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
            return data.get(rowIndex).getMaDonHang();
        }
         if (columnIndex == 1) {
            return data.get(rowIndex).getIdKhachHang();
        }
          if (columnIndex == 2) {
            return data.get(rowIndex).getSdtGiaoHang();
        }
        if (columnIndex == 3) {
            return data.get(rowIndex).getDiaChiGiaoHang();
        }
        if (columnIndex == 4) {
            return data.get(rowIndex).getNgayGiaoHang();
        }
        if (columnIndex == 5) {
            return data.get(rowIndex).getPhThucThanhToan();
        }
        if (columnIndex == 6) {
            return data.get(rowIndex).getNgayThanhToan();
        }
        if (columnIndex == 7) {
            return data.get(rowIndex).getTrangThai();
        }
        if (columnIndex == 8) {
            return data.get(rowIndex).getCreateddate();
        }
        if (columnIndex == 9) {
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
