
package bank.mnanagement.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;





/**
 *
 * @author akash
 */
public class Signunp3 extends JFrame implements ActionListener{
    
    
    private JLabel card_Number;
    private JLabel card_Detail;
    private JLabel c_Number;
    private JLabel pin_Number;
    private JLabel p_number;
    private JLabel pinDetails;
    private JLabel services_Required;
    
    private JRadioButton savings_Account;
    private JRadioButton fixed_Deposit_Account;
    private JRadioButton current_Account;
    private JRadioButton recurring_Deposit_Account;
    
    private JCheckBox  atm_Card;
    private JCheckBox  internet_Banking;
    private JCheckBox mobile_Banking;
    private JCheckBox email_SMS_alerts;
    private JCheckBox cheque_Book;
    private JCheckBox e_Statements;
    
    private JButton submit;
    private JButton cancel;
    private String formno;
    Signunp3(String formno){
        
        this.formno=formno;
        setLayout(null); // It will disable the default layout.
        
       JLabel l1  = new JLabel("Page 3 : Account Details");
       l1.setFont(new Font("Raleway" , Font.BOLD,22));
       l1.setBounds(280,40,400,40);
       add(l1);
 /*      
<<<<-----------------------Account Types------------------------------------>>>
   */    
       JLabel account_Type = new JLabel("Account Type");
       account_Type.setFont(new Font("Raleway", Font.BOLD,22));
       account_Type.setBounds(100,140,200,30);
       add(account_Type);
       
       savings_Account = new JRadioButton("Saving Account");
       savings_Account.setFont(new Font("Raleway",Font.BOLD,16));
       savings_Account.setBackground(Color.WHITE);
       savings_Account.setBounds(100,180,230,20);
       add(savings_Account);
       
       fixed_Deposit_Account = new JRadioButton("Fixed Deposit Account");
       fixed_Deposit_Account.setFont(new Font("Raleway",Font.BOLD,16));
       fixed_Deposit_Account.setBackground(Color.WHITE);
       fixed_Deposit_Account.setBounds(350,180,280,20);
       add(fixed_Deposit_Account);
       
       current_Account = new JRadioButton("Current Account");
       current_Account.setFont(new Font("Raleway",Font.BOLD,16));
       current_Account.setBackground(Color.WHITE);
       current_Account.setBounds(100,220,230,20);
       add(current_Account);
       
       recurring_Deposit_Account = new JRadioButton("Recurring Deposit Account");
       recurring_Deposit_Account.setFont(new Font("Raleway",Font.BOLD,16));
       recurring_Deposit_Account.setBackground(Color.WHITE);
       recurring_Deposit_Account.setBounds(350,220,280,20);
       add(recurring_Deposit_Account);
       
       ButtonGroup groupAccount = new ButtonGroup();
       groupAccount.add(savings_Account);
       groupAccount.add(fixed_Deposit_Account);
       groupAccount.add(current_Account);
       groupAccount.add(recurring_Deposit_Account);
       
       card_Number = new JLabel("Card Number");
       card_Number.setFont(new Font("Raleway", Font.BOLD,22));
       card_Number.setBounds(100,300,200,30);
       add(card_Number); 
       
       card_Detail = new JLabel("Your 16 Digit Card Number");
       card_Detail.setFont(new Font("Raleway",Font.BOLD,12));
       card_Detail.setBounds(100,330,300,20);
       add(card_Detail);
       
       
       c_Number = new JLabel("XXXX-XXXX-XXXX-4184");
       c_Number.setFont(new Font("Raleway",Font.BOLD,22));
       c_Number.setBounds(330,300,300,30);
       add(c_Number);
       
       pin_Number = new JLabel("PIN:");
       pin_Number.setFont(new Font("Raleway", Font.BOLD,22));
       pin_Number.setBounds(100,370,200,30);
       add(pin_Number); 
       
       p_number = new JLabel("XXXX");
       p_number.setFont(new Font("Raleway",Font.BOLD,22));
       p_number.setBounds(330,370,300,30);
       add(p_number);
       
       pinDetails = new JLabel("Your 4 Digit Password");
       pinDetails.setFont(new Font("Raleway",Font.BOLD,12));
       pinDetails.setBounds(100,400,300,20);
       add(pinDetails);
       
       services_Required = new JLabel("Services Required");
       services_Required.setFont(new Font("Raleway",Font.BOLD,22));
       services_Required.setBounds(100,450,230,30);
       add(services_Required);
       
       atm_Card= new JCheckBox("ATM CARD");
       atm_Card.setBackground(Color.WHITE);
       atm_Card.setFont(new Font("Raleway",Font.BOLD,16));
       atm_Card.setBounds(100,500,200,30);
       add(atm_Card);

       internet_Banking = new JCheckBox("Internet Banking");
       internet_Banking.setBackground(Color.WHITE);
       internet_Banking.setFont(new Font("Raleway",Font.BOLD,16));
       internet_Banking.setBounds(350,500,200,30);
       add(internet_Banking);
       
       mobile_Banking = new JCheckBox("Mobile Banking");
       mobile_Banking.setBackground(Color.WHITE);
       mobile_Banking.setFont(new Font("Raleway",Font.BOLD,16));
       mobile_Banking.setBounds(100,550,200,30);
       add(mobile_Banking);
       
       
       email_SMS_alerts  = new JCheckBox("EMAIL & SMS Alerts");
       email_SMS_alerts.setBackground(Color.WHITE);
       email_SMS_alerts.setFont(new Font("Raleway",Font.BOLD,16));
       email_SMS_alerts.setBounds(350,  550, 200,30);
       add(email_SMS_alerts);
               
       cheque_Book = new JCheckBox("Cheque Book");
       cheque_Book.setBackground(Color.WHITE);
       cheque_Book.setFont(new Font("Raleway",Font.BOLD,16));
       cheque_Book.setBounds(100,600,200,30);
       add(cheque_Book);
       
       e_Statements  = new JCheckBox("E-Statements");
       e_Statements.setBackground(Color.WHITE);
       e_Statements.setFont(new Font("Raleway",Font.BOLD,16));
       e_Statements.setBounds(350,  600, 200,30);
       add(e_Statements);
       
       atm_Card= new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
       atm_Card.setBackground(Color.WHITE);
       atm_Card.setFont(new Font("Raleway",Font.BOLD,12));
       atm_Card.setBounds(100,680,680,30);
       add(atm_Card);
       
       submit = new JButton("Submit");
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.setFont(new Font("Raleway",Font.BOLD,14));
       submit.setBounds(250,720,100,30);
       submit.addActionListener(this);
       add(submit);
       
       
       cancel = new JButton("Cancel");
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.WHITE);
       cancel.setFont(new Font("Raleway",Font.BOLD,14));
       cancel.setBounds(420,720,100,30);
       cancel.addActionListener(this);
       add(cancel);
       
