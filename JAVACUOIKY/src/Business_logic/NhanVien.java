/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_logic;

/**
 *
 * @author MY HP
 */
public class NhanVien {
     Frame.NhanVien guiNV;
     Frame.Form_ThemNV form;
    process_data.Users pdUS; 
    public NhanVien(Frame.NhanVien NV)
    {
       guiNV=NV;
       pdUS=new process_data.Users();
       LoadNV();
    }
    public NhanVien(Frame.NhanVien NV, Frame.Form_ThemNV nv)
    {
        guiNV = NV;
       form=nv;
       pdUS=new process_data.Users();
       LoadNV();
    }
     public void LoadNV() {
         guiNV.getTableNV().setModel(new ModelDataNhanVien(this.pdUS.DanhSachNhanVien(null)));

    }   
 public void Search(){
        String maHH=(guiNV.getjTextField2().getText());
       guiNV.getTableNV().setModel(new ModelDataNhanVien(this.pdUS.DanhSachNhanVien(maHH))); 
    }
    public int Insert()
    {
       int k=this.pdUS.thempr(form.getjTextField5().getText(), form.getjTextField6().getText(),
              form.getjTextField1().getText(),form.getjComboBox2().getSelectedItem().toString(),form.getjComboBox3().getSelectedItem().toString(),
       form.getjTextField3().getText(),form.getjTextField7().getText(), form.getjTextField9().getText(),form.getjTextArea1().getText(),
       Integer.parseInt(form.getjComboBox1().getSelectedItem().toString()));
       return k;
    }
    public int Update()
    {
       int k=this.pdUS.Sua(form.getjTextField2().getText(), 
              form.getjTextField1().getText(),form.getjComboBox2().getSelectedItem().toString(),form.getjComboBox3().getSelectedItem().toString(),
       form.getjTextField3().getText(),form.getjTextField7().getText(), form.getjTextField9().getText(),form.getjTextArea1().getText(),
       Integer.parseInt(form.getjComboBox1().getSelectedItem().toString()));
       return k;
    }
    public int Delete()
    {
       int k=this.pdUS.Xoa(guiNV.getjTextField2().getText());
       return k;
    }
}

