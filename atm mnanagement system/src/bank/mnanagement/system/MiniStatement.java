
package bank.mnanagement.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class MiniStatement extends JFrame implements ActionListener{

    
    MiniStatement(String pinNumber){
        
        setTitle("Mini Statement");
        
        
        setLayout(null);
        
        JLabel mini = new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);
        
        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
        add(bank);
        
        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        
        JLabel balance = new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);
        
        
        try{
            
            DatabaseConnection connection = new DatabaseConnection();
            ResultSet resultSet = connection.statement.executeQuery("Select * from login where pin = '"+pinNumber+"'");
            while(resultSet.next()){
                
                card.setText("Card Number: " + resultSet.getString("cardnumber").substring(0,4)+"XXXXXXXX"+ resultSet.getString("cardnumber").substring(12));
                              
            }
            
        }catch(Exception exception){
            
            System.out.println(exception);
            
        }
        
        try{
            
            int Balance = 0;
            
            DatabaseConnection connection = new DatabaseConnection();
            ResultSet resultSet = connection.statement.executeQuery("select * from bank where pin = '"+pinNumber+"'");
            while(resultSet.next())
            {
                mini.setText(mini.getText()+"<html>" + resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
                if(resultSet.getString("type").equals("Deposit")){

                            Balance+=Integer.parseInt(resultSet.getString("amount"));

                        }else{

                            Balance-=Integer.parseInt(resultSet.getString("amount"));

                        } 
            }
            balance.setText("Your current Account balance is Rs " + Balance);
            
        }catch(Exception e){
            
            System.out.println(e);
            
        }
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
    }
     @Override
     public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public static void main(String[] args){
        new MiniStatement("").setVisible(true);
    }

   
   
    
}