package bank.mnanagement.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author akash
 */
public class FastCash extends JFrame implements ActionListener{

    private JButton withdraw_hundred;
    private JButton withdraw_5hundred;
    private JButton withdraw_2thousand;
    private JButton withdraw_thousand;
    private JButton withdraw_5thousand;
    private JButton withdraw_10thousand ;
    private JButton back;
    private String pinNumber;

    FastCash(String pinNumber){
        setLayout(null);
        this.pinNumber= pinNumber;

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image2 = image1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image4 = new JLabel(image3);
        image4.setBounds(0,0,900,900);
        add(image4);


        JLabel fastCash = new JLabel("SELECT WITHDRAWAL AMOUNT");
        fastCash.setBounds(210,300,700,35);
        fastCash.setForeground(Color.WHITE);
        fastCash.setFont(new Font("System",Font.BOLD,16));
        image4.add(fastCash);


        withdraw_hundred = new JButton("Rs. 100");
        withdraw_hundred.setBounds(170,451,150,30);
        withdraw_hundred.addActionListener(this);
        image4.add(withdraw_hundred);

        withdraw_5hundred = new JButton("Rs. 500");
        withdraw_5hundred.setBounds(355,451,150,30);
        withdraw_5hundred.addActionListener(this);
        image4.add(withdraw_5hundred);

        withdraw_thousand = new JButton("Rs. 1000");
        withdraw_thousand.setBounds(170,486,150,30);
        withdraw_thousand.addActionListener(this);
        image4.add(withdraw_thousand);

        withdraw_2thousand = new JButton("Rs. 2000");
        withdraw_2thousand.setBounds(355,486,150,30);
        withdraw_2thousand.addActionListener(this);
        image4.add(withdraw_2thousand);

        withdraw_5thousand = new JButton("Rs. 5000");
        withdraw_5thousand.setBounds(170,521,150,30);
        withdraw_5thousand.addActionListener(this);
        image4.add(withdraw_5thousand);

        withdraw_10thousand = new JButton("Rs. 10000");
        withdraw_10thousand.setBounds(355,521,150,30);
        withdraw_10thousand.addActionListener(this);
        image4.add(withdraw_10thousand);

        back = new JButton("Back");
        back.setBounds(260,556,150,30);
        back.addActionListener(this);
        image4.add(back);




        setSize(900,900);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource()== back){

            setVisible(false);
            new Transaction(pinNumber).setVisible(true);

        }else {

               String amount = ((JButton) actionEvent.getSource()).getText().substring(4);
               DatabaseConnection connection = new DatabaseConnection();

               try
               {
                   ResultSet resultSet = connection.statement.executeQuery("SELECT * FROM bank WHERE pin = '"+pinNumber+"'");
                   int balance = 0;
                    while(resultSet.next()){
                        if(resultSet.getString("type").equals("Deposit")){

                            balance+=Integer.parseInt(resultSet.getString("amount"));

                        }else{

                            balance-=Integer.parseInt(resultSet.getString("amount"));

                        }

                    }

                    if(actionEvent.getSource() != back && balance < Integer.parseInt(amount)){

                        JOptionPane.showMessageDialog(null,"Insufficient Balance");
                        return;

                    }

                    Date date = new Date();
                    String query = "INSERT INTO bank VALUES('"+pinNumber+"', '"+date+"', 'Withdrawal', '"+amount+"')";
                    connection.statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs " + amount +" Debited Successfully");

                    setVisible(false);
                    new Transaction(pinNumber).setVisible(true);
               }catch (SQLException exception){

                   System.out.println(exception);

               }

        }

    }


    public static void main(String [] args){

         new FastCash("");

    }



}