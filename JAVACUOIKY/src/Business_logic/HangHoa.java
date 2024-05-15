
package Business_logic;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class HangHoa {
    Frame.HangHoa guiHH;
    Frame.Form_ThemDichVu formHH ;
    process_data.DichVu pdDV; 
    public HangHoa(Frame.HangHoa HH)
    {
       guiHH=HH;
       formHH = new Frame.Form_ThemDichVu(guiHH);
       pdDV=new process_data.DichVu();
       LoadHH();
       LoadNV();
    }
  
     public HangHoa(Frame.Form_ThemDichVu HH, Frame.HangHoa hh)
    {
        guiHH = hh;
       formHH=HH;
       pdDV=new process_data.DichVu();
       LoadHH();
       LoadNV();
    }
     public void LoadHH() {
       guiHH.getTableHH().setModel(new ModelDatahangHoa(this.pdDV.DanhSachHH(null)));
    }   
     public void LoadNV()
    {
        Vector<model.UsersModel> DanhSachNhanVien = pdDV.DanhSachNhanVien();
    Vector<String> tenNVList = new Vector<>();

    for (model.UsersModel ban : DanhSachNhanVien) {
        tenNVList.addElement( ban.getTenuser());
    }
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tenNVList);
    formHH.getjComboBoxDV().setModel(model);
        

    }
 
   public void Search(){
        String maHH=(guiHH.getjTextField2().getText());
       guiHH.getTableHH().setModel(new ModelDatahangHoa(this.pdDV.DanhSachHH(maHH))); 
    }
    public int Insert()
    {
       int k=this.pdDV.thempr(
              formHH.getjTextField2().getText(),Integer.parseInt(formHH.getjTextField4().getText()),formHH.getjTextField10().getText(),
       formHH.getjTextField3().getText(),Integer.parseInt( formHH.getjTextField8().getText()), Integer.parseInt(formHH.getjTextField7().getText()),formHH.getjTextField9().getText(),
       formHH.getjTextField5().getText(),formHH.getjComboBoxDV().getSelectedItem().toString());
       return k;
    }
    public int Update()
    {
       int k=this.pdDV.Sua(formHH.getjTextField1().getText(), 
              formHH.getjTextField2().getText(),Integer.parseInt(formHH.getjTextField4().getText()),formHH.getjTextField10().getText(),
       formHH.getjTextField3().getText(),Integer.parseInt( formHH.getjTextField8().getText()), Integer.parseInt(formHH.getjTextField7().getText()),formHH.getjTextField9().getText(),
       formHH.getjTextField5().getText(),formHH.getjComboBoxDV().getSelectedItem().toString());
       return k;
    }
    public int Delete()
    {
       int k=this.pdDV.Xoa(guiHH.getjTextField2().getText());
       return k;
    }
}
