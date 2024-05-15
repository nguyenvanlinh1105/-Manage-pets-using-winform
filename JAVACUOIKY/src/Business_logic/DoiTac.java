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
public class DoiTac {
     Frame.DoiTac guiDT;
     Frame.Form_ThemDT form;
    process_data.NCC pdUS; 
    public DoiTac(Frame.DoiTac DT)
    {
       guiDT=DT;
       form = new Frame.Form_ThemDT(guiDT);
       pdUS=new process_data.NCC();
       LoadDT();
       LoadNV();
    }
    public DoiTac(Frame.DoiTac DT, Frame.Form_ThemDT nv)
    {
        guiDT = DT;
       form=nv;
       pdUS=new process_data.NCC();
       LoadDT();
       LoadNV();
    }
     public void LoadDT() {
         guiDT.getTableDT().setModel(new ModelDataDoiTac(this.pdUS.DanhSachDoiTac(null)));

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

 public void Search(){
        String maHH=(guiDT.getjTextField2().getText());
       guiDT.getTableDT().setModel(new ModelDataDoiTac(this.pdUS.DanhSachDoiTac(maHH))); 
    }
    public int Insert()
    {
       int k=this.pdUS.thempr( 
              form.getjTextField1().getText(),form.getjTextField4().getText(),form.getjTextField7().getText(),
       form.getjTextField8().getText(), form.getjTextField9().getText(),form.getjComboBoxDV().getSelectedItem().toString());
       return k;
    }
    public int Update()
    {
       int k=this.pdUS.Sua(form.getjTextField2().getText(), 
              form.getjTextField1().getText(),form.getjTextField4().getText(),form.getjTextField7().getText(),
       form.getjTextField8().getText(),form.getjTextField9().getText(),form.getjComboBoxDV().getSelectedItem().toString());
       return k;
    }
    public int Delete()
    {
       int k=this.pdUS.Xoa(guiDT.getjTextField2().getText());
       return k;
    }
}

