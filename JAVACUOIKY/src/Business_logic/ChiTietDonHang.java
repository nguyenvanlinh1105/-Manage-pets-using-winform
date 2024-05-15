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
public class ChiTietDonHang {
     Frame.ChiTietDonHang guiDH;
     Frame.DonHang form;
     Frame.Form_ThemCTDH formDH;
    process_data.ChiTietDonHang pdUS; 
    public ChiTietDonHang(Frame.ChiTietDonHang DH)
    {
       guiDH=DH;
       pdUS=new process_data.ChiTietDonHang();
       formDH = new Frame.Form_ThemCTDH(guiDH);
       LoadDH();
       LoadNV();
       LoadBS();
       LoadDV();
    }
    public ChiTietDonHang(Frame.ChiTietDonHang DH, Frame.DonHang nv)
    {
        guiDH = DH;
       form=nv;
       pdUS=new process_data.ChiTietDonHang();
       formDH = new Frame.Form_ThemCTDH(guiDH);
       LoadDH();
        LoadNV();
       LoadBS();
        LoadDV();

    }
     public ChiTietDonHang(Frame.ChiTietDonHang DH, Frame.Form_ThemCTDH nv)
    {
        guiDH = DH;
       formDH=nv;
       pdUS=new process_data.ChiTietDonHang();
       LoadDH();
        LoadNV();
       LoadBS();
       LoadDV();
    }
     public void LoadDH() {
         guiDH.getTableCTDH().setModel(new ModelDataChiTietDonHang(this.pdUS.DanhSachChiTietDonHang(null)));

    }   
     public void LoadNV()
    {
        Vector<model.UsersModel> DanhSachNhanVien = pdUS.DanhSachNhanVien();
    Vector<String> tenNVList = new Vector<>();

    for (model.UsersModel ban : DanhSachNhanVien) {
        tenNVList.addElement(ban.getIdUser() + " - " + ban.getTenuser());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);
    formDH.getjComboBoxNV().setModel(model);
        guiDH.getjComboBoxDV().setModel(model);
        formDH.getjComboBoxNV1().setModel(model);

    }
     public void LoadBS()
    {
        Vector<model.UsersModel> DanhSachBacSi = pdUS.DanhSachBacSi();
    Vector<String> tenNVList = new Vector<>();

    for (model.UsersModel ban : DanhSachBacSi) {
        tenNVList.addElement(ban.getIdUser() + " - " + ban.getTenuser());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);

    formDH.getjComboBoxBS().setModel(model);
    }
     
     public void LoadDV()
    {
        Vector<model.DichVuModel> DanhSachHangHoa = pdUS.DanhSachHangHoa();
    Vector<String> tenNVList = new Vector<>();

    for (model.DichVuModel ban : DanhSachHangHoa) {
        tenNVList.addElement(ban.getTenDichVu());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);

    formDH.getjComboBoxDV().setModel(model);
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
   
       guiDH.getTableCTDH().setModel(new ModelDataChiTietDonHang(this.pdUS.DanhSachChiTietDonHang(maHH))); 
    }
    public int Insert()
    {
       int k=this.pdUS.thempr(formDH.getjTextField2().getText(), formDH.getjTextField5().getText(),
              splits(formDH.getjComboBoxBS().getSelectedItem()),splits(formDH.getjComboBoxNV().getSelectedItem().toString()),Integer.parseInt(formDH.getjTextField4().getText()),
       formDH.getjTextField8().getText(),splits(formDH.getjComboBoxNV1().getSelectedItem()));
       return k;
    }
 public int Update()
    {
       int k=this.pdUS.suapr(formDH.getjTextField2().getText(), formDH.getjTextField5().getText(),
              splits(formDH.getjComboBoxBS().getSelectedItem()),splits(formDH.getjComboBoxNV().getSelectedItem().toString()),Integer.parseInt(formDH.getjTextField4().getText()),
       formDH.getjTextField8().getText(),splits(formDH.getjComboBoxNV1().getSelectedItem()));
       return k;
    }
    public int Delete()
    {
       int k=this.pdUS.Xoa(guiDH.getjTextField1().getText(),guiDH.getjTextField2().getText());
       return k;
    }
    
    public String iddv(String ten)
    {
        String k = this.pdUS.getidMon(ten);
        return k;
    }
}

