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
public class ModelDataDatHang extends AbstractTableModel {


    Vector<model.DichVuModel> data=new Vector<>();
    String colNames[] = {"Mã", "Tên", "Đơn giá"};
    Class<?> colClasses[] = {String.class, String.class, int.class};

    ModelDataDatHang(Vector<model.DichVuModel> list) {
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

