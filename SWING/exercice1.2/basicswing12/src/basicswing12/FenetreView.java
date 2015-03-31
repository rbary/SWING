/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicswing12;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author rbary
 */
public class FenetreView extends JFrame  {
    
    public FenetreView (String message){     
        super(message);
        /* creation d'un objet JLabel */
        JLabel labelMessage;
        labelMessage = new JLabel("Hello World");
        
        /* On cree un layout */
        
        
        /* creation d'un bouton */
        JButton button;
        button = new JButton("Cliquer ici");
        
        /* on cree un event */
        FenetreEvent event = new FenetreEvent();
        
        /* recuperation du container */
        Container pan = this.getContentPane();
        
        //pan.add(labelMessage); 
        pan.add(button);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button.addActionListener(event);
    }
}
