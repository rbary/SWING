/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MorpionVue;

import javax.swing.*;
import java.awt.*;
import sun.misc.Contended;

/**
 *
 * @author rbary
 */
public class MorpionVue extends JFrame {
    private Icon _iconCaseVide;
    private Icon _iconPlayer1;
    private Icon _iconPlayer2;
    
    private JLabel _labelQuiJoue;
    private JLabel _labelPlayer1;
    private JLabel _labelPlayer2;
    
    private JButton[] _buttons;
    private JButton _buttonQuit;
    private JButton _buttonReset;
    
    static final int GAME_SIZE = 9;
    static final int PLAYER1 = 1;
    static final int PLAYER2 = 2;
    
    public MorpionVue(MorpionController morpionController){
       super("morpionController");
       /* pannel */
       Container pan = this.getContentPane();
       
       /* Layout */
       GridLayout layout = new GridLayout(5,3);
       this.setLayout(layout);
       
       /* Icones */
       this._iconCaseVide = new ImageIcon("./src/MorpionVue/imgCaseVide.jpg");
       this._iconPlayer1 = new ImageIcon("./src/MorpionVue/imgPlayer1.jpg");
       this._iconPlayer2 = new ImageIcon("./src/MorpionVue/imgPlayer2.jpg");
       
       /* Labels */
       this._labelQuiJoue = new JLabel("Joueur ayant le tour",_iconPlayer1,JLabel.LEFT);
       this._labelPlayer1 = new JLabel("Joueur 1",_iconPlayer1, JLabel.LEFT);
       this._labelPlayer2 = new JLabel("Joueur 2", _iconPlayer2, JLabel.LEFT);
       
       /* Game buttons */
       this._buttons = new JButton[GAME_SIZE];
       for(int i=0; i<this._buttons.length ;i++){
           _buttons[i] = new JButton(_iconCaseVide);
       }
       
       this._buttonQuit = new JButton("Quitter");
       this._buttonReset = new JButton("Recommencer");
       
       /* adding graphic objects to the pan */
       pan.add(_labelPlayer1);
       pan.add(_labelPlayer2);
       pan.add(_labelQuiJoue);  
       for(int i=0;i<this._buttons.length ; i++){
           pan.add(_buttons[i]);
       }
       pan.add(_buttonReset);
       pan.add(_buttonQuit);
       this.pack();
       
       /* Adding action Listener */
       this._buttonQuit.addActionListener(new MorpionEvent(morpionController));
       this._buttonReset.addActionListener(new MorpionEvent(morpionController));
       
       _buttonQuit.setActionCommand("quit");
       _buttonReset.setActionCommand("reset");
       
       for(int i=0;i<this._buttons.length ;i++){
           String str_i = Integer.toString(i);
           this._buttons[i].addActionListener(new MorpionEvent(morpionController));
           _buttons[i].setActionCommand("click_game_buttons-"+str_i);
       }
    }
    
    public void afficher(){
        this.setVisible(true);
    }
    
    public void modifierImageJeu(int buttonPos, int typePlayer){
        if(typePlayer == PLAYER1){
            _buttons[buttonPos].setIcon(_iconPlayer1);
        }
        
        if(typePlayer == PLAYER2){
            _buttons[buttonPos].setIcon(_iconPlayer1);
        }
    }
    
    public void reinitialiserGrille(){
            JButton tempButton = new JButton(this._iconCaseVide);
            for(int i=0; i<this._buttons.length ;i++){
                _buttons[i] = new JButton(_iconCaseVide);
            }
    }
}
 
