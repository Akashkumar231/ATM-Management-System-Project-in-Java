/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.mnanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PinChange extends JFrame implements ActionListener {

    
    private String pinNumber ;
    private final JButton back;
    private JPasswordField pinTextField ;
    private JPasswordField RePinTextField ;
    private  JButton changePin;
    public PinChange(String pinNumber) {
        setLayout(null);

        this.pinNumber=pinNumber;

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image1 = imageIcon1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2= new ImageIcon(image1);
        JLabel image = new JLabel(imageIcon2);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel pinChange = new JLabel("CHANGE YOUR PIN");
        pinChange.setForeground(Color.WHITE);
        pinChange.setFont(new Font("System", Font.BOLD,16));
        pinChange.setBounds(250,315,500,35);
        image.add(pinChange);

        JLabel pinText = new JLabel("New PIN:");
        pinText.setForeground(Color.WHITE);
        pinText.setFont(new Font("System", Font.BOLD,16));
        pinText.setBounds(165,355,180,25);
        image.add(pinText);

        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,25));
        pinTextField.setBounds(330,355,180,25);
        image.add(pinTextField);



        JLabel rePinText = new JLabel("Re-Enter NEW PIN:");
        rePinText.setForeground(Color.WHITE);
        rePinText.setFont(new Font("System", Font.BOLD,16));
        rePinText.setBounds(165,395,180,25);
        image.add(rePinText);

        RePinTextField = new JPasswordField();
        RePinTextField.setFont(new Font("Raleway",Font.BOLD,25));
        RePinTextField.setBounds(330,395,180,25);
        image.add(RePinTextField);

        changePin = new JButton("CHANGE");
        changePin.setBounds(355,490,150,30);
        changePin.addActionListener(this);
        image.add(changePin);

        back = new JButton("BACK");
        back.setBounds(355,525,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        if (actionEvent.getSource()==changePin){


            try{

                String newPin = pinTextField.getText();
                String re_Pin = RePinTextField.getText();

                if(!newPin.equals(re_Pin)){

                    JOptionPane.showMessageDialog(null,"Entered PIN does not Match");
                    return;

                }

                if(newPin.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please enter new PIN");
                    return;

                }

                if(re_Pin.equals("")){

                    JOptionPane.showMessageDialog(null,"Please re-enter  new PIN");
                    return;

                }

                DatabaseConnection connection = new DatabaseConnection();
                String query1 = "UPDATE bank SET pin = '"+re_Pin+"' WHERE pin ='"+pinNumber+"'";
                String query2 = "UPDATE login SET pin = '"+re_Pin+"' WHERE pin ='"+pinNumber+"'";
                String query3 = "UPDATE signupthree SET pin = '"+re_Pin+"' WHERE pin ='"+pinNumber+"'";

                connection.statement.executeUpdate(query1);
                connection.statement.executeUpdate(query2);
                connection.statement.executeUpdate(query3);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");

                setVisible(false);
                new Transaction(re_Pin).setVisible(true);
                
            }catch (Exception exception){

                System.out.println(exception);

            }


        }else{

            setVisible(false);
            new Transaction(pinNumber).setVisible(true);

        }


    }

    public static void main(String[] args) {

        new PinChange("").setVisible(true);

    }


   
}