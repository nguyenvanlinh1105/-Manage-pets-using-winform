/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package process_data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import raven.chart.data.pie.DefaultPieDataset;

/**
 *
 * @author MY HP
 */
public class pieChart {
     SQLSEVERDataAccess con = new SQLSEVERDataAccess();
     private String sqlSelect;
     
      public DefaultPieDataset<String> DataPieChart1(){
            DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
     try{
          sqlSelect="select Top 5 tenDichVu, soLuongDaBan\n" +
"from DichVu\n" +
"order by soLuongDaBan desc;";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.DichVuModel nv=new model.DichVuModel();
                String ten = rs.getString("tenDichVu");
                int sl = rs.getInt("soLuongDaBan");
                dataset.addValue(ten, sl);
            }          
     }catch(SQLException ex) {
     }
     return dataset;
    } 
   
      
     public DefaultPieDataset<String> DataPieChart2(){
            DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
     try{
          sqlSelect="select Top 5 tenDichVu, sum(soLuong) as soLuong\n" +
"from ChiTietDonHang c, DichVu d\n" +
"where c.idDichVu = d.idDichVu\n" +
"group by c.idDichVu, tenDichVu\n" +
"order by soLuong desc";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.DichVuModel nv=new model.DichVuModel();
                String ten = rs.getString("tenDichVu");
                int sl = rs.getInt("soLuong");
                dataset.addValue(ten, sl);
            }          
     }catch(SQLException ex) {
     }
     return dataset;
    } 
     public DefaultPieDataset<String> DataPieChart3(){
            DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
     try{
          sqlSelect="select Top 5 tenDichVu, sum(soLuongNhap) as soLuong\n" +
"from ChiTietPhieuNhap c, DichVu d\n" +
"where c.idDichVu = d.idDichVu\n" +
"group by c.idDichVu, tenDichVu\n" +
"order by soLuong desc";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.DichVuModel nv=new model.DichVuModel();
                String ten = rs.getString("tenDichVu");
                int sl = rs.getInt("soLuong");
                dataset.addValue(ten, sl);
            }          
     }catch(SQLException ex) {
     }
     return dataset;
    } 
}
