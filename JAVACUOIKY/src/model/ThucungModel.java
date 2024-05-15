
package model;

public class ThucungModel {
    private String idThuCung, tenThuCung, gioiTinh, loaiThuCung, createdate, modifieddate, createdby, modifiedby,tenKH;
    private int tuoi;
    public ThucungModel() {
    }

    public ThucungModel(String idThuCung, String tenThuCung, String gioiTinh, String loaiThuCung, int tuoi, String createdate, String modifieddate, String createdby, String modifiedby,String tenKH) {
        this.idThuCung = idThuCung;
        this.tenThuCung = tenThuCung;
        this.gioiTinh = gioiTinh;
        this.loaiThuCung = loaiThuCung;
        this.tuoi = tuoi;
        this.createdate = createdate;
        this.modifieddate = modifieddate;
        this.createdby = createdby;
        this.modifiedby = modifiedby;
        this.tenKH = tenKH;
    }

    public String getIdThuCung() {
        return idThuCung;
    }

    public void setIdThuCung(String idThuCung) {
        this.idThuCung = idThuCung;
    }

    public String getTenThuCung() {
        return tenThuCung;
    }

    public void setTenThuCung(String tenThuCung) {
        this.tenThuCung = tenThuCung;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLoaiThuCung() {
        return loaiThuCung;
    }

    public void setLoaiThuCung(String loaiThuCung) {
        this.loaiThuCung = loaiThuCung;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
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

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return tenThuCung;
    }
    
}
