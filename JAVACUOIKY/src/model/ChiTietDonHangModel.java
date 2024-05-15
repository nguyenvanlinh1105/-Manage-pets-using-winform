
package model;

public class ChiTietDonHangModel {
    private String maDonHang, tenDichVu, tenBS, tenNV, createddate, createdby, idDichVu, idBacSi, idNhanVien;
    private int soLuong, donGia;
    public ChiTietDonHangModel() {
    }

    public ChiTietDonHangModel(String maDonHang, String tenDichVu, String tenBS, String tenNV, int soLuong, String createddate, String createdby, String idDichVu, String idBacSi, String idNhanVien,int donGia) {
        this.maDonHang = maDonHang;
        this.tenDichVu = tenDichVu;
        this.tenBS = tenBS;
        this.tenNV = tenNV;
        this.soLuong = soLuong;
        this.createddate = createddate;
        this.createdby = createdby;
        this.idDichVu = idDichVu;
        this.idBacSi = idBacSi;
         this.idNhanVien = idNhanVien;
         this.donGia = donGia;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getTenBS() {
        return tenBS;
    }

    public void setTenBS(String tenBS) {
        this.tenBS = tenBS;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(String idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getIdBacSi() {
        return idBacSi;
    }

    public void setIdBacSi(String idBacSi) {
        this.idBacSi = idBacSi;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int DonGia) {
        this.donGia = DonGia;
    }

    @Override
    public String toString() {
        return tenBS;
    }

    
}
