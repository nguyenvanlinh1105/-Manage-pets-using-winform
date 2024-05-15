/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_logic;

/**
 *
 * @author MY HP
 */
public class Admin {
     Frame.Admin guiNV;
     Frame.Form_ThemAD form;
    process_data.Users pdUS; 
    public Admin(Frame.Admin NV)
    {
       guiNV=NV;
       pdUS=new process_data.Users();
       LoadNV();
    }
    public Admin(Frame.Admin NV, Frame.Form_ThemAD nv)
    {
        guiNV = NV;
       form=nv;
       pdUS=new process_data.Users();
       LoadNV();
    }
     public void LoadNV() {
         guiNV.getTableNV().setModel(new ModelDataAdmin(this.pdUS.DanhSachAdmin(null)));

    }   
 public void Search(){
        String maHH=(guiNV.getjTextField2().getText());
       guiNV.getTableNV().setModel(new ModelDataAdmin(this.pdUS.DanhSachAdmin(maHH))); 
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

