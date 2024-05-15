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
public class ModelDatahangHoa extends AbstractTableModel {


    Vector<model.DichVuModel> data=new Vector<>();
    String colNames[] = {"Mã dịch vụ", "Tên dịch vụ" , "Đơn giá","Thương hiệu", "Loại sản phẩm","Số lượng còn","Đã bán","Đơn vị tính","Ngày thêm", "Thêm bởi"};
    Class<?> colClasses[] = {String.class, String.class, int.class, String.class, String.class, int.class, int.class, String.class,String.class, String.class};

    ModelDatahangHoa(Vector<model.DichVuModel> list) {
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
            return data.get(rowIndex).getIdDichVu();
        }
        if (columnIndex == 1) {
            return data.get(rowIndex).getTenDichVu();
        }
        if (columnIndex == 2) {
            return data.get(rowIndex).getDonGia();
        }
        if (columnIndex == 3) {
            return data.get(rowIndex).getThuongHieu();
        }
        if (columnIndex == 4) {
            return data.get(rowIndex).getLoaiSanPham();
        }
        if (columnIndex == 5) {
            return data.get(rowIndex).getSoLuongHienCon();
        }
        if (columnIndex == 6) {
            return data.get(rowIndex).getSoLuongDaBan();
        }
        if (columnIndex == 7) {
            return data.get(rowIndex).getDonViTinh();
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

