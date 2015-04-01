
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rbary
 */
public class ConvertisseurEvent implements ActionListener {
    private ConvertisseurController convertisseurController;
    
    public ConvertisseurEvent(ConvertisseurController convertisseurController){
        this.convertisseurController = convertisseurController;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Command recu : "+e.getActionCommand());
        if(e.getActionCommand().equals("piedsmetres")){
            convertisseurController.boutonConvertirPiedsMetres();
        }
        else if(e.getActionCommand().equals("metrespieds")){
            convertisseurController.boutonConvertirMetresPieds();
        }
    }
}
