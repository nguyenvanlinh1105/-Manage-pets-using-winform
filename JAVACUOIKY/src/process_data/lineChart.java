/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package process_data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Vector;
import raven.chart.data.category.DefaultCategoryDataset;
import raven.chart.data.pie.DefaultPieDataset;

/**
 *
 * @author MY HP
 */
public class lineChart {
     SQLSEVERDataAccess con = new SQLSEVERDataAccess();
     private String sqlSelect;
     
      public DefaultCategoryDataset<String, String> DataLineChart1(){
                DefaultCategoryDataset<String, String> categoryDataset = new DefaultCategoryDataset<>();

     try{
          sqlSelect="SELECT \n" +
            "  SUM(CASE WHEN dv.donViTinh = N'Lần' THEN ctdh.SoLuong * dv.DonGia ELSE 0 END) AS ThanhTienDV,\n" +
            "    SUM(CASE WHEN dv.donViTinh <> N'Lần' THEN ctdh.SoLuong * dv.DonGia ELSE 0 END) AS ThanhTienHH,\n" +
            "    SUM(ctdh.SoLuong * dv.DonGia) AS TongThanhTien,\n" +
            "	day(ctdh.createddate) as ngay\n" +
            "FROM \n" +
            "    DonHang dh\n" +
            "JOIN \n" +
            "    ChiTietDonHang ctdh ON dh.maDonHang = ctdh.maDonHang\n" +
            "JOIN \n" +
            "    DichVu dv ON ctdh.idDichVu = dv.idDichVu\n" +
            "GROUP BY \n" +
                "    day(ctdh.createddate)\n" +
            "ORDER BY \n" +
                "    ngay";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.DichVuModel nv=new model.DichVuModel();
                int ten = rs.getInt("ThanhTienDV");
                int tien = rs.getInt("ThanhTienHH");
                int tien1 = rs.getInt("TongThanhTien");
                String sl = rs.getString("ngay");
        categoryDataset.addValue(ten, "Doanh thu theo dịch vụ", sl);
        categoryDataset.addValue(tien, "Doanh theo sản phẩm", sl);
        categoryDataset.addValue(tien1, "Tổng doanh thu", sl);

    }                      
     }catch(SQLException ex) {
     }
     return categoryDataset;
    } 
   
}
