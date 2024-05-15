
package process_data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
public class ChiTietPhieuNhap {
     public Vector<model.NhaCungCapModel> DanhSachDoiTac(String idUser){
        Vector<model.NhaCungCapModel> vt=new Vector<model.NhaCungCapModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from NhaCungCap where maNCC = '"+idUser + "'";
         else
             sqlSelect="select * from NhaCungCap ";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.NhaCungCapModel nv=new model.NhaCungCapModel();
                 nv.setMaNCC(rs.getString("maNCC"));
                    nv.setTenNCC(rs.getString("tenNCC"));
                    nv.setDiaChiNCC(rs.getString("diaChiNCC"));
                    nv.setSdt(rs.getString("SDT"));
                    nv.setNhanVienLienHe(rs.getString("nhanVienLienHe"));
                    nv.setCreateddate(rs.getString("createddate"));
                    nv.setCreatedby(rs.getString("createdby"));
                    nv.setModifieddate(rs.getString("modifieddate"));
                    nv.setModifiedby(rs.getString("modifiedby"));
          
                
                vt.addElement(nv);
            }          
     }catch(SQLException ex) {
         return null;
     }
     return  vt;
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
     SQLSEVERDataAccess con = new SQLSEVERDataAccess();
     private String sqlSelect, sqlUpdate, sqlDelete, sqlInsert;
     
     public Vector<model.DichVuModel> DanhSachHangHoa(){
        Vector<model.DichVuModel> vt=new Vector<model.DichVuModel>();
     try{
             sqlSelect="select * from DichVu where donViTinh <> N'Lần' ";
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
      public Vector<model.ChiTietPhieuNhapModel> DanhSachChiTietPhieuNhap(String idUser){
        Vector<model.ChiTietPhieuNhapModel> vt=new Vector<model.ChiTietPhieuNhapModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from dbo.chiTietPN where maPN = '"+idUser + "'";
         else
             sqlSelect="select * from dbo.chitietPN ";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.ChiTietPhieuNhapModel nv=new model.ChiTietPhieuNhapModel();
                    nv.setMaPN(rs.getString("maPN"));
                    nv.setIdDichVu(rs.getString("DichVu"));
                   nv.setGiaNhap(rs.getInt("giaNhap"));
                   nv.setSoLuongNhap(rs.getInt("soLuongNhap"));
                   nv.setCreateddate(rs.getString("createddate"));
                nv.setCreatedby(rs.getString("createdby"));
                vt.addElement(nv);
            }          
     }catch(SQLException ex) {
         return null;
     }
     return  vt;
    } 

     public int thempr(String mapn, String mancc, int gia, int sl , String date, String by)
    {

       Object[] para = new Object[] {mapn, mancc, gia, sl, date, by};
       int k = con.Execute_StoredProcedures("InsertCTPN", para);
       return k;
    }
       public int suapr(String mapn, String mancc, int gia, int sl, String date, String by )
    {
       Object[] para = new Object[] {mapn, mancc, gia, sl,  date,  by};
       int k = con.Execute_StoredProcedures("UpdateCTPN", para);
       return k;
    }
  
      public  int Xoa(String madv, String madh)
      {
          sqlDelete="delete from ChiTietPhieuNhap where maPN='"+ madv +"' and idDichVu ='"+ madh + "'";          
          int k= con.ExecuteUpdateSQL( sqlDelete);
          return  k;
      }

}
