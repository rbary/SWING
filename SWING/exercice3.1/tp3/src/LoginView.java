/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author rbary
 */
public class LoginView extends JFrame {
    private JPasswordField passwordField;
    private JTextField loginField;
    private JButton validerButton;
    private JLabel loginLabel;
    private JLabel passwordLabel ; 
    
    public LoginView(LoginController loginController){
        super("loginController");
        passwordField = new JPasswordField();
        loginField = new JTextField("Votre login");
        validerButton = new JButton("Valider");
        loginLabel = new JLabel("Login");
        passwordLabel = new JLabel("Password");
        
        Container pan = this.getContentPane();
        GridLayout layout = new GridLayout(2,3);
        this.setLayout(layout);
       
        pan.add(loginLabel);
        pan.add(loginField);
        pan.add(passwordLabel);
        pan.add(passwordField);
        pan.add(validerButton);
        
        this.pack();
    }
    
    public void afficher(){
        this.setVisible(true);
    }
    
    protected void afficherMessage(String message){
        JOptionPane.showMessageDialog(this, message,"Information",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String getLogin(){
        return this.loginField.getText();
    }
    
    public String getPassword(){
        char [] passwd = this.passwordField.getPassword();
        String fromCharPassword = new String(passwd);
        return fromCharPassword; 
    }
    
    
}
