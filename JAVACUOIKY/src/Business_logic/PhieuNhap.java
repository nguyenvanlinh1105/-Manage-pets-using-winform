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
public class PhieuNhap {
     Frame.PhieuNhap guiDH;
     Frame.Form_ThemPN form;
    process_data.PhieuNhap pdUS; 
    public PhieuNhap(Frame.PhieuNhap DH)
    {
       guiDH=DH;
       pdUS=new process_data.PhieuNhap();
       form = new Frame.Form_ThemPN(DH);
       LoadDH();
       LoadNV();
       LoadNCC();
    }
    public PhieuNhap(Frame.PhieuNhap DH, Frame.Form_ThemPN nv)
    {
        guiDH = DH;
       form=nv;
       pdUS=new process_data.PhieuNhap();
       LoadDH();
       LoadNV();
       LoadNCC();
    }
      public void LoadNCC()
    {
        Vector<model.NhaCungCapModel> DanhSachDoiTac = pdUS.DanhSachDoiTac(null);
    Vector<String> tenNVList = new Vector<>();

    for (model.NhaCungCapModel ban : DanhSachDoiTac) {
        tenNVList.addElement(ban.getMaNCC()+ " - " + ban.getTenNCC());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);
    form.getjComboBoxNCC().setModel(model);


    }
     public void LoadNV()
    {
        Vector<model.UsersModel> DanhSachNhanVien = pdUS.DanhSachNhanVien();
    Vector<String> tenNVList = new Vector<>();

    for (model.UsersModel ban : DanhSachNhanVien) {
        tenNVList.addElement( ban.getTenuser());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);
    form.getjComboBoxDV().setModel(model);


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
     public void LoadDH() {
         guiDH.getTableDH().setModel(new ModelDataPhieuNhap(this.pdUS.DanhSachPhieuNhap(null)));

    }   
 public void Search(){
        String maHH=(guiDH.getjTextField2().getText());
       guiDH.getTableDH().setModel(new ModelDataPhieuNhap(this.pdUS.DanhSachPhieuNhap(maHH))); 
    }
    public int Insert()
    {
       int k=this.pdUS.thempr( splits(form.getjComboBoxNCC().getSelectedItem()),
              form.getjTextField3().getText(), form.getjComboBoxDV().getSelectedItem().toString());
       return k;
    }
    public int Update()
    {
       int k=this.pdUS.Sua(form.getjTextField5().getText(),splits(form.getjComboBoxNCC().getSelectedItem()),
              form.getjTextField3().getText(),form.getjComboBoxDV().getSelectedItem().toString());
       return k;
    }
    public int Delete()
    {
       int k=this.pdUS.Xoa(guiDH.getjTextField2().getText());
       return k;
    }
}

