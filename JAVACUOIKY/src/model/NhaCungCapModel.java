
package model;

public class NhaCungCapModel {
    private String maNCC, tenNCC, diaChiNCC, sdt, nhanVienLienHe, createddate, createdby, modifieddate, modifiedby;

    public NhaCungCapModel() {
    }

    public NhaCungCapModel(String maNCC, String tenNCC, String diaChiNCC, String sdt, String nhanVienLienHe, String createddate, String createdby, String modifieddate, String modifiedby) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChiNCC = diaChiNCC;
        this.sdt = sdt;
        this.nhanVienLienHe = nhanVienLienHe;
        this.createddate = createddate;
        this.createdby = createdby;
        this.modifieddate = modifieddate;
        this.modifiedby = modifiedby;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChiNCC() {
        return diaChiNCC;
    }

    public void setDiaChiNCC(String diaChiNCC) {
        this.diaChiNCC = diaChiNCC;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNhanVienLienHe() {
        return nhanVienLienHe;
    }

    public void setNhanVienLienHe(String nhanVienLienHe) {
        this.nhanVienLienHe = nhanVienLienHe;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(String modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

}