
package model;

public class PhieuNhapModel {
   private String maPN, maNCC, createddate, createdby;

    public PhieuNhapModel() {
    }

    public PhieuNhapModel(String maPN, String maNCC, String createddate, String createdby) {
        this.maPN = maPN;
        this.maNCC = maNCC;
        this.createddate = createddate;
        this.createdby = createdby;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
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

}