
package process_data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class NCC {
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

      public int thempr(String ten, String diachi, String sdt, String nv,String createddate,String createdby  )
    {
       Object[] para = new Object[] {ten, diachi, sdt, nv, createddate, createdby};
       int k = con.Execute_StoredProcedures("InsertNhaCungCap", para);
       return k;
    }
      public int Sua(String ma, String ten, String diachi, String sdt, String nv,String createddate,String createdby   )
    {
     sqlUpdate="Update NhaCungCap set "
             + "tenNCC = N'"+ ten + "', diaChiNCC = N'"+ diachi + "', SDT = '" + sdt+ "',nhanVienLienHe =N'"+ nv + "', createddate = '" + createddate + "', createdby = N'" + createdby 
             + "' where maNCC= '" + ma + "'";
       int k= con.ExecuteUpdateSQL( sqlUpdate);
       return  k;
    }
      
      public  int Xoa(String madv)
      {
          sqlDelete="delete from NhaCungCap where maNCC='"+ madv +"'";          
          int k= con.ExecuteUpdateSQL( sqlDelete);
          return  k;
      }
    
}
