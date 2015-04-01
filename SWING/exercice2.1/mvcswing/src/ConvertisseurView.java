import javax.swing.*;
import java.awt.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rbary
 */
public class ConvertisseurView extends JFrame {
    private JTextField piedsTextField;
    private JTextField metresTextField;

    public ConvertisseurView(ConvertisseurController convertisseurController){
        super("convertisseurController");
        Container pan = this.getContentPane();
        GridLayout gridlayout = new GridLayout(2,3);
        pan.setLayout(gridlayout);
        
        JLabel piedsLabel = new JLabel("Hauteur en pieds");
        JLabel metresLabel = new JLabel("Hauteur en mètres");
        
        JButton piedsButton = new JButton("Calculer pieds-mètres");
        JButton metresButton = new JButton("Calculer mètres-pieds");
        
        piedsTextField = new JTextField("0.0");
        metresTextField = new JTextField("0.0");
        
        pan.add(piedsLabel);
        pan.add(piedsTextField);
        pan.add(piedsButton);
        
        pan.add(metresLabel);
        pan.add(metresTextField);
        pan.add(metresButton);
      
        piedsButton.addActionListener(new ConvertisseurEvent(convertisseurController));
        metresButton.addActionListener(new ConvertisseurEvent(convertisseurController));
        
        piedsButton.setActionCommand("piedsmetres");
        metresButton.setActionCommand("metrespieds");
    }
    
    public float getPieds(){
        return Float.parseFloat(piedsTextField.getText());
    }
    
    public float getMetres(){
        return Float.parseFloat(metresTextField.getText());
        
    }
    
    public void afficherPieds(float pieds){
        String piedsText = String.valueOf(pieds);
        piedsTextField.setText(piedsText);
    }
    
    public void afficherMetres(float metres){
        String metresText = String.valueOf(metres);
        metresTextField.setText(metresText);
    }
    
    
    public void setPiedsTextField(float pieds) {
        String piedsText = String.valueOf(pieds);
        this.piedsTextField.setText(piedsText);
    }

    public void setMetresTextField(float metres) {
        String metresText = String.valueOf(metres);
        this.metresTextField.setText(metresText);
    }
}
