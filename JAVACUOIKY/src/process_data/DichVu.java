/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package process_data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Vector;

/**
 *
 * @author MY HP
 */
public class DichVu {
   SQLSEVERDataAccess con = new SQLSEVERDataAccess();
    String sqlInsert;
    String sqlSelect;
    String sqlUpdate;
    String sqlDelete;
  public Vector<model.UsersModel> DanhSachNhanVien(){
        Vector<model.UsersModel> vt=new Vector<model.UsersModel>();
     try{
             sqlSelect="select * from Users where idUser like 'NV%' ";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.UsersModel nv=new model.UsersModel();
                 nv.setIdUser(rs.getString("idUser"));
                    nv.setUserName(rs.getString("userName"));
                    nv.setPassword(rs.getString("password"));
                    nv.setTenuser(rs.getString("tenUser"));
                    nv.setLoaiuser(rs.getString("loaiUser"));
                    nv.setGioiTinh(rs.getString("gioiTinh"));
                    nv.setNgaySinh(rs.getString("ngaySinh"));
                    nv.setSoDT(rs.getString("soDienThoai"));
                    nv.setEmail(rs.getString("email"));
                    nv.setThongTinUser(rs.getString("thongTinUser"));
                    nv.setCreateddate(rs.getString("createddate"));
                    nv.setModifieddate(rs.getString("modifieddate"));
                    nv.setCreatedby(rs.getString("createdby"));
                    nv.setModifiedby(rs.getString("modifiedby"));
                    nv.setStatus(rs.getInt("Status"));                
                
                vt.addElement(nv);
            }          
     }catch(SQLException ex) {
         return null;
     }
     return  vt;
    }
     public int thempr(String tendv,int donGia, String thuongHieu, String loaisp, int slcon, int slban, String dvTinh, String ngaytao, String taoboi)
    {
        String dgiast = String.valueOf(donGia);
        String slconst = String.valueOf(slcon);
        String slbanst = String.valueOf(slban);
       Object[] para = new Object[] {tendv, dgiast, thuongHieu, loaisp, slconst, slbanst, dvTinh, ngaytao, taoboi};
       int k = con.Execute_StoredProcedures("InsertDichVuNg", para);
       return k;
    }
      public int Sua(String madv, String tendv,int donGia, String thuongHieu, String loaisp, int slcon, int slban, String dvTinh, String ngaytao, String taoboi )
    {
     sqlUpdate="Update DichVu set "
             + " tenDichVu=N'"+tendv + "',donGia = " + donGia + ",thuongHieu=N'"+thuongHieu + "',loaiSanPham = N'" + loaisp 
             + "', soLuongHienCon = " + slcon + ", soLuongDaBan = " + slban + ", donViTinh = N'" + dvTinh +"', createddate = '" + ngaytao
             + "', createdby = N'" + taoboi + "'"
             + "where idDichVu = '"+ madv +"'";
       int k= con.ExecuteUpdateSQL( sqlUpdate);
       return  k;
    }
      
      public  int Xoa(String madv)
      {
          sqlDelete="delete from DichVu where idDichvu='"+ madv +"'";          
          int k= con.ExecuteUpdateSQL( sqlDelete);
          return  k;
      }
    
 public Vector<model.DichVuModel> DanhSachHH(String idDichVu){
        Vector<model.DichVuModel> vt=new Vector<model.DichVuModel>();
     try{
         if(idDichVu != null)
          sqlSelect="select * from DichVu where idDichVu ='"+idDichVu + "'";
         else
             sqlSelect="select * from DichVu";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.DichVuModel dv=new model.DichVuModel();
                dv.setIdDichVu(rs.getString("idDichVu"));
                dv.setTenDichVu(rs.getString("tenDichVu"));
                dv.setDonGia(rs.getInt("donGia"));
                dv.setThuongHieu(rs.getString("thuongHieu"));
                dv.setLoaiSanPham(rs.getString("loaiSanPham"));
                dv.setSoLuongHienCon(rs.getInt("soLuongHienCon"));
                dv.setSoLuongDaBan(rs.getInt("soLuongDaBan"));
                dv.setDonViTinh(rs.getString("donViTinh"));
                dv.setCreateddate(rs.getString("createddate"));
                dv.setModifieddate(rs.getString("modifieddate"));
                dv.setCreatedby(rs.getString("createdby"));
                dv.setModifiedby(rs.getString("modifiedby"));
                
                
                vt.addElement(dv);
            }          
     }catch(SQLException ex) {
         return null;
     }
     return  vt;
    }    

   
}
