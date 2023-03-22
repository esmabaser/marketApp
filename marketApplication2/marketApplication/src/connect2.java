import java.sql.Connection;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


//products database
public class connect2 {
    private static Connection con=null;
    public static Connection connection(){
        try{           
          Class.forName("org.sqlite.JDBC");
                String url="jdbc:sqlite:C:\\Users\\lenovo\\OneDrive\\Belgeler\\NetBeans\\Apps\\marketApplication\\p4.db";
                con= DriverManager.getConnection(url);
                System.out.println("Bağlantı başarılı.");
                return con;
        }
        catch(Exception e ){
            System.out.println("Bağlantı başarısız.");
            return null;
        }               
    }
}
