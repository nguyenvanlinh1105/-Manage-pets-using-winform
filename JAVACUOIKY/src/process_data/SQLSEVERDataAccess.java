/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process_data;

/**
 *
 * @author AD
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLSEVERDataAccess {

    Connection cnn;
    Statement stm;
    PreparedStatement ps;

    public SQLSEVERDataAccess() {
        try {
           String DriverClass, DriverURL;
            String UserName = "sa";
            String PassWord = "sa";
            String DataBaseName = "QUANLYTHUCUNG";
            String ServerName="LAPTOP-RFH2LVGG\\SQLSERVER1";
            
            
            String IntegratedSecurity = "IntegratedSecurity=false";
            DriverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
             DriverURL = "jdbc:sqlserver://"+ServerName+":1433;databaseName="+DataBaseName+";user="+UserName+" ;password="+PassWord+";encrypt=true;trustServerCertificate=true";
            Class.forName(DriverClass);
           // this.cnn=DriverManager.getConnection(DriverURL,UserName,PassWord);
           this.cnn = DriverManager.getConnection(DriverURL);
            this.stm = this.cnn.createStatement();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getResultSet(String SQL) {
        try {
            ResultSet rs;
            rs = this.stm.executeQuery(SQL);
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
   //SELECT * FROM TBLAOINHANVIEN WHERE  IDLOAINHANVIEN=?
        public ResultSet getResultSet(String SQL, Object[] param) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = cnn.prepareStatement(SQL);
            int i = 1;
            for (Object value : param) {
                ps.setObject(i, value);
                i++;
            }
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public int ExecuteUpdateSQL(String SQL) {
        try {
            int k = 0;
            k = this.stm.executeUpdate(SQL);
            return k;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int ExecuteUpdateSQL(String SQL, Object[] param) {
        try {
            int k = 0;
            PreparedStatement ps = this.cnn.prepareStatement(SQL);
            int i = 1;
            for (Object value : param) {
                ps.setObject(i, value);
                i++;
            }
            k = ps.executeUpdate();
            ps.close();
            return k;
        } catch (SQLException e) {
        }
        return 0;
    }

 public int Execute_StoredProcedures(String NameStoredProcedures, Object[] param) {
    try {
        int k = 0;
        StringBuilder sql = new StringBuilder("{call " + NameStoredProcedures + "(");
        for (int i = 0; i < param.length; i++) {
            sql.append("?");
            if (i < param.length - 1) {
                sql.append(",");
            }
        }
        sql.append(")}");

        CallableStatement ps = this.cnn.prepareCall(sql.toString());
        
        for (int i = 0; i < param.length; i++) {
            ps.setObject(i + 1, param[i]);
        }
        
        k = ps.executeUpdate();
        ps.close();
        return k;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}
 public ResultSet getResultSet_StoredProcedures(String NameStoredProcedures, Object[] param) {
        ResultSet rs = null;
        CallableStatement ps = null;

        try {
            ps = cnn.prepareCall("{call "+NameStoredProcedures+"}");
            if(param!=null)
            {
            int i = 1;
            for (Object value : param) {
                ps.setObject(i, value);
                i++;
            }
            }
            rs = ps.executeQuery();
            ps.close();
            return rs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
public Connection getConnection() {
    return cnn;
}
 
}


