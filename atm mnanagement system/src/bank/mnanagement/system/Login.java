
package bank.mnanagement.system;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
/**
 *
 * @author akash
 */
public class Login extends JFrame implements ActionListener{
    
    // Defining the buttons globally so we can access the buttons variable throughout the class anywhere.
    private final JButton login;
    private final JButton clear;
    private final JButton signup;
    
    // Defining TextField Globally.
    private final JTextField cardTextField;
    
    // Defining the  JPasswordField Globally for the Pin
    private final JPasswordField pinTextField;
    Login(){
        
        // Setting the title of the frame
        setTitle("AUTOMATED TELLER MACHINE");
        
        // Swing uses some default layout , that's why our icon will be at the centre position in the frame. We have set the Default layout to null.
        setLayout(null);
        
        
        // Image that is used to be put on the frame
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        
        // To scale theimage Icon.
        Image image1 = imageIcon1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        
        // We can not directly pass the Image class object to the JLabel. So Convert the image1 to ImageIcon
        ImageIcon imageIcon2 = new ImageIcon(image1);
        
        //
        JLabel label1 =new JLabel(imageIcon2);
        add(label1);
        
        // We used JLabel mainly to write the context on the label.
        JLabel greetPrompt = new JLabel("Welcome to ATM");
        
        // This step is used to set the fontStyle , Size
        greetPrompt.setFont(new Font("Osward",Font.BOLD,38));
        
        // The Label Text Will not be visible on the Frame. We have to set the Boundaries for the text.
        greetPrompt.setBounds(200,40,400,40);
        
        //this will add the textBox1 to the Frame.
        add(greetPrompt);
        
        /*
-------------Now We have to show the Card Number and area to Enter the Card Number.--------------------------------------------------*/
     
        JLabel cardNumber = new JLabel("Card No:");
     
        cardNumber.setFont(new Font("Raleway",Font.BOLD,28));
        
        cardNumber.setBounds(120,150,400,30);
        
        add(cardNumber);
        
        // Text Field will be showed to user to Enter the Text or Card No:
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
 /*----------------------------------------------------------------------------------------------------------------------------------*/    
        
         /*
   ------------Now We have to show the PIN: and area to Enter the PIN Number by the user.-------------------------------------------------
        */
     
        JLabel pinNumber = new JLabel("PIN:");
     
        pinNumber.setFont(new Font("Raleway",Font.BOLD,28));
        
        pinNumber.setBounds(120,220,250,30);
        
        add(pinNumber);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
  /*----------------------------------------------------------------------------------------------------------------------------------*/    
      
  // Adding buttons to the Frame using JButton
        
         // Added Signin Button.
         login = new JButton("SIGN IN");
         login.setBounds(300,300,100,30);
         login.setBackground(Color.BLACK);
         login.setForeground(Color.WHITE);
         login.addActionListener(this);
         add(login);
        
         // Added Clear Button
         clear = new JButton("CLEAR");
         clear.setBounds(430,300,100,30);
         clear.setBackground(Color.BLACK);
         clear.setForeground(Color.WHITE);
         clear.addActionListener(this);
         add(clear);
  
         
        // Added Signup Button
         signup = new JButton("SIGN UP");
         signup.setBounds(300,350,230,30);
         signup.setBackground(Color.BLACK);
         signup.setForeground(Color.WHITE);
         signup.addActionListener(this);
         add(signup);
        
        // This function  is  used  to set the color of the whole frame.
        getContentPane().setBackground(Color.WHITE);
        
        // Now I have to change the location of the image on the frame so I have to adjust the location of the label
        label1.setBounds(70,10,100,100);
        
        // Created Frame.
        setSize(800,480); 
        
        // By default the user visiblity of the frame is not set , we have to set it to true.
        setVisible(true);
        
        // This will set the location where our frame will be open.
        setLocation(550,325);
        
        
        
        
    }
    
    // ActionEventListener.
    
    @Override
    public void actionPerformed(ActionEvent actionEvent){
        
        // The use of this action listener is to define the action after event happened after clicking the button.
        if(actionEvent.getSource() == clear){
            
            cardTextField.setText("");
            pinTextField.setText("");
            
        }else if( actionEvent.getSource() == login){
            
            DatabaseConnection connection = new DatabaseConnection();
            String cardNumber = cardTextField.getText();
            String pinNumber = pinTextField.getText();
            String query = "SELECT * FROM login WHERE cardnumber = '" + cardNumber + "' AND pin = '" + pinNumber + "'";
            
            
            try{
                
               ResultSet resultSet = connection.statement.executeQuery(query);
               if(resultSet.next()){
                   
                   setVisible(false);
                   new Transaction(pinNumber).setVisible(true);
                   
               }else{
                   
                   
                   JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                   
               }
                
            }catch(SQLException e){
                
                System.out.println(e);
                
            }

        }else if( actionEvent.getSource() == signup){
            
            setVisible(false);
            new Signup1().setVisible(true);
            
        }
        
    }
    
    public static void main(String [] args){
        
         new Login(); 
        
    }
    
}
