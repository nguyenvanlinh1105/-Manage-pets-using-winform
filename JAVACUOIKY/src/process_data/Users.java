
package process_data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Users {
     SQLSEVERDataAccess con = new SQLSEVERDataAccess();
     private String sqlSelect, sqlUpdate, sqlDelete, sqlInsert;
     public boolean dangnhap(String username, String password)
     {
         try
         {
             String sql = "Select * from Users where userName = ? and password = ? ";
            PreparedStatement ps = con.getConnection().prepareStatement(sql) ;
            ps.setString(1, username);
             ps.setString(2,password);
             ResultSet rs = ps.executeQuery();
             if (rs.next()) {
                    // Nếu số lượng bản ghi là 1 (tức là tồn tại tài khoản với tên đăng nhập và mật khẩu đã nhập)
                    // thì trả về true, ngược lại trả về false
                    return true;
                }
         }
         catch (SQLException e) {
            e.printStackTrace();
         }
         return false;
     }
     
      public int doimk(String username, String password) throws SQLException
     {
         String sql1 = "select * from Users where userName ='" + username +"'";
         
        ResultSet rs = con.getResultSet(sql1);
             if (!rs.next()) {
                JOptionPane.showMessageDialog(new Frame.QuenMK(), "Không tìm thấy tên đăng nhập");
                return 0;
             }
             String sql = "update users set password ='" + password + "' where userName ='" + username + "'";
             int k= con.ExecuteUpdateSQL( sql);
       return  k;
     }
       public Vector<model.UsersModel> DanhSachAdmin(String idUser){
        Vector<model.UsersModel> vt=new Vector<model.UsersModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from Users where idUser = '"+idUser + "'";
         else
             sqlSelect="select * from Users where idUser like 'AD%' ";
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
      public Vector<model.UsersModel> DanhSachNhanVien(String idUser){
        Vector<model.UsersModel> vt=new Vector<model.UsersModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from Users where idUser = '"+idUser + "'";
         else
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
        public int Them(String ma, String ten, String loai, String gtinh, String date, String sdt, String email, String thtin, int tt )
    {
    sqlInsert = """
                INSERT INTO Users (idUser, tenUser, loaiuser, gioiTinh, ngaySinh, soDienThoai,email, thongTinUser, status)
                VALUES
                ('""" + ma + "', N'" + ten + "',N'" + loai + "', N'" + gtinh + "','" + date + "','" + sdt + "','" + email + "', N'" + thtin + "'," + tt + ")";

       int k= con.ExecuteUpdateSQL( sqlInsert);
       return  k;
    }
        
     public int thempr(String username, String pas, String ten, String loai, String gtinh, String date, String sdt, String email, String thtin, int tt)
    {
        String ttst = String.valueOf(tt);
       Object[] para = new Object[] {username, pas, ten, loai, gtinh, date, sdt, email,thtin, ttst};
       int k = con.Execute_StoredProcedures("InsertNhanVienNg", para);
       return k;
    }
     
      public int Sua(String ma, String ten, String loai, String gtinh, String date, String sdt, String email, String thtin, int tt )
    {
     sqlUpdate="Update Users set "
             + " tenUser=N'"+ten + "',Loaiuser = N'" + loai + "',gioiTinh=N'"+gtinh + "',ngaySinh = '" + date 
             + "', soDienThoai = '" + sdt + "', email = '" + email + "', thongTinUser = N'" + thtin +"', status = " + tt
             + "where idUser = '"+ ma +"'";
       int k= con.ExecuteUpdateSQL( sqlUpdate);
       return  k;
    }
      
      public  int Xoa(String madv)
      {
          sqlDelete="delete from Users where idUser='"+ madv +"'";          
          int k= con.ExecuteUpdateSQL( sqlDelete);
          return  k;
      }
    
      
     public Vector<model.UsersModel> DanhSachKhachHang(String idUser){
        Vector<model.UsersModel> vt=new Vector<model.UsersModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from Users where idUser = '"+idUser + "'";
         else
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
//       public int ThemKH(String ma, String ten, String loai, String gtinh, String date, String sdt, String email, String themboi, String ngaythem, int tt )
//    {
//    sqlInsert = """
//                INSERT INTO Users (idUser, tenUser, loaiuser, gioiTinh, ngaySinh, soDienThoai,email, createdby, createddate, status)
//                VALUES
//                ('""" + ma + "', N'" + ten + "',N'" + loai + "', N'" + gtinh + "','" + date + "','" + sdt + "','" + email + "', N'" + themboi + "','"+ ngaythem + "',"  + tt + ")";
//
//       int k= con.ExecuteUpdateSQL( sqlInsert);
//       return  k;
//    }
      public int themprKH(String username, String pas, String ten, String loai, String gtinh, String date, String sdt, String email,String themboi, String ngaythem, int tt)
    {
        String ttst = String.valueOf(tt);
       Object[] para = new Object[] {username, pas, ten, loai, gtinh, date, sdt, email,themboi, ngaythem, ttst};
       int k = con.Execute_StoredProcedures("InsertKhachHang", para);
       return k;
    }
      public int SuaKH(String ma, String ten, String loai, String gtinh, String date, String sdt, String email, String themboi, String ngaythem, int tt )
    {
     sqlUpdate="Update Users set "
             + " tenUser=N'"+ten + "',Loaiuser = N'" + loai + "',gioiTinh=N'"+gtinh + "',ngaySinh = '" + date 
             + "', soDienThoai = '" + sdt + "', email = '" + email + "', createdby = N'" + themboi +"',createddate = '" + ngaythem +"', status = " + tt
             + "where idUser = '"+ ma +"'";
       int k= con.ExecuteUpdateSQL( sqlUpdate);
       return  k;
    }
      public Vector<model.UsersModel> DanhSachBacSi(String idUser){
        Vector<model.UsersModel> vt=new Vector<model.UsersModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from Users where idUser = '"+idUser + "'";
         else
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
      public int themprBS(String username, String pas, String ten, String loai, String gtinh, String date, String sdt, String email, String thtin, int tt)
    {
        String ttst = String.valueOf(tt);
       Object[] para = new Object[] {username, pas, ten, loai, gtinh, date, sdt, email,thtin, ttst};
       int k = con.Execute_StoredProcedures("InsertBacSiNg", para);
       return k;
    }
     
}
