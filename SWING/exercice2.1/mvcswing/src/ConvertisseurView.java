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

    public ConvertisseurView(ConvertisseurController cc){
        super(cc);
        Container pan = this.getContentPane();
        GridLayout gridlayout = new GridLayout(2,3);
        pan.setLayout(gridlayout);
        JLabel piedsLabel = new JLabel("Hauteur en pieds");
        JLabel metresLabel = new JLabel("Hauteur en mètres");
    }
    
}
