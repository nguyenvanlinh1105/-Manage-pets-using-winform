
package process_data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ThuCung {
     SQLSEVERDataAccess con = new SQLSEVERDataAccess();
     private String sqlSelect, sqlUpdate, sqlDelete, sqlInsert;
     
      public Vector<model.ThucungModel> DanhSachThuCung(String idUser){
        Vector<model.ThucungModel> vt=new Vector<model.ThucungModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from dbo.TC where idThuCung = '"+idUser + "'";
         else
             sqlSelect="select * from dbo.TC ";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.ThucungModel nv=new model.ThucungModel();
                 nv.setIdThuCung(rs.getString("idThuCung"));
                 nv.setTenThuCung(rs.getString("tenThuCung"));
                 nv.setTenKH(rs.getString("tenuser"));
                 nv.setGioiTinh(rs.getString("gioiTinh"));
                 nv.setLoaiThuCung(rs.getString("loaiThuCung"));
                 nv.setTuoi(rs.getInt("tuoi"));
                nv.setCreatedate(rs.getString("createddate"));
                nv.setCreatedby(rs.getString("createdby"));
                vt.addElement(nv);
            }          
     }catch(SQLException ex) {
         return null;
     }
     return  vt;
    }
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
      public int thempr(String ten, String gtinh, String loai, int tuoi, String createddate, String createdby )
    {
                String ttst = String.valueOf(tuoi);
       Object[] para = new Object[] {ten, gtinh,loai,ttst,createddate, createdby};
       int k = con.Execute_StoredProcedures("InsertThuCung", para);
       return k;
    }
      public int Sua(String ma, String ten, String gtinh, String loai, int tuoi, String createddate, String createdby  )
    {
     sqlUpdate="Update ThuCung set "
             + " tenThuCung = N'" + ten + "', gioiTinh = N'" + gtinh +"', loaiThuCung = N'"+ loai + "', tuoi ="+ tuoi + ", createddate = '"+ createddate +"', createdby =N'"+ createdby +"' where idThuCung = '"+ ma +"'";
       int k= con.ExecuteUpdateSQL( sqlUpdate);
       return  k;
    }
      
      public  int Xoa(String madv)
      {
          sqlDelete="delete from ThuCung where idThuCung='"+ madv +"'";          
          int k= con.ExecuteUpdateSQL( sqlDelete);
          return  k;
      }
    public int themthe(String idKH, String createddate )
    {
       Object[] para = new Object[] {idKH, createddate};
       int k = con.Execute_StoredProcedures("InsertThe", para);
       return k;
    }
      public int suathe(String idTC, String idKH, String createddate )
    {
       Object[] para = new Object[] {idTC, idKH, createddate};
       int k = con.Execute_StoredProcedures("UpdateThe", para);
       return k;
    }
      public int XoaThe(String idtc)
      {
           sqlDelete="delete from The where idThuCung='"+ idtc +"'";          
          int k= con.ExecuteUpdateSQL( sqlDelete);
          return  k;
      }
}
