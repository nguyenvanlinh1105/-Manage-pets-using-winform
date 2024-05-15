/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package process_data;

import java.sql.ResultSet;
import java.sql.SQLException;
import raven.chart.data.pie.DefaultPieDataset;

/**
 *
 * @author MY HP
 */
public class Model_card {
      SQLSEVERDataAccess con = new SQLSEVERDataAccess();
     private String sqlSelect;
     
      public String DataPieChart1(){
          String sl= null;
     try{
          sqlSelect="select count(maDonHang) as soLuong\n" +
"from DonHang where trangThai = N'Đã thanh toán'";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                 sl = rs.getString("soLuong");
            }          
     }catch(SQLException ex) {
     }
     return sl;
    } 
    public String DataPieChart2(){
          String sl= null;
     try{
          sqlSelect="select count(maDonHang) as soLuong\n" +
"from DonHang where trangThai = N'Chưa thanh toán'";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                 sl = rs.getString("soLuong");
            }          
     }catch(SQLException ex) {
     }
     return sl;
    } 
    public String DataPieChart3(){
          String sl= null;
     try{
          sqlSelect="select count(maDonHang) as soLuong\n" +
"from DonHang where trangThai = N'Đã hủy'";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                 sl = rs.getString("soLuong");
            }          
     }catch(SQLException ex) {
     }
     return sl;
    } 
}