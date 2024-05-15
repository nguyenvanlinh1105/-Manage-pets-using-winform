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
public class DonHang {
     Frame.DonHang guiDH;
     Frame.Form_ThemDH form;
    process_data.DonHang pdUS; 
    public DonHang(Frame.DonHang DH)
    {
       guiDH=DH;
       form = new Frame.Form_ThemDH(DH);
       pdUS=new process_data.DonHang();
       LoadDH();
       LoadNV();
    }
    public DonHang(Frame.DonHang DH, Frame.Form_ThemDH nv)
    {
        guiDH = DH;
       form=nv;
       pdUS=new process_data.DonHang();
       LoadDH();
       LoadNV();
    }
     public void LoadNV()
    {
        Vector<model.UsersModel> DanhSachNhanVien = pdUS.DanhSachNhanVien();
    Vector<String> tenNVList = new Vector<>();

    for (model.UsersModel ban : DanhSachNhanVien) {
        tenNVList.addElement(ban.getTenuser());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);
    form.getjComboBoxDV().setModel(model);
    }
     public void LoadDH() {
         guiDH.getTableDH().setModel(new ModelDataDonHang(this.pdUS.DanhSachDonHang(null)));

    }   
 public void Search(){
        String maHH=(guiDH.getjTextField2().getText());
       guiDH.getTableDH().setModel(new ModelDataDonHang(this.pdUS.DanhSachDonHang(maHH))); 
    }
    public int Insert()
    {
       int k=this.pdUS.thempr(form.getjTextField2().getText(), form.getjTextField7().getText(),
              form.getjTextField1().getText(),form.getjTextField3().getText(),form.getjComboBoxPTTT().getSelectedItem().toString(),
       form.getjTextField4().getText(),form.getjComboBoxTT().getSelectedItem().toString(), form.getjTextField9().getText(),form.getjComboBoxDV().getSelectedItem().toString());
       return k;
    }
    public int Update()
    {
       int k=this.pdUS.Sua(form.getjTextField5().getText(), 
              form.getjTextField2().getText(), form.getjTextField7().getText(),
              form.getjTextField1().getText(),form.getjTextField3().getText(),form.getjComboBoxPTTT().getSelectedItem().toString(),
       form.getjTextField4().getText(),form.getjComboBoxTT().getSelectedItem().toString(), form.getjTextField9().getText(),form.getjComboBoxDV().getSelectedItem().toString());
       return k;
    }
    public int Delete()
    {
       int k=this.pdUS.Xoa(guiDH.getjTextField2().getText());
       return k;
    }
}

