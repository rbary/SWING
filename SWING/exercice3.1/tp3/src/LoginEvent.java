/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rbary
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginEvent  implements ActionListener {
    private LoginController controller;

    public LoginEvent(LoginController controller) {
        this.controller = controller;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       this.controller.boutonValider();
    }
    
}
