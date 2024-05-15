/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_logic;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author MY HP
 */
public class ChiTietPhieuNhap {
     Frame.ChiTietPhieuNhap guiDH;
     Frame.PhieuNhap form;
     Frame.Form_ThemCTPN formDH;
    process_data.ChiTietPhieuNhap pdUS; 
    public ChiTietPhieuNhap(Frame.ChiTietPhieuNhap DH)
    {
       guiDH=DH;
       pdUS=new process_data.ChiTietPhieuNhap();
       formDH = new Frame.Form_ThemCTPN(guiDH);
       LoadDH();
       LoadDV();
       LoadNV();
       LoadNCC();
    }
    public ChiTietPhieuNhap(Frame.ChiTietPhieuNhap DH, Frame.PhieuNhap nv)
    {
        guiDH = DH;
       form=nv;
       pdUS=new process_data.ChiTietPhieuNhap();
       formDH = new Frame.Form_ThemCTPN(guiDH);
       LoadDH();
       LoadDV();
    LoadNV();
    LoadNCC();
    }
     public ChiTietPhieuNhap(Frame.ChiTietPhieuNhap DH, Frame.Form_ThemCTPN nv)
    {
        guiDH = DH;
       formDH=nv;
       pdUS=new process_data.ChiTietPhieuNhap();
       LoadDH();
        LoadDV();
LoadNV();
    }
     public void LoadDH() {
         guiDH.getTableCTDH().setModel(new ModelDataChiTietPhieuNhap(this.pdUS.DanhSachChiTietPhieuNhap(null)));

    }   
      public void LoadNCC()
    {
        Vector<model.NhaCungCapModel> DanhSachDoiTac = pdUS.DanhSachDoiTac(null);
    Vector<String> tenNVList = new Vector<>();

    for (model.NhaCungCapModel ban : DanhSachDoiTac) {
        tenNVList.addElement(ban.getMaNCC()+ " - " + ban.getTenNCC());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);
    guiDH.getjComboBoxNCC1().setModel(model);


    }
      public void LoadDV()
    {
        Vector<model.DichVuModel> DanhSachHangHoa = pdUS.DanhSachHangHoa();
    Vector<String> tenNVList = new Vector<>();

    for (model.DichVuModel ban : DanhSachHangHoa) {
        tenNVList.addElement(ban.getIdDichVu() + " - " + ban.getTenDichVu());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);

    formDH.getjComboBoxDV().setModel(model);
    }
      public void LoadNV()
    {
        Vector<model.UsersModel> DanhSachNhanVien = pdUS.DanhSachNhanVien();
    Vector<String> tenNVList = new Vector<>();

    for (model.UsersModel ban : DanhSachNhanVien) {
        tenNVList.addElement( ban.getTenuser());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);
    formDH.getjComboBoxNV().setModel(model);
   guiDH.getjComboBoxDV1().setModel(model);

    }
        public String splits(Object input){
         String inputs, parts[];
           if (input == null )
            return null;
           else {
                inputs = input.toString();
              if (!inputs.contains(" - ")) 
                  return null;
                else
                parts = inputs.split(" - ", 2);
        }

        // Tách chuỗi bằng dấu gạch ngang và chỉ lấy phần đầu tiên

        return parts[0];
    }
 public void Search(String maHH){
   
       guiDH.getTableCTDH().setModel(new ModelDataChiTietPhieuNhap(this.pdUS.DanhSachChiTietPhieuNhap(maHH))); 
    }
    public int Insert()
    {
//        formDH.getjComboBoxDV().getSelectedItem().toString()
       int k=this.pdUS.thempr(formDH.getjTextField2().getText(),splits(formDH.getjComboBoxDV().getSelectedItem().toString()),Integer.parseInt( formDH.getjTextField4().getText()),
     Integer.parseInt(formDH.getjTextField8().getText()), formDH.getjTextField9().getText(), formDH.getjComboBoxNV().getSelectedItem().toString() );
       return k;
    }
 public int Update()
    {
       int k=this.pdUS.suapr(formDH.getjTextField2().getText(),splits(formDH.getjComboBoxDV().getSelectedItem().toString()),Integer.parseInt( formDH.getjTextField4().getText()),
     Integer.parseInt(formDH.getjTextField8().getText()), formDH.getjTextField9().getText(), formDH.getjComboBoxNV().getSelectedItem().toString());
       return k;
    }
    public int Delete()
    {
       int k=this.pdUS.Xoa(guiDH.getjTextField1().getText(),guiDH.getjTextField2().getText());
       return k;
    }
    
  
}

