
package process_data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DonHang {
     SQLSEVERDataAccess con = new SQLSEVERDataAccess();
     private String sqlSelect, sqlUpdate, sqlDelete, sqlInsert;
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
      public Vector<model.DonHangModel> DanhSachDonHang(String idUser){
        Vector<model.DonHangModel> vt=new Vector<model.DonHangModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from DonHang where maDonHang = '"+idUser + "'";
         else
             sqlSelect="select * from DonHang";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.DonHangModel nv=new model.DonHangModel();
                    nv.setMaDonHang(rs.getString("maDonHang"));
                    nv.setIdKhachHang(rs.getString("idKhachHang"));
                    nv.setSdtGiaoHang(rs.getString("sdtGiaoHang"));
                    nv.setDiaChiGiaoHang(rs.getString("diaChiGiaoHang"));
                    nv.setNgayGiaoHang(rs.getString("ngayGiaoHang"));
                    nv.setPhThucThanhToan(rs.getString("phThucThanhToan"));
                    nv.setNgayThanhToan(rs.getString("ngayThanhToan"));
                    nv.setTrangThai(rs.getString("trangThai"));
                    nv.setCreateddate(rs.getString("createddate"));
                    nv.setCreatedby(rs.getString("createdby"));                
                
                vt.addElement(nv);
            }          
     }catch(SQLException ex) {
         return null;
     }
     return  vt;
    } 
     public int thempr(String KH, String sdt, String diachi, String ngayGH, String pthuc, String ngayTT, String tt, String ngaytao, String taoboi)
    {
        String ttst = String.valueOf(tt);
       Object[] para = new Object[] {KH, sdt, diachi, ngayGH, pthuc, ngayTT, tt, ngaytao, taoboi};
       int k = con.Execute_StoredProcedures("InsertDonHangNg", para);
       return k;
    }
     
      public int Sua(String ma, String KH, String sdt, String diachi, String ngayGH, String pthuc, String ngayTT, String tt, String ngaytao, String taoboi )
    {
     sqlUpdate="Update DonHang set "
             + " idKhachHang=N'"+KH + "',sdtGiaoHang = '" + sdt + "',diaChiGiaoHang=N'"+diachi + "',ngayGiaoHang = '" + ngayGH 
             + "', phThucThanhToan = N'" + pthuc + "', ngayThanhToan = '" + ngayTT + "', trangThai = N'" + tt +"', createddate = '" + ngaytao
             + "', createdby =N'"+ taoboi + "' where maDonHang = '"+ ma +"'";
       int k= con.ExecuteUpdateSQL( sqlUpdate);
       return  k;
    }
      
      public  int Xoa(String madv)
      {
          sqlDelete="delete from DonHang where maDonHang='"+ madv +"'";          
          int k= con.ExecuteUpdateSQL( sqlDelete);
          return  k;
      }
}
