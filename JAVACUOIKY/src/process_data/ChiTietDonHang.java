
package process_data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
public class ChiTietDonHang {
     SQLSEVERDataAccess con = new SQLSEVERDataAccess();
     private String sqlSelect, sqlUpdate, sqlDelete, sqlInsert;
       public Vector<model.UsersModel> DanhSachKhachHang(){
        Vector<model.UsersModel> vt=new Vector<model.UsersModel>();
     try{
             sqlSelect="select * from Users where idUser like 'KH%' ";
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
     public Vector<model.DichVuModel> DanhSachHangHoa(){
        Vector<model.DichVuModel> vt=new Vector<model.DichVuModel>();
     try{
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
      public Vector<model.ChiTietDonHangModel> DanhSachChiTietDonHang(String idUser){
        Vector<model.ChiTietDonHangModel> vt=new Vector<model.ChiTietDonHangModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from dbo.chitietDH where maDonHang = '"+idUser + "'";
         else
             sqlSelect="select * from dbo.chitietDH";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.ChiTietDonHangModel nv=new model.ChiTietDonHangModel();
                    nv.setMaDonHang(rs.getString("maDonHang"));
                    nv.setIdDichVu(rs.getString("idDichVu"));
                    nv.setTenDichVu(rs.getString("tenDichVu"));
                    nv.setTenBS(rs.getString("tenBS"));
                    nv.setTenNV(rs.getString("tenNV"));
                    nv.setSoLuong(rs.getInt("soLuong"));
                    nv.setDonGia(rs.getInt("donGia"));
                    nv.setCreateddate(rs.getString("createddate"));
                    nv.setCreatedby(rs.getString("createdby"));
                                    
                
                vt.addElement(nv);
            }          
     }catch(SQLException ex) {
         return null;
     }
     return  vt;
    } 

     public int thempr(String ma, String dv, String bs, String nv, int sl, String createddate, String createdby )
    {
       Object[] para = new Object[] {ma, dv,bs,nv,sl,createddate, createdby};
       int k = con.Execute_StoredProcedures("InsertCTDT", para);
       return k;
    }
      public int suapr(String ma, String dv, String bs, String nv, int sl, String createddate, String createdby )
    {
       Object[] para = new Object[] {ma, dv,bs,nv,sl,createddate, createdby};
       int k = con.Execute_StoredProcedures("UpdateCTDT", para);
       return k;
    }
     
      public  int Xoa(String madv, String madh)
      {
          sqlDelete="delete from ChiTietDonHang where maDonHang='"+ madv +"' and idDichVu ='"+ madh + "'";          
          int k= con.ExecuteUpdateSQL( sqlDelete);
          return  k;
      }
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
      public Vector<model.UsersModel> DanhSachBacSi(){
        Vector<model.UsersModel> vt=new Vector<model.UsersModel>();
     try{
             sqlSelect="select * from Users where idUser like 'BS%' ";
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
       
 public String getidMon(String tendv) {
        String iddv = "";
        String sql = "SELECT idDichVu FROM DichVu WHERE tenDichVu = N'"+ tendv +"'";
        
           
        try (ResultSet resultSet = con.getResultSet(sql)) {
            if (resultSet.next()) {
                iddv = resultSet.getString("idDichVu");
            }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        
        return iddv;
    }
}
