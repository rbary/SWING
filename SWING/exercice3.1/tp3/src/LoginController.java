/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rbary
 */
public class LoginController {
    private LoginView _loginView;
    private LoginModel _loginModel;
    
    public LoginController(){
        this._loginView = new LoginView(this);
        this._loginModel = new LoginModel();        
    }
    
    public void start(){
        this._loginView.afficher();
    }
    
    public void boutonValider(){
        String login = _loginView.getLogin();
        String password = _loginView.getPassword();
        
        if(this._loginModel.estValide(login,password)){
            System.out.println("Identifiants corrects");
        }else{
            System.out.println("Identifiants incorrects"); 
        }
    }
}
