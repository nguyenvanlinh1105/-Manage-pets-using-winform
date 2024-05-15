
package model;

public class ChiTietPhieuNhapModel {
    private String maPN, idDichVu,  createdby, createddate;
    private int soLuongNhap, giaNhap;

    public ChiTietPhieuNhapModel() {
    }

    public ChiTietPhieuNhapModel(String maPN, String idDichVu,String createdby, String createddate, int soLuongNhap, int giaNhap) {
        this.maPN = maPN;
        this.idDichVu = idDichVu;
        this.createdby = createdby;
        this.createddate = createddate;
        this.soLuongNhap = soLuongNhap;
        this.giaNhap = giaNhap;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(String idDichVu) {
        this.idDichVu = idDichVu;
    }


    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

   
}
