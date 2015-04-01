/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MorpionVue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rbary
 */
public class MorpionEvent implements ActionListener {
    private MorpionController _morpionController;
    
    public MorpionEvent(MorpionController morpionController){
        this._morpionController = morpionController;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("quit")){
            morpionController.buttonQuit();
        }
        
        if(e.getActionCommand().equals("reset")){
            morpionController.buttonReset();
        }
        
        if(e.getActionCommand().contains("click_game_buttons"){
            //Todo faire un split pour chopper la position du bouton
            String auxString = e.getActionCommand().s
        }
    }
}
