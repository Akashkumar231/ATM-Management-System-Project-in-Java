package bank.mnanagement.system;

import java.sql.*;


public class DatabaseConnection {
    
//    There are four steps to create the Connection to the JDBC.
    
//    1) Create Connection 2) Connection Creation 
    
    Connection connection;
    Statement statement;
    
    DatabaseConnection(){
        
        try{
            
            connection = (Connection) DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");
            statement = connection.createStatement();
            
        }catch(Exception e){
            
            System.out.print(e);
            
        }
        
    }
    
}
