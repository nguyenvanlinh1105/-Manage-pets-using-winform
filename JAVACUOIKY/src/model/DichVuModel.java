
package model;

public class DichVuModel {
    private String idDichVu, tenDichVu, thuongHieu, loaiSanPham, donViTinh,createddate, modifieddate, createdby, modifiedby;
    private int donGia, soLuongHienCon, soLuongDaBan;
    public DichVuModel() {
    }

    public DichVuModel(String idDichVu, String tenDichVu, int donGia, String thuongHieu, String loaiSanPham, int soLuongHienCon, int soLuongDaBan, String donViTinh, String createddate, String modifieddate, String createdby, String modifiedby) {
        this.idDichVu = idDichVu;
        this.tenDichVu = tenDichVu;
        this.donGia = donGia;
        this.thuongHieu = thuongHieu;
        this.loaiSanPham = loaiSanPham;
        this.soLuongHienCon = soLuongHienCon;
        this.soLuongDaBan = soLuongDaBan;
        this.donViTinh = donViTinh;
        this.createddate = createddate;
        this.modifieddate = modifieddate;
        this.createdby = createdby;
        this.modifiedby = modifiedby;
    }

    public String getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(String idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public int getSoLuongHienCon() {
        return soLuongHienCon;
    }

    public void setSoLuongHienCon(int soLuongHienCon) {
        this.soLuongHienCon = soLuongHienCon;
    }

    public int getSoLuongDaBan() {
        return soLuongDaBan;
    }

    public void setSoLuongDaBan(int soLuongDaBan) {
        this.soLuongDaBan = soLuongDaBan;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
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

    @Override
    public String toString() {
        return tenDichVu;
    }
    
}
