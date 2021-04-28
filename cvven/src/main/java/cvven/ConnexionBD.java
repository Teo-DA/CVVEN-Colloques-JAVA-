/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvven;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author anouer
 */
public class ConnexionBD {

     Connection conn=null;

    public static Connection Connexion(){
       try {
         //Chargement du pilote JDBC pour MYSQL puis creation de la connection
           //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        // ou bien 
          Class.forName("com.mysql.jdbc.Driver");
     
           Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/CVVEN_java?serverTimezone=UTC",
                        "root", "darchy");
                if (conn!=null)
    System.out.println("Connexion à la base de données a été établie avec succès");
                 else 
                System.out.println("Problème de connexion à la base");

       return conn;

       }catch(Exception e) {
           System.out.println("--> SQLException : " + e) ;

       return null;
       }
    }



}
