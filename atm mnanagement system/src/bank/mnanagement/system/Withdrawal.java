
 
package bank.mnanagement.system;

/**
 *
 * @author akash
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {

    private JButton withdraw;
    private JButton back;
    private JTextField amountTextField;
    private String pinNumber;
    Withdrawal(String pinNumber){
        setLayout(null);
        this.pinNumber = pinNumber;

        ImageIcon imageIcon1 =  new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image1 = imageIcon1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image1);
        JLabel image = new JLabel(imageIcon2);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel withdrawLabel = new JLabel("Enter the amount you want to withdraw");
        withdrawLabel.setForeground(Color.WHITE);
        withdrawLabel.setFont(new Font("System",Font.BOLD,16));
        withdrawLabel.setBounds(170,300,400,20);
        image.add(withdrawLabel);

        amountTextField  = new JTextField();
        amountTextField.setFont(new Font("Raleway",Font.BOLD,22));
        amountTextField.setBounds(170,350,320,25);
        image.add(amountTextField);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(500,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

         if(actionEvent.getSource()== withdraw){

             String amountwithdrawal = amountTextField.getText();
             Date date = new Date();
             if(amountwithdrawal.equals("")){
             
                 JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw.");
                 
             }else{
                 
                 try
                 {
                 
                 DatabaseConnection connection = new DatabaseConnection();
                 String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'Withdraw', '"+amountwithdrawal+"')";
                 connection.statement.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Rs" + amountwithdrawal + "Withdraw Successfully");
                 setVisible(false);
                 new Transaction(pinNumber).setVisible(true);
                }catch(SQLException e){
                    
                    System.out.print(e);
                    
                }
                 
             }
           

        }else if(actionEvent.getSource() == back){
            
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
            
            
        }


    }

    public static void main(String[] args) {
    
        new Withdrawal("");

        
    }


}
