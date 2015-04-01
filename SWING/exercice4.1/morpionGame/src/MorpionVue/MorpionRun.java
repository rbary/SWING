package MorpionVue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rbary
 */
public class MorpionRun {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        System.err.println("Hello ! Welcome to Morpion Game");
        MorpionVue maVue = new MorpionVue();
        maVue.afficher();
    }
}
