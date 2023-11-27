
package bank.mnanagement.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author akash
 */
public class Transaction extends JFrame implements ActionListener{
    
    private JButton deposit;
    private JButton withdrawal;
    private JButton miniStatement;
    private JButton fastCash;
    private JButton pinChange;
    private JButton balanceEnquiry ;
    private JButton exit;
    private String pinNumber;
    
    Transaction(String pinNumber){
        setLayout(null);
        this.pinNumber= pinNumber;
        
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image2 = image1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image4 = new JLabel(image3);
        image4.setBounds(0,0,900,900);
        add(image4);
        
        
        JLabel transaction = new JLabel("Please select your transaction");
        transaction.setBounds(210,300,700,35);
        transaction.setForeground(Color.WHITE);
        transaction.setFont(new Font("System",Font.BOLD,16));
        image4.add(transaction);
                
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,451,150,30);
        deposit.addActionListener(this);
        image4.add(deposit);
        
        withdrawal = new JButton("Withdraw Cash");
        withdrawal.setBounds(355,451,150,30);
        withdrawal.addActionListener(this);
        image4.add(withdrawal);
        
        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(170,486,150,30);
        fastCash.addActionListener(this);
        image4.add(fastCash);
        
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(355,486,150,30);
        miniStatement.addActionListener(this);
        image4.add(miniStatement);
        
        pinChange = new JButton("Change Pin");
        pinChange.setBounds(170,521,150,30);
        pinChange.addActionListener(this);
        image4.add(pinChange);
        
        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(355,521,150,30);
        balanceEnquiry.addActionListener(this);
        image4.add(balanceEnquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(260,556,150,30);
        exit.addActionListener(this);
        image4.add(exit);

        
        setSize(900,900);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    
     @Override
    public void actionPerformed(ActionEvent actionEvent) {
        
        if(actionEvent.getSource()== exit){
            
            System.exit(0);
            
        }else if ( actionEvent.getSource() == deposit){
            
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
            
        }else if( actionEvent.getSource() == withdrawal){
            
            setVisible(false);
            new Withdrawal(pinNumber).setVisible(true);
            
        }else if(actionEvent.getSource()==fastCash){
            
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
            
        }else if(actionEvent.getSource() == pinChange){
            
            setVisible(false);
            new PinChange(pinNumber).setVisible(true);
            
        }else if(actionEvent.getSource() == balanceEnquiry){
            
            setVisible(false);
            new BalanceEnquiry(pinNumber).setVisible(true);
            
        }
        else if(actionEvent.getSource() == miniStatement){
           
            new MiniStatement(pinNumber).setVisible(true);
            
            
        }
        
    }
    
    
    public static void main(String [] args){
        
        new Transaction("");
        
    }

   
    
}
