
package model;

public class DonHangModel {
    private String maDonHang, idKhachHang, sdtGiaoHang,diaChiGiaoHang, ngayGiaoHang, phThucThanhToan, ngayThanhToan, trangThai, createddate, modifieddate, createdby, modifiedby;

    public DonHangModel() {
    }

    public DonHangModel(String maDonHang, String idKhachHang, String sdtGiaoHang, String diaChiGiaoHang, String ngayGiaoHang, String phThucThanhToan, String ngayThanhToan, String trangThai, String createddate, String modifieddate, String createdby, String modifiedby) {
        this.maDonHang = maDonHang;
        this.idKhachHang = idKhachHang;
        this.sdtGiaoHang = sdtGiaoHang;
        this.diaChiGiaoHang = diaChiGiaoHang;
        this.ngayGiaoHang = ngayGiaoHang;
        this.phThucThanhToan = phThucThanhToan;
        this.ngayThanhToan = ngayThanhToan;
        this.trangThai = trangThai;
        this.createddate = createddate;
        this.modifieddate = modifieddate;
        this.createdby = createdby;
        this.modifiedby = modifiedby;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getSdtGiaoHang() {
        return sdtGiaoHang;
    }

    public void setSdtGiaoHang(String sdtGiaoHang) {
        this.sdtGiaoHang = sdtGiaoHang;
    }

    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }

    public String getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(String ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public String getPhThucThanhToan() {
        return phThucThanhToan;
    }

    public void setPhThucThanhToan(String phThucThanhToan) {
        this.phThucThanhToan = phThucThanhToan;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
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
        return maDonHang;
    }
    
}
