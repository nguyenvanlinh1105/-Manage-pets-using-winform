
package process_data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class The {
     SQLSEVERDataAccess con = new SQLSEVERDataAccess();
     private String sqlSelect, sqlUpdate, sqlDelete, sqlInsert;
     
      public Vector<model.TheModel> DanhSachThuCung1(String idUser){
        Vector<model.TheModel> vt=new Vector<model.TheModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from dbo.tableThe where idThuCung = '"+idUser + "'";
         else
             sqlSelect="select * from dbo.tableThe";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.TheModel nv=new model.TheModel();
                 nv.setIdThuCung(rs.getString("idThuCung"));
                 nv.setTenTC(rs.getString("tenThuCung"));
                nv.setIdKhachHang(rs.getString("idKhachHang"));
                nv.setTenKH(rs.getString("tenuser"));
                nv.setCreateddate(rs.getString("createddate"));
                vt.addElement(nv);
            }          
     }catch(SQLException ex) {
         return null;
     }
     return  vt;
    }
      public Vector<model.TheModel> DanhSachThuCung2(String idUser){
        Vector<model.TheModel> vt=new Vector<model.TheModel>();
     try{
         if(idUser != null)
          sqlSelect="select * from dbo.tableThe where idKhachHang = '"+idUser + "'";
         else
             sqlSelect="select * from dbo.tableThe";
        ResultSet rs = con.getResultSet(sqlSelect);
            while (rs.next()) {
                model.TheModel nv=new model.TheModel();
                 nv.setIdThuCung(rs.getString("idThuCung"));
                 nv.setTenTC(rs.getString("tenThuCung"));
                nv.setIdKhachHang(rs.getString("idKhachHang"));
                nv.setTenKH(rs.getString("tenuser"));
                nv.setCreateddate(rs.getString("createddate"));
                vt.addElement(nv);
            }          
     }catch(SQLException ex) {
         return null;
     }
     return  vt;
    }

      public int them(String idtc, String idkh, String createddate)
    {
        sqlInsert = "Insert into The values ('" + idtc + "','"+ idkh + "','"+createddate+"')";
       int k= con.ExecuteUpdateSQL( sqlInsert);
       return k;
    }
      public int Sua(String idtc, String idkh, String createddate )
    {
     sqlUpdate="Update The set "
             + "idKhachHang = '"+ idkh + "',createddate = '"+ createddate +"' where idThuCung = '"+idtc+"'" ;
       int k= con.ExecuteUpdateSQL( sqlUpdate);
       return  k;
    }
      
      public  int Xoa(String madv)
      {
          sqlDelete="delete from The where idThuCung='"+ madv +"'";          
          int k= con.ExecuteUpdateSQL( sqlDelete);
          return  k;
      }
     public String getidKH(String tendv) {
        String iddv = "";
        String sql = "SELECT idUser FROM Users WHERE tenuser = N'"+ tendv +"'";
        
           
        try (ResultSet resultSet = con.getResultSet(sql)) {
            if (resultSet.next()) {
                iddv = resultSet.getString("idUser");
            }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        
        return iddv;
    }
}
