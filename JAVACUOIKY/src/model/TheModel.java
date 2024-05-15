
package model;

public class TheModel {
    private String idThuCung, idKhachHang, thoiGianTra, createddate, modifieddate, createdby, modifiedby, tenTC, tenKH;

    public TheModel() {
    }

    public TheModel(String idThuCung, String idKhachHang, String thoiGianTra, String createddate, String modifieddate, String createdby, String modifiedby, String tentc, String tenkh) {
        this.idThuCung = idThuCung;
        this.idKhachHang = idKhachHang;
        this.thoiGianTra = thoiGianTra;
        this.createddate = createddate;
        this.modifieddate = modifieddate;
        this.createdby = createdby;
        this.modifiedby = modifiedby;
        this.tenTC = tentc;
        this.tenKH = tenkh;
    }

    public String getIdThuCung() {
        return idThuCung;
    }

    public void setIdThuCung(String idThuCung) {
        this.idThuCung = idThuCung;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getThoiGianTra() {
        return thoiGianTra;
    }

    public void setThoiGianTra(String thoiGianTra) {
        this.thoiGianTra = thoiGianTra;
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

    public String getTenTC() {
        return tenTC;
    }

    public void setTenTC(String tenTC) {
        this.tenTC = tenTC;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }
    
}
