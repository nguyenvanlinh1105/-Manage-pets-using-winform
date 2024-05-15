/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_logic;

/**
 *
 * @author MY HP
 */
public class BacSi {
     Frame.BacSi guiBS;
     Frame.Form_ThemBS form;
    process_data.Users pdUS; 
    public BacSi(Frame.BacSi BS)
    {
       guiBS=BS;
       pdUS=new process_data.Users();
       LoadBS();
    }
    public BacSi(Frame.BacSi BS, Frame.Form_ThemBS nv)
    {
        guiBS = BS;
       form=nv;
       pdUS=new process_data.Users();
       LoadBS();
    }
     public void LoadBS() {
         guiBS.getTableBS().setModel(new ModelDataBacSi(this.pdUS.DanhSachBacSi(null)));

    }   
 public void Search(){
        String maHH=(guiBS.getjTextField2().getText());
       guiBS.getTableBS().setModel(new ModelDataBacSi(this.pdUS.DanhSachBacSi(maHH))); 
    }
    public int Insert()
    {
       int k=this.pdUS.themprBS(form.getjTextField5().getText(), form.getjTextField6().getText(),
              form.getjTextField1().getText(),form.getjComboBox3().getSelectedItem().toString(),form.getjComboBox2().getSelectedItem().toString(),
       form.getjTextField3().getText(),form.getjTextField7().getText(), form.getjTextField9().getText(),form.getjTextArea1().getText(),
       Integer.parseInt(form.getjComboBox1().getSelectedItem().toString()));
       return k;
    }
    public int Update()
    {
       int k=this.pdUS.Sua(form.getjTextField2().getText(), 
              form.getjTextField1().getText(),form.getjComboBox3().getSelectedItem().toString(),form.getjComboBox2().getSelectedItem().toString(),
       form.getjTextField3().getText(),form.getjTextField7().getText(), form.getjTextField9().getText(),form.getjTextArea1().getText(),
       Integer.parseInt(form.getjComboBox1().getSelectedItem().toString()));
       return k;
    }
    public int Delete()
    {
       int k=this.pdUS.Xoa(guiBS.getjTextField2().getText());
       return k;
    }
}

