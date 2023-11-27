package bank.mnanagement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

 class BalanceEnquiry extends JFrame implements ActionListener {

      private JButton back;
      private  String pinNumber;



     BalanceEnquiry(String pinNumber){
         setLayout(null);

         this.pinNumber  = pinNumber;

         ImageIcon imageIcon1  = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
         Image image1 = imageIcon1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
         ImageIcon imageIcon2= new ImageIcon(image1);
         JLabel image = new JLabel(imageIcon2);
         image.setBounds(0,0,900,900);
         add(image);


         back = new JButton("Back");
         back.setBounds(355,525,150,30);
         back.addActionListener(this);
         image.add(back);

         int balance=0;

         DatabaseConnection connection = new DatabaseConnection();

         try {
             ResultSet resultSet = connection.statement.executeQuery("SELECT * FROM bank WHERE pin = '" + pinNumber + "'");
             
             while (resultSet.next()) {
                 if (resultSet.getString("type").equals("Deposit")) {

                     balance += Integer.parseInt(resultSet.getString("amount"));

                 } else {

                     balance -= Integer.parseInt(resultSet.getString("amount"));

                 }

             }
         }catch (Exception e){

             System.out.println(e);

         }

         JLabel balanceLabel = new JLabel("Your Current Account balance is Rs "+ balance);
         balanceLabel.setForeground(Color.WHITE);
         balanceLabel.setBounds(170,300,400,30);
         image.add(balanceLabel);

         setSize(900,900);
         setLocation(500,0);
         setUndecorated(true);
         setVisible(true);


     }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

           setVisible(false);
           new Transaction(pinNumber).setVisible(true);


    }

    public static void main(String[] args) {

    new BalanceEnquiry("");

    }


}