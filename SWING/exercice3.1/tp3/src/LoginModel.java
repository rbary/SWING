/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rbary
 */
import java.sql.*;

public class LoginModel {
    private Connection connection;
    public LoginModel(){
        connection = null;
        String userName = "rbary";  //DB username
        String password = "rolton"; //User password BD
        String URL = "mysql:http://scinfe102.univ-pau.fr/"; // Serveur de la BD
        String baseName = "rbary";
  
        try
        {
                Class.forName("com.mysql.jdbc.Driver");
                connection=DriverManager.getConnection(URL+baseName, userName, password);
                System.out.println("Je me connecte a la base de donnees: " + baseName);
        }

        catch (SQLException ex1)
        {
                System.out.println("J'ai detecté une erreur de type SQL: " + ex1.getMessage());
        }

        catch (ClassNotFoundException ex2)
        {
                System.out.println("J'ai detecté une erreur de type lang: " + ex2.getMessage());
        }	
}

public void fermerConnexion()
{
        try
        {
                if (connection != null)
                        this.connection.close();
        }
        catch (SQLException ex1)
        {
                System.out.println("J'ai detecté une erreur de type SQL: " + ex1.getMessage());
        }
}

public boolean estValide(String login, String mdp)
{
        boolean trouve=false;
        try
        {
                String requete = new String("SELECT login, pass FROM users WHERE login = '"+login+"' AND pass = '"+mdp+"'");
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(requete);

                if (rs.next ())
                {
                        trouve = true;
                }		

                rs.close();
                stmt.close();
        } 

        catch (SQLException ex3)
        {
                while (ex3 != null)
                {
                        System.out.println(ex3.getSQLState());
                        System.out.println(ex3.getMessage());
                        System.out.println(ex3.getErrorCode());
                        ex3=ex3.getNextException();			
                }	
        }     
        return trouve;
}
}
