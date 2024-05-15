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
public class ThuCung {
     Frame.ThuCung guiTC;
     Frame.Form_ThemTC form;
    process_data.ThuCung pdUS; 
    public ThuCung(Frame.ThuCung TC)
    {
       guiTC=TC;
       pdUS=new process_data.ThuCung();
       form = new Frame.Form_ThemTC(guiTC);
       LoadTC();
       LoadKH();
    }
    public ThuCung(Frame.ThuCung TC, Frame.Form_ThemTC nv)
    {
        guiTC = TC;
       form=nv;
       pdUS=new process_data.ThuCung();
       LoadTC();
       LoadKH();
    }
     public void LoadTC() {
         guiTC.getTableTC().setModel(new ModelDataThuCung(this.pdUS.DanhSachThuCung(null)));

    }   
     public void LoadKH()
    {
        Vector<model.UsersModel> DanhSachKhachHang = pdUS.DanhSachKhachHang();
    Vector<String> tenNVList = new Vector<>();

    for (model.UsersModel ban : DanhSachKhachHang) {
        tenNVList.addElement(ban.getTenuser());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);
    form.getjComboBox2().setModel(model);
    }
     
 public void Search(){
        String maHH=(guiTC.getjTextField2().getText());
       guiTC.getTableTC().setModel(new ModelDataThuCung(this.pdUS.DanhSachThuCung(maHH))); 
    }
    public int Insert()
    {
       int k=this.pdUS.thempr( form.getjTextField1().getText(),
              form.getjComboBox1().getSelectedItem().toString(),form.getjTextField4().getText(),Integer.parseInt(form.getjTextField7().getText()),
       form.getjTextField5().getText(),form.getjTextField3().getText());
       return k;
    }
    public int Update()
    {
       int k=this.pdUS.Sua(form.getjTextField2().getText(), form.getjTextField1().getText(),
              form.getjComboBox1().getSelectedItem().toString(),form.getjTextField4().getText(),Integer.parseInt(form.getjTextField7().getText()),
       form.getjTextField5().getText(),form.getjTextField3().getText());
       return k;
    }
    public int Delete()
    {
       int k=this.pdUS.Xoa(guiTC.getjTextField2().getText());
       return k;
    }
     public int InsertThe()
    {
       int k=this.pdUS.themthe(
              form.getjComboBox2().getSelectedItem().toString(),form.getjTextField5().getText());
       return k;
    }
    public int UpdateThe()
    {
       int k=this.pdUS.suathe(form.getjTextField2().getText(),
              form.getjComboBox2().getSelectedItem().toString(),form.getjTextField5().getText());
       return k;
    }
    public int DeleteThe()
    {
       int k=this.pdUS.XoaThe(form.getjTextField2().getText());
       return k;
    }
}

