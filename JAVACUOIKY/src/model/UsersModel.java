
package model;

public class UsersModel {
    
    private String idUser;
    private String userName;
    private String password;
    private String tenuser;
    private String loaiuser;
    private String gioiTinh;
    private String ngaySinh;
    private String soDT;
    private String email;
    private String thongTinUser;
    private String createddate;
    private String modifieddate;
    private String createdby;
    private String modifiedby;
    private int status;

    public UsersModel() {
    }

    public UsersModel(String idUser, String userName, String password, String tenuser, String loaiuser, String gioiTinh, String ngaySinh, String soDT,String email, String thongTinUser, String createddate, String modifieddate, String createdby, String modifiedby, int status) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.tenuser = tenuser;
        this.loaiuser = loaiuser;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDT = soDT;
        this.email = email;
        this.thongTinUser = thongTinUser;
        this.createddate = createddate;
        this.modifieddate = modifieddate;
        this.createdby = createdby;
        this.modifiedby = modifiedby;
        this.status = status;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTenuser() {
        return tenuser;
    }

    public void setTenuser(String tenuser) {
        this.tenuser = tenuser;
    }

    public String getLoaiuser() {
        return loaiuser;
    }

    public void setLoaiuser(String loaiuser) {
        this.loaiuser = loaiuser;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getThongTinUser() {
        return thongTinUser;
    }

    public void setThongTinUser(String thongTinUser) {
        this.thongTinUser = thongTinUser;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(String modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return idUser + " - "  + tenuser;
    }
    
    

}
