/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rbary
 */

public class ConvertisseurController {
    private ConvertisseurView convertisseurView;
    private ConvertisseurModel convertisseurModel;
    
    public ConvertisseurController(){
        convertisseurView = new ConvertisseurView(this);
        convertisseurModel = new ConvertisseurModel();
    }
    public void start(){
        convertisseurView.setVisible(true);
    }
    
    public void  boutonConvertirMetresPieds(){
        this.convertisseurView.setPiedsTextField(this.convertisseurModel.convertirMetresPieds(this.convertisseurView.getMetres()));
    }
    
    public void  boutonConvertirPiedsMetres(){
        this.convertisseurView.setMetresTextField(this.convertisseurModel.convertirPiedsMetres(this.convertisseurView.getPieds()));
    }
    
}