       getContentPane().setBackground(Color.WHITE);
       
       setSize(850,820);
       setLocation(550,150);
       setVisible(true);
    
    }
    
     @Override
    public void actionPerformed(ActionEvent actionListener) {
    
        if(actionListener.getSource() == submit){
            
            String accountType  = null;
            
            if(savings_Account.isSelected()){
                
                accountType= "Saving Account";
                
            }else if( fixed_Deposit_Account.isSelected() ){
                
                accountType = "Fixed Deposit Account";
                
            }else if(current_Account.isSelected()){
                
                accountType = "Current Account";
                
            }else if(recurring_Deposit_Account.isSelected()){
                
                accountType = "Reccuring Deposit Account";
                
            }
            
            Random random = new Random();
            
            String cardNumber = ""+ Math.abs((random.nextLong()% 90000000L)+5040936000000000L);
            
            String pinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility ="";
            
            if(atm_Card.isSelected()){
                
                facility= facility + " ATM Card";
                
            }else if(internet_Banking.isSelected()){
                
                facility = facility + " Internet Banking";
                
            }else if(mobile_Banking.isSelected()){
                
                facility = facility + " Mobile Banking";
                
            }else if(email_SMS_alerts.isSelected()){
                
                facility = facility + " EMAIL & SMS Alerts";
                
            }else if(cheque_Book.isSelected()){
                
                facility = facility + " Cheque Book";
                
            }else if(e_Statements.isSelected()){
                
                facility = facility+ " E-Statements";
            }
            
            try{
                
                if(accountType.equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }else {
                    
                    DatabaseConnection connection = new DatabaseConnection();
                    String query1 = "INSERT INTO signupthree VALUES('" + formno + "','" + accountType + "','" + cardNumber + "','" + pinNumber + "','" + facility +  "')";
                    String query2 = "INSERT INTO login VALUES('" + formno + "','" + cardNumber + "','" + pinNumber + "')";
                    connection.statement.executeUpdate(query1);
                    connection.statement.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null,"Card Number " + cardNumber +"\n Pin: " + pinNumber);
                    
                    setVisible(false);
                    new Deposit(pinNumber).setVisible(false);
                }
                
            }catch(Exception e){
                
                System.out.println(e);
                
            }
            
            
            
        }
        else if(actionListener.getSource() == cancel){
            
            setVisible(false);
            new Login().setVisible(true);
            
        }
        
    }
    
    public static void main(String [] args){
        
        new Signunp3("");
        
    }

   
    
}
