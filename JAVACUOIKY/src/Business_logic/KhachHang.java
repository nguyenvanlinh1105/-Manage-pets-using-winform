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
public class KhachHang {
     Frame.KhachHang guiKH;
     Frame.Form_ThemKH form;
    process_data.Users pdUS; 
    public KhachHang(Frame.KhachHang KH)
    {
       guiKH=KH;
       pdUS=new process_data.Users();
       form = new Frame.Form_ThemKH(KH);
       LoadKH();
       LoadNV();
    }
    public KhachHang(Frame.KhachHang KH, Frame.Form_ThemKH nv)
    {
        guiKH = KH;
       form=nv;
       pdUS=new process_data.Users();
       LoadKH();
       LoadNV();
    }
     public void LoadKH() {
         guiKH.getTableKH().setModel(new ModelDataKhachHang(this.pdUS.DanhSachKhachHang(null)));

    }   
      public void LoadNV()
    {
        Vector<model.UsersModel> DanhSachNhanVien = pdUS.DanhSachNhanVien(null);
    Vector<String> tenNVList = new Vector<>();

    for (model.UsersModel ban : DanhSachNhanVien) {
        tenNVList.addElement( ban.getTenuser());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);
    form.getjComboBox2().setModel(model);
        

    }
 public void Search(){
        String maHH=(guiKH.getjTextField2().getText());
       guiKH.getTableKH().setModel(new ModelDataKhachHang(this.pdUS.DanhSachKhachHang(maHH))); 
    }
    public int Insert()
    {
       int k=this.pdUS.themprKH(form.getjTextField10().getText(), form.getjTextField11().getText(),
              form.getjTextField1().getText(),form.getjComboBox3().getSelectedItem().toString(),form.getjTextField8().getText(),
       form.getjTextField3().getText(),form.getjTextField7().getText(), form.getjTextField9().getText(),form.getjComboBox2().getSelectedItem().toString(),
      form.getjTextField6().getText(), Integer.parseInt(form.getjComboBox1().getSelectedItem().toString()));
       return k;
    }
    public int Update()
    {
       int k=this.pdUS.SuaKH(form.getjTextField2().getText(), 
              form.getjTextField1().getText(),form.getjComboBox3().getSelectedItem().toString(),form.getjTextField8().getText(),
       form.getjTextField3().getText(),form.getjTextField7().getText(), form.getjTextField9().getText(),form.getjComboBox2().getSelectedItem().toString(),
      form.getjTextField6().getText(), Integer.parseInt(form.getjComboBox1().getSelectedItem().toString()));
       return k;
    }
    public int Delete()
    {
       int k=this.pdUS.Xoa(guiKH.getjTextField2().getText());
       return k;
    }
}

